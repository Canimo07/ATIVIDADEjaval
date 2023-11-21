package aula.hello;

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[]args) {
		
		Double salariominimo = 1500.0;
		Double seusalario;
		Double qtdsalariosMN;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do seu salário");
		seusalario = ler.nextDouble();
		
		qtdsalariosMN = seusalario / salariominimo;
		
		if (seusalario > salariominimo) {
			System.out.println ( "Seu salário equivale a " +  qtdsalariosMN + " salários mínimos" + "\nSM = R$ " + (seusalario - salariominimo));
		}else {
			System.out.println("Faltam R$ " + ((seusalario - salariominimo)*-1)+ " reais para você alcançar o salário mínimo!");
		}
	}

}
