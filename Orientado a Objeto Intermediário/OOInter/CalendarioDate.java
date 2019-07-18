package OOInter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarioDate {

	public static void main(String[] args) {
	SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date data = new Date();
	Calendar cal = Calendar.getInstance();
	cal.setTime(data);
	
	System.out.println(date.format(data));
	System.out.println(data);
	
	cal.add(Calendar.DAY_OF_WEEK, 1);
	data = cal.getTime();
	
	System.out.println(date.format(data));
	System.out.println(data);
	
	
	int minutos =  cal.get(Calendar.MINUTE);
	int mes = cal.get(Calendar.MONTH);
	System.out.println("Minutos : " + minutos);
	System.out.println("Mês : " + (mes+1)); //inicia em mês 0
	}

}
