/*
18. Realizar un método llamado calcularAreaCirculo que devuelva el área de un círculo y otro llamado
calcularLongitudCirculo que devuelva su longitud.*/

package com.edu;

public class ejercicio_z18 {

	public static void main(String[] args) {
		System.out.println(calcularAreaCirculo(22));
		System.out.println(calcularLongitudCirculo(22));
	}
	
	public static double calcularAreaCirculo(int radio) {
		double area = 3.14 * (radio*radio);
		return area;
	}
	
	public static double calcularLongitudCirculo(int diametro) {
		double longitud = 3.14 * diametro;
		return longitud;
	}

}
