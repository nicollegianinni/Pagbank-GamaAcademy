package aulaHerancaInterfaceAbstratcLambdaDefault;

public class pessoa {

	private String nome ;
	private Integer idade;
	
	
	//metodo1
	public void Pessoa1 () {
		
		System.out.println("mae1");
	}
	
	//metodo2
     public void Pessoa2 (String nome) {
		
		System.out.println("mae2");
	}

	//metodo falar
	public void falar() {
		System.out.println("OI");
		
	}
	
	// getts e setts para mostrar na classe mae
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
		


}
