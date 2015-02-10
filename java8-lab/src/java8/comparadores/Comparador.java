package java8.comparadores;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.List;
import java8.Usuario;

public class Comparador {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		usuarios.sort(comparing(u -> u.getNome()));
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
	}
}
