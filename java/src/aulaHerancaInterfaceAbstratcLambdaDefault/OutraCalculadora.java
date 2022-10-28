package aulaHerancaInterfaceAbstratcLambdaDefault;
// adiciona o abstract => pq nao implementei todos os metodos da interface

public abstract class OutraCalculadora implements calculadora {

	@Override
	public int soma(int a, int b) {

		return 0;
	}

	@Override
	public int subtracao(int a, int b) {

		return 0;
	}

	@Override
	public int divisao(int a, int b) {

		return 0;
	}

	@Override
	public int multiplicacao(int a, int b) {

		return 0;
	}
	
	
	// LAMBADA NAO CONSGEUE CHAMAR O @Override
	
	/* Por causa de um metodo que criou na interface calculadora e nao puxou aqui, ia dar erro.
	@Override
	public int potencia(int a, int b) {
		
		return 0;
	}
	*/

	// se criou um metodo abstract na interface tem que por abstract no nome da classe
	public abstract String imprime();
}
