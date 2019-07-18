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
		return String.format("Dados do Funcion�rio :\nNome : %s\nSal�rio Bruto :  %.2f\nImp�stos Incidentes : %.2f\nSal�rio L�quido : %.2f",nome, salarioB, imposto, salarioL);
	}
	
	}
	
	