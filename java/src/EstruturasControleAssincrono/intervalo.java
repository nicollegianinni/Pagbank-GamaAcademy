package EstruturasControleAssincrono;

import java.util.Scanner;

public class intervalo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		/*
		 * Faça um programa que leia um valor qualquer,
		 * e apresente a mensagem dizendo em qual dos seguintes intervalor 
		 * este valor se encontra :[0,25], [25,50],[50,75], [75,100].
		 */

		

		double valor;

		System.out.println("Digite um valor : ");
		
		valor = entrada.nextDouble();
	

		if (valor >= 0.0 && valor <=25.0 ) {

			System.out.println("intervalo [ 0,25]");

		} else if (valor >= 25.0 && valor <=50.0 ) {

			System.out.println("intervalo [ 25,50]");

		}else if (valor >= 50.0 && valor <=75.0 ) {

			System.out.println("intervalo [ 50,75]");
			
		}else if (valor >= 75.0 && valor <=100.0 ) {

			System.out.println("intervalo [ 75,100]");
			
		}else {
			System.out.println( " Fora do intervalo !");
		}

		entrada.close();


	}

}
