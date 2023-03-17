package com.bridgelabz.dayonearraayassignmentproblems;

/*Java Program to print the elements of an array present on odd position*/

import java.util.Scanner;

public class ArrayPresentOnOddPosition {
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
		System.out.println("The array present on odd possition is");
		int i = 1;
		while (i < n) {
			System.out.println(array[i]);
			i = i + 2;
		}
	}
}