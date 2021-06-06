package com.demo.collections.set;

import java.util.HashSet;
import java.util.Set;

// extends AbstractSet<E> implements Set<E>, Cloneable, java.io.Serializable
public class HashSetDemo {

	public Set<String> hashSet = null;

	public void hashSetDemo() {
		hashSet = new HashSet<String>();

		// Check if empty
		System.out.println("Check if empty =  " + hashSet.isEmpty());

		// add element
		hashSet.add("First");
		hashSet.add("Duplicate");
		hashSet.add("Duplicate");
		hashSet.add(null);
		System.out.println("After adding element = " + hashSet);

		// remove element
		hashSet.add("Third");
		System.out.println("After adding element = " + hashSet);
		hashSet.remove("Third");
		System.out.println("After removing element = " + hashSet);

		// size
		System.out.println("List size = " + hashSet.size());

	}

}
