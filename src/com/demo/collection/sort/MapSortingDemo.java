package com.demo.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.demo.collection.iteration.Employee;

public class MapSortingDemo {

	public static Map<Integer, String> map = null;
	public static Map<String, Employee> userMap = null;

	static {
		map = new HashMap<Integer, String>();
		map.put(2, "Sonu");
		map.put(1, "Anurag");
		map.put(3, "Optimus");

		userMap = new LinkedHashMap<String, Employee>();
		userMap.put("1", new Employee("Zee", 45, 1));
		userMap.put("3", new Employee("Anurag", 29, 22));
		userMap.put("4", new Employee("Sonu", 25, 8));
		userMap.put("2", new Employee("OPtimus", 49, 2));
		userMap.put("5", new Employee("Bee", 49, 2));
	}

	public void primitiveSortingDemo() {
		System.out.println("Using Tree Map");
		Map<Integer, String> sorted = new TreeMap<Integer, String>(map);
		System.out.println(sorted);

		System.out.println("Using List Sort By Key");
		List<Integer> key = new ArrayList<Integer>(map.keySet());
		Collections.sort(key);
		System.out.println(key);

		System.out.println("Using List Sort By Value");
		List<String> value = new ArrayList<String>(map.values());
		Collections.sort(value);
		System.out.println(value);

		System.out.println("Using Streaming Sort By Key");
		map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByKey()).forEach(System.out::println);

		System.out.println("Using Streaming Sort By Value");
		map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue()).forEach(System.out::println);

	}

	public void objectSortingDemo() {
		System.out.println("Using Tree Map sort by id");
		Map<String, Employee> sorted = new TreeMap<String, Employee>(userMap);
		System.out.println(sorted);

		System.out.println("Using List Sort By Key");
		List<String> key = new ArrayList<String>(userMap.keySet());
		Collections.sort(key);
		System.out.println(key);

		System.out.println("Using List Sort By Value");
		List<Employee> value = new ArrayList<Employee>(userMap.values());
		Collections.sort(value);
		System.out.println(value);

		System.out.println("Using Streaming Sort By Key");
		userMap.entrySet().stream().sorted(Map.Entry.<String, Employee>comparingByKey()).forEach(System.out::println);

		System.out.println("Using Streaming Sort By Value");
		userMap.entrySet().stream().sorted(Map.Entry.<String, Employee>comparingByValue()).forEach(System.out::println);

		System.out.println("Using Streaming Sort By value filed");
		Comparator<Employee> cm = Comparator.comparing(Employee::getId).thenComparing(Employee::getName);
		userMap.entrySet().stream().sorted(Map.Entry.<String, Employee>comparingByValue(cm))
				.forEach(System.out::println);
	}

}
