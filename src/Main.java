import java.util.HashMap;

import stacksAndQueues.*;
import strings.*;

public class Main {

	public static HashMap<String,Integer> driverMap = new HashMap<String,Integer>();
	
	/*
	  Adding values to the HashMap 
	  Will keep on growing as Code base grows 
	 */
	
	
	
	
	public static void main(String[] args){
	/*	KStackProblem ks = new KStackProblem(3, 10);
		
		ks.push(20, 1);
		ks.push(21, 1);
		ks.push(22, 1);
		
		ks.push(23, 2);
		ks.push(24, 2);
		ks.push(25, 2);
		
		ks.push(26, 0);
		ks.push(27, 0);
		ks.push(28, 0);
		System.out.println("PPPING OUT OF 2---"+ks.pop(2));
		ks.pop(0);
		ks.push(29, 0);
		ks.push(30, 2);
		
		
		ks.driver(3,10); */
		
	/*	
		TwoStackProblem ts = new TwoStackProblem(6);
		
		ts.push(30, 1);
		ts.push(31, 1);
		
		ts.push(32, 0);
		ts.push(33, 0);
		ts.push(33, 0);
		ts.push(33, 0);
		ts.push(33, 0);
		
		System.out.println("POPPPED VALUE FROM ONE ---"+ts.size(1));
		
		*/
		
		IndexOfStr is = new IndexOfStr();
		int index = is.indexOf("Hello World Prog", "orl");
		System.out.println("Index of string is "+ index);
	}
	
}
