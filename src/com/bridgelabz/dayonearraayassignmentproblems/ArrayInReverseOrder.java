package com.bridgelabz.dayonearraayassignmentproblems;

/*Java Program to print the elements of an array in reverse order*/

import java.util.Scanner;

public class ArrayInReverseOrder {
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
		System.out.println("Theelementsof array in reverse order");
		for (int i = n - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}
}
