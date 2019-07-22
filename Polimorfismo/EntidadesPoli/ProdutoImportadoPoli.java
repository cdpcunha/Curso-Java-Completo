package EntidadesPoli;

public class ProdutoImportadoPoli extends ProdutoPoli{
	private Double taxaImport;

	public ProdutoImportadoPoli() {
	}

	public ProdutoImportadoPoli(String nome, Double pre�o, Double taxaImport) {
		super(nome, pre�o);
		this.taxaImport = taxaImport;
	}
	
	public double pre�oTotal () {
		return taxaImport + pre�o;
	}
	
	@Override
	public String etiqueta () {
		return "Nome : " + this.nome + " , Pre�o com Taxa de Importa��o : $" + (pre�o+taxaImport) + " , Taxa de Importa��o : " + taxaImport ;
	}

	public Double getTaxaImport() {
		return taxaImport;
	}

	public void setTaxaImport(Double taxaImport) {
		this.taxaImport = taxaImport;
	}
}
