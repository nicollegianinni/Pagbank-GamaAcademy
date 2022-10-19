package EstruturasControleAssincrono;

import java.util.Scanner;

public class exercicioDDD {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		/*
		 * Leia um numero inteiro que representa um codigo DDD para discagem
		 * interurbana. Em seguida, informe a qual cidade o DD pertece, considerando a
		 * tabela: 
		 * 61 Brasilia 
		 * 71 Salvador 
		 * 11 Sao paulo 
		 * 21 Rio de janeiro 
		 * 32 Juiz de fora 
		 * 27 Vitoria 
		 * 31 Belo horizonte 
		 * 81 Pernambuco
		 */

		int numero;

		System.out.println("Digite o DDD: ");
		numero = entrada.nextInt();

		switch (numero) {
		case 61:
			System.out.println("Brasilia - DF");
			break;
		case 71:
			System.out.println("Salvador");
			break;
		case 11:
			System.out.println("São paulo");
			break;
		case 21:
			System.out.println("Rio de janeiro");
			break;
		case 31:
			System.out.println("Belo horizonte");
			break;
		case 32:
			System.out.println("Juiz de fora - MG");
			break;
		case 27:
			System.out.println("Vitoria- BA");
			break;
		case 81:
			System.out.println("PERNAMBUCO");
			break;

		default:
			System.out.println("DDD NÃO IDENTIFICADO, DIGITE NOVAMENTE.");

		}

		entrada.close();

	}

}
