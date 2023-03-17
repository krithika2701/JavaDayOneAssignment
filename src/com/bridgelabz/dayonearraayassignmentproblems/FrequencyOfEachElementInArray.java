package com.bridgelabz.dayonearraayassignmentproblems;

/*Java Program to find the frequency of each element in the array*/

public class FrequencyOfEachElementInArray {
	public static void main(String[] args) {
		int array[] = { 1, 3, 4, 5, 3, 2, 3, 1, 3, 2, 3, 1, 4, 5 };
		int frequency[] = new int[array.length];
		int count = 1, visit = -1;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					frequency[j] = visit;

				}
				if (frequency[i] != visit) {
					frequency[i] = count;
				}

			}
		}
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != visit) {
				System.out.println("Frequency of element");
				System.out.println(array[i] + "frequency of element array" + frequency[i]);
			}
		}
	}
}
