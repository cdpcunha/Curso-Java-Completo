package course;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //sc.Close() quando o scanner n�o for mais necess�rio
	
	String sentence = sc.nextLine();
	System.out.println(sentence);
	String x, y, z;
	x=sc.next();
	y=sc.next();
	z=sc.next();
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	
	x=sc.next();
	y=sc.next();
	z=sc.next();
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	sc.close();
	}
	

}
