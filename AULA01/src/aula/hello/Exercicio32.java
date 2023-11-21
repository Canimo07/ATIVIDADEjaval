package aula.hello;

import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[]args) {
	
		Scanner ler = new Scanner (System.in); 
		int numero;
		
		System.out.println("Informe um número: ");
		numero = ler.nextInt();
		for(int i = 1; i <= 10; i++ ) {
			
			System.out.println(numero + " x "+ i + " = "+ numero*i);
		}

	}
}
