package aula.hello;

import java.util.Scanner;

public class Exercicio19 {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		
		Integer [] numero = new Integer[tamanho];
		
		int posicao = 0;

		System.out.println("Informe os números: ");
		for (int i = 0; i < tamanho; i++) {
			numero[i] = sc.nextInt();	
		}
		int maior = numero[0];
        for (int y = 0; y < numero.length ; y++) {
           if (numero[y]> maior) {
        	   maior = numero[y];
        	   posicao = y;
           }
        }
    	System.out.println("O maior numero informado é: " + maior + "\nSua posição é: " + posicao);

	}
}


