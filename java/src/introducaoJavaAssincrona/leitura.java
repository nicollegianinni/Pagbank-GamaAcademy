package introducaoJavaAssincrona;

import java.util.Scanner;  // para entrar dados usa essa biblioteca

public class leitura {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int valorInteiro;
		float valorFloat;
		
		System.out.println("\n Por favor digite um numero inteiro: ");
		valorInteiro = entrada.nextInt(); // lembre se por Int no next.
		
		System.out.println("\n Por favor digite um numero real (pode ser decimal): ");
		valorFloat = entrada.nextFloat(); // lembre se por Float no next.
		
		System.out.println("\n Você digitou os valores : " + valorInteiro + " e " + valorFloat);
		
		
		entrada.close(); // Para boas praticas : avisar que fechou a entrada de dados 
	}

}
