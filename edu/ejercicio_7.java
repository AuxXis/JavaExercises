/*

7. Codifica las siguientes secuencias numéricas haciendo uso de estructuras: 
i) for, 
ii) while, 
iii) do-while 

en cada una de ellas:
a. Crea un método que muestre los números del 1 al 100.
b. Repite el ejercicio anterior, pero en formato descendente, 
	es decir, del 100 al 1. 
c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100. 
d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.
*/


package com.edu;

import java.util.Scanner;

public class ejercicio_7{
	
	public static final int UPPER_LIMIT = 100; //Como todos los ejercicios tienen los mismos límites,
	public static final int LOWER_LIMIT = 1;		//creamos las constantes éstas fuera de void main para poder utilizarlas en otros ejercicios.

		
	public static void main(String[] args) {
System.out.println();
System.out.println("A) ------------------ A) ---------------------------- A)");
System.out.println();
		for (int contador = 1 ; contador<=100; contador++) {
			System.out.println(contador);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int contadorw= LOWER_LIMIT;
		while(contadorw <= UPPER_LIMIT) {
			System.out.println(contadorw);
			contadorw++;
		}

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		
System.out.println();
System.out.println("B) ------------------ B) ---------------------------- B)");
System.out.println();
		
	int contador1 = UPPER_LIMIT;
	
	while(contador1 >= LOWER_LIMIT) {
		System.out.println(contador1);
		contador1--;
	}
	
	System.out.println();
	System.out.println("C) ------------------- C)---------------------------- C)");
	System.out.println();
	
	int contador2 = 0;
	while (contador2<=100) {
		contador2+=1;
		if(contador2%5==0) {
			System.out.println(contador2);
		}	
	}
	System.out.println();
	System.out.println("D) -------------------- D) -------------------------- D)");
	System.out.println();
	
	int contador3 = 320;
	while (contador3>160) {
		System.out.println(contador3);
		contador3-=20;
	}
		}
	}