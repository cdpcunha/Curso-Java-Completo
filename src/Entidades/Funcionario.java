package Entidades;

public class Funcionario {
	public String nome;
	public double salarioB;
	public double imposto;	
	public double salarioL;
	
	
	public void atualizaSalario () {
		salarioL = salarioB - imposto;
	}
	public void aumentaSalario (double porcentagem) {
		salarioB = salarioB * (1+porcentagem);
		salarioL = salarioB - imposto;
	}
	
		public String toString() {
		return String.format("Dados do Funcionário :\nNome : %s\nSalário Bruto :  %.2f\nImpóstos Incidentes : %.2f\nSalário Líquido : %.2f",nome, salarioB, imposto, salarioL);
	}
	
	}
	
	