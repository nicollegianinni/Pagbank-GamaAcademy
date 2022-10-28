package aulaHerancaInterfaceAbstratcLambdaDefault;


// classe abstract é quando se cria um metodo mais nao implementa 
public abstract class computador {

	public void liga () {
		
		System.out.println("liga");
		
	}
	
	public void desliga () {
		System.out.println("desliga");
	}
	
	public abstract void reboot (); // tem que adicionar abstract no nome da classe
	
	
}
