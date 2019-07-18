package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.ClienteEx;
import Entidades.ItemPedido;
import Entidades.PedidoEx;
import Entidades.ProdutoEx;
import Entidades.StatusPedidoEx;

public class ExercícioFixação {

	public static void main(String[] args) throws ParseException {
	Scanner sc = new Scanner (System.in);
	SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.println("Entre com os dados do cliente : ");
	System.out.print("Nome : ");
	String nomeCli =sc.nextLine();
	System.out.print("Email : ");
	String emailCli = sc.nextLine();
	System.out.print("Data de nascimento (DD/MM/YYYY) : ");
	Date dtNasc = sdf.parse(sc.nextLine());
	
	ClienteEx cliente = new ClienteEx(nomeCli, emailCli, dtNasc);
	PedidoEx pedido = new PedidoEx(new Date() ,StatusPedidoEx.PROCESSANDO, cliente);
	
	System.out.println("Adicionar um item ao pedido (s/n) ?");
	char op = sc.nextLine().charAt(0);
	while(op!= 'n') {
		int i = 0;
		System.out.printf("Entre com o item #%d\n",i+1);
		i++;
		System.out.print("Nome do Produto : ");
		String nomeProd = sc.nextLine();
		System.out.print("Preço do produto : ");
		Double precoProd = sc.nextDouble();
		System.out.print("Quantidade do Produto : ");
		Integer qtdProd = sc.nextInt();
		sc.nextLine();
		ProdutoEx produto = new ProdutoEx(nomeProd, precoProd);
		ItemPedido itemPedido = new ItemPedido(produto, qtdProd, precoProd);
		pedido.addItens(itemPedido);
		System.out.println("Adicionar outro produto (s/n) ?");
		op = sc.nextLine().charAt(0);
		}
	System.out.println("Sumário do Pedido");
	System.out.println(pedido);
	System.out.println(cliente);
	pedido.imprimeItens();
	System.out.println("\nTotal do Pedido : " + pedido.totalItens());
	sc.close();
	}

}
