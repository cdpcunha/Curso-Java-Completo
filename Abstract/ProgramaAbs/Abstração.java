package ProgramaAbs;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import EntidadeAbs.PessoaFisica;
import EntidadeAbs.Contribuinte;
import EntidadeAbs.PessoaJuridica;

public class Abstra��o {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<Contribuinte> listaContrib = new ArrayList<>();
	double totalImpostos = 0;
	int count = 0;
	
	System.out.println("Quantidade de registros de entrada?");
	try {
	count = sc.nextInt();
	}
	catch(InputMismatchException e) {
		System.out.println("Esperado N�mero Inteiro");
	}
	sc.nextLine();
	for(int i = 0; i< count; i++) {
		System.out.println("-----------------------------------");
		System.out.print("Pessoa (f)�sica ou (j)ur�dica?");
		char op = sc.nextLine().charAt(0);
		System.out.print("Nome : ");
		String nome = sc.nextLine();
		System.out.print("Receita Anual : ");
		double receita = sc.nextDouble();
		if(op == 'f') {
			System.out.print("Gastos com Sa�de : ");
			double gasto = sc.nextDouble();
			sc.nextLine();
			listaContrib.add(new PessoaFisica(nome,receita,gasto));
		}
		else if(op == 'j') {
			System.out.print("Quantidade de empregados ?");
			int qtdEmp = sc.nextInt();
			sc.nextLine();
			listaContrib.add(new PessoaJuridica(nome, receita, qtdEmp));
		}
		else System.out.println("Op��o inv�lida. Ignorando");
	}
	for (Contribuinte x:listaContrib) {
		totalImpostos += x.impostoAPagar();
	}
	sc.close();
	System.out.printf("\nTotal dos impostos pagos da lista : %.2f",totalImpostos);
	System.out.println();
	System.out.println("-----------------------------------");
	System.out.print("  Lista  ");
	for(Contribuinte x:listaContrib) {
		System.out.printf("\n%s : %.2f",x.getNome(),x.impostoAPagar());
	}
	}
}
