package course;

import java.util.Scanner;

public class Praticando {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre o primeiro Valor :");
	int a = sc.nextInt();
	System.out.println("Entre o segundo Valor :");
	int b = sc.nextInt();
	int total = a + b;
	System.out.printf("Total da Soma = %d\n",total);
	
	double pi = 3.14159;
	System.out.println("Entre com o valor do Raio :");
	double raio = sc.nextDouble();
	double area = pi * (raio * raio);
	System.out.printf("Total da área do Círculo = %.4f",area);
	
	
	sc.close();
	}

}
