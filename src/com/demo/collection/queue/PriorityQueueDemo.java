package com.demo.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

// extends AbstractQueue<E> implements java.io.Serializable
// PriorityBlockingQueue and ArrayBlockingQueue 
public class PriorityQueueDemo {

	public Queue<String> priorityQueue = null;

	public void priorityQueueDemo() {
		priorityQueue = new PriorityQueue<String>();

		// Check if empty
		System.out.println("Check if empty =  " + priorityQueue.isEmpty());

		// add element
		priorityQueue.add("First");
		priorityQueue.add("Second");
		priorityQueue.add("Second");
		System.out.println("After adding element = " + priorityQueue);

		// remove element
		priorityQueue.remove();
		System.out.println("After removing element = " + priorityQueue);

		// size
		System.out.println("List size = " + priorityQueue.size());

	}

}
