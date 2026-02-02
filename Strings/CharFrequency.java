package Strings;

import java.util.HashMap;

//Time Complexity:O(n)(single traversal of the string)
//Space Complexity:O(k)where k is the number of unique characters(worst case O(n))
public class CharFrequency {
    public static void main(String args[]) {
        String str = "programming";

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        for (char c : hm.keySet()) {
            System.out.println(c + " : " + hm.get(c));
        }

        // The below continued code is to check first non-repeating character in aboven
        // given string

        // for(int i=0;i<str.length();i++)
        // {
        // if(hm.get(str.charAt(i))==1)
        // {
        // System.out.print(str.charAt(i)+" is the first non-repeating character in the
        // given string");
        // break;
        // }
        // }

    }
}
