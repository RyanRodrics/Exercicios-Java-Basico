import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int segundos, minutos, horas;
		int entrada;
		
		System.out.print("Digite uma quantidade de segundos: ");
		entrada = input.nextInt();
		
		segundos = entrada % 60;
		minutos = entrada / 60; //minutos totais
		horas = minutos / 60;
		minutos = minutos % 60;
		
		System.out.printf("%d:%d:%d", horas, minutos, segundos);
		input.close();
		
	}

}
