/*12. Realiza un programa que pida números hasta que se teclee uno negativo y muestre cuántos números se han introducido.*/

package com.edu;

import java.util.Scanner;

public class ejercicio_z12 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int n;
		do {
			System.out.print("Enter number: ");
			n = Integer.valueOf(sc.nextLine());
			i++;
		}while(n>0);
		System.out.println(i-1);

	}

}
