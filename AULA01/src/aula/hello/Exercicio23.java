package aula.hello;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio23 {
	public static void main (String []args) {

		ArrayList<String> nomes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite \"FIM\" (em maiúsculo) para encerrar. ");
		System.out.println("Informe nomes: ");
		while(true) {
			String nome = sc.next();

			if (nome.equals("FIM")){
				break;
			}
			nomes.add(nome);
		}

		for (int i = nomes.size()- 1; i >= 0; i--) {
			System.out.println(nomes.get(i));
		}
		System.out.println("Os nomes em ordem inversa.");

		sc.close();

	}
}

