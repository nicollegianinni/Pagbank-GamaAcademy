package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class exercicio1 {

	public static void main(String[] args) {
		
		// exemplo: nao cometer erro abaixo
		/*
		ArrayList Lista = new ArrayList();
		Lista.add(1);
		Lista.add("texto");
		Lista.add(new cidade()));
		
		// lista com generics
		*/
		
		ArrayList c = new ArrayList();
		
		ArrayList<cidade> lista = new ArrayList<cidade>();
		lista.add(new cidade (  15000,  "cidade1"));
		lista.add(new cidade (  15000, "cidade2"));
		lista.add(new cidade (  20000, "cidade3"));
		lista.add(new cidade (  30000, "cidade4"));
		
		
		lista.stream()
		 .filter(c -> c.gethabitantes() >= 20000)
		 .forEach(c-> System.out.println(c.getNome());
		
		
		System.out.println("===============================");
		
		for (cidade cidade : lista) {
			
			if (cidade.getHabitantes() > 20000) {
				System.out.println(cidade.getNome());;
			}
		}
	}

}
