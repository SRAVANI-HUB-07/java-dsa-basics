package LeetCode;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        // Brute force solution

        // int result[]=new int[2];
        // for(int i=0;i<nums.length;i++)
        // {

        // int remain=target-nums[i];
        // for(int j=i+1;j<nums.length;j++)
        // {
        // if(nums[j]==remain)
        // {
        // result[0]=i;
        // result[1]=j;
        // break;
        // }

        // }

        // }
        // return result;

        // Optimized solution using HashMap

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
