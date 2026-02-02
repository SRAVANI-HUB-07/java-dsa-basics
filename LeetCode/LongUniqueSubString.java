package LeetCode;

import java.util.*;

// Time Complexity — O(n): Each character is added to the set once and removed from the set once.
//Space Complexity — O(k) : k = number of unique characters in the current window

public class LongUniqueSubString {
    public static void main(String args[]) {
        String s = "aab";
        int maxLen = 0, left = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("length= " + maxLen);
    }
}