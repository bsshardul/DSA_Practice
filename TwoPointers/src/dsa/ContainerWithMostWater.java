//You are given an integer array height of length n. 
//There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//Notice that you may not slant the container.
package dsa;

public class ContainerWithMostWater {


    public static int maxArea(int[] height) {
       int left = 0;
       int right =height.length-1;
       int res=0;
       while(left<right) {
    	   int area = Math.min(height[left], height[right])*(right-left);
    	   res = Math.max(area, res);
    	   if(height[left]<=height[right]) {
    		   left++;
    	   }else {
    		   right--;
    	   }
    	  
    }
       return res;
    }

    public static void main(String[] args) {
        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area 1: " + maxArea(heights1)); // Expected: 49

        int[] heights2 = {1, 1};
        System.out.println("Max Area 2: " + maxArea(heights2)); // Expected: 1

        int[] heights3 = {4, 3, 2, 1, 4};
        System.out.println("Max Area 3: " + maxArea(heights3)); // Expected: 16
    }

}
