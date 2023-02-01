/*5. Realiza un método que reciba una hora por parámetro y que muestre luego buenos días, buenas tardes*
 * o buenas noches según corresponda. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente,
 * sólo teniendo en cuenta el valor de las horas.*/

package com.edu;

import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una hora:");
		double h1 = sc.nextDouble();
		
		if (h1>0 && h1<=23) {
			if(h1>=6 && h1<=12) {
				System.out.println("\n ¡Buenos días!");
			}else if (h1>=13 && h1<=20) {
				System.out.println("\n ¡Buenas tardes!");
			}else {
				System.out.println("\n ¡Buenas noches!");			
			}
		}else {
			System.out.println("\n ¡Error!");
		}
	}
}
