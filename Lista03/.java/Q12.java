import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nomes[];
		String aux[];
		int tam = 1;
		char r;
		nomes = new String[tam];
		
		while (true) {
			System.out.print("Digite um Nome: ");
			nomes[tam-1] = input.nextLine();
			System.out.println("Nome registrado");
			
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
				aux = new String[tam];
				tam++;
				aux = nomes.clone();
				nomes = new String[tam];
				for (int i=0; i<tam-1; i++) {
					nomes[i] = aux[i];
				}
			}	
		}
		
		System.out.println("Nomes em ordem alfabética: ");
		Arrays.sort(nomes);
		for(String nome : nomes) {
			System.out.printf("%s --> ", nome);
		}
		System.out.println("FIM");
		
		input.close();

	}

}
