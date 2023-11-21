package aula.hello;

public class Exercicio39 {
	public static void main(String[] args) {
		decimalParaoctal(246);
	}

	private static void decimalParaoctal(int n) {
		if(n > 0) {
			decimalParaoctal(n / 8);
			System.out.print(n % 8);
	}
	}

}


