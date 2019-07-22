package EntidadesPoli;

public class ProdutoImportadoPoli extends ProdutoPoli{
	private Double taxaImport;

	public ProdutoImportadoPoli() {
	}

	public ProdutoImportadoPoli(String nome, Double preço, Double taxaImport) {
		super(nome, preço);
		this.taxaImport = taxaImport;
	}
	
	public double preçoTotal () {
		return taxaImport + preço;
	}
	
	@Override
	public String etiqueta () {
		return "Nome : " + this.nome + " , Preço com Taxa de Importação : $" + (preço+taxaImport) + " , Taxa de Importação : " + taxaImport ;
	}

	public Double getTaxaImport() {
		return taxaImport;
	}

	public void setTaxaImport(Double taxaImport) {
		this.taxaImport = taxaImport;
	}
}
