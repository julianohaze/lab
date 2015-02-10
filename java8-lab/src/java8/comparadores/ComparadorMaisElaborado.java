package java8.comparadores;

import static java.util.Comparator.*;

import java.util.Arrays;
import java.util.List;
import java8.Usuario;

public class ComparadorMaisElaborado {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("João da Silva", 150);
		Usuario user3 = new Usuario("Rodrigo Turini", 120);
		Usuario user4 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4);
		
		usuarios.sort(comparingInt(Usuario::getPontos).thenComparing(Usuario::getNome));
		
		usuarios.forEach(u -> System.out.println(u.getNome() + ": " + u.getPontos()));
	}
}
