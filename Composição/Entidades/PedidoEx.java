package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoEx {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	private Date momento;
	private StatusPedidoEx status;
	private ClienteEx cliente;
	private List<ItemPedido> itens = new ArrayList<>();
	
	public PedidoEx(Date momento, StatusPedidoEx status, ClienteEx cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public PedidoEx() {
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nMomento da Ordem : " + sdf.format(momento));
		sb.append("\nStatus da Ordem : " + status);
		return sb.toString();
		}
	
	public void imprimeItens(){
		for(ItemPedido x: itens) {
			System.out.printf(x.toString() + " Sub Total do Produto : %.2f",x.subTotal());
		}
	}

	public double totalItens() {
		double soma = 0;
		for(ItemPedido x : itens) {
			soma += x.subTotal();
		}
		return soma;
	}
	
	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedidoEx getStatus() {
		return status;
	}

	public void setStatus(StatusPedidoEx status) {
		this.status = status;
	}

	public ClienteEx getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEx cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void addItens(ItemPedido item) {
		this.itens.add(item);
	}
	public void remItens(ItemPedido item) {
		this.itens.remove(item);
	}
}
