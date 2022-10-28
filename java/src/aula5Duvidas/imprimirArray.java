package aula5Duvidas;

/* CONSTRUÇÃO
 * cira um metodo que imprima numeros de 0 a 10  no FOR.
 * */
public class imprimirArray {
	
	
	public void imprima (Integer [] numeros) {
		
		for (int x =0; x <=numeros.length; x++) {
			
			System.out.println(numeros[x]);
			
		}
		
	}
	
	

	public static void main(String[] args) {
		
		// objeto com FOR
		int [] numeros = new int [10]; // OU int [] numeros = ou  {10,20,50,60}
		
        for (int x =0; x <=numeros.length; x++) {
			numeros[x] = x +1;
		
		// um metodo de ir acrescentando ao array
		/* Integer[] numeros = new Integer [10];
		 numeros [0] = 1 ;
		
		*/
			
		
			


		
		
	}

	}
}
