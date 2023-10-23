import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int index;
		String nomes[];
		System.out.print("Deseja cadastrar quantos nomes? ");
		n = input.nextInt();
		input.nextLine();
		nomes = new String[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Nome %d: ", i+1);
			nomes[i] = input.nextLine();
		}
		
		while (true) {
			System.out.print("\nQual o numero da pessoa que deseja acessar? ");
			index = input.nextInt();
			index--;
			if (index<0 || index>=n) {
				System.out.println("Posição invalida, tente novamente!");
			}
			else {
				break;
			}
		}
		System.out.printf("Na posição %d esta %s", index+1, nomes[index]);
		input.close();
		
	}

}
