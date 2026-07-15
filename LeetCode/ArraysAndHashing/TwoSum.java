package LeetCode.ArraysAndHashing;

import java.util.*;

/*
Problem: Two Sum
Pattern: Hashing
Data Structure: HashMap
Algorithm: Traverse the array once, store each element and its index in a HashMap, and check if the complement (target - current element) already exists.
Time Complexity: O(n)
Reason: Each element is processed once, and HashMap containsKey(), get(), and put() take O(1) on average.
Space Complexity: O(n)
Reason: In the worst case, the HashMap stores all n elements and their indices.
Key Idea: Store previously seen numbers in a HashMap so the required complement can be found in constant time.
*/

public class TwoSum {
    public static void main(String args[]) {
        TwoSum obj = new TwoSum();
        int nums[] = new int[] { 2, 7, 8, 0 };
        int target = 9;
        int sol[] = obj.twoSum(nums, target);
        System.out.print("{ " + sol[0] + ", " + sol[1] + " }");
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hm.containsKey(target - nums[i])) {

                return new int[] { hm.get(target - nums[i]), i };
            }
            hm.put(nums[i], i);
        }
        return new int[0];

    }
}
