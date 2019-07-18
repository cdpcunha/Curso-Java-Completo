package Entidades;

public class Empregado {
	private int id;
	private String nome;
	private double salario;
	
	public Empregado(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public String toString() {
		return "Identificador : " + id + ",  Nome : " +  nome + ",  Salário : " + salario;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public void aumentaSalario(double indice) {
		this.salario = this.salario + this.salario*((indice)/100);
	}

	
}
