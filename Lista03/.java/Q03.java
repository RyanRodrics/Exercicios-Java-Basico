import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Deseja registrar quantas notas? " );
		n = input.nextInt();
		float notas[] = new float[n];
		float media = 0;
		
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
		input.close();
	}

}
