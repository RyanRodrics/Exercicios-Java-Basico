
public class Lista01Respostas {

	public static void main(String[] args) {
		// Q1
		System.out.println("Questão 1.");
		for (int i=150; i<=300; i++) {
			System.out.printf("%d --> ", i);
		}
		System.out.println("FIM \n");
		
		// Q2
		System.out.println("Questão 2.");
		int soma = 0;
		for (int i=1; i<=1000; i++) {
			soma += i;
		}
		System.out.println(soma);
		System.out.println();
		
		
		// Q3
		System.out.println("Questão 3.");
		for (int i=0; i<=100; i++) {
			if (i % 3 == 0) {
				System.out.printf("%d --> ", i);
			}
		}
		System.out.println("FIM \n");
		
		// Q4 e Q5
		System.out.println("Questões 4 e 5.");
		double fat = 1;
		for (int i=1; i<=10/* valor a ser alterado */; i++) {
			fat = fat*i;
			System.out.printf("%d!=%.0f --> ", i, fat);
		}
		System.out.println("FIM \n");
		
		// Q6
		System.out.println("Questão 6.");
		int i = 0;
		int j = 1;
		int fibo = 0;
		while (true) {
			System.out.printf("%d --> ", i);
			if (i>100) {
				break;
			}
			fibo = i + j;
			i = j;
			j = fibo;
			
		}
		System.out.println("FIM\n");
		
		// Q7
		System.out.println("Questão 7.");
		double s1 = 0;
		double a = 1;
		double b = 1;
		for (; b<=50; b++) {
			s1 += (a/b);
			a += 2;
		}
		System.out.println(s1);
		System.out.println();
		
		// Q8
		System.out.println("Questão 8.");
		int x = 13; // alterarável
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			}
			else {
				x = 3 * x + 1;
			}
			System.out.printf("%d --> ", x);
			
		}
		System.out.println("FIM \n");
		
		// Q9
		System.out.println("Questão 9.");
		int n = 5; // numero de linhas
		for (i=1; i<=n; i++) {
			for (j=1; j<=i; j++) {
				System.out.printf("%d ", i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		// Q10
		System.out.println("Questão 10.");
		for (i=1000; i<=9999; i++) {
			int ab = i / 100;
			int cd = i - ab*100;
			if ((ab+cd)*(ab+cd) == i) {
				System.out.printf("%d --> ", i);
			}
		}
		System.out.println("FIM \n");		

	}

}
