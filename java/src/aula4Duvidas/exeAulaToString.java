package aula4Duvidas;

public class exeAulaToString {

	public static void main(String[] args) {

		String s1 = new String("A");
		String s2 = new String("A");

		// 1
		if (s1 == s2) {

			System.out.println("igual em referencias/ memoria");

		}
		if (s1.equals(s2)) {
			System.out.println("igual em valor ; string");
		}

		// 2
		s2 = s1;

		if (s1 == s2) {
			System.out.println("igual em referencias/ memoria");
		}
		if (s1.equals(s2)) {
			System.out.println("Não são mais iguais em valor");
		}

		// 3
		s2 = "B"; // imutavel
		s2 = "C";

		System.out.println(s1.toString()); // valor de referencia de memoria
		System.out.println(s2.toString()); // valor de referencia de memoria

		//valor 4
		if (s1 == s2) {
			System.out.println("igual em referencias/ memoria");
		}
		if (s1.equals(s2)) {
			System.out.println("Não são mais iguais em valor");
		}
	}

}
