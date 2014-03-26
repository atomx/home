package java.listest;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {
	
	

	public static void main(String[] args) {
		
		LinkedList<String> llist = new LinkedList<String>(); 
		Collections.addAll(llist, "first","second","third");
		System.out.println(llist);
		
		System.out.println("first element:"+llist.getFirst()+" element(): "+llist.element());
		System.out.println("last element:"+llist.getLast());
		System.out.println("peek: "+llist.peek()); //Retrieves, but does not remove, the head (first element) of this list
		
		System.out.println("remove: "+llist.remove());//remove first element
		System.out.println(llist);
		
		System.out.println("add first");
		llist.addFirst("addFirst");
		System.out.println("after add first:"+llist);
		
		System.out.println("remove last");
		llist.removeLast();
		System.out.println("after remove last:"+llist);
		
		
		
		
		
		

	}

}
