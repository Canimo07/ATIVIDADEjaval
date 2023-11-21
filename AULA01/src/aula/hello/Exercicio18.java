package aula.hello;

import java.util.Scanner;
public class Exercicio18 {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		 Integer [] numeros = new Integer [tamanho];
		 
		 for (int i=0; i< numeros.length; i++) {
			 System.out.println("Digite um número (Digite a soma dos dois números anteriores para encerrar)");
			 numeros[i] = sc.nextInt();
			 
			 if (i >= 2 && numeros [i] == numeros [i-1] + numeros [i-2]) {
				 System.out.println("Você digitou a soma dos dois números anteriores.");
				 break;
			 }
		 }
		
		sc.close();
		}
	}

