package EntidadesPoli;

public class ProdutoPoli {
	protected String nome;
	protected Double pre�o;
	
	public ProdutoPoli() {
	}
	
	public ProdutoPoli(String nome, Double pre�o) {
		super();
		this.nome = nome;
		this.pre�o = pre�o;
	}
	
	public String etiqueta () {
		return "Nome : " + this.nome + " , Pre�o : $" + pre�o;
	}

	public String getNome() {
		return nome;
	}
	public Double getPre�o() {
		return pre�o;
	}
}
