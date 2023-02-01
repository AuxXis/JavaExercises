/*14. Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y nos diga
 * cuántos números se han introducido, la media de los impares y el mayor de los pares. El número negativo
 * sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.*/

package com.edu;

import java.util.Scanner;

public class ejercicio_z14 {

	public static void main(String[] args) {
		operarConNumeros();
	}
	public static void operarConNumeros() {
		
		int n = 0;
		int cantidadImpares = 0;
		int mayorPares = 0;
		double totalImpares = 0.0;
		int nayorPares = 0, cantidadTotal = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Dime un número: ");
		n = Integer.valueOf(sc.nextLine());
		
			if(n >=0) {
				if(n%2 == 0) {
					mayorPares = (mayorPares < n) ? n: mayorPares;
				}else {
					totalImpares +=n;
					cantidadImpares++;	
				}
				cantidadTotal++;
			}
		
		}while(n > 0);
		System.out.println(
				String.format("La cantidad total es %s, la media de los " + "impares es %s y el mayor de los pares es %s", cantidadTotal,
						cantidadImpares >0? totalImpares/cantidadImpares:0,
								mayorPares));
		

	}

}
