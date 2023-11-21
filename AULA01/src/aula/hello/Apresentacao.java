package aula.hello;

import java.util.Scanner;
//Aqui é uma classe 
public class Apresentacao {
	//Aqui é um método
	public static void main(String...args) {
		//intanciando ojeto scanner 
		Scanner scanner = new Scanner (System.in);
		
		String nome;
		String tipoBebida;
		
		System.out.println("Informe seu nome? ");
		nome = scanner.nextLine();
		
		System.out.println(nome);
		
		System.out.println(nome + " ! Pode me informar a sua bebida favorita?");
		 tipoBebida = scanner.nextLine();
		 System.out.println("Eu " + nome + " Curso SI 2º, e gosto de " + tipoBebida);
	}

}
