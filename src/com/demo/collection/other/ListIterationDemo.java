package com.demo.collection.other;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterationDemo {

	public static List<String> list = null;
	public static List<User> userList = null;

	static {
		list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");

		userList = new ArrayList<User>();
		userList.add(new User("Anurag"));
		userList.add(new User("Sonu"));
	}

	public void primitiveIterationDemo() {
		System.out.println("Using Iterator");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Using enhanced for loop");
		for (String element : list) {
			System.out.println(element);
		}

		System.out.println("Using For loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Using ListIterator");
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			System.out.println(list1.previous());
		}

		System.out.println("Using forEach");
		list.forEach(element -> {
			System.out.println(element);
		});

		System.out.println("Using forEachRemaining");
		itr = list.iterator();
		itr.forEachRemaining(element -> {
			System.out.println(element);
		});
	}

	public void objectIterationDemo() {
		System.out.println("Using Iterator");
		Iterator<User> itr = userList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getName());
		}

		System.out.println("Using enhanced for loop");
		for (User user : userList) {
			System.out.println(user.getName());
		}

		System.out.println("Using For loop");
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).getName());
		}

		System.out.println("Using ListIterator");
		ListIterator<User> list1 = userList.listIterator(userList.size());
		while (list1.hasPrevious()) {
			System.out.println(list1.previous().getName());
		}

		System.out.println("Using forEach");
		userList.forEach(user -> {
			System.out.println(user.getName());
		});

		System.out.println("Using forEachRemaining");
		itr = userList.iterator();
		itr.forEachRemaining(user -> {
			System.out.println(user.getName());
		});
	}
}
