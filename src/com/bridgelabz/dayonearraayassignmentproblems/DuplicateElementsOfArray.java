package com.bridgelabz.dayonearraayassignmentproblems;

/*Java Program to print the duplicate elements of an array*/

public class DuplicateElementsOfArray {
	public static void main(String[] args) {
		int array[] = { 2, 5, 6, 3, 4, 1, 8, 7, 9 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i ; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[j]);
				}
			}
		}
	}

}
