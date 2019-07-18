package EntidadesHerança;

public class ContaNegocio extends Conta {
	private double limiteEmprestimo;

	public ContaNegocio() {
	}

	public ContaNegocio(Integer id, String usuario, double saldo, double limiteEmrestimo) {
		super(id, usuario, saldo);
		this.limiteEmprestimo = limiteEmrestimo;
	}

	
	public String toString() {
		return "ContaNegocio [limiteEmprestimo=" + limiteEmprestimo + ", saldo=" + saldo + "]";
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	
}
