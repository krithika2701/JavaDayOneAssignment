package com.bridgelabz.forloopprograms;

/* Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5*/

import java.util.Scanner;

public class SumOfNaturalnumbers {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i, sum;
		N = 5;
		sum = 0;
		for (i = 1; i <= N; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
		sc.close();
	}
}
