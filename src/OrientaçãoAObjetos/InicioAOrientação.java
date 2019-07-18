package OrientaçãoAObjetos;

import java.util.Scanner;

public class InicioAOrientação {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com as medidas dos 3 lados do primeiro triangulo :");
	double a1 = sc.nextDouble();
	double b1 = sc.nextDouble();
	double c1 = sc.nextDouble();
	
	System.out.println("\nEntre com as medidas dos 3 lados do segundo triangulo :");
	double a2 = sc.nextDouble();
	double b2 = sc.nextDouble();
	double c2 = sc.nextDouble();
	
	double p1 = (a1+b1+c1)/2;
	double r1 = p1*(p1-a1)*(p1-b1)*(p1-c1);
	double area1 = Math.sqrt(r1);

	double p2 = (a2+b2+c2)/2;
	double r2 = p2*(p2-a2)*(p2-b2)*(p2-c2);
	double area2 = Math.sqrt(r2);
	
	System.out.printf("\nAs áreas são : \n Triangulo 1 = %.4f \n Triangulo 2 = %.2f",area1,area2);
	
	sc.close();
	}

}
