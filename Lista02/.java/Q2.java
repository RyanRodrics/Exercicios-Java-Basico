import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores[] = new int[3];
		int unidades[] = new int[3];
		boolean resultado;
		
		System.out.println("Digite três valores inteiros ");
		for (int i=0; i<3; i++) {
			System.out.printf("%dº valor: ", i+1);
			valores[i] = input.nextInt();
			unidades[i] = valores[i] % 10;
		}
		
		if (unidades[0]==unidades[1] || unidades[0]==unidades[2] || unidades[1]==unidades[2]) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		
		System.out.printf("O resultado é: " + resultado);
		input.close();
		
	}

}
