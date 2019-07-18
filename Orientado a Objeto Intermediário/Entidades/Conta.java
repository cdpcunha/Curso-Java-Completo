package Entidades;

public class Conta {
	private int nuConta;
	private String titular;
	private double saldo;
	
	public Conta(int nuConta, String titular) {
		super();
		this.nuConta = nuConta;
		this.titular = titular;
	}

	
	//Methods
	public String toString() {
		return "Dados atuais da Conta :\n"
				+"Código : " + this.nuConta
				+"\nTitular : " + this.titular
				+"\nSaldo Atual :" +this.saldo;				
	}
	
	public void saldoComDepInic(double depIni) {
		this.saldo = depIni;
	}

	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void saque(double saque) {
		if(this.saldo < 0) {
			System.out.println("Saldo negativo atualmente. Impossível sacar.");
		}
		else this.saldo -= (saque+5);
	}

	public int getNuConta() {
		return nuConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
}
