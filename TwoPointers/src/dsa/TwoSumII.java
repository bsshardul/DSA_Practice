//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. 
//Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] 
//of length 2.
//The tests are generated such that there is exactly one solution. You may not use the same element twice.
//Your solution must use only constant extra space.
package dsa;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right =numbers.length-1;
       int res[] = new int[2];
        while(left<right) {
        	if(numbers[left]+numbers[right]>target) {
        		right--;
        	}else if(numbers[left]+numbers[right]<target) {
        		left++;
        	}else {
        		res[0]=left+1;
        		res[1]=right+1;
        		break;
        	}
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(numbers1, target1);
        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]"); // Expected: [1, 2]

        int[] numbers2 = {1, 2, 3, 4, 4, 9, 56, 90};
        int target2 = 8;
        int[] result2 = twoSum(numbers2, target2);
        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]"); // Expected: [4, 5]

        int[] numbers3 = {1, 3, 4, 5, 7, 11, 15};
        int target3 = 9;
        int[] result3 = twoSum(numbers3, target3);
        System.out.println("Result 3: [" + result3[0] + ", " + result3[1] + "]"); // Expected: [2, 5]
    }
}
