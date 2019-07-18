package CursoPt2;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um número inteiro :");
	int x = sc.nextInt();
	
	if(x % 2 == 0) {
		System.out.println("Número Par !");
	}
	else {
		System.out.println("Número Ímpar !");
	}
	
	
	System.out.println("Entre as horas do dia :");
	int time = sc.nextInt();
	if (time > 6 && time < 12) {
		System.out.println("Bom dia !");
	}
	else if (time > 12 && time < 18) {
		System.out.println("Boa tarde !");
	}
	else if (time > 18 && time <= 24) {
		System.out.println("Boa noite !");
	}
	else if (time > 0 && time <= 6) {
		System.out.println("Boa Madrugada !");
	}
	else {
		System.out.println("Ta doido manim? Isso não é uma hora do dia.");
	}
	
sc.close();
	}
	
}