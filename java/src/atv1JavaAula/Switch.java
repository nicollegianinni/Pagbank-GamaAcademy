package atv1JavaAula;


public class Switch {
	
	/* Escreva uma classe com atributo chamado mes,
	criar um metodo chamado escrever mesExtenso. 
	caso o mes seja igual a 1 escrever janeiro,
    2 fevereiro, e assim por diante.
    Modificar o valor do mes para testar varias possibilidades.
	
	  */
	
	void mesExtenso(int mes) {
		
	switch(mes) {
		
		case 1: 
			System.out.println("janeiro");
			break;
		case 2: 
			System.out.println("fevereiro");
			break;
		case 3: 
			System.out.println("março");
			break;
		case 4: 
			System.out.println("abril");
			break;
		case 5: 
			System.out.println("maio");
			break;
		case 6: 
			System.out.println("junho");
			break;
		case 7: 
			System.out.println("julho");
			break;
		case 8: 
			System.out.println("agosto");
			break;
		case 9: 
			System.out.println("setembro");
			break;
		case 10: 
			System.out.println("outubro");
			break;
		case 11: 
			System.out.println("novembro");
			break;
		case 12: 
			System.out.println("dezembro");
			break;	
	}
	}
	
	public static void main(String[] args) {
		
		
		

		Switch mes = new Switch();    // formato: class (nome do arquivo) / objeto (que quero criar) / nome da classe
		
	    
	    mes.mesExtenso(12);
		

	}
}




