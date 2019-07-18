package OrientaçãoAObjetos;

import java.util.Scanner;

public class MembrosEstaticos {

	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre o valor do raio : ");
	double raio = sc.nextDouble();
	
	double circ = calcCirc(raio);
	double vol = calcVol(raio);
	
	System.out.printf("\nCircumferencia = %.4f", circ);
	System.out.printf("\nVolume = %.4f", vol);
	System.out.printf("\nValor de PI = %.5f",PI);
	
	sc.close();
	}
	
	public static double calcCirc (double raio) {
		return 2.0* PI * raio;
	}
	public static double calcVol (double raio) {
		return (4.0* PI * raio * raio *raio)/3 ;
	}

}
