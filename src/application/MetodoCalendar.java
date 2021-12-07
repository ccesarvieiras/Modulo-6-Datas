package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class MetodoCalendar {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Horario formato ISO UTC

		System.out.println(sdf.format(d));

		// forma de acrescentar hras na data
		Calendar dataAtual = Calendar.getInstance();
		dataAtual.setTime(d);
		dataAtual.add(Calendar.HOUR_OF_DAY, 4);
		d = dataAtual.getTime();

		System.out.println(sdf.format(d));

		// mostrar uma unidade de tempo
		int mes = 1 + dataAtual.get(Calendar.MONTH); // o mes começa em 0, tem que por +1 pra ficar igual calendario
														// normal
		int minutos = dataAtual.get(Calendar.MINUTE);
		int horas = dataAtual.get(Calendar.HOUR);
		int segundos = dataAtual.get(Calendar.SECOND);
		
		System.out.println(mes);
		
		System.out.println(horas);
		System.out.println(minutos);
		System.out.println(segundos);

	}

}