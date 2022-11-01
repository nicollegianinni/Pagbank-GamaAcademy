package streams;

public class cidade {

//atributos
private int habitantes;
private String nome;

//metodo construtor 
public cidade (int habitantes, String nome) {
	this.habitantes = habitantes;
	this.nome = nome;
	
}

//metodos gett e setts 

public int getHabitantes() {
	return habitantes;
}
public void setHabitantes(int habitantes) {
	this.habitantes = habitantes;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}



}
