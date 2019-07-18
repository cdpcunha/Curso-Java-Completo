package OOInter;

import java.util.Scanner;

import Entidades.Produto;

public class Construtores {

	public static void main(String[] args) {
		
		int op = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre o nome do produto : ");
		String nome = sc.nextLine();
		System.out.println("Entre o preço atual do produto : ");
		double preco = sc.nextDouble();
		System.out.println("Entre o estoque atual do produto : ");
		int qtd = sc.nextInt();
			
		Produto p = new Produto(nome,preco,qtd);
		p.vlrAtualEst = p.qtd * p.preco;
		System.out.println(p);
		
		
		System.out.println("-------------------------------------");
		System.out.println("\n\nSelecione uma das opções : \n(1) - Adiciona Produto\n(2) - Remove Produto\n(3) - Sair");
		op = sc.nextInt();
						
		while (op != 3) {
			if (op == 1) {
				System.out.println("\nQuantos produtos deseja adicionar no estoque ?\n");
				p.addProdEst(sc.nextInt());
				System.out.println(p);
			} else if (op == 2) {
				System.out.println("\nQuantos produtos deseja remover no estoque ?\n");
				p.remProdEst(sc.nextInt());
				System.out.println(p);
			} else if (op != 3 && op != 2 && op != 1) {
				System.out.println("Opção inválida, digite novamente !");
			}
			System.out.println("-------------------------------------");
			System.out.println("Selecione uma das opções : \n(1) - Adiciona Produto\n(2) - Remove Produto\n(3) - Sair");
			op = sc.nextInt();
		}

		sc.close();
	}

}
