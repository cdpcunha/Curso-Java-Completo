package OOInter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Dates {

	public static void main(String[] args) throws ParseException{
	SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat dataGMT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	dataGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
		
	Date d1 = data1.parse("25/06/2019");
	Date d2 = data2.parse("30/05/2019 15:55:25");
	Date d3 = new Date();
	Date d4 = new Date(0L);
	Date d5 = Date.from(Instant.parse("2018-06-25T12:30:22Z"));
	
	System.out.println(d1);
	System.out.println(data1.format(d1));
	System.out.println(data2.format(d1));
	System.out.println(dataGMT.format(d1));
	System.out.println("---------------------------");
	System.out.println(d2);
	System.out.println(data1.format(d2));
	System.out.println(data2.format(d2));
	System.out.println(dataGMT.format(d2));
	System.out.println("---------------------------");
	System.out.println(d3);
	System.out.println(data1.format(d3));
	System.out.println(data2.format(d3));
	System.out.println(dataGMT.format(d3));
	System.out.println("---------------------------");
	System.out.println(d4);
	System.out.println(data1.format(d4));
	System.out.println(data2.format(d4));
	System.out.println(dataGMT.format(d4));
	System.out.println("---------------------------");
	System.out.println(d5);
	System.out.println(data1.format(d5));
	System.out.println(data2.format(d5));
	System.out.println(dataGMT.format(d5));
	}

}
