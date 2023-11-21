package aula.hello;

import java.util.Scanner;

public class Porcentagem {
	public static void main(String...args) {
			Scanner scanner = new Scanner (System.in);
			
			Double num ;
			Double perc ;
			String text;
			
			System.out.println("BEM VINDO AO SISTEMA DE PERCENTAGENS");
			
			System.out.println("Informe um numero: ");
			num = scanner.nextDouble();
			
			if (num = text) {
				
				System.out.println("somente numero?");
				} else {
				System.out.println("Qual percentual deseja calcular?");
				}
			
			System.out.println(num);
			
			System.out.println("Qual percentual deseja calcular? ");
			perc = scanner.nextDouble();
			
			Double resul = num + ((100/perc)-num);
			System.out.println(perc + "% de" + num + "é igual a:" + resul);
			
		}

}
