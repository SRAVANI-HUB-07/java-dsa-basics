package LeetCode;

/*
Time Complexity: O(n)
traverse the array once and perform constant work for each element.

Space Complexity: O(1)
only use a few variables (no extra data structures).
*/

public class BestTimeToBuyAndSellStock {
    public static void main(String args[])
    {
        int maxProfit=maxProfit(new int[]{7,2,4,3,7,1,5});
        System.out.print("Maximum profit: "+maxProfit);
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0, minPriceSoFar = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPriceSoFar)
                minPriceSoFar = price;
            else {
                maxProfit = Math.max(maxProfit, price - minPriceSoFar);
            }
        }
        return maxProfit;
    }
}
