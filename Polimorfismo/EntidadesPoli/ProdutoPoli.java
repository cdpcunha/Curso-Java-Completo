package EntidadesPoli;

public class ProdutoPoli {
	protected String nome;
	protected Double preço;
	
	public ProdutoPoli() {
	}
	
	public ProdutoPoli(String nome, Double preço) {
		super();
		this.nome = nome;
		this.preço = preço;
	}
	
	public String etiqueta () {
		return "Nome : " + this.nome + " , Preço : $" + preço;
	}

	public String getNome() {
		return nome;
	}
	public Double getPreço() {
		return preço;
	}
}
