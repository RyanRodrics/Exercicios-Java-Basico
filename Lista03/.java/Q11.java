import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Registre dois conjuntos numericos \nQuantos elementos quer em cada? ");
		n = input.nextInt();
		int conj1[] = new int[n];
		int conj2[] = new int[n];
		int aux[] = new int[n];
		int count = 0;
		boolean in_aux;
		
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
				if (elem1 == aux[j]) {
					in_aux = true;
					break;
				}
			}
			if (in_aux) continue;
			for (int elem2 : conj2) {
				if (elem1 == elem2) {
					aux[count] = elem1;
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
				System.out.printf("%d --> ", aux[i]);
			}
			System.out.println("FIM");
		}
		
		input.close();
	}

}
