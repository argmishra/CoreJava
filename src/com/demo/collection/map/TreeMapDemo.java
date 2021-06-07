package com.demo.collection.map;

import java.util.Map;
import java.util.TreeMap;

// extends <K,V> implements NavigableMap<K,V>, Cloneable, java.io.Serializable
public class TreeMapDemo {

	public Map<Integer, String> treeMap = null;

	public void treeMapDemo() {
		treeMap = new TreeMap<Integer, String>();

		// Check if empty
		System.out.println("Check if empty =  " + treeMap.isEmpty());

		// add element
		treeMap.put(1, "One");
		treeMap.put(2, "Two");
		treeMap.put(2, "TWO");
		treeMap.put(3, null);
		treeMap.put(4, null);
		treeMap.put(5, "TWO");
		System.out.println("After adding element = " + treeMap);

		// add element if absent
		treeMap.put(4, "Four");
		System.out.println("After adding element if absent = " + treeMap);

		// change element
		treeMap.replace(1, "One", "1");
		System.out.println("After changing element = " + treeMap);

		// remove element
		treeMap.remove(4, "Four");
		System.out.println("After removing element = " + treeMap);

		// size
		System.out.println("After removing element = " + treeMap.size());

	}

}
