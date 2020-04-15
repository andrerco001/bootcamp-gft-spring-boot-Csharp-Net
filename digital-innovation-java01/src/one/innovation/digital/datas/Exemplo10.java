package one.innovation.digital.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exemplo10 {

	public static void main(String[] args) {
		
		// LocalDate - trabalha exclusivamente com Data
		// LocalTime - trabalha com horario
		// LocalDateTime - trabalha com data e horario
		
		// LocalDate
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
	
		LocalDate ontem = hoje.minusDays(1);
		System.out.println(ontem);
		
		// LocalTime
		LocalTime agora = LocalTime.now();
		System.out.println(agora);
		
		LocalTime maisUmaHora = agora.plusHours(1);
		System.out.println(maisUmaHora);
		
		// LocalDateTime
		LocalDateTime agoraDataHorario = LocalDateTime.now();
		System.out.println(agoraDataHorario);
		
		LocalDateTime futuro = agoraDataHorario.plusHours(1).plusDays(2).plusSeconds(12);
		System.out.println(futuro);
		
		
		

	}

}
