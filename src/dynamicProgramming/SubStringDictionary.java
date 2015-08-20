package dynamicProgramming;

import java.lang.reflect.Array;

public class SubStringDictionary {

	/*
	 *	Problem Statement:
	 *		You are provided with an input string and dictionary of words. 
	 *		You have to write a program to tell whether the input string can be broken into dictionary words
	 *		For e.g.
	 *		Dictionary = {"i","sam","sung","like","cream","ice"}
	 *		input = "ilike";
	 *		Result = TRUE, "i like"
	 *
	 *  Solution:
	 *  	This problem can be solved with recursively. 
	 *  	But we can get a better solution by using a dynamic programming.
	 *  
	 * 	>> we create a boolean array Wbt[i] will be true only if substr(0,i-1) can be segmented into 
	 * 		dictionary words.
	 *  	
	 */
	
	String[] dictionary = new String[]{"i", "like", "asda", "qeewq", "sam"};
	
	public void Driver(){
		System.out.print("#### SUBSTRING DICTIONARY PROBLEM DRIVER ####");
	}
	
	
	public boolean dictionaryContains(String word){
		
		for(int i=0; i<dictionary.length; i++){
			if(word.equals(dictionary[i]))
					return true;
		}
		return false;
	}
	
	public boolean isWordBreakable(String str){
		// base case
		int length = str.length();
		if(length == 0)
				return true;
		
		// create a boolean array 
		boolean[] isWB = new boolean[length+1]; 
		for(int i=0; i<=length; i++)
			isWB[i] = false;
		
		for(int i=0; i<=length; i++){
			
			if(isWB[i] == false && dictionaryContains(str.substring(0, i)))
				isWB[i] = true;

			if(isWB[i] == true){
				
				if(i==(length))
					return true;
				
				for(int j= i+1; j<=length; j++){
					
					if(isWB[j] == false && dictionaryContains(str.substring(i, j))){
						isWB[j] = true;
						i=j;
					}
					
					if(j == (length) && isWB[j] == true)
						return true;
				}
				
			}
			
		}
		
		return false;
	}
	
	
}
