package com.demo.collection.sort;

import java.util.Comparator;

import com.demo.collection.iteration.User;

public class AgeSorter implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
