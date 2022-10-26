package atv3JavaAulaPOO;

/*
 * Crie uma classe chamada Carro, contendo os seguintes atributos: 
 * numPortas, ano, preco, quilometragem,cor e marca. Crie 2 metodos contrutores:
 * o padrão e um construtor que receba a marca e a cor desse carro.
 * Crie metodos get e set para todos os atributos.
 * Crie um metodo main, nessa classe instancie 2 objetvos de carro ultilizando 
 * a palavra reservada new, usando os setts para passar os valores.
 * Ob.: existem varios meio de resulver as questoes, esse é apenas um modo.
 *  
 * */
public class carro {
	
	private int numPortas, ano ;
	private double preco, kilometragem;
	private String cor ,marca;
	
	//metodo 1
	public carro() {

	}
	
	//metodo 2
	public static void carroNovo () {
		
		carro CarroNovoRecebe = new carro();
		CarroNovoRecebe.cor = "azul" ;
		CarroNovoRecebe.marca = "Citroen";
		
		System.out.println("\n\n 2º metodo: ");
		System.out.println( "\n" + CarroNovoRecebe.getMarca());
		System.out.println("\n" + CarroNovoRecebe.getCor());
		
	}
	

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
		
	}

	public double getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(double kilometragem) {
		this.kilometragem = kilometragem;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public static void main(String[] args) {
		
		carro carro1 = new carro();
		carro carro2 = new carro();
		
		
		// carro 1
		carro1.setNumPortas(4);
		carro1.setAno(2022);
		carro1.setKilometragem(0.0);
		carro1.setPreco(150.000);
		carro1.setCor("Cinza");
		carro1.setMarca("Land Rover");
		
		// carro 2
		carro2.setNumPortas(4);
		carro2.setAno(2021);
		carro2.setKilometragem(40.0);
		carro2.setPreco(120.000);
		carro2.setCor("Preto");
		carro2.setMarca("Fiat");
		
		System.out.println("\n\n 1º metodo: ");
		
		System.out.println("\n\nPrimeiro Carro: \n");
		System.out.println("qnt Portas: " + carro1.getNumPortas());
		System.out.println("Ano :" + carro1.getAno());
		System.out.println("Km : " + carro1.getKilometragem());
		System.out.println("Preço : " + carro1.getPreco());
		System.out.println("Cor : " + carro1.getCor());
		System.out.println("Marca : " + carro1.getMarca());
	
		
		System.out.println("\n\nSegundo Carro: \n");
		System.out.println("qnt Portas: " + carro1.getNumPortas());
		System.out.println("Ano :" + carro2.getAno());
		System.out.println("Km : " + carro2.getKilometragem());
		System.out.println("Preço : " + carro2.getPreco());
		System.out.println("Cor : " + carro2.getCor());
		System.out.println("Marca : " + carro2.getMarca());
	
	
		// metodo 2
		carroNovo();
		
		
	}

	
}
