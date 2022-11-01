package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exe2 {

	public static void main(String[] args) {

		List<pessoaColaboradora> listaPessoas = new ArrayList<pessoaColaboradora>();
		listaPessoas.add(new pessoaColaboradora("Ana", 10000, 35));
		listaPessoas.add(new pessoaColaboradora("José", 5000, 62));
		listaPessoas.add(new pessoaColaboradora("Marcos", 8000, 52));

		ArrayList<pessoaColaboradora> lista = (ArrayList) listaPessoas.stream().map(p -> {
			p.setSalario(p.getSalario() + (p.getSalario() * 0.15));
			return p;
		}).collect(Collectors.toList());

		lista.forEach(p -> System.out.println(p.getNome() + " - " + p.getSalario()));

	}

}
