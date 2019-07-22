package ProgramaPoli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import EntidadesPoli.ProdutoImportadoPoli;
import EntidadesPoli.ProdutoPoli;
import EntidadesPoli.ProdutoUsadoPoli;

public class PolimorfismoFix {

	public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);
	List<ProdutoPoli> listaProd = new ArrayList<>();
	
	
	System.out.println("Quantidade de entradas ? ");
	int count = sc.nextInt();
	sc.nextLine();		
	for(int i=0;i<count;i++) {
		System.out.println("Entrada de produto #"+(i+1));
		System.out.println("Produto é (c)omum, (i)mportado ou (u)sado ?");
		char op = sc.nextLine().charAt(0);
		System.out.print("Nome : ");
		String nomeProd = sc.nextLine();
		System.out.print("Preço : ");
		double precoProd = sc.nextDouble();
		sc.nextLine();
		if(op == 'i') {
			System.out.print("Taxas : ");
			double taxaProdImport = sc.nextDouble();
			sc.nextLine();	
			ProdutoImportadoPoli prod = new ProdutoImportadoPoli(nomeProd, precoProd, taxaProdImport);
			listaProd.add(prod);
		}
		else if(op == 'u') {
			System.out.print("Data de Manufatura (DD/MM/YYYY) : ");
			Date dataManu = sdf.parse(sc.nextLine());
			ProdutoUsadoPoli prod = new ProdutoUsadoPoli(nomeProd, precoProd, dataManu);
			listaProd.add(prod);
		}
		else if (op == 'c') {
			ProdutoPoli prod = new ProdutoPoli(nomeProd, precoProd);
			listaProd.add(prod);
		}
		else System.out.println("Opção inválida ignorada");
		
	}
	for(ProdutoPoli x: listaProd) {
		System.out.println(x.etiqueta());
	}
	sc.close();
	}

}
