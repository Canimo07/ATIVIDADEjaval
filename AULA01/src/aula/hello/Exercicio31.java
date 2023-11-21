package aula.hello;

 import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = 0, antecessor = 0, sucessor = 0;
		
		System.out.println("Informe um número: ");
		
		num = entrada.nextInt();
		sucessor = num + 1;
		antecessor = num - 1;
	
		System.out.println("O antecessor é: "+ antecessor);
		System.out.println("O sucessor é: "+ sucessor);
	}
}
