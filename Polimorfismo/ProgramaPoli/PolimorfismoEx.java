package ProgramaPoli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EntidadesPoli.Empregado;
import EntidadesPoli.EmpregadoTerceirizado;

public class PolimorfismoEx {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<Empregado> listaEmpregado = new ArrayList<>();
	
	System.out.println("Digite o número de Empregados : ");
	int count = sc.nextInt();
	int i = 0;
	
	for(i=0;i<count;i++) {
		sc.nextLine();
		System.out.print("\nTerceirizado ? (s/n)");
		char op = sc.nextLine().charAt(0);
		if (op == 'n') {
			System.out.println("Entre com os dados do Empregado : ");
			System.out.print("Nome : ");
			String nomeEmp = sc.nextLine();
			System.out.print("Horas Trabalhadas : ");
			int horaEmp = sc.nextInt();
			sc.nextLine();
			System.out.print("Valor da Hora : ");
			double vlrHoraEmp = sc.nextDouble();
			listaEmpregado.add(new Empregado(nomeEmp, horaEmp, vlrHoraEmp));
		}
		else if (op == 's') {
			System.out.println("Entre com os dados do Empregado Terceirizado: ");
			System.out.print("Nome : ");
			String nomeEmp = sc.nextLine();
			System.out.print("Horas Trabalhadas : ");
			int horaEmp = sc.nextInt();
			sc.nextLine();
			System.out.print("Valor da Hora : ");
			double vlrHoraEmp = sc.nextDouble();
			System.out.print("Valor de Custo Extra : ");
			double vlrExtra = sc.nextDouble();
			listaEmpregado.add(new EmpregadoTerceirizado(nomeEmp, horaEmp, vlrHoraEmp,vlrExtra));
		}
		else System.out.println("Opção Inválida. Ignorada");
	}
	System.out.println("-------------------------------------");
	System.out.println("Totais dos Pagamentos :");
	for(Empregado x : listaEmpregado) {
		System.out.println(x.getNome() + "- $ " + x.pagamento());
	}
	sc.close();
	}

}
