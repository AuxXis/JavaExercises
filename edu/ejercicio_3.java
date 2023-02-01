/* 
3. Escribir un método que reciba un carácter y devuelva el tipo de carácter que es.
Debe devolver una de los siguientes mensajes según corresponda:
◦ Letra mayúscula
◦ Letra minúscula
◦ Dígito entre 0 y 9
◦ Signo de puntuación 
◦ Espacio en blanco
◦ Paréntesis () o llaves {} 
◦ Otro carácter
*/


package com.edu;

import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce un carácter: ");
		char caracter = sc.nextLine().charAt(0);
		String mensaje = "";
		
		if(Character.isUpperCase(caracter)) {
			mensaje = "Es mayuscula.";
		}else if(Character.isLowerCase(caracter)){
			mensaje = "Es minúscula.";
		}else if(Character.isDigit(caracter)) {
			mensaje = "Es dígito.";
		}else if(Character.isWhitespace(caracter)) {
			mensaje ="Es un espacio en blanco.";
		}else if(caracter == '.' || caracter == ',' || caracter == ';' || caracter == ':' || caracter == '-' || caracter == '_'){
			mensaje	= "Es un signo de puntuación.";
		}else if(caracter == '(' || caracter == ')' || caracter == '{' || caracter == '}') {
			mensaje = "Es un paréntesis o aladín.";
		}else {
			mensaje = "Es otro carácter.";
		}
		System.out.println("\n"+ mensaje);
}
}