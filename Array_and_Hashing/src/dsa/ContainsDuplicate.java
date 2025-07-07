//Given an integer array nums, return true if any value appears at least twice in the array,
//and return false if every element is distinct.
//Input: nums = [1,2,3,1]
//Output: true
package dsa;

import java.util.Arrays;

public class ContainsDuplicate {
	public static boolean containsDup(int nums[]) {
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i+1]==nums[i]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[] = {1,2,3,1};
	System.out.println(containsDup(nums));
	}

}
