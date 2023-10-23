import java.util.Scanner;
import java.lang.Integer;

public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String binario = new String();
		int decimal;
		
		System.out.print("Insira um número binário: ");
		binario = input.nextLine();
		decimal = Integer.parseInt(binario, 2);
		
		System.out.println("Resultado em decimal: " + decimal);
		input.close();
		
	}

}
