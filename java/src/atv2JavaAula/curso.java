package atv2JavaAula;

import java.util.Scanner;

import atv1JavaAula.salario;


/*
 * Escreva uma classe chamada curso, crie um metodo chamado "escreveNome".
 * Usando While escreva Elas Tech por 5 vezes (usando System.out.println)
 *  
 *  */
public class curso {

	// metodo
	public static void escreveNome() {

		int x = 1;

		while (x <= 5) {

			System.out.println("\n Elas Tech");

			x++;
			
			
		}
	}
	// classe main

	public static void main(String[] args) {

		curso Curso = new curso();
		Curso.escreveNome();

	}

}
