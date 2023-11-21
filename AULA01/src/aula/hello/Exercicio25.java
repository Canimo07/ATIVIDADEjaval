package aula.hello;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio25 {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> numeros = new ArrayList<>();

	        int soma = 0;

	        System.out.println("Digite um número (Digite a média dos números anteriores para encerrar)");

	        while (true) {
	            Integer numero = sc.nextInt();
	            numeros.add(numero);
	            soma += numero;

	            if (numeros.size() > 1 && numero == (soma - numero) / (numeros.size() - 1)) {
	                System.out.println("Você digitou a média dos números anteriores.");
	                break;
	            }
	        }
	    }
	}


