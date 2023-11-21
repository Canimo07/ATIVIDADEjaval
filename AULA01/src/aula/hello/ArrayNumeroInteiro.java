package aula.hello;
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
	            return false; // Não foi possível adicionar, array está cheio.
	        }
	    }

	    public int calculaMedia() {
	        if (numeroAtual == 0) {
	            return 0; // Evita divisão por zero.
	        }

	        int soma = 0;
	        for (int i = 0; i < numeroAtual; i++) {
	            soma += array[i];
	        }

	        return soma / numeroAtual;
	    }
