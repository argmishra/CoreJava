package com.demo.collection.iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterationDemo {

	public static Map<Integer, String> map = null;
	public static Map<String, User> userMap = null;

	static {
		map = new HashMap<Integer, String>();
		map.put(1, "Anurag");
		map.put(2, "Sonu");
		map.put(3, "Optimus");

		userMap = new HashMap<String, User>();
		userMap.put("1", new User("Anurag"));
		userMap.put("2", new User("Sonu"));
		userMap.put("3", new User("Optimus"));
	}

	public void primitiveIterationDemo() {
		System.out.println("Using Iterator");
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("Using enhanced for loop");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("Using streaming");
		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

		System.out.println("Using lambdas");
		map.forEach((k, v) -> System.out.println((k + ":" + v)));

	}

	public void objectIterationDemo() {
		System.out.println("Using Iterator");
		Iterator<Map.Entry<String, User>> itr = userMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, User> entry = itr.next();
			System.out.println(entry.getKey() + ":" + ((User) entry.getValue()).getName());
		}

		System.out.println("Using enhanced for loop");
		for (Map.Entry<String, User> m : userMap.entrySet()) {
			System.out.println(m.getKey() + ":" + ((User) m.getValue()).getName());
		}

		System.out.println("Using streaming");
		userMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue().getName()));

		System.out.println("Using lambdas");
		userMap.forEach((k, v) -> System.out.println((k + ":" + v.getName())));

	}

}
