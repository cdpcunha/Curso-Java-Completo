package Orienta��oAObjetos;

import java.util.Scanner;

import Entidades.Funcionario;

public class ExerciciosFixa��o {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Funcionario Funcionario = new Funcionario();
	System.out.println("  Entre com os dados do Funcio�rio  ");
	System.out.println("Nome : ");
	Funcionario.nome = sc.nextLine();
	System.out.println("Sal�rio Bruto : ");
	Funcionario.salarioB = sc.nextDouble();
	System.out.println("Impostos : ");
	Funcionario.imposto =  sc.nextDouble();
	
	Funcionario.atualizaSalario();
	System.out.println(Funcionario);
	
	System.out.println("\nO que gostaria de fazer?\n1- Aumentar o Sal�rio?\n2- Imprimir Informa��es? \n3- Sair?");
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
			System.out.println("Op��o inv�lida, Didite novamente !");
			
		}
		System.out.println("\nO que gostaria de fazer?\n1- Aumentar o Sal�rio?\n2- Imprimir Informa��es? \n3- Sair?");
		op = sc.nextInt();
	}
		
	sc.close();	
	}
	

}
