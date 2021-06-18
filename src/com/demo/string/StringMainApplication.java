package com.demo.string;

import java.util.Arrays;
import java.util.Objects;

public class StringMainApplication {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");

		System.out.println("Compare using == " + s1 == s2);
		System.out.println("Compare using equals " + s1.equals(s2));
		System.out.println("Compare using compareTo " + s1.compareTo(s2));
		System.out.println("Compare using equalsIgnoreCase " + s1.equalsIgnoreCase(s2));
		System.out.println("Compare using compareToIgnoreCase " + s1.compareToIgnoreCase(s2));
		System.out.println("Compare using Objects " + Objects.equals(s1, s2));

		String s5 = "";
		String s6 = " ";

		System.out.println("Check s5 for Blank " + s5.isBlank());
		System.out.println("Check s5 for Empty " + s5.isEmpty());

		System.out.println("Check s6 for Blank " + s6.isBlank());
		System.out.println("Check s6 for Empty " + s6.isEmpty());

		String[] myFavouriteLanguages = { "Java", "JavaScript", "Python" };
		String s7 = Arrays.toString(myFavouriteLanguages);
		System.out.println("String by Array =  " + s7);
	}

}
