package com.bridgelabz.switchstatementprograms;

/* Write a Program to Check Vowel or Consonant*/

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		System.out.println("Enter the character");
		Scanner sc =new Scanner(System.in);
		char ch=sc.next().charAt(0);
		 switch(ch)
		    {
		        case 'a':
		            System.out.println("character is a vowel");
		                    break;
		        case 'e':
		            System.out.println("character is a vowel");
		            break;
		        case 'i':
		            System.out.println("character is a vowel");
		            break;
		        case 'o':
		            System.out.println("character is a vowel");
		            break;
		        case 'u':
		            System.out.println("character is a vowel");
		            break;
		        default:
	System.out.println("Entered the consonent character");
		    }
		 sc.close();
		
			
		}
		
		
	}

