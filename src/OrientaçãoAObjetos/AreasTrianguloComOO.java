package OrientaçãoAObjetos;
import java.util.Scanner;
import Entidades.Triangulo;
public class AreasTrianguloComOO {

	public static void main(String[] args) {
	Triangulo x, y;
	x = new Triangulo();
	y = new Triangulo();

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com as medidas do triangulo X :");
	x.a = sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	
	System.out.println("Entre com as medidas do triangulo Y :");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
	
	double areaX = x.area();
	
	double areaY = y.area();
	
	char res = '_';
	
	System.out.printf("\nAs áreas são : \n Triangulo 1 = %.4f \n Triangulo 2 = %.4f",areaX,areaY);
	if(areaX > areaY) {
		res = 'X';
	}
	else res='Y';
	System.out.printf("\nA maior área é a do Triangulo %c",res);
	
	sc.close();
	}

}
