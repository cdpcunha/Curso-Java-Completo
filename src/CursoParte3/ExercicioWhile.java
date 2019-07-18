package CursoParte3;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int senhaTrue = 2002;
	int cnt =0;
	System.out.println("Digite sua senha : ");
	int senhaTry = sc.nextInt();
	
	while (senhaTry != senhaTrue && cnt < 4) {
		cnt ++;
		if(cnt >= 3) {
			System.out.println("\nAcesso bloqueado !");
			break;
		}
		System.out.printf("\nTentativas incorretas : %d de 3\n",cnt);
		System.out.println("Tente novamente :");
		senhaTry = sc.nextInt();
		}
	if(cnt<3) {
		System.out.println("\nAcesso garantido !");
	}
		
	sc.close();
	}

}
