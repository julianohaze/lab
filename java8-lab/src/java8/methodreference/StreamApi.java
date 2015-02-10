package java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import java8.Usuario;

public class StreamApi {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 90);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		Stream<Usuario> stream = usuarios.stream().filter(u -> u.getPontos() > 100);
		
		stream.forEach(System.out::println);
	}
}
