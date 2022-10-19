package EstruturasControleAssincrono;

import java.util.Scanner;

public class whileTabuada {

	
// digite um numero para saber a tabuada 
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero = entrada.nextInt(); // entrar coim um numero
		int contador = 1;

		while (contador <= 10) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));

			// looping
			contador++;
			// contador += 1;
			// contador = contador + 1
		}

	}

}
