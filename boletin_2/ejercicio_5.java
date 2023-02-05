/*
5. Realizar un método llamado esMultiplo que recibirá dos números y devuelva True si el primer número es múltiplo del segundo.*/

package boletin_2;
import java.util.Scanner;

public class ejercicio_5 {
	
public static boolean esMultiplo (int n1, int n2) {
			
			boolean valid = false;
			if (n1%n2==0) {
				valid = true;
			}
			return valid;	
		}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1st number: ");
		int n1 = sc.nextInt();
		
		System.out.println("2nd number: ");
		int n2 = sc.nextInt();
		
		System.out.println();

		System.out.println("1st number is a multiple of 2nd number --->" + esMultiplo(n1, n2));
	}
}

