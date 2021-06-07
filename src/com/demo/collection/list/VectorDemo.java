package com.demo.collection.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public List<String> vectorList = null;

	public void vectorListDemo() {
		vectorList = new Vector<String>();

		// Check if empty
		System.out.println("Check if empty =  " + vectorList.isEmpty());

		// add element
		vectorList.add("First");
		vectorList.add("Duplicate");
		vectorList.add("Duplicate");
		vectorList.add(null);
		System.out.println("After adding element = " + vectorList);

		// change element
		vectorList.set(2, "Second");
		System.out.println("After changing element = " + vectorList);

		// remove element
		vectorList.add("Third");
		System.out.println("After adding element = " + vectorList);
		vectorList.remove("Third");
		System.out.println("After removing element = " + vectorList);

		// size
		System.out.println("List size = " + vectorList.size());

		// to array
		System.out.println("List as array = " + vectorList.toArray(String[]::new).length);
	}

}
