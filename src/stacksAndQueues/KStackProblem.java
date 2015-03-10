package stacksAndQueues;

import java.util.EmptyStackException;

/*
 * Problem Statement :
 * Efficiently implement K stacks in N size array
 *
 * Approach(s):
 * 1. Divide the array into K parts and implement one stack in each part.
 * 	  Not so efficient. does not use space property of array
 * 
 * 2. Take two arrays topIndex and nextIndex of integers of size K and N respectively.
 * 	  In topIndex maintain topIndexes elements of all stacks  
 *    In nextIndex maintain indexes for the next items in given array
 *    
 *  Notes: For implementation we are taking array of integers to implement integer stacks.
 *  	 This implementation will hold good for any type of stack. (Strings,Objects etc.)
 *  	topIndex and nextIndex will always stores integer value only  
 *  
 */

public class KStackProblem {

	int[] array; 
	int[] topIndex;
	int[] nextIndex;
	
	int curpointer; //This index keeps a pointer to current free position in array. 
	/*
	 * Constructor: It will do all the initialization and set up part 
	 */
	public KStackProblem(int K, int N){
		
		array = new int[N];
		topIndex = new int[K];
		nextIndex = new int[N];
		
		// initialize all top Elements to -1;
		for(int i=0; i<K; i++)
			topIndex[i] = -1;
		
		// point to next elements in array
		for(int i=0; i<N-1; i++)
			nextIndex[i] = i+1;

		curpointer = 0;
		nextIndex[N-1] = -1; // its the last element It cannot point to anything.
		
	}
	
	// function to check a stack is empty or not
	public boolean isEmpty(int stackNum){
		return (topIndex[stackNum] == -1);
	}
	
	// function to check stack is full or not
	public boolean isFull(){
		return (curpointer == -1); // when curpointer is at last position of array
	}
	
	public void push(int value, int stackNum){
		
		if(isFull()){
			System.out.println("\n Stack OverFlow. Maximum Limit Reached");
			return ;	
		}
		// get position to be stored
		int i = curpointer;
		curpointer = nextIndex[i];
		// change next pointer
		nextIndex[i] = topIndex[stackNum];
		topIndex[stackNum] = i;

		array[i] = value;	
	}
	
	public int pop(int stackNum){
		
		if(isEmpty(stackNum)){
			System.out.println("\n Stack Empty.");
			throw new EmptyStackException();	
		}
		// tricky part of the code 1. update topIndex 2. change nextIndex and restore curpointer
		int i = topIndex[stackNum];
		topIndex[stackNum] = nextIndex[i];

		nextIndex[i] = curpointer;
		curpointer = i;
		
		return array[i];
		
	}
	
	public int size(int stackNum){
		int size = 0;
		int top = topIndex[stackNum];
		while(nextIndex[top] != -1){
			top = nextIndex[top];
			size++;
		}
		
		return ++size;
	}
	
	public void driver(int K, int N)
	{
		System.out.println("\n *****HELLO K STACK PROBLEM****");		
		System.out.println("\n *****BBYE K STACK PROBLEM****");
	}
}
