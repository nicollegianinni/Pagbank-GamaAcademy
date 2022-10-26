package EstruturasControleAssincrono;

public class testeArgs {

	public static void main(String[] args) {
		System.out.println("Parametros passados pela linha de comando...");
		for (int posi =0; posi < args.length; posi++) {
			
			System.out.println("Parametro " + posi + " = " + args[posi]);
		}

	}

}
