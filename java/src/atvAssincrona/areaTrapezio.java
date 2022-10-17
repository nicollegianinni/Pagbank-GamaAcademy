package atvAssincrona;

import java.util.Scanner;

public class areaTrapezio {

	public static void main(String[] args) {
		

		//entrada
		Scanner entrada = new Scanner(System.in);
		
		double baseMaior , baseMenor, resultado, altura ;
		
		
		System.out.println("\n qual valor da base maior do trapezio");
		baseMaior = entrada.nextDouble();
		
		System.out.println("\n qual valor da base menor do trapezio ?");
		baseMenor = entrada.nextDouble();
		
		System.out.println("\n qual valor da altura do trapezio ?");
		altura = entrada.nextDouble();
		
		
		
		// processamento
		resultado = (baseMaior * baseMenor) * altura /2 ;
		
		
		
		// saida
		System.out.println("\n A area do Trapezio é : \n " + resultado );
		

	}

}
