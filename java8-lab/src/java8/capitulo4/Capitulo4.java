package java8.capitulo4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java8.Usuario;

public class Capitulo4 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		Consumer<Usuario> mostraMensagem = u -> System.out
				.println("mostra mensagem antes de imprimir os nome");

		Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());

		usuarios.forEach(mostraMensagem.andThen(imprimeNome));
	}

}