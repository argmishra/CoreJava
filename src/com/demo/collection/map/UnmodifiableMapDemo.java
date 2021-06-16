package com.demo.collection.map;

import java.util.Collections;
import java.util.Map;

public class UnmodifiableMapDemo {

	public Map<Integer, String> hashMap = null;

	public void unmodifiableMapDemo() {
		hashMap = Collections.unmodifiableMap(Map.of(1, "b", 3, "d"));

		System.out.println("HashMap =  " + hashMap);

		// This will throw exception
		hashMap.put(1, "One");

	}

}
