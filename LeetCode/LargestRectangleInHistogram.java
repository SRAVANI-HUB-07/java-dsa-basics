package LeetCode;
import java.util.*;

/*
Time Complexity: O(n)
Reason: Each index is pushed onto the stack once and popped at most once.

Space Complexity: O(n)
Reason: The stack can store up to n indices in the worst case.
*/

public class LargestRectangleInHistogram {
    public static void main(String args[])
    {
        LargestRectangleInHistogram obj=new LargestRectangleInHistogram();
        int[] heights=new int[]{2,1,5,6,2,3};
        int largeRectangleArea=obj.largestRectangleArea(heights);
        System.out.println(largeRectangleArea);
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> indices = new Stack<>();
        int maxArea = 0, currentArea = 0;
        int width = 0;
        int currentHeight = 0;
        int currentIndex = 0;
        for (int i = 0; i < heights.length; i++) {
            currentIndex = i;
            if (indices.isEmpty()) {
                indices.push(currentIndex);
            } else {
                while (!indices.isEmpty() && heights[currentIndex] < heights[indices.peek()]) {
                    currentHeight = heights[indices.pop()];

                    if (indices.isEmpty()) {
                        width = currentIndex;
                    } else {
                        width = currentIndex - indices.peek() - 1;
                    }
                    currentArea = width * currentHeight;
                    maxArea = currentArea > maxArea ? currentArea : maxArea;

                }
                indices.push(currentIndex);
            }
        }
        while (!indices.isEmpty()) {
            currentIndex = indices.peek();
            currentHeight = heights[indices.pop()];
            if (indices.isEmpty()) {
                width = heights.length;
            } else {
                width = heights.length - indices.peek() - 1;
            }
            currentArea = currentHeight * width;
            maxArea = currentArea > maxArea ? currentArea : maxArea;
        }
        return maxArea;
    }
}