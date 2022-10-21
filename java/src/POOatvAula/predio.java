package POOatvAula;

/*
 * Crie uma classe chamada Predio, contendo os seguintes atributos: 
 * endereco, cidade, estado, numApts. Crie apenas um metodo contrutor
 * padrão, Crie metodos get e set para todos os atributos.
 * No metodo setNumApts, verifique se o numero de apartamentos passados é maior que 0.
 * Crie um metodo main, nessa classe instancie 2 objetvos de predio ultilizando 
 * a palavra reservada new, usando os setts para passar os valores.
 * Ob.: existem varios meio de resulver as questoes, esse é apenas um modo.
 *  
 * */
public class predio {


	private String endereco, cidade, estado;
	private int numApts;

	public predio() {

	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumApts() {
		return numApts;
	}

	public void setNumApts(int numApts) {
		if (numApts > 0) {
			this.numApts = numApts;

		} else {
			System.out.println("o numero precisa ser maior que 0 ");
		}

	}

	public static void main(String[] args) {

		predio p1 = new predio();
		predio p2 = new predio();

		p1.setEndereco("Av boa viagem");
		p1.setCidade("Recife");
		p1.setEstado("PE");
		p1.setNumApts(25);

		p2.setEndereco("Av Rio branco");
		p2.setCidade("Rio de janeiro");
		p2.setEstado("RJ");
		p2.setNumApts(32);

		System.out.println("Dados do apartamento 1 :");
		System.out.println("Rua:" + p1.getEndereco());
		System.out.println("Cidade" + p1.getCidade());
		System.out.println("Estado : " + p1.getEstado());
		System.out.println("Numero de apartamentos : " + p1.getNumApts());

		System.out.println("\nDados do apartamento 2 :");
		System.out.println("Rua:" + p2.getEndereco());
		System.out.println("Cidade" + p2.getCidade());
		System.out.println("Estado : " + p2.getEstado());
		System.out.println("Numero de apartamentos : " + p2.getNumApts());

	}
}
