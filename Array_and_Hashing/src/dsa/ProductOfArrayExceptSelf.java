//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all 
//the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
package dsa;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
        // TODO: Implement your logic here
		int n= nums.length;
		int res[]=new int[n];
		res[0]=1;
		for(int i=1;i<n;i++) {
			res[i]=res[i-1]*nums[i-1];	
		}
		int postfix=1;
		for(int i=n-1;i>=0;i--) {
			res[i]*=postfix;
			postfix*=nums[i];
		}
		
        return res; // Placeholder return
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; // Example test case
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

    

}
