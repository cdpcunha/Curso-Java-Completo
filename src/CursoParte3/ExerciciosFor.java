package CursoParte3;

import java.util.Scanner;

public class ExerciciosFor {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre um número entre 1 e 1000 :");
	int x = sc.nextInt();
	int i=0;
	while (x<0 || x>1000) {
		System.out.println("Número fora do intervalo solicitado.");
		System.out.println("Entre um número entre 1 e 1000 :");
		x = sc.nextInt();
	}
	
	for(i=0;i<=x;i++) {
		if(i % 2 == 1) {
			System.out.println(i);
		}
	}
	
	sc.close();
	}

}
