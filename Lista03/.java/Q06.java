import java.util.Scanner;
import java.lang.String;

public class Q06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		lista03_classe alunos[];
		lista03_classe aux[];
		int tam = 1;
		alunos = new lista03_classe[tam];
		for (int i=0; i<tam; i++) {
			alunos[i] = new lista03_classe();
		}
		float media = 0;
		char r;
		
		System.out.println("Digite os nomes e notas de alunos da turma \n");
		while (true) {
			System.out.printf("Aluno %d \n", tam);
			System.out.print("Nome: ");
			alunos[tam-1].nome = input.nextLine();
			System.out.print("Nota: ");
			alunos[tam-1].nota = input.nextFloat();
			input.nextLine();
			System.out.println(" ");
			media += alunos[tam-1].nota;
			
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
				aux = new lista03_classe[tam];
				tam++;
				aux = alunos.clone();
				alunos = new lista03_classe[tam];
				for (int i=0; i<tam; i++) {
					alunos[i] = new lista03_classe();
				}
				for (int i=0; i<tam-1; i++) {
					alunos[i] = aux[i];
				}
			}	
		}
		media = media / tam;
		
		System.out.printf("Media: %.2f \n", media);
		System.out.println("Alunos com nota acima da media da turma:");
		for (int i=0; i<tam; i++) {
			if (alunos[i].nota > media) {
				System.out.printf("%s(%.2f) --> ", alunos[i].nome, alunos[i].nota);
			}
		}
		System.out.println("FIM");
		input.close();
	}

}
