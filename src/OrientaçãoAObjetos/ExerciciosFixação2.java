package Orienta��oAObjetos;

import java.util.Scanner;
import Entidades.ConversorDeMoeda;

/**
 * @author Peixe
 *
 */
public class ExerciciosFixa��o2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int dolares;
	double cotacao;
	double total;
	
	System.out.println("Entre com a quantidade de Dol�res a serem comprados : ");
	dolares=sc.nextInt();
	System.out.println("Cota��o do D�lar atualmente : ");
	cotacao = sc.nextDouble();
	
	total = ConversorDeMoeda.calcula(cotacao, dolares);
	System.out.println(" Quantidade a ser paga em reais : "+ String.format("%.2f",total)+ "\n");
	sc.close();
	}

}
