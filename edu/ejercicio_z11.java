/*11. Realiza un programa que pida números y muestre su cuadrado, repitiendo el proceso hasta que se introduzca un número negativo.*/

package com.edu;

import java.util.Scanner;

public class ejercicio_z11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Gimme number: ");
			n = Integer.valueOf(sc.nextLine());
			System.out.println(n * n);
		}while(n > 0);
	}

}
