package EntidadesHerança;

public class Conta {
	private Integer id;
	private String usuario;
	protected double saldo;
	
	public Conta(Integer id, String usuario, double saldo) {
		this.id = id;
		this.usuario = usuario;
		this.saldo = saldo;
	}
	
	public Conta() {
	}

	public void deposito (double quantia) {
		this.saldo += quantia;
	}
	
	public void saque (double quantia) {
		this.saldo -= quantia;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getSaldo() {
		return saldo;
	}

	public String toString() {
		return "Conta [Id=" + id + ", Usuario=" + usuario + ", Saldo=" + saldo + "]";
	}
	
}
