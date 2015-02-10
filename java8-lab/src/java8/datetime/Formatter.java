package java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter {

	public static void main(String[] args) {
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(DateTimeFormatter.ISO_LOCAL_TIME));

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String resultado = agora.format(formatador);
		LocalDate agoraEmData = LocalDate.parse(resultado, formatador);
		System.out.println(agoraEmData);
		
	}
}
