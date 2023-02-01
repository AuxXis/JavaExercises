
/*
/*4. Calcular las calificaciones de un alumno con un método que reciba la nota 
de la parte práctica, la nota de los problemas y la parte teórica. La nota final 
se calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas 
vale el 50% y la parte teórica el 40%. Las notas deben estar entre 0 y 10, si no lo están, 
deberá devolver un mensaje de error.
Realiza el método que calcule la media de tres notas y te devuelva la nota del boletín 
(insuficiente, suficiente, bien, notable o sobresaliente).
*/



package com.edu;

import java.util.Scanner;

public class ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Práctica: ");
		double nota_prac = sc.nextDouble();
		
		System.out.println("Problemas: ");
		double nota_prob = sc.nextDouble();
		
		System.out.println("Teoría: ");
		double nota_teo = sc.nextDouble();
		
		double resultado = 0;
		
		String mensaje;
		mensaje = "";
	
		if( nota_prac>=0 && nota_prac<=10 && nota_prob>=0 && nota_prob<=10 && nota_teo>=0 && nota_teo<=10) {
			resultado = nota_prac * 0.1 + nota_prob * 0.5 + nota_teo * 0.4;
			if(resultado<5) {
				System.out.println(resultado + "   Tienes un insuficiente.");
			}else if(resultado > 5 && resultado <=5.99) {
				System.out.println(resultado +"   Tienes un suficiente.");
			}else if(resultado > 5.99 && resultado <= 6.99) {
				System.out.println(resultado + "    Tienes un bien.");
			}else if(resultado > 6.99 && resultado <=8.99) {
				System.out.println(resultado + "   Tienes un notable.");
			}else {
				System.out.println(resultado + "   ¡Tienes un sobresaliente!");
			}
		}			
		else {
			System.out.println("¡Datos incorrectos!");
		}
	}


}


/*		String mensaje;
		mensaje = "";
		
		if( nota_prac>=0 && nota_prac<=10 && nota_prob>=0 && nota_prob<=10 && nota_teo>=0 && nota_teo<=10) {
			resultado = nota_prac * 0.1 + nota_prob * 0.5 + nota_teo * 0.4;
			if(resultado<5) {
				mensaje = "Tienes un insuficiente.";
			}else if(resultado > 5 && resultado <=5.99) {
				mensaje = "Tienes un suficiente.";
			}else if(resultado > 5.99 && resultado <= 6.99) {
				mensaje = "Tienes un bien.";
			}else if(resultado > 6.99 && resultado <=8.99) {
				mensaje = "Tienes un notable.";
			}else {
				mensaje = "¡Tienes un sobresaliente!";
			}
		}			
		else {
			mensaje = "Datos incorrectos.";
		}
	}


}*/
