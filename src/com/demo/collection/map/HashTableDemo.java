package com.demo.collection.map;

import java.util.Hashtable;
import java.util.Map;

// extends Dictionary<K,V> implements Map<K,V>, Cloneable, java.io.Serializable
public class HashTableDemo {

	public Map<Integer, String> hashTable = null;

	public void hashTableDemo() {
		hashTable = new Hashtable<Integer, String>();

		// Check if empty
		System.out.println("Check if empty =  " + hashTable.isEmpty());

		// add element
		hashTable.put(1, "One");
		hashTable.put(2, "Two");
		hashTable.put(2, "Two");
		System.out.println("After adding element = " + hashTable);

		// add element if absent
		hashTable.put(4, "Four");
		System.out.println("After adding element if absent = " + hashTable);

		// change element
		hashTable.replace(1, "One", "1");
		System.out.println("After changing element = " + hashTable);

		// remove element
		hashTable.remove(4, "Four");
		System.out.println("After removing element = " + hashTable);

		// size
		System.out.println("After removing element = " + hashTable.size());

	}

}
