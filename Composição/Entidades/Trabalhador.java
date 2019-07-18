package Entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	private String nome;
	private Nivel nivel;
	private double salarioBase;
	private Departamento depart;
	private List<Contrato> contratos = new ArrayList<>();

	public Trabalhador() {
		
	}
	
	public Trabalhador(String nome, Nivel nivel, double salarioBase, Departamento depart) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.depart = depart;
	}
	
	public double calculaSalario(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
				
		for(Contrato x : contratos) {
			cal.setTime(x.getData());
			
			int x_mes = 1+ cal.get(Calendar.MONTH);
			int x_ano = cal.get(Calendar.YEAR);
			
			if(ano == x_ano && mes == x_mes) {
				soma += x.valorTotal();
			}
		}
		return soma;
	}
	
	public void addContrato(Contrato contrato) {
		this.contratos.add(contrato);
	}
	
	public void remContrato(Contrato contrato) {
		this.contratos.remove(contrato);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepart() {
		return depart;
	}

	public void setDepart(Departamento depart) {
		this.depart = depart;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}
}
