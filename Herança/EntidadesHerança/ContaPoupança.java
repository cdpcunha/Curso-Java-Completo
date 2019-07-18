package EntidadesHerança;

public class ContaPoupança extends Conta {
	private Double taxaJuro;

	public ContaPoupança(Integer id, String usuario, double saldo, double taxaJuro) {
		super(id, usuario, saldo);
		this.taxaJuro = taxaJuro;
	}
	
	public String toString() {
		return "ContaPoupança [taxaJuro=" + taxaJuro + ", saldo=" + saldo + "]";
	}


	public ContaPoupança() {
		super();
	}
	
	public void atualizaSaldo() {
		saldo += saldo * (taxaJuro/100);
	}
	
	public double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
}
