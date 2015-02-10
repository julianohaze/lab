package java8.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DuracaoEPeriodo {

	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();
		LocalDate outraData = LocalDate.of(1989, Month.JANUARY, 25);
		long dias = ChronoUnit.DAYS.between(outraData, agora);
		long meses = ChronoUnit.MONTHS.between(outraData, agora);
		long anos = ChronoUnit.YEARS.between(outraData, agora);

		System.out.printf("A diferença entre 25/01/1989 até hoje é de %d dias ou %d meses ou %d anos.", dias, meses, anos);

		System.out.println();
		System.out.println("\nUtilizando a classe Period");
		Period periodo = Period.between(outraData, agora);
		System.out.printf("%s dias, %s meses e %s anos", periodo.getDays(), periodo.getMonths(), periodo.getYears());

		outraData = agora.plusYears(5);
		System.out.println();
		System.out.println("\nLidando com períodos negativos");
		Period periodo2 = Period.between(outraData, agora);

		if (periodo2.isNegative()) {
			periodo2 = periodo2.negated();
		}

		System.out.printf("%s dias, %s meses e %s anos", periodo2.getDays(), periodo2.getMonths(), periodo2.getYears());

		System.out.println();
		System.out.println("\nTrabalhando com Duration");

		LocalDateTime now = LocalDateTime.now();
		LocalDateTime daquiAUmaHora = LocalDateTime.now().plusHours(1);
		Duration duration = Duration.between(now, daquiAUmaHora);

		if (duration.isNegative()) {
			duration = duration.negated();
		}

		System.out.printf("%s horas, %s minutos e %s segundos", duration.toHours(), duration.toMinutes(), duration.getSeconds());

	}
}
