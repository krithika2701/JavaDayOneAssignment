package com.bridgelabz.dayonearraayassignmentproblems;

/*Java program to print the second Largest Number in an Array*/

import java.util.Scanner;

public class SecondLargestNumberInArray {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of  elements");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int array[] = new int[n];
		System.out.print("The elements of array");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			System.out.println(array[i]);
		}

		System.out.println("The second largest element of array is " + array[n - 2]);

	}

}
