package com.demo.collections.implementation.list;

import java.util.ArrayList;
import java.util.List;

// extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable
public class ArrayListDemo {

	public List<String> arrayList = null;

	public void arrayListDemo() {
		arrayList = new ArrayList<String>();
		
		// Check if empty
        System.out.println("Check if empty =  "+arrayList.isEmpty());  

		// add element 
		arrayList.add("First");
		arrayList.add("Duplicate");
		arrayList.add("Duplicate");
		arrayList.add(null);
		System.out.println("After adding element = "+arrayList);
		
		// change element
		arrayList.set(2, "Second");
		System.out.println("After changing element = "+arrayList);
		
		// remove element 
		arrayList.add("Third");
		System.out.println("After adding element = "+arrayList);
		arrayList.remove("Third");
		System.out.println("After removing element = "+arrayList);
		
		// size
		System.out.println("List size = "+arrayList.size());
		
		// to array
		System.out.println("List as array = "+arrayList.toArray(String[]::new).length);
	}

}
