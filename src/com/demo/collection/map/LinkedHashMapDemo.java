package com.demo.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

//  extends linkedhashMap<K,V> implements Map<K,V>
public class LinkedHashMapDemo {

	public Map<Integer, String> linkedhashMap = null;

	public void linkedhashMapDemo() {
		linkedhashMap = new LinkedHashMap<Integer, String>();

		// Check if empty
		System.out.println("Check if empty =  " + linkedhashMap.isEmpty());

		// add element
		linkedhashMap.put(1, "One");
		linkedhashMap.put(2, "Two");
		linkedhashMap.put(2, "TWO");
		linkedhashMap.put(null, "Three");
		linkedhashMap.put(null, "dfds");
		linkedhashMap.put(3, null);
		linkedhashMap.put(4, null);
		linkedhashMap.put(5, "TWO");
		System.out.println("After adding element = " + linkedhashMap);

		// add element if absent
		linkedhashMap.put(4, "Four");
		System.out.println("After adding element if absent = " + linkedhashMap);

		// change element
		linkedhashMap.replace(1, "One", "1");
		System.out.println("After changing element = " + linkedhashMap);

		// remove element
		linkedhashMap.remove(4, "Four");
		System.out.println("After removing element = " + linkedhashMap);

		// size
		System.out.println("After removing element = " + linkedhashMap.size());

	}

}
