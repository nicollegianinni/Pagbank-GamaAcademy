package atv1JavaAula;


public class salario {

/*exercicio 1 IF-ELSE: escreva uma classe, com um atributo int chamado salario. 
Crie um metodo chamado informaValorImposto. e caso o salario seja maior que 5000, retorne 15. 
Caso contrario, retorne 5. */

	//metodo
	void informaValorImposto(int salario) {

		if (salario > 5000) {
			System.out.println("\n 15");

		} else {
			System.out.println("\n 5");
		}
	}

	//classe main
	public static void main(String[] args) {

		salario Salario = new salario();
		Salario.informaValorImposto(6000); // (inclua o valor aqui para testar o metodo)
	}
}
