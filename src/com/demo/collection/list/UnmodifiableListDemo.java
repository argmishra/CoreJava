package com.demo.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListDemo {

	public List<String> arrayList = null;

	public void unmodifiableListDemo() {
		arrayList = Collections.unmodifiableList(Arrays.asList("a", "b", "c", "d", "f"));

		System.out.println("List = " + arrayList);

		// This will throw exception
		arrayList.add("First");

	}

}
