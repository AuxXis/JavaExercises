/*Programar un sistema de calefacción-refrigeración que compruebe en función del día y el mes, la estación en la que estamos
 	y dependiendo de la estación programe la temperatura: Invierno→19º, Primavera→20º, Verano→24º, Otoño→19º.
El método deberá recibir como parámetro el mes y el día actual y devolver los grados a los que deberemos programar el sistema.*/

package com.edu;

import java.util.Scanner;

public class ejercicio_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué día es hoy?  ");
		int day = sc.nextInt();
		
		System.out.println("¿En qué mes estamos? ");
		int month = sc.nextInt();
		
		if ((day>=20 && month==3) || month==4 || month==5 || (day<=21 && month==6)) {
			System.out.println("Es primavera. Estableciendo temperatura→20º.");
		}else if ((day>=21 && month==6) || day==7 || month==8 || (day<=223 && month==9)) {
			System.out.println("Es verano. Estableciendo temperatura→24º.");
		}else if ((day>=24 && month==9) || month==10 || month==11 || (day<=21 && month==12)) {
			System.out.println("Es otroño. Estableciendo temperatura→19º.");
		}else {
			System.out.println("Es invierno. Estableciendo temperatura→19º.");
		}
		
	}

}
