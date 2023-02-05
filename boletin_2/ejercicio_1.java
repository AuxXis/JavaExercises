/*1. Realizar un método llamado numeroSolucionesEcuacionSegundoGrado que reciba los coeficientes de una ecuación
 	de segundo grado y devuelva el número de soluciones que tiene. Si los argumentos no son válidos
 	(el primer coeficiente tiene que ser distinto de cero) debe devolver un -1.*/

package boletin_2;

public class ejercicio_1 {

	public static void main(String[] args) {
		System.out.println(numeroSolucionesEcuacionSegundoGrado(3.0,5.0,8.0));
	}
	public static double numeroSolucionesEcuacionSegundoGrado(double a, double b, double c) {
		double solucion1;
		solucion1 = 0;
		if (a == 0) {
			solucion1 = -1;
		}
		return solucion1;
	}

}

