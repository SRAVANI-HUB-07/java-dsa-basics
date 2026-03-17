package LeetCode;
import java.util.*;

/*
Time Complexity: O(n)
Reason: Each token is processed once.

Space Complexity: O(n)
Reason: Stack can store up to n elements.
*/

class ReversePolishNotation{
    public static void main(String args[])
    {
        String[] tokens=new String[]{"3","2","+","4","-","-3","*"};
        ReversePolishNotation obj=new ReversePolishNotation();
        int result=obj.evalRPN(tokens);
        System.out.print(result);
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") ||
                    token.equals("/") || token.equals("*")) {
                int operand2 = st.pop();
                int operand1 = st.pop();

                if (token.equals("+")) {
                    st.push(operand1 + operand2);
                } else if (token.equals("-")) {
                    st.push(operand1 - operand2);
                } else if (token.equals("*")) {
                    st.push(operand1 * operand2);
                } else {
                    st.push(operand1 / operand2);
                }
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}