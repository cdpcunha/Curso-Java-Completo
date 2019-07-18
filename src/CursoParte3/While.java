package CursoParte3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com um número : ");
	double x = sc.nextDouble();
	
	while(x>=0) {
		double res = Math.sqrt(x);
		System.out.printf("Raiz = %.2f\n",res);
		System.out.println("Entre outo número : ");
		x=sc.nextDouble();
	}
	System.out.println("\n\nNúmero negativo ! Terminando ....");
	
	sc.close();
	}

}
