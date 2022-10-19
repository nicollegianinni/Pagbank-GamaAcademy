package introducaoJavaAssincrona;

import java.util.Scanner;

public class diversasLeituras {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		
		// ESCREVER TEXTO
		String texto;

		System.out.println("\n digite seu texto: ");
		texto = entrada.nextLine(); /*
									 strings (palavras); next: finaliza com espaço; 
									 E o nextLine so finaliza quando da enter.
									 */
		System.out.println("\n você escreveu : " + texto);

		
		
		// CODIGO - PRODUTO - VALOR
		int codigo;
		double preco;
		String nome;

		System.out.println("\n\n\n\n Digite o codigo");
		codigo = entrada.nextInt();

		System.out.println("\n Digite o nome do produto");
		nome = entrada.next(); // OBS: usa se next por esta entre variaveis de diferentes tipos

		System.out.println("\n Digite o preco");
		preco = entrada.nextDouble();

		System.out.println("\n codigo: " + codigo + " \n produto: " + nome + " \n valor: R$ " + preco);

		
		
		
		// INFORMAÇÕES
		System.out.println("\n\n Algumas informações: ");

		System.out.println("\n Para pular linha usa-se 1 barra ao contrario \\n   ");
		System.out.println("\t Para dar paragrafo no texto escreve 1 barra contrario \\t ");
		System.out.println("\n Para identar organizar os codigos (apertar ctrl + shift + letra F  ) ");
		System.out.println("\n Para chamar as bibliotecas (apertar ctrl + shift + letra O ) ");

	
		entrada.close(); // Para boas praticas : avisar que fechou a entrada de dados 
	}
}
