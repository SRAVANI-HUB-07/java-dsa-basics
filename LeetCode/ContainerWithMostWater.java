package LeetCode;
import java.util.*;

/*
Time Complexity: O(n)
Reason: Each pointer moves at most n times.

Space Complexity: O(1)
Reason: Only a few variables are used.
*/

public class ContainerWithMostWater {
        public static int maxArea(int[] height) {
            int leftPointer = 0, rightPointer = height.length - 1, area = 0, maxArea = 0, length = 0, width = 0;
            while (leftPointer < rightPointer) {
                width = rightPointer - leftPointer;
                length = Math.min(height[rightPointer], height[leftPointer]);
                area = length * width;
                maxArea = Math.max(maxArea, area);
                if (height[leftPointer] < height[rightPointer])
                    leftPointer++;
                else
                    rightPointer--;
            }
            return maxArea;
        }
        public static void main(String args[])
        {
            int[] height={1,8,6,2,5,4,8,3,7};
            int maxArea=maxArea(height);
            System.out.println("Maximum area: "+maxArea);
        }
    }

