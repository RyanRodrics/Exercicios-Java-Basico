import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		lista03_classe alunos[] = new lista03_classe[5];
		for (int i=0; i<5; i++) {
			alunos[i] = new lista03_classe();
		}
		float media = 0;
		
		System.out.println("Digite os nomes e notas de cinco alunos da turma");
		for (int i=0; i<5; i++) {
			System.out.printf("Aluno %d: \n", i+1);
			System.out.print("Nome: ");
			alunos[i].nome = input.nextLine();
			System.out.print("Nota: ");
			alunos[i].nota = input.nextFloat();
			//input.nextLine();
			System.out.println(" ");
			media += alunos[i].nota;
		}
		media = media / 5;
		System.out.printf("A media de notas da turma foi %.2f \n", media);
		
		System.out.println("Os alunos com nota acima da media da turma foram: ");
		for (int i=0; i<5; i++) {
			if (alunos[i].nota > media) {
				System.out.printf("%s(%.2f) --> ", alunos[i].nome, alunos[i].nota);
			}
		}
		/*System.out.println("\nOs alunos com nota abaixo da media foram: ");
		for (int i=0; i<5; i++) {
			if (alunos[i].nota <= media) {
				System.out.printf("%s(%.2f) --> ", alunos[i].nome, alunos[i].nota);
			}
		}*/
		System.out.println("FIM");
		input.close();
	}

}
