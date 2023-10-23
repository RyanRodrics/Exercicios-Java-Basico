import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores[] = new int[3];
		boolean resultado;
		
		System.out.println("Digite três valores inteiros ");
		for (int i=0; i<3; i++) {
			System.out.printf("%dº valor: ", i+1);
			valores[i] = input.nextInt();
		}
		if ((valores[1]>valores[0]) && (valores[2]>valores[1])) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		
		System.out.printf("O resultado é: " + resultado);
		input.close();
		
	}
}
