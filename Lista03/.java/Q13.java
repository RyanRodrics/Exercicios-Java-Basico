import java.util.Scanner;
import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int conjA[];
		int conjB[];
		int aux[];
		int tam = 1; 
		char r;
		conjA = new int[tam];
		conjB = new int[tam];
		
		System.out.println("Digite elementos para um conjunto de inteiros A");
		while (true) {
			System.out.printf("Elemento %d: ", tam);
			conjA[tam-1] = input.nextInt();
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
				aux = new int [tam];
				tam++;
				aux = conjA.clone();
				conjA = new int[tam];
				for (int i=0; i<tam-1; i++) {
					conjA[i] = aux[i];
				}
			}	
		}
		Arrays.sort(conjA);
		
		tam = 1;
		System.out.println("\nDigite elementos para um conjunto de inteiros B");
		while (true) {
			System.out.printf("Elemento %d: ", tam);
			conjB[tam-1] = input.nextInt();
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
				aux = new int [tam];
				tam++;
				aux = conjB.clone();
				conjB = new int[tam];
				for (int i=0; i<tam-1; i++) {
					conjB[i] = aux[i];
				}
			}	
		}
		Arrays.sort(conjB);
		
		int U[] = new int[conjA.length + conjB.length];
	    System.arraycopy(conjA, 0, U, 0, conjB.length);
	    System.arraycopy(conjB, 0, U, conjA.length, conjB.length);
	    Arrays.sort(U);
	    
	    System.out.println("AUB: ");
	    for (int elem : U) {
	    	System.out.printf("%d --> ", elem);
	    }
	    System.out.println("FIM");
	    
	    input.close();
	}

}
