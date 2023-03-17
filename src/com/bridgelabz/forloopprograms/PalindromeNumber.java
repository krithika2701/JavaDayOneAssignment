package com.bridgelabz.forloopprograms;

/*Java program To print the given number is palindrome or not */  

public class PalindromeNumber {
	public static void main(String[] args) {

		int reminder, number = 121, reverse = 0;

		for (int i = 0;i<=number ; i++) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("reverse number:-" + reverse);

		if (reverse == number) {
			System.out.println("Given number is a palindrome");
		} else {
			System.out.println("Given number is not a palindrome");
		}
	}
}
