package LeetCode;
import java.util.*;

/*
Space Complexity: O(n)
Reason: In the worst case both stacks may store up to n elements.
*/

/*
Time Complexity: O(1)
Reason: All operations (push, pop, top, getMin) only access or modify the top of the stacks.
*/

public class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public MinStack() {
        
    }

    public void push(int val) {
        if(minStack.isEmpty()||minStack.peek()>=val)
            minStack.push(val);
        st.push(val);
    }

    public void pop() {
        if(minStack.peek().equals(st.peek()))
            /*
             * Stack<Integer> stores Integer objects, not primitive int.
             * So when you do: minStack.peek() == st.peek(), you are comparing object
             * references, not values.
             * Java caches Integer values between -128 and 127, so for those numbers == may
             * appear to work. But for larger numbers like 512, Java creates different
             * Integer objects, so:
             * Integer(512) != Integer(512) // different objects
             * Even though the values are the same.
             * 
             * Correct Fix
             * 
             * Compare values, not references:
             */
        {
            minStack.pop();
        }
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String args[]) {

        MinStack obj = new MinStack();
        obj.push(512);
        obj.push(-1024);
        obj.push(-1024);
        obj.push(512);
       
        obj.pop();

        System.out.println(obj.getMin());

        obj.pop();

        System.out.println(obj.getMin());

        obj.pop();

        System.out.println(obj.getMin());
        
        
        
    }
}
