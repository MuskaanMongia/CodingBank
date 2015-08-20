package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingOneQueue {

	/*
	 * Problem Statement :
	 * 		Implement stack using one queue 
	 * 
	 * Solution:
	 * 	Push : Simply insert into queue
	 * Pop: Tricky Part -- Remove all elements from queue one by one and insert again except the last 
	 * 		last element .. return Nth element
	 * 
	 */
	public Queue<Integer> q = new ArrayDeque<Integer>();
	
	
	public boolean isEmpty(){
		return q.isEmpty();
	}
	
	public int size(){
		return q.size();
	}
	
	public void push(int value){
		q.add(value);
	}
	
	public int pop(){
		
		for(int i=0; i<(q.size()-1); i++){
			int temp = q.poll();
			q.add(temp);
		}
		
		return q.poll();
	}
	
}
