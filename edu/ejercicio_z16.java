/*16. Pedir 10 valores numéricos que representan el salario mensual de 10 empleados. 
	Mostrar su suma y cuantos hay mayores de 1000€.*/

package com.edu;

import java.util.Scanner;

public class ejercicio_z16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the salary from 10 employees. ");
		int salary;
		int count = 0;
		int sum = 0;
		int higher = 0;
		
		while (count < 10) {
			System.out.println("Enter a salary: ");
			salary = Integer.valueOf(sc.nextLine());
			sum += salary;
			count++;
			if (salary > 1000) {
				higher++;
			}
		}
		System.out.println("The result of the addition of the salaries is: " + sum);
		System.out.println("The number of salaries over 1000 are: " + higher);
	}

}
