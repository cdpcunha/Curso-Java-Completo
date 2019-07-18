package OrientaçãoAObjetos;
import Entidades.Calcula;
import java.util.Scanner;

public class MembrosEstaticos2 {
public static final double PI = 3.14159;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre o valor do raio : ");
	
	double raio = sc.nextDouble();
	
	double circ = Calcula.calcCirc(raio);
	double vol = Calcula.calcVol(raio);
	
	System.out.printf("\nCircumferencia = %.4f", circ);
	System.out.printf("\nVolume = %.4f", vol);
	System.out.printf("\nValor de PI = "+ PI);
	
	sc.close();
	}


}
