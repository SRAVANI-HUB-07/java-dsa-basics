package LeetCode;

// Time complexity : O(n)
// Space complexity : O(1)

public class MaxAvgSubArrayI {
    public static void main(String args[])
    {
        MaxAvgSubArrayI obj=new MaxAvgSubArrayI();
        System.out.print(obj.findMaxAverage(new int[]{1,4,6,2,9,5},4));
    }
  
    public double findMaxAverage(int[] nums, int k) {
            int right = 0, left = 0;
            double avg = 0;
            double sum = 0;
            while (right < k) {
                sum += nums[right++];
            }
            double maxAvg = sum / k;
            for (; right < nums.length; right++) {
                sum = sum - nums[left++] + nums[right];
                avg = sum / k;
                maxAvg = Math.max(avg, maxAvg);
            }
            return maxAvg;
        }
    }

