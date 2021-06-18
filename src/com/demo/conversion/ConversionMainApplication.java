package com.demo.conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConversionMainApplication {

	public static void main(String[] args) throws ParseException {

		dateAndTimeConversions();
		fromStringConversions();
		ToStringConversions();
	}

	private static void fromStringConversions() {
		String s1 = "200";
		String s2 = "200.56";
		String s3 = "true";
		Object o1 = s2;

		System.out.println("String to Int = " + Integer.parseInt(s1));
		System.out.println("String to Int = " + Integer.valueOf(s1));

		System.out.println("String to Long = " + Long.parseLong(s1));
		System.out.println("String to Long = " + Long.valueOf(s1));

		System.out.println("String to Double = " + Double.parseDouble(s2));
		System.out.println("String to Double = " + Double.valueOf(s2));

		System.out.println("String to Float = " + Float.parseFloat(s2));
		System.out.println("String to Float = " + Float.valueOf(s2));

		System.out.println("String to Booelan = " + Boolean.parseBoolean(s3));
		System.out.println("String to Booelan = " + Boolean.valueOf(s3));

		System.out.println("String to Object = " + o1);
		System.out.println("String to Enum = " + DAYS.valueOf("MONDAY"));
	}

	private static void ToStringConversions() {
		int n1 = 45;
		long n2 = 89;
		double n3 = 67.98;
		float n4 = 167.98f;
		boolean b1 = true;
		Object o1 = b1;

		System.out.println("Int to String = " + String.valueOf(n1));
		System.out.println("Int to String = " + Integer.toString(n1));
		System.out.println("Int to String = " + String.format("%d", n1));

		System.out.println("Long to String = " + String.valueOf(n2));
		System.out.println("Long to String = " + Long.toString(n2));
		System.out.println("Long to String = " + String.format("%d", n2));

		System.out.println("Double to String = " + String.valueOf(n3));
		System.out.println("Double to String = " + Double.toString(n3));
		System.out.println("Double to String = " + String.format("%f", n3));

		System.out.println("Float to String = " + String.valueOf(n4));
		System.out.println("Float to String = " + Float.toString(n4));
		System.out.println("Float to String = " + String.format("%f", n4));

		System.out.println("Booelan to String = " + String.valueOf(b1));
		System.out.println("Booelan to String = " + Boolean.toString(b1));
		System.out.println("Booelan to String = " + String.format("%b", b1));

		System.out.println("Object to String = " + o1.toString());
		System.out.println("Enum to String = " + DAYS.SUNDAY.toString());
	}

	private static void dateAndTimeConversions() throws ParseException {
		String date1 = "17/06/2021";
		String date2 = "08:45:08";
		String date3 = "17/06/2021 08:45:08";

		System.out.println(
				"Date to String = " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()));
		System.out.println("String to Date = "
				+ new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse(date1)));

		System.out.println(
				"Time to String = " + new SimpleDateFormat("hh:mm:ss a").format(Calendar.getInstance().getTime()));
		System.out.println("String to Time = "
				+ new SimpleDateFormat("hh:mm:ss").format(new SimpleDateFormat("hh:mm:ss").parse(date2)));

		System.out.println("Date & Time to String = "
				+ new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").format(Calendar.getInstance().getTime()));
		System.out.println("String to Date & Time = " + new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
				.format(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(date3)));
	}

}
