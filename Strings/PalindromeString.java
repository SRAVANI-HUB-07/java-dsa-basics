package Strings;

//Time Complexity:O(n)

// Space Complexity: O(n)
//In Java,reversing a string requires converting it to a mutable structure,so the character array is treated as the input and the algorithm runs in O(1)extra space.However,for palindrome checking,the character array is optional since we can compare characters directly using charAt(),so using a char array would increase space complexity to O(n).”

public class PalindromeString {
    public static void main(String args[]) {
        String str = "madams";
        str = str.toLowerCase();
        char ch[] = str.toCharArray();
        boolean flag = true;
        int len = ch.length;
        for (int i = 0; i < len / 2; i++) {
            if (ch[i] != ch[len - i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.print(str + " is palindrome");
        else
            System.out.print(str + " is not a palindrome");
    }
}
