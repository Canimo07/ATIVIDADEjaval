package aula.hello;

import java.util.Scanner;
public class Exercicio46 {

	    private int idade;
	    private int diaNascimento;
	    private int mesNascimento;
	    private int anoNascimento;
	    private String nome;

	    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
	        this.nome = nome;
	        ajustaDataDeNascimento(diaNascimento, mesNascimento, anoNascimento);
	    }

	    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
	        idade = anoAtual - anoNascimento;

	        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
	            idade--;  
	        }
	    }

	    public int informaIdade() {
	        return idade;
	    }

	    public String informaNome() {
	        return nome;
	    }

	    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
	        diaNascimento = dia;
	        mesNascimento = mes;
	        anoNascimento = ano;
	    }
	}



