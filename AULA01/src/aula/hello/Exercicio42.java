package aula.hello;
import java.util.Scanner;
public class Exercicio42 {
	public static void main(String[] args) {

		int numeroSorteado = sortearNumero();
		int tentativas = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem-vindo ao jogo de sorteio!");

		do {
			System.out.print("Digite seu palpite (de 0 a 1000): ");
			int palpite = scanner.nextInt();
			tentativas++;

			if (palpite == numeroSorteado) {
				System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
				break;
			} else if (palpite < numeroSorteado) {
				System.out.println("Seu palpite é menor. Tente novamente!");
			} else {
				System.out.println("Seu palpite é maior. Tente novamente!");
			}

		} while (true);
		private static int sortearNumero() {
			return (int) (Math.random() * 1001);
		}
	}



