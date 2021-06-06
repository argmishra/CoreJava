package com.demo.collections;

import com.demo.collections.implementation.list.ArrayListDemo;
import com.demo.collections.implementation.list.LinkedListDemo;
import com.demo.collections.implementation.other.IteratingDemo;

public class CollectionsMainApplication {

	public static void main(String[] args) {
		new ArrayListDemo().arrayListDemo();
		new LinkedListDemo().linkedListDemo();
		new IteratingDemo().primitiveIterationDemo();
		new IteratingDemo().objectIterationDemo();


	}

}
