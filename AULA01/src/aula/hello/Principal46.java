package aula.hello;

public class Principal46 {
	 public static void main(String[] args) {
	    	
	        Pessoa albertEinstein = new Pessoa("Kanye West", 8, 6, 1977);
	        Pessoa isaacNewton = new Pessoa("Taylor Swift", 13, 12, 1989);

	        int diaAtual = 20;
	        int mesAtual = 11;
	        int anoAtual = 2023;

	        albertEinstein.calculaIdade(diaAtual, mesAtual, anoAtual);
	        isaacNewton.calculaIdade(diaAtual, mesAtual, anoAtual);

	        System.out.println("Idade de " + KanyeWest.informaNome() + ": " + KanyeWest.informaIdade());
	        System.out.println("Idade de " + TaylorSwift.informaNome() + ": " + TaylorSwif.informaIdade());
	    }

	}


