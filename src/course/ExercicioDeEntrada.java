package course;

import java.util.Scanner;

public class ExercicioDeEntrada {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre seu nome completo :");
	String nome = sc.nextLine();
	System.out.println("Quantos quartos existem na sua casa :");
	int bed = sc.nextInt();
	System.out.println("Qual o preço do produto :");
	double price = sc.nextDouble();
	System.out.println("Entre com seu último nome, idade e altura :");
	String ln = sc.next();
	int age = sc.nextInt();
	double heigh = sc.nextDouble();
	
	System.out.println(nome);
	System.out.println(bed);
	System.out.println(price);
	System.out.println(ln);
	System.out.println(age);
	System.out.println(heigh);
	
	sc.close();

	}

}
