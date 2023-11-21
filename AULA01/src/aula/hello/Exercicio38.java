package aula.hello;

public class Exercicio38 {
	public static void main(String[] args) {
		decimalParahexadecimal(438);
	}

	private static void decimalParahexadecimal(int n) {
		if(n > 0) {
			decimalParahexadecimal(n / 16);
			System.out.print(n % 16);
		}
	}

}


