package Entidades;

public class ItemPedido {
	private ProdutoEx produto;
	private int qtd;
	private double pre�o;
	
	public ItemPedido(ProdutoEx produto, int qtd, double pre�o) {
		super();
		this.produto = produto;
		this.qtd = qtd;
		this.pre�o = pre�o;
	}
	
	public String toString() {
		return String.format("Produto : " + produto.getNome() + " , Quantidade : " + qtd + " , Pre�o Unit. : %.2f",pre�o);
	}
	
	public ItemPedido() {
	}

	public ProdutoEx getProduto() {
		return produto;
	}

	public void setProduto(ProdutoEx produto) {
		this.produto = produto;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	public double subTotal() {
		return this.qtd * this.pre�o;
	}
		
}
