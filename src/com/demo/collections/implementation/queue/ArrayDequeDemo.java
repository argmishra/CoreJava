package com.demo.collections.implementation.queue;

import java.util.ArrayDeque;
import java.util.Deque;

//  extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable
public class ArrayDequeDemo {

	public Deque<String> arrayDeqeue = null;

	public void arrayDeqeueDemo() {
		arrayDeqeue = new ArrayDeque<String>();

		// Check if empty
		System.out.println("Check if empty =  " + arrayDeqeue.isEmpty());

		// add element
		arrayDeqeue.add("First");
		arrayDeqeue.add("Second");
		arrayDeqeue.add("Second");
		System.out.println("After adding element = " + arrayDeqeue);

		// remove element
		arrayDeqeue.remove();
		System.out.println("After removing element = " + arrayDeqeue);

		// size
		System.out.println("List size = " + arrayDeqeue.size());

	}
}
