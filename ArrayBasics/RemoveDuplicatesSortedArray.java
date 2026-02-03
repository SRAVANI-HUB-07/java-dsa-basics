package ArrayBasics;

///Time: O(n) One pass through the array

//Space:O(1) No extra data structures

public class RemoveDuplicatesSortedArray {
    public static void main(String args[]) {
        RemoveDuplicatesSortedArray obj = new RemoveDuplicatesSortedArray();
        int nums[] = new int[] { 1, 2 };
        System.out.print(obj.removeDuplicatesSortedArray(nums));
    }

    public int removeDuplicatesSortedArray(int nums[]) {
        if(nums.length==0)
            return 0;
        int count = 1, lastUniqueIndex = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[lastUniqueIndex]) {
                nums[lastUniqueIndex + 1] = nums[right];
                count++;
                lastUniqueIndex++;
            }
        }
        return count;
    }
}
