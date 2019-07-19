package EntidadesHerança;

public final class ContaPoupança extends Conta {
	private Double taxaJuro;

	public ContaPoupança(Integer id, String usuario, double saldo, double taxaJuro) {
		super(id, usuario, saldo);
		this.taxaJuro = taxaJuro;
	}
	
	public String toString() {
		return "ContaPoupança [TaxaJuro=" + taxaJuro + "]" + super.toString();
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
	
	@Override //sobreposição do metodo saque de Conta
	public void saque (double quantia) {
		this.saldo -= quantia + 5;
	}

}
