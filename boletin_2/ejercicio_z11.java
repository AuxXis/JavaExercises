
/*/11. Realizar un método llamado minimoComunMultiplo que reciba dos números y calcule el mínimo común múltiplo de dos números.
 * Con el máximo común divisor de una pareja de números podemos obtener fácilmente el mínimo común múltiplo de dicha pareja.
 * El mínimo común múltiplo de dos números es igual al producto de los números dividido entre su máximo común divisor.
 * Por ejemplo, el máximo común divisor de 24 y 36 es 12, por tanto el mínimo común múltiplo de 24 y 36 es (24×36)/12=72.
 */

package boletin_2;
import java.util.Scanner;

public class ejercicio_z11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1st number: ");
		int n1= sc.nextInt();
		
		System.out.println("2nd number: ");
		int n2= sc.nextInt();
	
		System.out.println(LeastCommonMultiple(n1, n2));

	}
	
	public static int LeastCommonMultiple(int n1, int n2) {
		
		int lcm = ejercicio_z10.gcd(n1, n2);
		int result = (n1*n2) / lcm;
		
		return result;
		
	}

}
