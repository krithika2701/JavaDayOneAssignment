package com.bridgelabz.forloopprograms;

/* Write a Program to reverse the integer number eg. Input n=231 reverse is 132*/

public class ReverseTheIntegerNumber {
	public static void main(String[] args) {

		int n = 231, rem, rev = 0;
		for (int i = 0; n > 0; i++) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println("reverse number:-" + rev);
	}
}
