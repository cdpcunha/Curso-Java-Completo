package Entidades;

public class Calcula {
	
	public static final double PI = 3.14159;
	
	public static double calcCirc (double raio) {
		return 2.0* PI * raio;
	}
	public static double calcVol (double raio) {
		return (4.0* PI * raio * raio *raio)/3 ;
	}
}
