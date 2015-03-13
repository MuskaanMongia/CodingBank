package stacksAndQueues;

import java.util.EmptyStackException;


public class TwoStackProblem {

	/*Problem Statement 
	 * Implement two stacks using a N size array 
	 * 
	 * Aprroach :
	 * Take two pointers 
	 * 1. top1 and top2 pointing to top position of stacks.
	 * 2. keep track of size and pointer overlapping
	 * 
	 */
	int[] array;
	int topOne;
	int topTwo;
	
	public TwoStackProblem(int N){
		array = new int[N];
		topOne = -1;
		topTwo = N;
	}
	
	public boolean isFull(){
		return ((topTwo-topOne) == 1);
	}
	
	public boolean isEmpty(int stackNum){
		if(stackNum == 0)
			return (topOne == -1); 
		else
			return (topTwo == (array.length));
	}
	
	public int size(int stackNum){
		if(stackNum == 0)
			return topOne+1;
		else
			return (array.length - topTwo);
	}
	
	public void push(int value, int stackNum){
		if(isFull()){
			System.out.println("\n Stack OverFlow");
			return ;
		}
		
		if(stackNum == 0){
			topOne++;
			array[topOne] = value;	
		}
		else{
			topTwo--;
			array[topTwo] = value;
		}
		
	}
	
	public int pop(int stackNum){
		int retVal; 
		
		if(isEmpty(stackNum)){
			System.out.println("\n Stack Empty");
			throw new EmptyStackException();
		}
		
		if(stackNum == 0 ){
			retVal = array[topOne];
			topOne--;
		}
		else{
			retVal = array[topTwo];
			topTwo++;
		}
		
		return retVal;
	}
	
	
	
	public void driver()
	{
		System.out.println("*** HELLO TWO STACK PROBLEM ***");
	}
}
