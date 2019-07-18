package OOInter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidades.Empregado;

public class ExercicioLista {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i = 0 , count = 0;
	List<Empregado> listaEmp = new ArrayList<>();
	
	System.out.println("Quantidade de entradas ? ");
	count = sc.nextInt();
	sc.nextLine();
	
	for(i=0;i<count;i++) {
		System.out.print("Empregado #"+(i+1)+" ");
		System.out.print("\nIdentificador : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("\nNome : ");
		String nome = sc.nextLine();
		System.out.print("\nSalário : ");
		double salario = sc.nextDouble();
		listaEmp.add(new Empregado(id,nome,salario));
		System.out.println("----------------------------");
	}
		
	for(Empregado x : listaEmp) {
		System.out.println(x);
		System.out.println("----------------------------");
	}
	
	System.out.print("\nIdentificador do empregado do aumento : ");
	int idAumento = sc.nextInt();
	sc.nextLine();
	Empregado empAumento = listaEmp.stream().filter(x -> x.getId() == idAumento).findAny().orElse(null);
	
	if (empAumento == null) {
		System.out.println("Identificador não existe.");
	}
	else {
		System.out.print("Porcentagem de aumento : ");
		double percent = sc.nextDouble(); 
		empAumento.aumentaSalario(percent);
	}
	
	for(Empregado x : listaEmp) {
		System.out.println(x);
		System.out.println("----------------------------");
	}
	
	sc.close();
	}

}
