package EntidadesHerança;

public final class ContaNegocio extends Conta {
	private double limiteEmprestimo;

	public ContaNegocio() {
	}

	public ContaNegocio(Integer id, String usuario, double saldo, double limiteEmrestimo) {
		super(id, usuario, saldo);
		this.limiteEmprestimo = limiteEmrestimo;
	}

	
	public String toString() {
		return "ContaNegocio [limiteEmprestimo=" + limiteEmprestimo + "]" + super.toString();
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	
	@Override //sobreposição do metodo saque de Conta
	public void saque (double quantia) {
		super.saque(quantia);
		this.saldo -= 10;
	}	
	
}
