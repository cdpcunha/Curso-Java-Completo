package CursoParte3;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char op;
	do{
		System.out.println("Digite um número :");
	
	double n = sc.nextDouble();
	double sq = Math.sqrt(n);
	System.out.printf("Raiz quadrada = %.4f",sq);
	
	System.out.println("\nRepetir o processo (y/n) ?");
	op = sc.next().charAt(0);
	} while (op != 'n');
	sc.close();
	}

}
