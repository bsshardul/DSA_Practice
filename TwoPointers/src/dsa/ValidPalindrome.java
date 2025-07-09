//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
//Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
//Example 1:
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
package dsa;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for(char c: s.toCharArray()) {
        	if(Character.isLetterOrDigit(c)) {
        		newStr.append(Character.toLowerCase(c));
        	}
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }
    public static void main(String[] args) {
    
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); 
        System.out.println(isPalindrome("race a car")); 
        System.out.println(isPalindrome(" ")); 
    }
}
