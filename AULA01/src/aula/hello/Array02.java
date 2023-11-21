package aula.hello;

public class Array02 {
	
	public static void main(String[] args) {
		Integer[]arraynum = new Integer[30];
		int aux;
		for(int i = 0; i <= 29; i++) {
			for(int y = 0; y<=29; y++) {
				if (arraynum[i] > arraynum[y] ) {
					aux = arraynum[i];
					arraynum[i] = arraynum[y];
					arraynum[y] = aux;
				}
			}
		}
		for(int i = 0; i <= 29; i++) {
		System.out.println("Número: " + arraynum[i]);
		}
	}
}

