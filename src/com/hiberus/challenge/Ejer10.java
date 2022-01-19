package com.hiberus.challenge;

public class Ejer10 {
	public static void main(String args[]) {
		int numbers[] = { 4, 5, 2, 25 };
		boolean found;

		for (int i = 0; i < numbers.length; i++) {
			found = false;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] > numbers[i]) {
					found = true;
					System.out.println(+numbers[i] + " --> " + numbers[j]);
					break;
				}
			}
			if (!found) {
				System.out.println(+numbers[i] + " --> -1");
			}
		}

	}
}
