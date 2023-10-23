import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salarios[];
		double aux[];
		int tam = 1;
		double reajuste;
		double r;
		salarios = new double[tam];
		
		System.out.println("Digite o valor dos salarios para registra-los (-1 para encerrar)");
		while (true) {
			System.out.printf("Salario %d: ", tam);
			r = input.nextDouble();
			if (r == -1) {
				break;
			}
			salarios[tam-1] = r;
			aux = new double [tam];
			tam++;
			aux = salarios.clone();
			salarios = new double[tam];
			for (int i=0; i<tam-1; i++) {
				salarios[i] = aux[i];
			}
		}
		
		System.out.print("\nQual reajuste sera aplicado nos salarios? ");
		reajuste = input.nextDouble();
		System.out.println(" ");
		for (int i=0; i<tam-1; i++) {
			salarios[i]+= reajuste;
			System.out.printf("Salario %d: %.2f\n", i+1, salarios[i]);
		}
		input.close();
	}

}
