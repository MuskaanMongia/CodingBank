package strings;

public class IndexOfStr {

	/*Problem Statement:
	 * 	Write a function to find index of substring in a string 
	 * 
	 * Return Value 
	 * On success Index value , -1 failure 
	 * 
	 * we will be solving this problem in O(n) complexity
	 * 
	 */
	
	public int indexOf(String mainStr, String subStr){

		int returnVal = -1;
		int mainLen = mainStr.length();
		int subLen = subStr.length();
		int m1 =0; // will act as pointer to the current character in array  
		int s1 =0;
		
		while(m1<mainLen){
			if(mainStr.charAt(m1) == subStr.charAt(s1)){
				m1++;
				s1++;
			}
			else if(mainStr.charAt(m1) != subStr.charAt(s1)){
				m1++;
				s1=0;
			}
			if(s1 == subLen){
				returnVal = m1-s1;
				break;
			}
		}
		return returnVal;		
	}
	
	public void driver(){
		System.out.println("Find Index Of substring Driver function");
	}
	
}
