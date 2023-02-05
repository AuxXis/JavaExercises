/*3. Diseña una función que, dada una cadena de entrada, comprueba si es una contraseña fuerte o no.
 * Se considera que una contraseña es fuerte si contiene 8 o más caracteres, y entre ellos al menos
 * hay una mayúscula, una minúscula, un signo de puntuación y al menos un dígito.*/

package boletin_2;
import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a new password: ");
		String pass = sc.nextLine();
		
		
		System.out.println(contraseniaFuerte(pass));

	}
	
	
	public static String contraseniaFuerte(String pass) {
		
		if ((pass.length() >= 8) && (esMayuscula(pass)==true)
				&& (esMinuscula(pass)==true)&&(esSigno(pass))&& (esDigito(pass))) {
			System.out.println("valid password!");
		}else {
			System.out.println("not valid password! Please Try again:");
		}
		
		String msg = "";
		return msg;
	}
	
	public static Boolean esMayuscula (String pass) {
		boolean valid = false;
		for(int n = 0; n < pass.length();n ++ ) {
			char letter = pass.charAt(n);
			String letter1 = String.valueOf(letter);
			if (letter1==letter1.toUpperCase()) {
				valid = true;
			}
		}
		return valid;
	}
	
	public static Boolean esMinuscula (String pass) {
		boolean valid = false;
		for(int n = 0; n < pass.length();n ++ ) {
			char letter = pass.charAt(n);
			String letter1 = String.valueOf(letter);
			if (letter1==letter1.toLowerCase()) {
				valid = true;
			}
		}
		return valid;
	} 
	
	public static Boolean esSigno (String pass) {
		boolean valid = false;
		for(int n = 0; n < pass.length();n ++ ) {
			char letter = pass.charAt(n);
			if (letter==','||letter=='.'||letter==';'||letter==':'||letter=='?' ||letter=='!') {
				valid = true;
			}
		}
		return valid;
	} 
	
	public static Boolean esDigito (String pass) {
		boolean valid = false;
		for(int n = 0; n < pass.length();n ++ ) {
			char letter = pass.charAt(n);
			if (Character.isDigit(letter)) {
				valid = true;
			}
		}
		return valid;
	} 
	

}