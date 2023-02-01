
/*
8. Método que pida 15 números y realice su suma.
*/

package com.edu;

import java.util.Scanner;

public class ejercicio_8 {

	public static void main(String[] args) {
		
		int contador=1;
		int numero=0;
		int suma =0;
		while (contador<16) {
		System.out.println("Introduce una cifra: ");
		Scanner sc1= new Scanner(System.in);
		numero= Integer.valueOf(sc1.nextLine());

		contador+=1;
		suma+=numero;
		}	
		System.out.println("La suma de las cifras introducidas es: " + suma);
	}
	
}
