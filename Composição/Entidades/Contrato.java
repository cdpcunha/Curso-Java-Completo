package Entidades;

import java.util.Date;

public class Contrato {
	private Date data;
	private Double vlrHora;
	private Double qtdHora;
	
	public Contrato () {
		
	}
	
	public Contrato(Date data, double vlrHora, double qtdHora) {
		super();
		this.data = data;
		this.vlrHora = vlrHora;
		this.qtdHora = qtdHora;
	}
	
	public double valorTotal () {
		return this.vlrHora * this.qtdHora;
	}
	
	public Date getData() {
		return data;
	}
	public double getVlrHora() {
		return vlrHora;
	}
	public double getQtdHora() {
		return qtdHora;
	}
}
