import java.util.Scanner;
import java.lang.Integer;

public class Q6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimal;
		String binario = new String();
		
		System.out.print("Insira um número decimal: ");
		decimal = input.nextInt();
		binario = Integer.toBinaryString(decimal);
		
		System.out.println("Resultado em binário: " + binario);
		input.close();
		
	}

}
