package CursoParte3;

import java.util.Scanner;

public class ExerciciosWhileFor {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i = 0;
	int count = 0;
	int aux = 0;
	int[] num = new int[20];
	System.out.println("Entre com a quantidade de n�meros a serem considerados, at� 20 : ");
	count = sc.nextInt();
		
	while(count< 0 || count > 20) {
		System.out.println("O valor deve ser positivo, digite novamente :");
		count = sc.nextInt();
	}
	
	for(i=0;i<count;i++) {
		System.out.printf("\nDigite o %d� n�mero da �rdem : ",i+1);
		num[i] = sc.nextInt();
		if (num[i] > aux) {
			aux = num[i];
		}
	}
	
	System.out.printf("\nO maior n�mero � %d",aux);
	sc.close();
	}

}
