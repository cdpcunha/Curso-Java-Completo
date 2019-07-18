package Entidades;

public class ConversorDeMoeda {
	public static final double IOF = 0.06;
	
	public static double calcula (double dolar, int qtd) {
		return (dolar * qtd)* 1+IOF;
	}
}
