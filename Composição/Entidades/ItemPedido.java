package Entidades;

public class ItemPedido {
	private ProdutoEx produto;
	private int qtd;
	private double preço;
	
	public ItemPedido(ProdutoEx produto, int qtd, double preço) {
		super();
		this.produto = produto;
		this.qtd = qtd;
		this.preço = preço;
	}
	
	public String toString() {
		return String.format("Produto : " + produto.getNome() + " , Quantidade : " + qtd + " , Preço Unit. : %.2f",preço);
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

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public double subTotal() {
		return this.qtd * this.preço;
	}
		
}
