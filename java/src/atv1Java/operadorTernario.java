package atv1Java;

public class operadorTernario {

	/*
	 * reescrever o exercicio 1 fi-else com o operador ternario escrever uma classe,
	 * com um atributo int chamado salario. criar um metodo chamado
	 * informarValorImposto. caso salario seja maior que 5000 retornar 15. caso nao
	 * retornar 5.
	 */
	
	//classe main
	public static void main(String[] args) {
		
		int salario= 3000;
		int resultado ;

		resultado = (salario > 5000) ?  15 : (salario < 5000) ?  5 : 5;
				System.out.println(resultado);
 // serve como um IF ELSE para pequenos testes de um 2 ou 3 dados.
		
	}
}
	