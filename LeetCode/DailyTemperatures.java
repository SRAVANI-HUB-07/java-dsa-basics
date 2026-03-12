package LeetCode;
import java.util.*;

/*
Time Complexity: O(n)
Reason: Each index is pushed and popped from the stack at most once.

Space Complexity: O(n)
Reason: The stack may store up to n indices in the worst case.
*/


class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length=temperatures.length;
        int answer[]=new int[length];
        Stack<Integer> indices=new Stack<>();
        for(int currentIndex=0;currentIndex<length;currentIndex++)
        {
            if(indices.isEmpty())
            indices.push(currentIndex);
            else{
                while (!indices.isEmpty() && temperatures[currentIndex] > temperatures[indices.peek()]) {
                    int previousIndex = indices.peek();
                    answer[previousIndex] = currentIndex - previousIndex;
                    indices.pop();
                }
                indices.push(currentIndex);
            }
        }
       
        return answer;
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        int temp[]=new int[]{73,74,75,71,69,72,76,73};
        int result[]=obj.dailyTemperatures(temp);
        for(int i:result)
            System.out.print(i+ " ");
    }
}