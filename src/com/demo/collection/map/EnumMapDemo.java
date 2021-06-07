package com.demo.collection.map;

import java.util.EnumMap;
import java.util.Map;

import com.demo.collection.set.Days;

// extends Enum<K>, V> extends AbstractMap<K, V> implements java.io.Serializable, Cloneable
public class EnumMapDemo {

	public void enumMapDemo() {
		EnumMap<Days, String> days = new EnumMap<Days, String>(Days.class);
		days.put(Days.MONDAY, "1");
		days.put(Days.THURSDAY, "4");
		for (Map.Entry<Days, String> m : days.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
