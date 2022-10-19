package introducaoJavaAssincrona;

import java.util.Scanner;

public class diversasleituras2 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
		// MESMO EXERCICIO DO "DIVERSAS LEITURAS" POREM COM CONVERSÃO
	
				int codigo;
				double preco;
				String nome, texto;

				
				System.out.println("\n Digite o codigo");
				texto = entrada.nextLine();
				codigo = Integer.parseInt(texto);

				System.out.println("\n Digite o nome do produto");
				nome = entrada.nextLine(); 

				System.out.println("\n Digite o preco");
				texto = entrada.nextLine();
				preco = Double.parseDouble(texto);

//Escrever tudo em "string"(foi usado printf)  %d inteiros      %s String     %f  float mesma coisa de double  
				System.out.printf("\n %d - %s  R$%10.2f" , codigo , nome , preco); // R$%10 (casas antes da virgula) . 2 (casas depois da virgula)
				System.out.println(" \n\n Codigo : " + codigo + "\n produto: " + nome + "\n R$: " + preco );
	
				entrada.close(); // Para boas praticas : avisar que fechou a entrada de dados 
	}

}
