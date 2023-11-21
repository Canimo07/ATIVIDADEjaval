package aula.hello;

import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {
		decimalParabinario(28);
	}

	private static void decimalParabinario(int n) {
		if(n > 0) {
			decimalParabinario(n / 2);
			System.out.print( n % 2);
		}
		
	}
}   