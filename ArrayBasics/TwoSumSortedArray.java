package ArrayBasics;

//Time: O(n) : Each pointer moves at most n times.

//Space: O(1) : No extra data structures.

public class TwoSumSortedArray {
    public static void main(String args[]) {
        TwoSumSortedArray obj = new TwoSumSortedArray();
        int nums[] = new int[] { 2, 4, 6, 7, 11, 15 };
        int target = 9;
        int resultIndices[] = obj.twoSum(nums, target);
        for (int i : resultIndices)
            System.out.print(i + " ");
    }

    public int[] twoSum(int nums[], int target) {
        if(nums.length<2)
            return new int[0];
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[right] + nums[left] == target)
                return new int[] { left,right };
            else if (nums[left] + nums[right] > target)
                right--;
            else
                left++;
        }

        return new int[0];
    }
}
