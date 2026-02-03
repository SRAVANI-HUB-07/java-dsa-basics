package ArrayBasics;

//Time: O(n) (each element added once and removed once)
//Space: O(1) (only variables)

public class MaxSumSubArrays {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, -1, 10, 7, 4 };
        int size = -1;
        MaxSumSubArrays obj = new MaxSumSubArrays();
        System.out.print(obj.maxSumSubArrays(arr, size));
    }

    public long maxSumSubArrays(int[] arr, int size) {
        if (arr == null || arr.length == 0 || size <= 0 || size > arr.length) {
            throw new IllegalArgumentException("Invalid window size");
        }

        int left = 0, right = 0;
        long sum = 0;
        while (right < size) {
            sum += arr[right++];
        }
        long maxSum = sum;
        for (; right < arr.length; right++) {
            sum = sum - arr[left++] + arr[right];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
