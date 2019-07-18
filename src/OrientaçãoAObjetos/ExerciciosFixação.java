package OrientaçãoAObjetos;

import java.util.Scanner;

import Entidades.Funcionario;

public class ExerciciosFixação {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Funcionario Funcionario = new Funcionario();
	System.out.println("  Entre com os dados do Funcioário  ");
	System.out.println("Nome : ");
	Funcionario.nome = sc.nextLine();
	System.out.println("Salário Bruto : ");
	Funcionario.salarioB = sc.nextDouble();
	System.out.println("Impostos : ");
	Funcionario.imposto =  sc.nextDouble();
	
	Funcionario.atualizaSalario();
	System.out.println(Funcionario);
	
	System.out.println("\nO que gostaria de fazer?\n1- Aumentar o Salário?\n2- Imprimir Informações? \n3- Sair?");
	int op = sc.nextInt();
	
	
	while (op != 3) {
		if (op == 1) {
			System.out.println("Entre o percentual para o aumento: ");
			Funcionario.aumentaSalario(sc.nextDouble()/100);
		}
		else if (op == 2) {
			System.out.println(Funcionario);	
		}
		else{
			System.out.println("Opção inválida, Didite novamente !");
			
		}
		System.out.println("\nO que gostaria de fazer?\n1- Aumentar o Salário?\n2- Imprimir Informações? \n3- Sair?");
		op = sc.nextInt();
	}
		
	sc.close();	
	}
	

}
