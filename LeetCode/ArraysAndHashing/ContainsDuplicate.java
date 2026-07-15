package LeetCode.ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;


/*
Problem: Contains Duplicate (LeetCode 217)
Pattern: Hashing
Data Structure: HashSet
Algorithm: Traverse the array, store each element in a HashSet, and return true if an element already exists in the set.
Time Complexity: O(n)
Reason: Each element is visited once, and HashSet contains() and add() take O(1) on average.
Space Complexity: O(n)
Reason: In the worst case, all n unique elements are stored in the HashSet.
Key Idea: A HashSet stores only unique elements, making duplicate detection efficient.
*/

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            if(set.contains(i))
            return true;
            set.add(i);
        }
        return false;
    }
    public static void main(String args[])
    {
        int[] nums=new int[]{1,12,4,5,3};
        boolean isDuplicate=containsDuplicate(nums);
        if(isDuplicate)
        {
            System.out.println("The array contains duplicates");
        }
        else
        {
            System.out.println("The array does not contain any duplicates");
        }
    }
}

