package Programa;

import EntidadesHerança.Conta;
import EntidadesHerança.ContaNegocio;
import EntidadesHerança.ContaPoupança;

public class Herança {

	public static void main(String[] args) {
	//Conta conta1 = new Conta(11, "James", 500); Não pode ser instanciada por ser abstract
	ContaNegocio contaN1 = new ContaNegocio(21, "Juca", 1200, 200);
	ContaPoupança contaP1 = new ContaPoupança(31, "Paulinho", 30000, 1);
	
	//UPCASTING
	Conta conta2 = contaN1;
	System.out.println(conta2.getSaldo());
	Conta conta3 = new ContaNegocio(5, "Bob", 0, 50);
	Conta conta4 = new ContaPoupança(15, "Anna", 299, 5);
	
	//DOWNCASTING
	ContaNegocio contaN2 = (ContaNegocio)conta2;
	ContaNegocio contaN3;
	if(contaP1 instanceof ContaPoupança) {
		contaN3 = (ContaNegocio)contaN1;
	}
	else contaN3 = new ContaNegocio();
	
	System.out.println(conta2);
	System.out.println(conta3);
	System.out.println(conta4);
	System.out.println(contaN1);
	System.out.println(contaN2);
	System.out.println(contaN3);
	System.out.println(contaP1);
	
	contaP1.saque(200);
	contaN3.saque(200);
	System.out.println("------------------------------------");
	System.out.println(contaP1);
	System.out.println(contaN3);
	}
}
