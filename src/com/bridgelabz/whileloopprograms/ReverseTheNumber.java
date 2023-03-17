package com.bridgelabz.whileloopprograms;

/*Write a Program to reverse the integer number eg. Input n=231 reverse is 132*/

public class ReverseTheNumber {
	public static void main(String[] args) {
		 int n=231,rem,rev=0;
		    while(n!=0)	    {
		      rem=n%10;
		      rev=rev*10+rem;
		      n=n/10;
		      System.out.println(rev);
		    }
	}
	}


