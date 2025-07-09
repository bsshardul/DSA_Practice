//Design an algorithm to encode a list of strings to a single string. 
//The encoded string is then decoded back to the original list of strings.
//Please implement encode and decode
//Example 1:
//Input: ["neet","code","love","you"]
//Output:["neet","code","love","you"]
package dsa;
import java.util.*;
public class EncodeAndDecodeString {

	
    public String encode(List<String> strs) {
       StringBuilder res =new StringBuilder();
       for(String s:strs) {
    	   res.append(s.length()).append('#').append(s);
       }
        return res.toString();
    }

    
    public List<String> decode(String s) {
    	List<String> res = new ArrayList<>();
   int i=0;
   while(i<s.length()) {
	   int j=i;
	   while(s.charAt(j)!='#') {
		   j++;
	   }
	   int length = Integer.parseInt(s.substring(i,j));
	   i=1+j;
	   j=i+length;
	   res.add(s.substring(i,j));
	   i=j;
	   
	   
   }
        return res;
    }

    public static void main(String[] args) {
        EncodeAndDecodeString codec = new EncodeAndDecodeString();

        List<String> input1 = Arrays.asList("neet", "code", "love", "you");
        String encoded1 = codec.encode(input1);
        List<String> decoded1 = codec.decode(encoded1);

        System.out.println("Original: " + input1);
        System.out.println("Encoded: " + encoded1);
        System.out.println("Decoded: " + decoded1);

      
    }

}
