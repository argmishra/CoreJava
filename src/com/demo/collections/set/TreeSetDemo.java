package com.demo.collections.set;

import java.util.Set;
import java.util.TreeSet;

// extends AbstractSet<E> implements NavigableSet<E>, Cloneable, java.io.Serializable
public class TreeSetDemo {
	public Set<String> treehSet = null;

	public void treehSetDemo() {
		treehSet = new TreeSet<String>();

		// Check if empty
		System.out.println("Check if empty =  " + treehSet.isEmpty());

		// add element
		treehSet.add("First");
		treehSet.add("Duplicate");
		treehSet.add("Duplicate");
		System.out.println("After adding element = " + treehSet);

		// remove element
		treehSet.add("Third");
		System.out.println("After adding element = " + treehSet);
		treehSet.remove("Third");
		System.out.println("After removing element = " + treehSet);

		// size
		System.out.println("List size = " + treehSet.size());

	}

}
