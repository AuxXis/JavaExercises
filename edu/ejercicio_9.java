/*
9. Método que pida 5 números e imprima si alguno es múltiplo de 3.
*/

package com.edu;

import java.util.Scanner;

public class ejercicio_9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Primer número: ");
		int n1 = sc.nextInt();
		
		System.out.println("Segundo número: ");
		int n2 = sc.nextInt();
		
		System.out.println("Tercer número: ");
		int n3 = sc.nextInt();
		
		System.out.println("Cuarto número: ");
		int n4 = sc.nextInt();
		
		System.out.println("Quinto número: ");
		int n5 = sc.nextInt();
		
		
		if(n1 % 3==0) {
			System.out.println(n1 + " es múltiplo de 3.");
		}else if (n2 % 3==0) {
			System.out.println(n2 + " es múltiplo de 3.");
		}else if (n3 % 3==0) {
			System.out.println(n3 + " es múltiplo de 3.");
		}else if (n4 % 3 ==0) {
			System.out.println(n4 + " es múltiplo de 3.");
		}else if (n5 % 3 ==0) {
			System.out.println(n5 + " es múltiplo de 3.");
		}
	}

}
