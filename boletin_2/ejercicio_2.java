/*2. Realiza un programa que pida un número por teclado y que después muestre ese número al revés.*/

package boletin_2;
import java.util.Scanner;

public class ejercicio_2 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n;
			
			System.out.println("Inserte un número:");
			n = Integer.valueOf(sc.nextLine());
			String nStr= String.valueOf(n);
			
			String newN = "";
			for(int count=nStr.length()-1; count >= 0; count--) {
				newN+=nStr.charAt(count);
			}
			System.out.println(newN);
				
			}		

		}