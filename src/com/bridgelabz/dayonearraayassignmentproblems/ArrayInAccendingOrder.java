package com.bridgelabz.dayonearraayassignmentproblems;

/*Java Program to sort the elements of an array in ascending order */

import java.util.Scanner;

public class ArrayInAccendingOrder {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of  elements");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int array[] = new int[n];
		System.out.print("The elements of array");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Sorting the elements of array in accending order");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}
}
