package java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTimeApi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();

		LocalDate anoPassado = hoje.minusYears(1);

		System.out.println("Ano Passado: " + anoPassado);

		System.out.println("Hoje: " + hoje);

		LocalDateTime hojeEAgora = LocalDateTime.now();

		System.out.println("Hoje e agora: " + hojeEAgora);

		LocalTime agora = LocalTime.now();

		System.out.println("Agora: " + agora);

		LocalDateTime hojeAoMeioDia = LocalDate.now().atTime(12, 0);

		System.out.println("Hoje ao meio dia: " + hojeAoMeioDia);

		LocalDate mesQueVem = LocalDate.now().plusMonths(1);

		System.out.println("Mês que vem: " + mesQueVem);

		// junção de data e hora
		LocalDateTime dataEHora = hoje.atTime(agora);

		System.out.println("Mês que vem: " + mesQueVem);

		// time zone
		ZonedDateTime dataComHoraETimezone = dataEHora.atZone(ZoneId.of("America/Sao_Paulo"));

		System.out.println("Adicionando timezone: " + dataComHoraETimezone);

		LocalDateTime dataComHoraSemTimezone = dataComHoraETimezone.toLocalDateTime();

		System.out.println("Removendo timezone: " + dataComHoraSemTimezone);

		LocalDate date = LocalDate.of(2014, 12, 25);

		System.out.println("Utilizando o método LocalDate.of: " + date);

		LocalDateTime dateTime = LocalDateTime.of(2014, 12, 25, 10, 30);

		System.out.println("Utilizando o método LocalDateTime.of: " + dateTime);

		LocalDate anoModificado = LocalDate.now().withYear(1984);

		System.out.println("Utilizando o método LocalDate.of: " + anoModificado);

		LocalDate amanha = LocalDate.now().plusDays(1);

		System.out.println("\nComparações entre datas");
		System.out.println("hoje.isBefore(amanha): " + hoje.isBefore(amanha));
		System.out.println("hoje.isAfter(amanha)" + hoje.isAfter(amanha));
		System.out.println("hoje.isEqual(amanha)" + hoje.isEqual(amanha));

		System.out.println("hoje é dia: " + MonthDay.now().getDayOfMonth());

		System.out.println("\nUtilizando métodos dos enuns");
		System.out.println("Month.DECEMBER.firstMonthOfQuarter(): " + Month.DECEMBER.firstMonthOfQuarter());
		System.out.println("Month.DECEMBER.plus(2): " + Month.DECEMBER.plus(2));
		System.out.println("Month.DECEMBER.minus(1): " + Month.DECEMBER.minus(1));

		System.out.println("\nImprimindo o valor dos enuns");
		Locale pt = new Locale("pt");

		System.out.println("Full Name: " + Month.DECEMBER.getDisplayName(TextStyle.FULL, pt));
		System.out.println("Short Name: " + Month.DECEMBER.getDisplayName(TextStyle.SHORT, pt));

	}
}
