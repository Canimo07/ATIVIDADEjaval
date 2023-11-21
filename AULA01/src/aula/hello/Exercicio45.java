package aula.hello;

import java.util.Scanner;

public class Exercicio45 {
	public class ArrayNumeroInteiro {
	    private int[] array;
	    private int numeroAtual;
	    private int numeroMaximo;

	    public ArrayNumeroInteiro(int tamanho) {
	        array = new int[tamanho];
	        numeroAtual = 0;
	        numeroMaximo = tamanho;
	    }

	    public boolean adicionar(int numero) {
	        if (numeroAtual < numeroMaximo) {
	            array[numeroAtual] = numero;
	            numeroAtual++;
	            return true;
	        } else {
	            return false; 
	        }
	    }

	    public int calculaMedia() {
	        if (numeroAtual == 0) {
	            return 0; 
	        }

	        int soma = 0;
	        for (int i = 0; i < numeroAtual; i++) {
	            soma += array[i];
	        }

	        return soma / numeroAtual;
	    }
	}

}
