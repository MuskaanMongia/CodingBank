package strings;

public class ReverseString {

	/*
	 * Problem Statement:
	 * 	Reverse a String in O(1) space
	 * 
	 *  Solution:
	 *  	Convert into char array and do swaps
	 */
	
	public String stringReverse(String str){
		char[] strArray = str.toCharArray();
		int length = strArray.length;
		for(int i=0; i<(length/2); i++){
			char c = strArray[i];
			strArray[i] = strArray[length-i-1];
			strArray[length-i-1] = c;
			//System.out.println("Swapping strArray === "+ strArray[i] + " === " +strArray[length-i-1]);
		}
		
		str = String.valueOf(strArray);
		return str;
	}
	
	
}
