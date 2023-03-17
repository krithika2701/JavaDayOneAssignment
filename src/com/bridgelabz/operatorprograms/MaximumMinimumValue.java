package com.bridgelabz.operatorprograms;

/* Enter two numbers and do the following arithmetic Operations find max and min.
i) a+b*c ii) c+a/b
iii) a%b+c iV) a*b+c  */

public class MaximumMinimumValue {
	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		int k, l, m, n;
		k = a + b * c;
		l = c + a / b;
		m = a % b + c;
		n = a * b + c;
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		if (k > l && k > m && k > n) {
			System.out.println("k value is maximum");
		} else if (l > k && l > m && l > n) {
			System.out.println("l value is maximum");
		} else if (m > k && m > l && m > n) {
			System.out.println("m value is maximum");
		} else if (n > k && n > l && n > m) {
			System.out.println("n value is maximum");
		} else if (k < l && k < m && k < n) {
			System.out.println("k value is minimum");
		} else if (l < k && l < m && l < n) {
			System.out.println("l value is minimum");
		} else if (m < k && m < l && m < n) {
			System.out.println("m value is minimum");
		} else if (n < k && n < l && n < m) {

		}

		else {

		}

	}

}
