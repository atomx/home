package javaP.listest;

import java.util.LinkedList;
import java.util.Random;

public class SimulateStackTest<T> {
	
	private LinkedList<T> llist = new LinkedList<T>();
	
	public void push(T element){
		llist.addFirst(element);
		
	}
	
	public T pop(){
		if(!llist.isEmpty())
		return llist.remove();
		
		return null;
	}
	
	public String toString(){
		
		return llist.toString();
		
	}

	public static void main(String[] args) {
		SimulateStackTest<String> stack = new SimulateStackTest<String>();
		
		stack.push("1");
		stack.push("2");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		
		
		Random r = new Random();
		
		
		

	}

}
