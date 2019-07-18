package Entidades;

public class Estudante {
	private String nome;
	private String email;
	private int quarto;
	private double aluguel;
	
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	public double getAluguel() {
		return aluguel;
	}
	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}
	
	public Estudante() {
		
	}
	
	public Estudante(String nome, String email, int quarto, double aluguel) {
		super();
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
		this.aluguel = aluguel;
	}
	
	public String toString() {
		return String.format("Quarto: %d\nNome: %s\nE-mail: %s\nAluguel: %.2f",quarto,nome,email,aluguel);
	}
}
