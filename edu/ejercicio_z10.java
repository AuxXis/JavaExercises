/*10. Realiza un programa que sume los 100 números siguientes a un número entero y
positivo introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un número positivo).*/

package com.edu;

import java.util.Scanner;

public class ejercicio_z10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero positivo: ");
		
		int n1 = Integer.valueOf(sc.nextLine());
		
		int suma = 0;
		
		while (n1<0) {		 
				
			System.out.println("Error: ");
			System.out.println("Introduce un número entero positivo: ");
			n1 = Integer.valueOf(sc.nextLine());
	
		}	
		suma = n1+100;
		System.out.println(suma);
	}

}
