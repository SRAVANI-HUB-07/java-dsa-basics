package LeetCode.ArraysAndHashing;
import java.util.*;

/*
Problem: Longest Consecutive Sequence

Pattern: Hashing / Sequence Detection

Data Structure: HashSet

Algorithm: Store all numbers in a HashSet to allow constant-time lookup.
For each number, check whether its previous consecutive number (num - 1)
exists. If it does not, the current number is the start of a sequence.
From that starting number, move forward while consecutive numbers exist
and track the sequence length. Keep the maximum length found.

Time Complexity: O(n)

Reason: Building the HashSet takes O(n). Each number is checked during
the set traversal, and the while loop only starts from the beginning of
a sequence. Therefore, all forward sequence traversals combined process
at most O(n) elements. HashSet contains() takes O(1) average time.

Space Complexity: O(n)

Reason: The HashSet stores at most n unique elements from the input array.

Key Idea: Only start counting a sequence when the previous number does
not exist. This prevents the same consecutive sequence from being
repeatedly traversed and keeps the overall time complexity O(n).
*/

class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int maxLength = 0;
        int length;
        Set<Integer> entries = new HashSet<>();
        for (int i : nums)
            entries.add(i);
        for (int entry : entries) {
            if (!entries.contains(entry - 1)) {
                length = 1;
                while (entries.contains(entry + 1)) {
                    length += 1;
                    entry += 1;
                }
                maxLength = length > maxLength ? length : maxLength;
            }
        }
        return maxLength;
    }

    public static void main(String args[])
    {
        LongestConsecutiveSequence obj=new LongestConsecutiveSequence();
        int[] nums={100,4,200,3,2,1};
        System.out.print(obj.longestConsecutive(nums));
    }
}