package OOInter;

import java.util.Scanner;
import Entidades.Conta;
public class ExercicioDeFixação {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Olá ! Gostariamos de iniciar sua conta.");
	System.out.println("Entre por favor com os seguintes dados :");
	System.out.println("Nome :");
	String nome = sc.nextLine();
	System.out.println("Código da Conta :");
	int codConta = sc.nextInt();
	
	Conta conta = new Conta(codConta,nome);
	
	System.out.println("Deseja Realizar um Depósito inicial? (s/n) ");
	char op1 = sc.next().charAt(0);
	if(op1=='s') {
			System.out.println("Digite o valor de depósito inicial :");
			double depIni = sc.nextDouble();
			conta.saldoComDepInic(depIni);
	}
	System.out.println("------------------------------------------");
	System.out.println("Selecione uma das opções a seguir :");
	System.out.println("1 - Realizar Depósito");
	System.out.println("2 - Realizar Saque");
	System.out.println("3 - Alterar Titular da Conta");
	System.out.println("4 - Consultar Dados");
	System.out.println("5 - Finalizar");
	
	int menu = sc.nextInt();
	
	while(menu != 5) {
		if(menu == 1) {
			System.out.print("Informe o valor do Depósito : ");
			double deposito = sc.nextDouble();
			conta.deposito(deposito);
		}
		else if(menu == 2) {
			System.out.print("Informe o valor do Saque (R$ 5.00 de taxas) : ");
			double saque = sc.nextDouble();
			conta.saque(saque);
		}
		else if(menu == 3) {
			System.out.print("Digite o nome do novo titular :");
			String novoTitular = sc.nextLine();
			conta.setTitular(novoTitular);
		}
		else if (menu == 4) {
			System.out.println(conta);
		}
		else if(menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5) {
			System.out.println("Opção Inválida, digite novamente.");
		}
		System.out.println("------------------------------------------");
		System.out.println("Selecione uma das opções a seguir :");
		System.out.println("1 - Realizar Depósito");
		System.out.println("2 - Realizar Saque");
		System.out.println("3 - Alterar Titular da Conta");
		System.out.println("4 - Consultar Dados");
		System.out.println("5 - Finalizar");
		menu = sc.nextInt();
	}
	
	sc.close();
	}

}
