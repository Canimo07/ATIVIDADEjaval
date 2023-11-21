package aula.hello;

import java.util.Scanner;

public class Exercicio04 {
	public class Quarto {
		public static void main (String [] args) {
			Scanner sc = new Scanner(System.in);
			Integer nu;
			Integer m = Integer.MIN_VALUE;

			for(int i =0; i<5; i++) {
				System.out.println("Fale o " + (i+1) + "º numero: ");
				nu = sc.nextInt();
				if (nu>m) {
					m = nu;
				}
			}
			System.out.println("O maior numero informado é: " + m);
		}
	}

}
