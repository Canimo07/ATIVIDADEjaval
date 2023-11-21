package aula.hello;
import java.util.Scanner;
public class Exercicio28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu saldo: ");
		double saldo = sc.nextDouble();
		
		double reajuste = saldo * 1.01;
		
		System.out.println("Seu saldo com reajuste em 1% é : " + reajuste);
		
	}
}


