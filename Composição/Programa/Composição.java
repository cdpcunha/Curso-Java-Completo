package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.Contrato;
import Entidades.Departamento;
import Entidades.Nivel;
import Entidades.Trabalhador;

public class Composição {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Entre o Departamento : ");
		String auxDep = sc.nextLine();
		System.out.println("Entre com as informações do Trabalhador : ");
		System.out.print("Nome : ");
		String trabNome = sc.nextLine();
		System.out.print("Nível : ");
		String trabNivel = sc.nextLine();
		System.out.println("Entre o salário Base : ");
		double trabSal = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(trabNome, Nivel.valueOf(trabNivel), trabSal, new Departamento(auxDep));
		System.out.print("Quantos contratos estão associados ao trabalhador? ");
		int count = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < count; i++) {
			System.out.printf("Entre com as informações do contrato #%d : ",i+1);
			System.out.print("Data do contrato dd/MM/yyyy : ");
			Date dataCont = sdf.parse(sc.nextLine()); //precisamos criar o SimpleDateFormat
			System.out.print("Valor por hora do contrato : ");
			double vlrHr = sc.nextDouble();
			System.out.print("Quantidade de horas : ");
			double qtdHr  =sc.nextDouble();
			sc.nextLine();
			
			Contrato contrato = new Contrato(dataCont, vlrHr, qtdHr);
			trabalhador.addContrato(contrato);
		}
				
		System.out.println("Selecione o mês e ano :");
		String mesEAno = sc.nextLine();
		int mes = Integer.parseInt(mesEAno.substring(0,2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Nome : " + trabalhador.getNome());
		System.out.println("Departamenteo : " + trabalhador.getDepart().getNome());
		System.out.println("Salário Total : " + trabalhador.calculaSalario(ano, mes));
		sc.close();
	}

}
