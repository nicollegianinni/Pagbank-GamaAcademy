package aulaHerancaInterfaceAbstratcLambdaDefault;

public class colaborador extends pessoa {

	private float salario;
	private colaborador gerente;

	public colaborador(String nome, int idade, float salario, colaborador gerente) {

		// classe mae
		this.setNome(nome);
		this.setIdade(idade);

		// propria classe
		this.salario = salario;
		this.gerente = gerente;

		// herando ao metodo da mae
		// pode acessar pelo super.serNome(nome);
		// super (); chama o metodo da classe mae


	}

	public void falar() {

		System.out.println("oi, sou um colaborador !");
	}

	// metodo da classe e metodo da mae
	public void usar() {
		falar();
		super.falar();
	}

	public static void main(String[] args) {


		
		
}
}
