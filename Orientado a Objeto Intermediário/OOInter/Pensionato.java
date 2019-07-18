package OOInter;
import java.util.Scanner;

import Entidades.Estudante;
public class Pensionato {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i = 0;
	Estudante[] quarto = new Estudante[10];
	System.out.print("Quantos estudantes malditos estão vindo ? ");
	int count = sc.nextInt();
	sc.nextLine();
	
	for(i=0;i<10;i++) {
		quarto[i] = new Estudante();
		quarto[i].setQuarto(i);;
	}
	
	for(i=0;i<count;i++) {
		System.out.println("----------------------------------------");
		System.out.printf("\nQual o quarto escolhido do Estudante %d ?",i+1);
		int qrtoEscol = sc.nextInt();
		sc.nextLine();
		
		while(qrtoEscol >= 10) {
			System.out.printf("Quarto inexistente, tente novamente :");
			qrtoEscol = sc.nextInt();
			sc.nextLine();
		}
		
		while(quarto[qrtoEscol].getAluguel() != 0 ) {
			System.out.print("Quarto Alugado, digite um novo : ");
			qrtoEscol = sc.nextInt();
			sc.nextLine();
		}
				
		System.out.print("\nNome : ");
		String nome = sc.nextLine();
		System.out.print("\nValor do Aluguel :");
		double aluguel = sc.nextDouble();
		sc.nextLine();
		System.out.print("\nEndereço de E-mail :");
		String email = sc.nextLine();
		quarto[qrtoEscol] = new Estudante(nome,email,qrtoEscol,aluguel);
	}
	
	for(i=0;i<10;i++) {
		if(quarto[i].getAluguel() != 0) {
		System.out.println("----------------------------------------");
		System.out.println(quarto[i]);
		}
	}
	
	sc.close();
	}

}
