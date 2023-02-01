/*13. Programa que reciba 10 números y nos indique el valor máximo y mínimo.*/

package com.edu;
import java.util.Scanner;

public class ejercicio_z13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int max = 0;
		int min = 100;
		int count = 0;
		
		while (count < 10) {
			System.out.println("Enter number: ");
			n = Integer.valueOf(sc.nextLine());
			if (n > max) {
				max = n;
			}else if (n < min) {
				min = n;
			}
			count++;
		}
		
		
		System.out.println(max+" is the highest number.");
		System.out.println(min+" is the lowest number.");

	}
}
