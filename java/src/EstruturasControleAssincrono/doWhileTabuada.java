package EstruturasControleAssincrono;

import java.util.Scanner;

public class doWhileTabuada {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite um numero para a tabuada: ");

		int numero = entrada.nextInt(); // entrar coim um numero
		int contador = 1;

		contador = 100;

		do {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
			contador += 1;

		} while (contador <= 10);


		entrada.close();

	}

}
