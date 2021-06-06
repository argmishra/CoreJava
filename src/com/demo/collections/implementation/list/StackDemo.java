package com.demo.collections.implementation.list;

import java.util.Stack;

// extends Vector<E> 
public class StackDemo {

	public Stack<String> stackList = null;

	public void stackListDemo() {
		stackList = new Stack<String>();

		// Check if empty
		System.out.println("Check if empty =  " + stackList.isEmpty());

		// add element
		stackList.push("First");
		stackList.push("Duplicate");
		stackList.push(null);
		stackList.push("Duplicate");
		System.out.println("After adding element = " + stackList);

		// remove element
		stackList.pop();
		System.out.println("After removing element = " + stackList);

		// top element
		System.out.println("Top element = " + stackList.peek());

		// search element
		System.out.println("Top element = " + stackList.search("Duplicate"));

		// size
		System.out.println("Top element = " + stackList.size());

	}
}
