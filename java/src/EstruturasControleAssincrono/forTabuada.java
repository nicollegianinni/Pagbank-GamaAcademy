package EstruturasControleAssincrono;

import java.util.Scanner;

public class forTabuada {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite um numero para a tabuada: ");
		int numero = entrada.nextInt(); // entrar coim um numero
		


		for (int contador = 1; contador <= 10; contador ++) {
			
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
			
		}

		entrada.close();

	}

}
