import java.util.Scanner;
import java.lang.Integer;

public class Q7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String binario1 = new String();
		String binario2 = new String();
		int soma;
		
		System.out.print("Insira o primeiro número binário: ");
		binario1 = input.nextLine();
		System.out.print("Insira o segundo número binário: ");
		binario2 = input.nextLine();
		
		soma = Integer.parseInt(binario1, 2) + Integer.parseInt(binario2, 2);
		
		System.out.println("Soma dos dois números binários: " + Integer.toBinaryString(soma));
		input.close();

	}

}
