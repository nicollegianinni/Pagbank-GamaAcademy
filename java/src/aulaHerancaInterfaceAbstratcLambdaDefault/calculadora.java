package aulaHerancaInterfaceAbstratcLambdaDefault;


// @FunctionalInterface so funciona se tiver apenas um metodo para implementar, aqui nao se aplica pois foi criado varios.
public interface calculadora {

	// metodos para chamar na classe que inplementara no caso minhacalculadora

	public int soma(int a, int b);

	public int subtracao(int a, int b);

	public int divisao(int a, int b);

	public int multiplicacao(int a, int b);

     //metodo criado so para mostrar que em OutraCalculadora nao funcionaria se nao puxasse ela la.
    // public int potencia (int a , int b);

	
	// são metodos da interface
	
    // metodo LAMBDA : nao pode efazer override
	static String meuMetodoLambdaStatic() {
		return "classe mae, metodo lambda static";
	}

     // metodo Default : pode efazer override
     public default String meuMetodoDefault () {
    	 return "classe mae, metodo default";
     }
}
