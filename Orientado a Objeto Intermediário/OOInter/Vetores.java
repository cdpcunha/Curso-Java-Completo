package OOInter;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Entre com o número de pessoas na lista :");
	int count = sc.nextInt();
	int i =0;
	double mediaSom = 0;
	double[] registro = new double[count];
	
	for(i=0;i<count;i++) {
		System.out.printf("\nInsira o registro da altura da pessoa #%d.",i+1);
		registro[i]=sc.nextDouble();
		mediaSom += registro[i];
		}
	double media = mediaSom / count;
	System.out.printf("\nMédia dos tamanhos: %.2f",media);
	
	sc.close();
	}

}
