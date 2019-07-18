package CursoParte3;

import java.util.Scanner;

public class Funções {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com 3 números :\n");
	double x = sc.nextDouble();
	double y = sc.nextDouble();
	double z = sc.nextDouble();
		
	double a = maior(x,y,z);
	
	mostraResultado(a);
		
	sc.close();
	}
//INICIANDO A DEFINIÇÂO DE FUNÇOES	
	
	public static double maior(double arg1, double arg2, double arg3) {
		double aux;
		
		if(arg1>arg2 && arg1>arg3) {
			aux = arg1;
		}
		else if(arg2>arg1 && arg2>arg3)	{
			aux = arg2;
		}
		else{
			aux = arg3;
		}	
		return aux;
	}
	
	public static void mostraResultado(double res) {
		System.out.println("O maior valor encontrado foi : " + res);
	}
}
