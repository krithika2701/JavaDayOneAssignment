package com.bridgelabz.dayonearraayassignmentproblems;

/*Java Program to print the largest element in an array*/

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInArray {
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

		System.out.println("The largest element of arrayis" + array[n - 1]);

	}
}
