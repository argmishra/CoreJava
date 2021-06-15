package com.demo.collection;

import com.demo.collection.iteration.ListIterationDemo;
import com.demo.collection.iteration.MapIterationDemo;
import com.demo.collection.list.ArrayListDemo;
import com.demo.collection.list.LinkedListDemo;
import com.demo.collection.list.StackDemo;
import com.demo.collection.list.VectorDemo;
import com.demo.collection.map.EnumMapDemo;
import com.demo.collection.map.HashMapDemo;
import com.demo.collection.map.HashTableDemo;
import com.demo.collection.map.LinkedHashMapDemo;
import com.demo.collection.map.TreeMapDemo;
import com.demo.collection.queue.ArrayDequeDemo;
import com.demo.collection.queue.PriorityQueueDemo;
import com.demo.collection.set.EnumSetDemo;
import com.demo.collection.set.HashSetDemo;
import com.demo.collection.set.LinkedHashSetDemo;
import com.demo.collection.set.TreeSetDemo;
import com.demo.collection.sort.ListSortingDemo;
import com.demo.collection.sort.MapSortingDemo;

public class CollectionMainApplication {

	public static void main(String[] args) {
		new MapSortingDemo().primitiveSortingDemo();
		new MapSortingDemo().objectSortingDemo();
		new ListSortingDemo().primitiveSortingDemo();
		new ListSortingDemo().objectSortingDemo();
		new EnumMapDemo().enumMapDemo();
		new HashTableDemo().hashTableDemo();
		new TreeMapDemo().treeMapDemo();
		new LinkedHashMapDemo().linkedhashMapDemo();
		new HashMapDemo().hashMapDemo();
		new MapIterationDemo().objectIterationDemo();
		new MapIterationDemo().primitiveIterationDemo();
		new EnumSetDemo().enumSetDemo();
		new StackDemo().stackListDemo();
		new VectorDemo().vectorListDemo();
		new ArrayDequeDemo().arrayDeqeueDemo();
		new PriorityQueueDemo().priorityQueueDemo();
		new TreeSetDemo().treehSetDemo();
		new LinkedHashSetDemo().linkedhashSetDemo();
		new HashSetDemo().hashSetDemo();
		new ArrayListDemo().arrayListDemo();
		new LinkedListDemo().linkedListDemo();
		new ListIterationDemo().primitiveIterationDemo();
		new ListIterationDemo().objectIterationDemo();
	}

}
