//Given an integer array nums and an integer k, return the k most frequent elements. 
//You may return the answer in any order.
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
 
package dsa;
import java.util.*;


public class TopKFreqElements {
	
	public static int[] topKFrequent(int[] nums, int k) {
        // TODO: Implement your logic here
		Map<Integer,Integer> count = new HashMap<>();
		List<Integer> freq[]=new List[nums.length];
		for(int i=0;i<nums.length;i++) {
			freq[i]= new ArrayList<>();
		}
		for(int n: nums) {
			count.put(n,count.getOrDefault(n, 0)+1);
		}
		for(Map.Entry<Integer,Integer>entry:count.entrySet()) {
			freq[entry.getValue()].add(entry.getKey());
		}
		int res[]= new int[k];
		int index = 0;
		for(int i=nums.length-1;i>=0&&index<k;i--) {
			for(int n: freq[i]) {
				res[index++]=n;
				if(index==k) {
					return res;
				}
			}
		}
		
		
        return res; // Placeholder return
    }

	public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3}; // Example test case
        int k = 2;
        int[] result = topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }

    

}
