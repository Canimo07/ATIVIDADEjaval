package aula.hello;
import java.util.Scanner;

public class Imc {
	public static void main (String[]args) {
		
		Double peso;
		Double altura;
		
		Scanner ler = new Scanner(System.in);
		        System.out.println("BEM VINDO AO SISTEMA DE CALCULO DE ICM ");
		        
				System.out.println("Digite seu peso:\n(Em números) ");
				peso = ler.nextDouble();
			
				System.out.println("Digite sua altura:\n(Em números sepados por vigulas(,)!)gg");
				altura = ler.nextDouble();
				
				Double imc;
		imc  = peso / (altura*altura);
		
		if(imc <= 18.5) {
			System.out.println("Abaixo do peso");
		}else if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("Sudável");
		}else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("Peso em exesso");
		}else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("Obesidade grau 1");
		}else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obesidade grau 2 (severa)");
		}else if (imc >= 40.0) {
			System.out.println("Obesidade grau 3 (mórbida)");
		}
		System.out.printf("Seu IMC é: "+ imc );
		}

}
