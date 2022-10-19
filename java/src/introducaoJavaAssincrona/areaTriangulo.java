package introducaoJavaAssincrona;

import java.util.Scanner;

public class areaTriangulo {

	public static void main(String[] args) {
		
		
		//entrada
		Scanner entrada = new Scanner(System.in);
		
		double base , altura, resultado;
		
		System.out.println("\n qual valor da base do triangulo ?");
		base = entrada.nextDouble();
		System.out.println("\n qual valor da altura do triangulo ?");
		altura = entrada.nextDouble();

		// processamento
		resultado = (base * altura)/2 ;
		
		// saida
		System.out.println("\n A area do Triangulo é : \n " + resultado );
		
		

	}

}
