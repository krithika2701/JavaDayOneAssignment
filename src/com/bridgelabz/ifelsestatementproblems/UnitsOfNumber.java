package com.bridgelabz.ifelsestatementproblems;

import java.util.Scanner;

/* Read a Number 1,10,100,1000 and display unit, ten hundred*/

public class UnitsOfNumber {
	public static void main(String[] args) {
		System.out.println("Enter tha numbers:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i == 1) {
			System.out.println("unit value numbers");
		} else if (i == 10) {

			System.out.println("tens value numbers");
		}

		else if (i == 100) {
			System.out.println("hundreds value numbers");
		} else if (i == 1000) {

			System.out.println("thousands value numbers");
		} else {
			System.out.println("oother value");
		}
		sc.close();
	}

}
