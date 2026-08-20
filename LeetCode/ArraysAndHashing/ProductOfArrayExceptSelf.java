package LeetCode.ArraysAndHashing;

import java.util.*;

/*
Problem: Product of Array Except Self

Pattern: Prefix and Suffix Products

Data Structure: Output Array + Running Product

Algorithm: Store suffix products directly in the output array by traversing
from right to left. Then traverse from left to right while maintaining a
running prefix product and multiply it with the stored suffix product.

Time Complexity: O(n)

Reason: The array is traversed twice, and each element is processed in
constant time during each traversal.

Auxiliary Space Complexity: O(1)

Reason: Only one running product variable is used as extra space.
The output array is excluded from auxiliary space analysis.

Key Idea: The product except self at each index equals the product of all
elements before it multiplied by the product of all elements after it.
*/

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] productExceptSelf = new int[nums.length];
        productExceptSelf[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            productExceptSelf[i] = productExceptSelf[i + 1] * nums[i + 1];
        }
        int previousMultiples = 1;
        for (int i = 1; i < nums.length; i++) {
            previousMultiples = previousMultiples * nums[i - 1];
            productExceptSelf[i] = productExceptSelf[i] * previousMultiples;
        }
        return productExceptSelf;
    }

    public static void main(String args[]) {
        ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
        int[] nums = new int[] { 6, 2, 3, 4 };
        System.out.println(Arrays.toString(p.productExceptSelf(nums)));
    }
}
