package aula.hello;
import java.util.Scanner;
public class Exercicio44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Leitura da mensagem e valor de J
		System.out.print("Digite a mensagem: ");
		String mensagem = scanner.nextLine().toUpperCase(); // Converte para maiúsculas para facilitar a manipulação.

		System.out.print("Digite o valor de J (inteiro): ");
		int valorJ = scanner.nextInt();

		// Criptografia de César
		String mensagemCriptografada = criptografarCesar(mensagem, valorJ);

		// Exibição do resultado
		System.out.println("Mensagem criptografada: " + mensagemCriptografada);
	}

	private static String criptografarCesar(String mensagem, int valorJ) {
		StringBuilder resultado = new StringBuilder();

		for (int i = 0; i < mensagem.length(); i++) {
			char caractere = mensagem.charAt(i);

			if (caractere == ' ') {
				resultado.append(' ');  // Mantém espaços inalterados.
			} else {
				char caractereCriptografado = (char) ((caractere - 'A' + valorJ) % 26 + 'A'); 
				resultado.append(caractereCriptografado);
				}
			}

			return resultado.toString();
		}
	}


