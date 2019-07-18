package OrientaçãoAObjetos;
import java.util.Scanner;
public class AreasTrianguloSemOO {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int res = 0;
	
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
	
	System.out.printf("\nAs áreas são : \n Triangulo 1 = %.4f \n Triangulo 2 = %.4f",area1,area2);
	if(area1 > area2) {
		res = 1;
	}
	else res=2;
	System.out.printf("\nA maior área é a do Triangulo %d",res);
	sc.close();
	}

}
