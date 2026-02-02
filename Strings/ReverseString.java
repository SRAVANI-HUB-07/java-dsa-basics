package Strings;

import java.util.*;

// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        char temp;
        int n = ch.length;
        for (int i = 0; i < n / 2; i++) {
            temp = ch[i];
            ch[i] = ch[n - 1 - i];
            ch[n - 1 - i] = temp;
        }
        str = String.valueOf(ch);

        System.out.print("Reversed String : " + str);

        sc.close();
    }
}
