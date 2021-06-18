package com.demo.enums;

import java.util.HashMap;
import java.util.Map;

public enum MONTH {

	JAN(1), FEB(2), MAR(3), APR(4);

	int month;

	private MONTH(int month) {
		this.month = month;
	}

	int showMonth() {
		return month;
	}

	private static final Map<Integer, MONTH> lookup = new HashMap<>();
	static {
		for (MONTH month : MONTH.values()) {
			lookup.put(month.showMonth(), month);
		}
	}

	public static MONTH getMonth(int month) {
		return lookup.get(month);
	}

}
