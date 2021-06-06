package com.demo.collections.set;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

// extends Enum<E>> extends AbstractSet<E> implements Cloneable, java.io.Serializable
public class EnumSetDemo {

	public void enumSetDemo() {
		Set<Days> days = EnumSet.of(Days.SATURDAY, Days.MONDAY, Days.FRIDAY);
		Iterator<Days> day = days.iterator();
		while (day.hasNext())
			System.out.println(day.next());
	}

}
