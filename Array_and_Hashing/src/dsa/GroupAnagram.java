//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//Explanation:
//There is no string in strs that can be rearranged to form "bat".
//The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
//The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
package dsa;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagram {
	public static List<List<String>> groupAnagram(String[] strs){
		Map<String,List<String>> res = new HashMap<>();
		for(String s:strs) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String sSorted = new String(charArray);
			res.putIfAbsent(sSorted,new ArrayList<>());
			res.get(sSorted).add(s);
		}
		  return new ArrayList<>(res.values());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String	strs[] = {"eat","tea","tan","ate","nat","bat"};
	  List<List<String>> result = groupAnagram(strs);

      for (List<String> group : result) {
          System.out.println(group);
      }
	}

}
