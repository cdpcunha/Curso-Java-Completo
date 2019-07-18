package Entidades;

public class Produto {
	public String nome;
	public double preco;
	public int qtd;
	public double vlrAtualEst;
		
	public Produto(String nome, double preco, int qtd) {
		this.nome =  nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Produto(String nome, double preco) {
		this.nome =  nome;
		this.preco = preco;
		}
	
	
	public void addProdEst (int qtdAdd) {
		qtd = qtd + qtdAdd;
		vlrAtualEst = qtd * preco;
	}
	
	public void remProdEst (int qtdRem) {
		qtd = qtd - qtdRem;
		vlrAtualEst = qtd * preco;
	}
	
	public String toString() {
		return String.format("Dados atausis do produto : \nNome: %s\nEstoque Atual: %d\nPreço : %.2f\nTotal em Estoque: %.2f",nome,qtd,preco,vlrAtualEst);
	}
}
