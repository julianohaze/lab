package java8.capitulo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java8.Usuario;

public class Capitulo2 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		usuarios.forEach(u -> u.tornaModerador());

		usuarios.forEach(u -> System.out.println("Nome: " + u.getNome()
				+ " - Moderador: " + u.isModerador()));
	}

}

class Mostrador implements Consumer<Usuario> {

	@Override
	public void accept(Usuario u) {
		System.out.println(u.getNome());
	}
}