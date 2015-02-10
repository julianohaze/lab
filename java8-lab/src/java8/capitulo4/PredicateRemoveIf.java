package java8.capitulo4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java8.Usuario;

public class PredicateRemoveIf {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);

		Predicate<Usuario> temMaisQue160Pontos = u -> u.getPontos() > 160;

		usuarios.removeIf(temMaisQue160Pontos);

		usuarios.forEach(u -> System.out.println(u.getNome()));
	}
}
