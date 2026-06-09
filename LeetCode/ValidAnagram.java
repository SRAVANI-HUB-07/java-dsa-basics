package LeetCode;

/*
Problem: Valid Anagram
Pattern: Frequency Counting / Hashing
Data Structure: Fixed-size Integer Array
Algorithm: Count characters from the first string, subtract counts using the second string, then verify all frequencies are zero.
Time Complexity: O(n)
Reason: Each character from both strings is processed once.
Space Complexity: O(1)
Reason: Uses a fixed-size array of 26 characters regardless of input size.
Key Idea: Two strings are anagrams if they have the same frequency of every character.
*/

public class ValidAnagram {
    public static void main(String args[])
    {
        String s="cat";
        String t="tac";
        boolean result=isAnagram(s,t);
        if(result)
        {
            System.out.print("Both are Anagrams");
        }
        else{
            System.out.println("Both are not anagrams");
        }
    }

        public static boolean isAnagram(String s, String t) {
            int charCount[] = new int[26];
            if (s.length() != t.length())
                return false;
            for (char ch : s.toCharArray()) {
                charCount[ch - 'a']++;
            }
            for (char ch : t.toCharArray()) {
                charCount[ch - 'a']--;
            }
            for (int i : charCount) {
                if (i != 0)
                    return false;
            }
            return true;
        }
    }

