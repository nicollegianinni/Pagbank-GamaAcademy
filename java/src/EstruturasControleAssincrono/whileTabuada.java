package EstruturasControleAssincrono;

import java.util.Scanner;

public class whileTabuada {

// digite um numero para saber a tabuada 

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite um numero para a tabuada: ");
		int numero = entrada.nextInt(); // entrar coim um numero
		int contador = 1;

		while (contador <= 10) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));

			// parar o looping : contador
			contador += 1;
			// contador++;
			// contador = contador + 1

		}
		entrada.close();

	}

}
