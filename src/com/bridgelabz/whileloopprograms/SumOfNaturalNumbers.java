package com.bridgelabz.whileloopprograms;

import java.util.Scanner;

/*Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5*/

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
			int i,sum;
			N=5;
		sum=0;
		i=1;
		while(i<=N) {
			System.out.println(i);
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		
	}
	
}
