package CursoParte3;

import java.util.Scanner;

public class ExerciciosFor2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int countIn = 0 ;
	int countOut = 0;
	int i =0;
	System.out.println("Entre a quantidade de números a serem lidos : ");
	int x = sc.nextInt();
	
	for(i=0;i<x;i++) {
		int a;
		System.out.printf("\nEntre o inteiro #%d : ",i+1);
		a = sc.nextInt();
		if(a >= 10 && a<=20) {
			countIn++;
		}
		else {
			countOut++;
		}
	}
	System.out.println("\nNúmeros dentro do intervalo [10,20] : "+ countIn);
	System.out.println("\nNúmeros fora do intervalo [10,20] : "+ countOut);
	sc.close();
	}

}
