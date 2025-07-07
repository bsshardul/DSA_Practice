//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//Input: s = "anagram", t = "nagaram"
//Output: true
package dsa;

import java.util.Arrays;

public class ValidAnagram {
	public static boolean validAnagram(String s,String t) {
		char[] sSorted = s.toCharArray();
		char[] tSorted = t.toCharArray();
		if(sSorted.length!=tSorted.length) {
			return false;
		}
		Arrays.sort(sSorted);
		Arrays.sort(tSorted);
		return Arrays.equals(sSorted, tSorted);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "anagram";
String t = "nagaram";
System.out.println(validAnagram(s,t));
	}

}
