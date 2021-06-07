package com.demo.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.demo.collection.iteration.User;

public class ListSortingDemo {

	public static List<String> list = null;
	public static List<User> userList = null;

	static {
		list = new ArrayList<String>();
		list.add("Three");
		list.add("Two");
		list.add("One");

		userList = new ArrayList<User>();
		userList.add(new User("Zee", 45, 13));
		userList.add(new User("OPtimus", 49, 4));
		userList.add(new User("Anurag", 29, 45));
		userList.add(new User("Sonu", 25, 27));
	}

	public void primitiveSortingDemo() {
		System.out.println("Using Collections");
		Collections.sort(list);
		System.out.println("Sorted List " + list);
	}

	public void objectSortingDemo() {
		System.out.println("Sort by Name");
		Collections.sort(userList);
		for (User u : userList) {
			System.out.println(u);
		}

		System.out.println("Sort by Id");
		Comparator<User> cm1 = Comparator.comparing(User::getAge);
		Comparator<User> cm = Comparator.comparing(User::getId).reversed().thenComparing(cm1);
		Collections.sort(userList, cm);
		for (User u : userList) {
			System.out.println(u);
		}

		System.out.println("Sort by age");
		Collections.sort(userList, new AgeSorter());
		for (User u : userList) {
			System.out.println(u);
		}

	}

}
