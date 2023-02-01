/*15. Crea un programa que permita sumar N números. El usuario decide cuándo termina de introducir números
 * al indicar la palabra ‘fin’.*/

package com.edu;
import java.util.Scanner;

public class ejercicio_z15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String mensaje = "0";
		int suma=0;
		
		
		do {
			System.out.println("Enter number: ");
			suma+= Integer.valueOf(mensaje);
			mensaje = sc.nextLine();
			
		}while (!mensaje.equals ("fin"));
							
		System.out.println("The result of the addition of the numbers is " + suma);
	}

}
