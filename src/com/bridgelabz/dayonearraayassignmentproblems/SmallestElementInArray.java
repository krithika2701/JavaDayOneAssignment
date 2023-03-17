package com.bridgelabz.dayonearraayassignmentproblems;

import java.util.Scanner;

/*Java Program to print the smallest element in an array*/

public class SmallestElementInArray {
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

		System.out.println("The smalest element of arrayis " + array[0]);

	}
}
