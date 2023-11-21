package aula.hello;
import java.util.Scanner;
public class Exercicio26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a idade em anos, meses e dias:");
		System.out.print("Anos: ");
		int anos = scanner.nextInt();
		System.out.print("Meses: ");
		int meses = scanner.nextInt();
		System.out.print("Dias: ");
		int dias = scanner.nextInt();

		int totalDias = (anos * 365) + (meses * 30) + dias;

		System.out.println("A idade em dias é: " + totalDias + " dias.");
		scanner.close();
	}
}


