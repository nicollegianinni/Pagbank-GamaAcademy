package introducaoJavaAssincrona;

import java.util.Scanner;

/*
 * Exercicio 1 : Faça um programa que entre 3 numeros e que a saida dele seja o numero invertido.
 * 
234  ==>  2 centenas + 3 dezenas + 4 unidades

   234 / 100
    34    2 (centenas)
    
    34 /10
     4   3 (dezenas)
     
     4 / 1
     0   4 (unidades)
*/

public class exe1Algoritmo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeroOriginal, c, d, u, resto;
		int novoNumero;

		// entrada de dados
		System.out.println("Digite 3 numero para serem invertidos: ");
		numeroOriginal = entrada.nextInt();

		// processamento
		c = numeroOriginal / 100; // ex.: 234 / 100 = 2 (inteiro), c = 2 e resto seria 34.
		resto = numeroOriginal % 100; // ex.: resto de 234 % 100 = 34
		d = resto / 10; // ex.: 34 /10 = 3 , portanto a dezena é 3
		u = resto % 10; // ex.: 34 % 10 = 4, portanto a Unidade é 4

		novoNumero = u * 100 + d * 10 + c;

		// saida
		System.out.println("novo numero vale: \n " + novoNumero);

		entrada.close(); // Para boas praticas : avisar que fechou a entrada de dados
	}

}
