package com.demo.collection.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
public class HashMapDemo {

	public Map<Integer, String> hashMap = null;

	public void hashMapDemo() {
		hashMap = new HashMap<Integer, String>();

		// Check if empty
		System.out.println("Check if empty =  " + hashMap.isEmpty());

		// add element
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(2, "TWO");
		hashMap.put(null, "Three");
		hashMap.put(null, "dfds");
		hashMap.put(3, null);
		hashMap.put(4, null);
		hashMap.put(5, "TWO");
		System.out.println("After adding element = " + hashMap);

		// add element if absent
		hashMap.put(4, "Four");
		System.out.println("After adding element if absent = " + hashMap);

		// change element
		hashMap.replace(1, "One", "1");
		System.out.println("After changing element = " + hashMap);

		// remove element
		hashMap.remove(4, "Four");
		System.out.println("After removing element = " + hashMap);

		// size
		System.out.println("After removing element = " + hashMap.size());

		Map<Integer, String> hashMap2 = new HashMap<Integer, String>();
		hashMap2.put(1, "One");
		hashMap2.put(2, "TWO");
		hashMap2.put(3, "Three");

		// Compare Map
		System.out.println("Compare Map = " + hashMap.equals(hashMap2));

		// Compare Map Key
		System.out.println("Compare Map Key = " + hashMap.keySet().equals(hashMap2.entrySet()));

		// Compare Map Value
		System.out.println("Compare Map Value = " + hashMap.values().equals(hashMap2.values()));

		// Unique Map Values
		System.out.println(" Non Unique Map Value = " + hashMap.values());
		System.out.println("Unique Map Value = " + new HashSet<>(hashMap.values()));

	}

}
