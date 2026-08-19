package LeetCode.ArraysAndHashing;
import java.util.*;

/*
Problem: Top K Frequent Elements

Pattern: Frequency Counting / Bucket Sort

Data Structure: HashMap + List of Lists (Frequency Buckets)

Algorithm: Count the frequency of each number using a HashMap. Use each
frequency as an index in the bucket list and store numbers with the same
frequency in that bucket. Traverse the buckets from highest frequency to
lowest and collect the first k elements.

Time Complexity: O(n)

Reason: Building the frequency map, populating the buckets, and traversing
the buckets each take O(n) time in the worst case.

Space Complexity: O(n)

Reason: The HashMap and frequency buckets store at most n elements.

Key Idea: Since the maximum frequency of an element is n, frequency can be
used directly as a bucket index, avoiding O(n log n) sorting.
*/

public class TopKFrequentElements {
    
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int results[] = new int[k];
        for (int i = 0; i < nums.length; i++) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            buckets.get(entry.getValue()).add(entry.getKey());
        }
        int j = 0;
        for (int i = nums.length; j < k && i >= 0; i--) {
            if (!buckets.get(i).isEmpty()) {
                for (int num : buckets.get(i)) {
                    if (j == k)
                        break;
                    results[j++] = num;
                }
            }
        }
        return results;
    }

    public static void main(String args[])
    {
        int[] nums=new int[]{1,2,1,2,3,1,3,3};
        int results[]=topKFrequent(nums, 2);
        for(int i:results)
            System.out.print(i+" ");
    }

}
