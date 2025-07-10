// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
//such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

package dsa;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
    	Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
        	if(i>0 && nums[i]==nums[i-1]) {
        		continue;
        	}if(nums[i]>0)break;
        	int left=i+1;
        	int right= nums.length-1;
        	while(left<right) {
        		int sum = nums[i]+nums[left]+nums[right];
        		if(sum<0) {
        			left++;
        		}else if(sum>0) {
        			right--;
        		}else {
        			res.add(Arrays.asList(nums[i],nums[left],nums[right]));
        			left++;
        			right--;
        			while(left<right && nums[left]==nums[left-1]) {
        				left++;
        			}
        			while(left<right && nums[right]==nums[right+1]) {
        				right--;
        			}
        		}
        	}
        }
        return res;
        
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = threeSum(nums1);
        System.out.println("Result 1: " + result1); // Expected: [[-1, -1, 2], [-1, 0, 1]]

        int[] nums2 = {0, 1, 1};
        List<List<Integer>> result2 = threeSum(nums2);
        System.out.println("Result 2: " + result2); // Expected: []

        int[] nums3 = {0, 0, 0};
        List<List<Integer>> result3 = threeSum(nums3);
        System.out.println("Result 3: " + result3); // Expected: [[0, 0, 0]]
    }
}
