/*10. Realiza un método llamado gcd (greaterCommonDivisor) que recibirá dos números y devuelva el máximo común divisor
según el algoritmo de Euclides.*/

package boletin_2;
import java.util.Scanner;

public class ejercicio_z10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1st number: ");
		int n1= sc.nextInt();
		
		System.out.println("2nd number: ");
		int n2= sc.nextInt();
		
		System.out.println("Greatest Common Divisor: " + gcd(n1, n2));
	}
	
	public static int gcd(int n1, int n2) {
		int result = 0;
		int rest;
		
		if (n1%n2==0) {
			result = n1/n2;
		}else {
			rest = n1%n2;
			
			for (;rest>0;) {
				n1 = n2;
				n2 = rest;
				rest = n1%n2;
				result = n2;
			}
			
		}return result;
	}

}


