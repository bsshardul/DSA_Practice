//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.
//Example 1:
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
package dsa;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
   Set<Integer> set = new HashSet<>();
   for(int i:nums) {
	   set.add(i);
   }
   int longest =0;
   for(int i:set) {
	   if(!set.contains(i-1)) {
	   int length =1;
   while(set.contains(i+length)) {
	   length++;
   }
   longest = Math.max(length, longest);
	   }
	   }
        return longest;
    }
    public static void main(String[] args) {
     
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2})); // Output: 4
        System.out.println(longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1})); // Output: 9
        System.out.println(longestConsecutive(new int[]{})); // Output: 0
        System.out.println(longestConsecutive(new int[]{1, 2, 0, 1})); // Output: 3
    }
}
