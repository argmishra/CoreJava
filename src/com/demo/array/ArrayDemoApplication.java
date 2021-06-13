package com.demo.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ArrayDemoApplication {

	public static void main(String[] args) {
		Integer[] intArray = primitiveArray();
		User[] userArray = objectArray();
		cloneArray(userArray, intArray);
		arrayToList(userArray, intArray);
		checkArray(userArray, intArray);
		copyArray(userArray, intArray);
		fillArray(userArray, intArray);
		searchArray(userArray, intArray);
		combineArray(userArray, intArray);
		sortArray(userArray, intArray);
		mismatchArray(userArray, intArray);
		parallelPrefix(intArray);
		streamArray(userArray, intArray);
		splitIteratorArray(userArray, intArray);
		compareArray(userArray, intArray);
	}

	private static void compareArray(User[] userArray, Integer[] intArray) {
		Integer[] intCopyArray = Arrays.copyOf(intArray, intArray.length + 1);
		intCopyArray[8] = 12;
		System.out.println("Compare Int Array = " + Arrays.compare(intCopyArray, intArray));
	}

	private static void streamArray(User[] userArray, Integer[] intArray) {
		System.out.println("Stream Operation on Int Array = " + Arrays.stream(intArray).count());
		System.out.println("Stream Operation on User Array = " + Arrays.stream(userArray).findFirst().get());
	}

	private static void splitIteratorArray(User[] userArray, Integer[] intArray) {
		System.out.println("Split Iterator for Int  ");
		Arrays.spliterator(intArray).forEachRemaining(value -> System.out.print(value + " "));
		System.out.println();

		System.out.println("Split Iterator for User");
		Arrays.spliterator(userArray).forEachRemaining(user -> System.out.print(user + " "));
		System.out.println();
	}

	private static void parallelPrefix(Integer[] intArray) {
		Arrays.parallelPrefix(intArray, (left, right) -> left + right);
		System.out.println("Addition of adjacent numbers = " + Arrays.toString(intArray));
	}

	private static void mismatchArray(User[] userArray, Integer[] intArray) {
		Integer mismatchIntArray[] = { 4, 6, 5, 8 };
		System.out.println("Check same value in Int array = " + Arrays.mismatch(mismatchIntArray, intArray));

		User userMismatchArray[] = new User[1];
		userMismatchArray[0] = new User(1, "Sonu");
		userArray[0] = userMismatchArray[0];
		System.out.println("Check same value in User array = " + Arrays.mismatch(userMismatchArray, userArray));
		userArray[0] = new User(2, "Anurag");

	}

	private static void sortArray(User[] userArray, Integer[] intArray) {
		Arrays.parallelSort(intArray);
		System.out.println("Sort Int Array = " + Arrays.toString(intArray));

		Arrays.sort(userArray, Comparator.comparing(User::getName));
		System.out.println("Sort User Array by name = " + Arrays.toString(userArray));
	}

	private static void combineArray(User[] userArray, Integer[] intArray) {
		Integer combineIntArray[] = { 18, 19, 20 };
		int[] resultIntArray = new int[combineIntArray.length + intArray.length];
		Arrays.setAll(resultIntArray, i -> (i < intArray.length ? intArray[i] : combineIntArray[i - intArray.length]));
		System.out.println("Combined Int Array = " + Arrays.toString(resultIntArray));

		User userNewArray[] = new User[2];
		userNewArray[0] = new User(10, "McQueen");
		userNewArray[1] = new User(12, "Thorin");
		System.out.println("Combined User Array = "
				+ Arrays.toString(Stream.of(userNewArray, userArray).flatMap(Stream::of).toArray()));

	}

	private static void copyArray(User[] userArray, Integer[] intArray) {
		User[] userCopy = Arrays.copyOf(userArray, userArray.length + 1);
		userCopy[2] = new User(3, "Optimus");
		System.out.println("Copy User Array = " + Arrays.toString(userCopy));

		Integer[] intCopyArray = Arrays.copyOf(intArray, intArray.length + 1);
		intCopyArray[8] = 12;
		System.out.println("Copy Int Array = " + Arrays.toString(intCopyArray));
	}

	private static void fillArray(User[] userArray, Integer[] intArray) {
		Arrays.fill(intArray, 6, 7, 12);
		System.out.println("Fill Int Array = " + Arrays.toString(intArray));

		Arrays.fill(userArray, 1, 2, new User(4, "Bee"));
		System.out.println("Fill User Array = " + Arrays.toString(userArray));
	}

	private static void searchArray(User[] userArray, Integer[] intArray) {
		System.out.println("Search Int Array = " + Arrays.binarySearch(intArray, 6));

		User user = new User();
		user = userArray[0];
		System.out.println("Search User Array = " + Arrays.asList(userArray).contains(user));
	}

	private static void cloneArray(User[] userArray, Integer[] intArray) {
		User[] userArrayClone = userArray.clone();
		System.out.println("Clone User Array = " + Arrays.toString(userArrayClone));

		Integer[] intArrayClone = intArray.clone();
		System.out.println("Clone Int Array = " + Arrays.toString(intArrayClone));
	}

	private static void arrayToList(User[] userArray, Integer[] intArray) {
		System.out.println("User Array as List = " + Arrays.asList(userArray));

		System.out.println("Int Array as List = " + Arrays.asList(intArray));
	}

	private static void checkArray(User[] userArray, Integer[] intArray) {
		System.out.println("Check User Array = " + Arrays.equals(userArray, userArray.clone()));

		Integer checkIntArray[] = { 6, 5, 6, 7, 8, 9, 10 };
		System.out.println("Check Int Array = " + Arrays.equals(intArray, checkIntArray));
	}

	private static User[] objectArray() {
		User[] users = new User[2];
		users[0] = new User(1, "Sonu");
		users[1] = new User(2, "Anurag");
		for (User user : users) {
			System.out.println("User Detail = " + user);
		}
		return users;
	}

	private static Integer[] primitiveArray() {
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		System.out.println("Iterate using for loop");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		Integer b[] = { 4, 6, 5, 6, 7, 8, 9, 10 };
		System.out.println("Iterate using for each loop");
		for (int j : b) {
			System.out.print(j + " ");
		}
		System.out.println();

		System.out.println("Multi Dimesional Array");

		int c[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		return b;
	}

}
