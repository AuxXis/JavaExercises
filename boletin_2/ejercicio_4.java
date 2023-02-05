package boletin_2;
import java.util.Scanner;

public class ejercicio_4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Write something: ");
		String str = sc.nextLine();
		
		String newStr = "";
		for (int count = 0; count < str.length(); count += 2) {
				newStr += str.charAt(count+1);
				newStr += str.charAt(count);
				
		}
		if (str.length()%2==1) {
			newStr += str.charAt(str.length()-1);
		}
		System.out.println(newStr);
		
	}

}
