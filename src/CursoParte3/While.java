package CursoParte3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com um n�mero : ");
	double x = sc.nextDouble();
	
	while(x>=0) {
		double res = Math.sqrt(x);
		System.out.printf("Raiz = %.2f\n",res);
		System.out.println("Entre outo n�mero : ");
		x=sc.nextDouble();
	}
	System.out.println("\n\nN�mero negativo ! Terminando ....");
	
	sc.close();
	}

}
