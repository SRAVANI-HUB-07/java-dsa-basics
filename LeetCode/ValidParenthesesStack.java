package LeetCode;
import java.util.*;

// Time Complexity:O(n) 
// Space Complexity:O(n) . Since we need to remember unmatched opening brackets, worst-case auxiliary space is linear.

class ValidParenthesesStack {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        char ch, recentOpened;
        while (i < s.length()) {
            ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else if (st.isEmpty())
                return false;
            else {
                recentOpened = st.pop();
                if ((ch == ')' && recentOpened != '(') || (ch == ']' && recentOpened != '[')
                        || (ch == '}' && recentOpened != '{'))
                    return false;
            }
            i++;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s="{[()]}";
        System.out.print(isValid(s));
    }
}