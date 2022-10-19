package EstruturasControleAssincrono;

import java.util.Scanner;

public class testeIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota1, nota2, media;
		
		System.out.println("digite sua primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("digite sua segunda nota: ");
		nota2 = entrada.nextDouble();

		media = (nota1 + nota2) / 2;

		System.out.println(" Sua media é: " + media);

		if (media >= 6) {

			System.out.println("PARABENS APROVADO !!!");

		} else if (media >= 4 && media < 6) {
			System.out.println(" Você está de exame, precisa recuperar a nota! ");
		} else {

			System.out.println("Infelizmente você esta reprovado.");
		}

		entrada.close();

	}

}
