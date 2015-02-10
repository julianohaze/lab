package java8.methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import java8.Usuario;

public class StreamApi2 {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 90);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		double media = usuarios.stream().mapToInt(Usuario::getPontos).average().getAsDouble();
		
		System.out.println("Média: " + media);
		
		OptionalDouble optional = usuarios.stream().mapToInt(Usuario::getPontos).average();
		
		System.out.println("Média Optional: " + optional.orElse(0.0));
		
		Optional<Integer> maiorQuantidadeDePontos = usuarios.stream().max(Comparator.comparing(Usuario::getPontos)).map(Usuario::getPontos);
		
		System.out.println("Maior quantidade de pontos: " + maiorQuantidadeDePontos.orElse(0));
		
		Optional<String> usuarioComMaiorQuantidadeDePontos = usuarios.stream().max(Comparator.comparing(Usuario::getPontos)).map(Usuario::getNome);
		
		System.out.println("Usuário com maior quantidade de pontos: " + usuarioComMaiorQuantidadeDePontos.orElse("Nenhum"));
	}
}
