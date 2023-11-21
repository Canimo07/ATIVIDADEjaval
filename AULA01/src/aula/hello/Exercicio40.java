package aula.hello;

import java.util.Scanner;

public class Exercicio40 {
	public static void main(String[] args) {
		String binario = "00111101";
		
		int decimal = Integer.parseInt(binario, 2);
		System.out.println("O valor binário "+ binario + " convertido para decimal é: " + decimal);
		
		System.exit(0);
	}
}