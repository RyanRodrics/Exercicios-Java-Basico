import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class Lista03RyanCompleta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeros[];
		int aux_int[];
		int tam;
		char r;
		Pessoa alunos[];
		float media;
		int n;
		float notas[];
		double salarios[];
		double reajuste;
		double salario;
		double aux_double[];
		Pessoa aux_pessoa[];
		int index;
		String nomes[];
		Pessoa pessoas[];
		String aux_string;
		String aux_strings[];
		boolean b;
		int conj1[];
		int conj2[];
		int count;
		boolean in_aux;
		
		// Q01
		System.out.println("QUESTÃO 01: ");
		tam = 1;
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
				aux_int = new int [tam];
				tam++;
				aux_int = numeros.clone();
				numeros = new int[tam];
				for (int i=0; i<tam-1; i++) {
					numeros[i] = aux_int[i];
				}
			}	
		}
	
		System.out.print("Os numeros digitados foram: ");
		for (int j=tam-1; j>=0; j--) {
			System.out.printf("%d --> ", numeros[j]);
		}
		System.out.println("FIM");
		
		
		// Q02
		System.out.println("\n\nQUESTÃO 02: ");
		alunos = new Pessoa[5];
		for (int i=0; i<5; i++) {
			alunos[i] = new Pessoa();
		}
		media = 0;
		
		System.out.println("Digite os nomes e notas de cinco alunos da turma");
		for (int i=0; i<5; i++) {
			System.out.printf("Aluno %d: \n", i+1);
			System.out.print("Nome: ");
			alunos[i].nome = input.nextLine();
			System.out.print("Nota: ");
			alunos[i].nota = input.nextFloat();
			input.nextLine();
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
		
		
		// Q03
		System.out.println("\n\nQUESTÃO 03: ");
		System.out.print("Deseja registrar quantas notas? " );
		n = input.nextInt();
		notas = new float[n];
		media = 0;
		
		for (int i=0; i<n; i++) {
			System.out.printf("Nota %d: ", i+1);
			notas[i] = input.nextFloat();
			media += notas[i];
		}
		media = media / n;
		System.out.printf("\nMedia: %.2f \n", media);
		
		System.out.println("\nNotas maiores que a media: ");
		for (int i=0; i<n; i++) {
			if (notas[i] > media){
				System.out.printf("%.2f --> ", notas[i]);
			}
		}
		System.out.println("FIM");
		
		System.out.println("\nNotas menores que a media: ");
		for (int i=0; i<n; i++) {
			if (notas[i] < media){
				System.out.printf("%.2f --> ", notas[i]);
			}
		}
		System.out.println("FIM");
		
		
		// Q04
		System.out.println("\n\nQUESTÃO 04: ");
		tam = 1;
		salarios = new double[tam];
		
		System.out.println("Digite o valor dos salarios para registra-los (-1 para encerrar)");
		while (true) {
			System.out.printf("Salario %d: R$", tam);
			salario = input.nextDouble();
			if (salario == -1) {
				break;
			}
			salarios[tam-1] = salario;
			aux_double = new double [tam];
			tam++;
			aux_double = salarios.clone();
			salarios = new double[tam];
			for (int i=0; i<tam-1; i++) {
				salarios[i] = aux_double[i];
			}
		}
		
		System.out.print("\nQual reajuste sera aplicado nos salarios? ");
		reajuste = input.nextDouble();
		input.nextLine();
		System.out.println(" ");
		for (int i=0; i<tam-1; i++) {
			salarios[i]+= reajuste;
			System.out.printf("Salario %d: R$%.2f\n", i+1, salarios[i]);
		}
		
		
		// Q05
		System.out.println("\n\nQUESTÃO 05: ");
		numeros = new int[50];
		
		for (int i=0; i<50; i++) {
			numeros[i] = 101 + i;
		}
		for (int i=0; i<50; i++) {
			System.out.printf("%d --> ", numeros[i]);
		}
		System.out.println("FIM");
		
		
		// Q06
		System.out.println("\n\nQUESTÃO 06: ");
		tam = 1;
		media = 0;
		alunos = new Pessoa[tam];
		alunos[0] = new Pessoa();
		
		System.out.println("Digite os nomes e notas de alunos da turma \n");
		while (true) {
			System.out.printf("Aluno %d \n", tam);
			System.out.print("Nome: ");
			alunos[tam-1].nome = input.nextLine();
			System.out.print("Nota: ");
			alunos[tam-1].nota = input.nextFloat();
			input.nextLine();
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
				aux_pessoa = new Pessoa[tam];
				tam++;
				aux_pessoa = alunos.clone();
				alunos = new Pessoa[tam];
				for (int i=0; i<tam; i++) {
					alunos[i] = new Pessoa();
				}
				for (int i=0; i<tam-1; i++) {
					alunos[i] = aux_pessoa[i];
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
		
		
		// Q07
		System.out.println("\n\nQUESTÃO 07: ");
		while (true) {
			System.out.print("Deseja cadastrar quantos nomes? ");
			n = input.nextInt();
			if (n>0) {
				break;
			}
		}
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
		
		
		// Q08
		System.out.print("\n\n\nQUESTÃO 08: ");
		System.out.print("Deseja cadastrar quantas pessoas? ");
		n = input.nextInt();
		input.nextLine();
		pessoas = new Pessoa[n];
		for (int i=0; i<n; i++) {
			pessoas[i] = new Pessoa();
		}
		b = false;
		
		for (int i=0; i<n; i++) {
			System.out.printf("\nPessoa %d \n", i+1);
			System.out.print("Nome: ");
			pessoas[i].nome = input.nextLine();
			System.out.print("Telefone: ");
			pessoas[i].telefone = input.nextLine();
		}
		
		System.out.print("Qual o nome da pessoa que deseja consultar? ");
		aux_string = input.nextLine();
		for (int i=0; i<n; i++) {
			if (pessoas[i].nome.intern() == aux_string.intern()) {
				System.out.printf("Telefone de %s: %s", pessoas[i].nome, pessoas[i].telefone);
				b = true;
			}
		}
		if (b == false) System.out.println("\nPessoa não encontrada");
		
		
		// Q09
		System.out.println("\n\nQUESTÃO 09: ");
		tam = 1;
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
				aux_int = new int [tam];
				tam++;
				aux_int = numeros.clone();
				numeros = new int[tam];
				for (int i=0; i<tam-1; i++) {
					numeros[i] = aux_int[i];
				}
			}	
		}
		for (int i=0; i<tam; i++) {
			if ((tam % 2) == 0){
				System.out.printf("%d - %d = %d  --->  ", numeros[i], numeros[tam-1-i], numeros[i] - numeros[tam-1-i]);
			}
			else {
				if (i == (tam / 2)) System.out.printf("%d  --->  ", numeros[i]);
				else System.out.printf("%d - %d = %d --->  ", numeros[i], numeros[tam-1-i],numeros[i] - numeros[tam-1-i]);
			}
		}
		System.out.println("FIM");
		
		
		// Q10
		System.out.println("\n\nQUESTÃO 10: ");
		tam = 1;
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
				aux_int = new int [tam];
				tam++;
				aux_int = numeros.clone();
				numeros = new int[tam];
				for (int i=0; i<tam-1; i++) {
					numeros[i] = aux_int[i];
				}
			}	
		}
		
		System.out.print("Em ordem crescente: ");
		Arrays.sort(numeros);
		for (int i=0; i<tam; i++) {
			System.out.printf("%d --> ", numeros[i]);
		}
		System.out.println("FIM");
		
		
		// Q11
		System.out.println("\n\nQUESTÃO 11: ");
		System.out.print("Registre dois conjuntos numericos \nQuantos elementos quer em cada? ");
		n = input.nextInt();	
		conj1 = new int[n];
		conj2 = new int[n];
		aux_int = new int[n];
		count = 0;
		
		System.out.println("\nConjunto A: ");
		for (int i=0; i<n; i++) {
			System.out.printf("Elemento %d: ", i+1);
			conj1[i] = input.nextInt();
		}
		System.out.println("\nConjunto B: ");
		for (int i=0; i<n; i++) {
			System.out.printf("Elemento %d: ", i+1);
			conj2[i] = input.nextInt();
		}
		for (int elem1 : conj1) {
			in_aux = false;
			for (int j=0; j<n; j++) {
				if (elem1 == aux_int[j]) {
					in_aux = true;
					break;
				}
			}
			if (in_aux) continue;
			for (int elem2 : conj2) {
				if (elem1 == elem2) {
					aux_int[count] = elem1;
					count++;
					break;
				}
			}
		}
		System.out.println("\nElementos de A∩B:");
		if (count==0) {
			System.out.println("Não há interseção entre os conjuntos ");
		}
		else {
			for (int i=0; i<count; i++) {
				System.out.printf("%d --> ", aux_int[i]);
			}
			System.out.println("FIM");
		}
		
		
		// Q12
		System.out.println("\n\nQUESTÃO 12: ");
		tam = 1;
		nomes = new String[tam];
		input.nextLine();
		
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
				aux_strings = new String[tam];
				tam++;
				aux_strings = nomes.clone();
				nomes = new String[tam];
				for (int i=0; i<tam-1; i++) {
					nomes[i] = aux_strings[i];
				}
			}	
		}
		
		System.out.println("Nomes em ordem alfabética: ");
		Arrays.sort(nomes);
		for(String nome : nomes) {
			System.out.printf("%s --> ", nome);
		}
		System.out.println("FIM");

		
		// Q13
		System.out.println("\n\nQUESTÃO 13: ");
		tam = 1;
		conj1 = new int[tam];
		conj2 = new int[tam];
		
		System.out.println("Digite elementos para um conjunto de inteiros A");
		while (true) {
			System.out.printf("Elemento %d: ", tam);
			conj1[tam-1] = input.nextInt();
			input.nextLine();
			System.out.println("Elemento registrado");
			
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
				aux_int = new int [tam];
				tam++;
				aux_int = conj1.clone();
				conj1 = new int[tam];
				for (int i=0; i<tam-1; i++) {
					conj1[i] = aux_int[i];
				}
			}	
		}
		Arrays.sort(conj1);
		
		tam = 1;
		System.out.println("\nDigite elementos para um conjunto de inteiros B");
		while (true) {
			System.out.printf("Elemento %d: ", tam);
			conj2[tam-1] = input.nextInt();
			input.nextLine();
			System.out.println("Elemento registrado");
			
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
				aux_int = new int [tam];
				tam++;
				aux_int = conj2.clone();
				conj2 = new int[tam];
				for (int i=0; i<tam-1; i++) {
					conj2[i] = aux_int[i];
				}
			}	
		}
		Arrays.sort(conj2);
		
		int U[] = new int[conj1.length + conj2.length];
	    System.arraycopy(conj1, 0, U, 0, conj2.length);
	    System.arraycopy(conj2, 0, U, conj1.length, conj2.length);
	    Arrays.sort(U);
	    System.out.println("AUB: ");
	    for (int elem : U) {
	    	System.out.printf("%d --> ", elem);
	    }
	    System.out.println("FIM");
		
	    
	    input.close();
	    
	}

}
