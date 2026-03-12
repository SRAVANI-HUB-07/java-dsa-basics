package StackBasics;
import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        String s="{[()]}";
        char ch,recentOpened;
        boolean valid=true;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='{'||ch=='['||ch=='(')
                st.push(ch);
            else if(st.isEmpty())
            {
                valid=false;
                break;
            }
            else{
               recentOpened=st.pop();
               if((ch==')'&& recentOpened!='(') || (ch==']'&& recentOpened!='[') || (ch=='}'&& recentOpened!='{'))
               {
                valid=false;
                break;
               }
            }
        }
        valid=valid&&st.isEmpty();
        System.out.print(valid);
    }
}
