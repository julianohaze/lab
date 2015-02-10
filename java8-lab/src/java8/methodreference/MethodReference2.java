package java8.methodreference;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.List;
import java8.Usuario;

public class MethodReference2 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		usuarios.sort(comparing(Usuario::getNome));
		
		usuarios.forEach(System.out::println);
	}
}
