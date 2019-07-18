package course;

import java.util.Scanner;

public class Praticando2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com os valores : Nome , Horas trabalhadas , Recebimento por hora ");
	String name = sc.nextLine();
	double horas = sc.nextDouble();
	double rec = sc.nextDouble();
	double total = rec*horas;
	System.out.printf("\nO funcionário %s deve receber um total de %.2f neste mês ",name,total);
	
	sc.close();
	}

}
