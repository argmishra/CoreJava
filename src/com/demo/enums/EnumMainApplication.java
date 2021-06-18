package com.demo.enums;

public class EnumMainApplication {

	public static void main(String[] args) {
		System.out.println("Getting value by name = " + MONTH.MAR.month);
		System.out.println("Getting value by name = " + MONTH.valueOf("JAN").showMonth());

		System.out.println("Getting name by value = " + MONTH.getMonth(4));

	}

}
