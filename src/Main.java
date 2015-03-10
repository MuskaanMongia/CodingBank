import java.util.HashMap;

import stacksAndQueues.KStackProblem;


public class Main {

	public static HashMap<String,Integer> driverMap = new HashMap<String,Integer>();
	
	/*
	  Adding values to the HashMap 
	  Will keep on growing as Code base grows 
	 */
	
	
	
	
	public static void main(String[] args){
		KStackProblem ks = new KStackProblem(3, 10);
		
		ks.push(20, 1);
		ks.push(21, 1);
		ks.push(22, 1);
		
		ks.push(23, 2);
		ks.push(24, 2);
		ks.push(25, 2);
		
		ks.push(26, 0);
		ks.push(27, 0);
		ks.push(28, 0);
		ks.pop(2);
		ks.pop(0);
		ks.push(29, 0);
		ks.push(30, 2);
		
		
		ks.driver(3,10);
		
	}
	
}
