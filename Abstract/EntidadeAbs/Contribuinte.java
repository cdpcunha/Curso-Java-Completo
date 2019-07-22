package EntidadeAbs;

public abstract class Contribuinte {
	protected String nome;
	protected double renda;
	
	public Contribuinte(String nome, double renda) {
		super();
		this.nome = nome;
		this.renda = renda;
	}
	public Contribuinte() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public abstract double impostoAPagar();
	}
	

