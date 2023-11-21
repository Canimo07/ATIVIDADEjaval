package aula.hello;

import java.util.Scanner;

public class Exercicio36 {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o primeiro numero:");
    String binarioNum1 = ler.nextLine();
    
    System.out.println("Digite o segundo numero:");
    String binarioNum2 = ler.nextLine();

    int num1 = Integer.parseInt(binarioNum1, 2);
    
    int num2 = Integer.parseInt(binarioNum2, 2);
          
    int Resultado = num1 * num2;

        System.out.println("Resultado da multiplicação: "+ Resultado );
    }
}
