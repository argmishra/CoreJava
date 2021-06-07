package com.demo.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

// extends HashSet<E> implements Set<E>, Cloneable, java.io.Serializable {
public class LinkedHashSetDemo {

	public Set<String> linkedhashSet = null;

	public void linkedhashSetDemo() {
		linkedhashSet = new LinkedHashSet<String>();

		// Check if empty
		System.out.println("Check if empty =  " + linkedhashSet.isEmpty());

		// add element
		linkedhashSet.add("First");
		linkedhashSet.add("Duplicate");
		linkedhashSet.add("Duplicate");
		linkedhashSet.add(null);
		System.out.println("After adding element = " + linkedhashSet);

		// remove element
		linkedhashSet.add("Third");
		System.out.println("After adding element = " + linkedhashSet);
		linkedhashSet.remove("Third");
		System.out.println("After removing element = " + linkedhashSet);

		// size
		System.out.println("List size = " + linkedhashSet.size());

	}

}
