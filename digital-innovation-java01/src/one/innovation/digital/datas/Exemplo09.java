package one.innovation.digital.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo09 {

	public static void main(String[] args) {
		
		Date agora = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mm");
		
		String dataFormatada = formatter.format(agora);
				
		System.out.println(dataFormatada);
		

	}
}
