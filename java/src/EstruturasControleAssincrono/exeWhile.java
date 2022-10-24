package EstruturasControleAssincrono;

import java.util.Scanner;
// questao while que cai em provas tecnicas 
public class exeWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		
		int produto = 2;
		
		while (produto <= 1000) {
			
			produto = 2 * produto;
			System.out.println(produto);
		}
		
		entrada.close();
	}

}
