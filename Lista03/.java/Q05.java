
public class Q05 {

	public static void main(String[] args) {
		int numeros[] = new int[50];
		
		for (int i=0; i<50; i++) {
			numeros[i] = 101 + i;
		}
		for (int i=0; i<50; i++) {
			System.out.printf("%d --> ", numeros[i]);
		}
		System.out.println("FIM");

	}

}
