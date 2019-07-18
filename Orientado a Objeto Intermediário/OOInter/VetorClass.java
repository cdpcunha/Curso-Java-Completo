package OOInter;

import java.util.Scanner;
import Entidades.Produto;
public class VetorClass {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i=0, count=0;
	double mediaSoma = 0 , mediaFin = 0 ;
	System.out.println("Quantidade de produtos no Registro?");
	count = sc.nextInt();
	sc.nextLine();
	Produto[] vectProd = new Produto[count];
	
	for(i=0;i<count;i++) {
		System.out.printf("Entre os dados do produto #%d",i+1);
		System.out.print("\nNome :");
		String nome = sc.nextLine();
		System.out.print("Preço :");
		double preco = sc.nextDouble();
		sc.nextLine();
		vectProd[i] = new Produto(nome,preco);
		mediaSoma += vectProd[i].preco;
	}
	mediaFin = mediaSoma / count;
	System.out.printf("Média dos Preços dos Produtos : %.4f",mediaFin);
	sc.close();
	}

}
