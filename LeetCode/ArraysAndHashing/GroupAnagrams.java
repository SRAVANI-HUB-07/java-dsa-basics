package LeetCode.ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Problem: Group Anagrams (LeetCode 49)
Pattern: Hashing + Sorting
Data Structure: HashMap<String, List<String>>
Algorithm: Sort each string to create a common key, then group strings with the same sorted key using a HashMap.
Time Complexity: O(n * k log k)
Reason: Each of the n strings is sorted, and sorting a string of length k takes O(k log k).
Space Complexity: O(n * k)
Reason: The HashMap stores all input strings in grouped lists, and each sorted key requires O(k) space.
Key Idea: Anagrams produce the same sorted string, so the sorted string can be used as a common HashMap key.
*/

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> combineAnagrams=new HashMap<>();
        for(String str:strs)
        {
            char charArray[]=str.toCharArray();
            Arrays.sort(charArray);
            String sortedString=new String(charArray);
            combineAnagrams.putIfAbsent(sortedString,new ArrayList<>());
            combineAnagrams.get(sortedString).add(str);  
        }
        return new ArrayList<>(combineAnagrams.values());
    }

    public static void main(String args[])
    {
        String[] strs ={"eat","tea","tan","ate","nat","bat"};
        System.out.print(groupAnagrams(strs));
    }
}
