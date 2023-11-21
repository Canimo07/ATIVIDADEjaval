package aula.hello;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número binário: ");
        String binario1 = ler.nextLine();

            System.out.println("Digite o segundo número binário: ");
            String binario2 = ler.nextLine();
            
            String resultado = binario1 + binario2;

            System.out.println("Resultado da soma: " + resultado);
        }
    }

       
        

