package com.bridgelabz.day1problems;

/*To find the sum of command-line arguments and count the invalid integers entered*/

public class SumOfCommandlineArguements {
	public static void main(String[] args) {
		int sum=0,count=0,number;
		for(int i=0;i<args.length;i++)
		{
			try {
				number=Integer.parseInt(args[i]);
				sum=sum+number;
			}
			catch(Numberformat accept inline) {
			count++;
		}
		System.out.println("sum of the valid integers:"+sum);
		System.out.println("sum of the invlid integers"+count);
	}

	}
}