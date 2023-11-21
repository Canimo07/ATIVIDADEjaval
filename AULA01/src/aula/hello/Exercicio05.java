package aula.hello;

import java.util.Scanner;

public class Exercicio05 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		double nu;
		double soma=0;
		for(int i =0; i<10; i++) {
			System.out.println("Fale o " + (i+1) + "º numero: ");
			nu = sc.nextInt();
			soma += nu;
		}
		double resultado = soma/10;
		System.out.println("A média dos números informados é  " + resultado);
	}
}


