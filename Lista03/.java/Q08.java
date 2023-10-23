import java.util.Scanner;
import java.lang.String;

public class Q08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Deseja cadastrar quantas pessoas? ");
		int n = input.nextInt();
		input.nextLine();
		lista03_classe pessoas[] = new lista03_classe[n];
		for (int i=0; i<n; i++) {
			pessoas[i] = new lista03_classe();
		}
		String aux;
		boolean b = false;
		
		for (int i=0; i<n; i++) {
			System.out.printf("\nPessoa %d \n", i+1);
			System.out.print("Nome: ");
			pessoas[i].nome = input.nextLine();
			System.out.print("Telefone: ");
			pessoas[i].telefone = input.nextLine();
			System.out.println(" ");
		}
		
		System.out.print("Qual o nome da pessoa que deseja consultar? ");
		aux = input.nextLine();
		for (int i=0; i<n; i++) {
			if (pessoas[i].nome.intern() == aux.intern()) {
				System.out.printf("Telefone de %s: %s", pessoas[i].nome, pessoas[i].telefone);
				b = true;
			}
		}
		if (b == false) System.out.println("\nPessoa não encontrada");
		input.close();
		
	}

}
