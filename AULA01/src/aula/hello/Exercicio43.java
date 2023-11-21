package aula.hello;
import java.util.Scanner;
public class Exercicio43 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String[] palavras = nomeCompleto.split(" ");
        StringBuilder abreviatura = new StringBuilder();

        for (String palavra : palavras) {
            if (palavra.length() > 2) {
                abreviatura.append(palavra.charAt(0)).append(". ");
            } else {
                abreviatura.append(palavra).append(" ");
            }
        }

        System.out.println("Abreviatura: " + abreviatura.toString().trim());
    }

}


