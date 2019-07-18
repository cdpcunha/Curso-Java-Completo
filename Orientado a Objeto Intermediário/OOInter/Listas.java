package OOInter;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
	List<String> lista = new ArrayList<>();

	lista.add("Maria");
	lista.add("Bob");
	lista.add("João");
	lista.add("Ana");
	lista.add(2,"Carlos");
	
	
	for(String nome : lista) {
		System.out.println(lista.indexOf(nome)+" " +nome);
	}
	
	System.out.println("Tamanho :" + lista.size());
	}

}
