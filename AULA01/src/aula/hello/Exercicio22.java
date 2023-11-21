package aula.hello;

import java.util.Scanner;
public class Exercicio22 {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		
		Integer [] numero = new Integer[tamanho];
		
		System.out.println("Informe os números: ");
		for (int i = 0; i < tamanho; i++) {
			numero[i] = sc.nextInt();	
		}
		int maior = numero[0];
		int segundom = numero[0];
		
        for (int y = 0; y < numero.length ; y++) {
           if (numero[y]> maior) {
        	   segundom = maior;
        	   maior = numero[y];
           }else if(numero[y] > segundom && numero[y] < maior){
        	   segundom = numero[y];
           }
        }
    	System.out.println("O segundo maior numero informado é: " + segundom);

	}
}


