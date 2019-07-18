package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClienteEx {
	private String nome;
	private String email;
	private Date dtnasc;
	
	public ClienteEx(String nome, String email, Date dtnasc) {
		super();
		this.nome = nome;
		this.email = email;
		this.dtnasc = dtnasc;
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public String toString() {
		return "Nome = " + nome + " , Email = " + email + " , Data de Nascimento = " + sdf.format(dtnasc);
	}



	public ClienteEx() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtnasc() {
		return dtnasc;
	}

	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}	
}
