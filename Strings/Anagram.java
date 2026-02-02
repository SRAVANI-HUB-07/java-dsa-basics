package Strings;

import java.util.HashMap;

//Time Complexity: O(n) Single loop over the strings .One loop over map values.
//Space Complexity: O(k). k=number of unique characters . Worst case O(n)

public class Anagram {
    public static void main(String args[]) {
        String str1 = "siLent";
        String str2 = "LISten";
        int len1 = str1.length(), len2 = str2.length();
        if (len1 != len2) {
            System.out.print("Both are not anagrams..");
        } else {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < len1; i++) {
                char ch1 = str1.charAt(i), ch2 = str2.charAt(i);
                hm.put(ch1, hm.getOrDefault(ch1, 0) + 1);
                hm.put(ch2, hm.getOrDefault(ch2, 0) - 1);
            }
            int flag = 1;
            for (int i : hm.values()) {
                if (i != 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print("Both are anagrams");
            else
                System.out.print("Both are not anagrams");

        }

    }
}
