package EntidadesHeran�a;

public class ContaPoupan�a extends Conta {
	private Double taxaJuro;

	public ContaPoupan�a(Integer id, String usuario, double saldo, double taxaJuro) {
		super(id, usuario, saldo);
		this.taxaJuro = taxaJuro;
	}
	
	public String toString() {
		return "ContaPoupan�a [taxaJuro=" + taxaJuro + ", saldo=" + saldo + "]";
	}


	public ContaPoupan�a() {
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
