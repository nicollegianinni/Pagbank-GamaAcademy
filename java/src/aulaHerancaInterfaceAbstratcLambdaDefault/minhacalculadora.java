package aulaHerancaInterfaceAbstratcLambdaDefault;

public class minhacalculadora implements calculadora {

	// mostra vermelho porque esta pedindo para você implementar todos os metodos da
	// interface

	@Override
	public int soma(int a, int b) {
		return a + b;
	}

	@Override
	public int subtracao(int a, int b) {
		return a - b;
	}

	@Override
	public int divisao(int a, int b) {
		return a / b;
	}

	@Override
	public int multiplicacao(int a, int b) {
		return a * b;
	}
	// caso queira usar a função LAMBDA
	// USA PUXANDO DIRETO DA MAE

	public static void main(String[] args) {
		// so tem acesso pela classe mae
		minhacalculadora c = new minhacalculadora();

		// memso sendo criando na classe mae, nao pode chamar pois default nao é static.
		c.meuMetodoDefault();
		
		
		// CLASSE, INTERFACE POR ISSO SO CHAMAR STATICpode chamar o lambda static
		calculadora.meuMetodoLambdaStatic();
	}

}
