package com.demo.exception;

public class ExceptionMainApplication {

	public static void main(String[] args) throws VoteEligibilityException {
		int age = 13;

		if (age > 18) {
			System.out.print("You are eligible");
		} else {
			throw new VoteEligibilityException("You are not eligible");
		}

	}

}
