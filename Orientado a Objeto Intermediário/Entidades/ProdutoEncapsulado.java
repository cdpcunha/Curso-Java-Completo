package Entidades;

public class ProdutoEncapsulado {
	private String nome;
	private double preco;
	private int qtd;
	private double vlrAtualEst;
	//Construtor	
	public ProdutoEncapsulado(String nome, double preco, int qtd) {
		this.nome =  nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	//Get e Set
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
	public int getQtd() {
		return this.qtd;
	}
	
	//Métodos
	public void atualEst () {
		this.vlrAtualEst = this.qtd * this.preco;
	}
	
	public void addProdEst (int qtdAdd) {
		this.qtd = this.qtd + qtdAdd;
		this.vlrAtualEst = this.qtd * this.preco;
	}
	
	public void remProdEst (int qtdRem) {
		this.qtd = this.qtd - qtdRem;
		this.vlrAtualEst = this.qtd * this.preco;
	}
	
	public String toString() {
		return String.format("Dados atausis do produto : \nNome: %s\nEstoque Atual: %d\nPreço : %.2f\nTotal em Estoque: %.2f",nome,qtd,preco,vlrAtualEst);
	}
}
