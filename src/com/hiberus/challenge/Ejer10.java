package com.hiberus.challenge;
/**
 * 
 * No ha sido necesario utilizar ninguna estructura de datos ya que se perdía el sentido de recuperar el siguiente elemento mayor para el array
 * 
 * La complejidad temporal vendría dada por los dos bucles for en los que se recorre en el primero todo el array y en el segundo todo el array -1 siendo O(2n-1)
 *
 */
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
