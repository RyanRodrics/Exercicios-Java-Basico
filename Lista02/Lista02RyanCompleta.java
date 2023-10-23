import java.util.Scanner;
import java.lang.Integer;

public class Lista02RyanCompleta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores[];
		boolean resultado;
		int unidades[];
		int segundos, minutos, horas;
		int entrada;
		int count;
		int decimal;
		String binario1;
		String binario2;
		int soma;
		
		// Q01
		System.out.println("QUESTÃO 01: ");
		valores = new int[3];
		
		System.out.println("Digite três valores inteiros ");
		for (int i=0; i<3; i++) {
			System.out.printf("%dº valor: ", i+1);
			valores[i] = input.nextInt();
		}
		if ((valores[1]>valores[0]) && (valores[2]>valores[1])) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		System.out.printf("O resultado é: " + resultado);
		
		
		// Q02
		System.out.println("\n\nQUESTÃO 02: ");
		valores = new int[3];
		unidades = new int[3];
		
		System.out.println("Digite três valores inteiros ");
		for (int i=0; i<3; i++) {
			System.out.printf("%dº valor: ", i+1);
			valores[i] = input.nextInt();
			unidades[i] = valores[i] % 10;
		}
		
		if (unidades[0]==unidades[1] || unidades[0]==unidades[2] || unidades[1]==unidades[2]) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		System.out.printf("O resultado é: " + resultado);
		
		
		// Q03
		System.out.println("\n\nQUESTÃO 03: ");	
		System.out.print("Digite uma quantidade de segundos: ");
		entrada = input.nextInt();
		segundos = entrada % 60;
		minutos = entrada / 60; //minutos totais
		horas = minutos / 60;
		minutos = minutos % 60;
		System.out.printf("%d:%d:%d", horas, minutos, segundos);
		
		
		// Q04
		System.out.println("\n\nQUESTÃO 04: ");
		count = 0;
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				for(int k=1; k<=4; k++) {
					if(i!=j && i!=k && j!=k) {
						System.out.println(i*100 + j+10 + k);
						count++;
					}
				}
			}
		}
		System.out.println("O número total do número de três dígitos é " + count);
		
		
		// Q05
		System.out.println("\nQUESTÃO 05: ");
		binario1 = new String();
		
		System.out.print("Insira um número binário: ");
		input.nextLine();
		binario1 = input.nextLine();
		decimal = Integer.parseInt(binario1, 2);
		System.out.println("Resultado em decimal: " + decimal);
		
		
		// Q06
		System.out.println("\nQUESTÃO 06: ");
		binario1 = new String();
		
		System.out.print("Insira um número decimal: ");
		decimal = input.nextInt();
		binario1 = Integer.toBinaryString(decimal);
		System.out.println("Resultado em binário: " + binario1);
		
		// Q07
		System.out.println("\nQUESTÃO 07: ");
		binario1 = new String();
		binario2 = new String();
		
		System.out.print("Insira o primeiro número binário: ");
		input.nextLine();
		binario1 = input.nextLine();
		System.out.print("Insira o segundo número binário: ");
		binario2 = input.nextLine();
		soma = Integer.parseInt(binario1, 2) + Integer.parseInt(binario2, 2);
		System.out.println("Soma dos dois números binários: " + Integer.toBinaryString(soma));
		input.close();

	}

}
