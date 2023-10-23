import java.util.Scanner;
import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeros[];
		int aux[];
		int tam = 1;
		char r;
		numeros = new int[tam];
		
		while (true) {
			System.out.print("Digite um numero inteiro: ");
			numeros[tam-1] = input.nextInt();
			input.nextLine();
			System.out.println("Valor registrado");
			
			while (true) {
				System.out.print("Deseja continuar [S/N]? ");	
				r = input.nextLine().charAt(0);
				if (r == 78 || r == 83) {
					break;
				}
			}			
			System.out.println(" ");
			
			if (r == 78) {
				break;
			}
			else {
				aux = new int [tam];
				tam++;
				aux = numeros.clone();
				numeros = new int[tam];
				for (int i=0; i<tam-1; i++) {
					numeros[i] = aux[i];
				}
			}	
		}
		
		System.out.print("Em ordem crescente: ");
		Arrays.sort(numeros);
		for (int i=0; i<tam; i++) {
			System.out.printf("%d --> ", numeros[i]);
		}
		System.out.println("FIM");
		
		input.close();
	}

}
