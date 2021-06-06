package com.demo.collections.implementation.list;

import java.util.LinkedList;
import java.util.List;

// extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable
public class LinkedListDemo {
	
	public List<String> linkedList = null;

	public void linkedListDemo() {
		linkedList = new LinkedList<String>();
		
		// Check if empty
        System.out.println("Check if empty =  "+linkedList.isEmpty());  

		// add element 
        linkedList.add("First");
        linkedList.add("Duplicate");
		linkedList.add("Duplicate");
        linkedList.add(null);
		System.out.println("After adding element = "+linkedList);
		
		// change element
		linkedList.set(2, "Second");
		System.out.println("After changing element = "+linkedList);
		
		// remove element 
		linkedList.add("Third");
		System.out.println("After adding element = "+linkedList);
		linkedList.remove("Third");
		System.out.println("After removing element = "+linkedList);
		
		// size
		System.out.println("List size = "+linkedList.size());
		
		// to array
		System.out.println("List as array = "+linkedList.toArray(String[]::new).length);
	}
}
