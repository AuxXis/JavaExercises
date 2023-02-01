

/*2. Escribe un método que reciba por parámetro el día de la semana 
(Lunes, Martes, Miércoles, etc) y devuelva qué asignatura toca a primera hora ese día.
*/

package com.edu;
import java.util.Scanner;


public class ejercicio_2{
	public static void main(String[] args) {
	
		System.out.println("Introduce un día de la semana");		
		try (Scanner sc = new Scanner(System.in)) {
			String dia = sc.nextLine();
			System.out.println();
			
			if (dia.equals("lunes")) {
				System.out.println("Los lunes tenemos Entornos de desarrollo.");
			}else if (dia.equals("martes")) {
				System.out.println("Los martes tenemos FOL.");
			}else if (dia.equals("miercoles") || dia.equals("miercoles")) {
				System.out.println("Los miércoles tenemos Sistemas informáticos.");
			}else if (dia.equals("jueves")) {
				System.out.println("Los jueves tenemos BBDD.");
			}else if (dia.equals("viernes")) {
				System.out.println("Los viernes tenemos Sistemas informáticos.");
			}else {
				System.out.println("Datos no válidos. Introduzca un día correcto: ");
			}
		}
		}
	}





