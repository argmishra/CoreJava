package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable
public class ArrayListDemo {

	public List<String> arrayList = null;

	public void arrayListDemo() {
		arrayList = new ArrayList<String>();

		// Check if empty
		System.out.println("Check if empty =  " + arrayList.isEmpty());

		// Add element
		arrayList.add("First");
		arrayList.add("Duplicate");
		arrayList.add("Duplicate");
		arrayList.add(null);
		System.out.println("After adding element = " + arrayList);

		// Unique list
		List<String> listWithoutDuplicates = arrayList.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique list = " + listWithoutDuplicates);

		// Change element
		arrayList.set(2, "Second");
		System.out.println("After changing element = " + arrayList);

		// Remove element
		arrayList.add("Third");
		System.out.println("After adding element = " + arrayList);
		arrayList.remove("Third");
		System.out.println("After removing element = " + arrayList);

		// Size
		System.out.println("List size = " + arrayList.size());
		System.out.println("Empty List = " + arrayList.isEmpty());

		// To array
		System.out.println("List as array = " + arrayList.toArray(String[]::new).length);

		// Compare list
		ArrayList<String> arratListNew = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));
		System.out.println("Compare list = " + arrayList.equals(arratListNew));

		// Merge list
		arratListNew.addAll(arrayList);
		System.out.println("Merge list = " + arratListNew);

	}

}
