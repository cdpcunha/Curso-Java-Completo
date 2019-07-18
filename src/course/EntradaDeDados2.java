package course;

import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre com um Inteiro:");
	int n1 = sc.nextInt();
	sc.nextLine();					//flush, pois a quebra de linha fica pendente
	System.out.println("Entre com o nome da Pessoa:");
	String name = sc.nextLine();
	System.out.println("Entre com o caracter de Gênero:");
	char gender = sc.next().charAt(0);
	System.out.println("Digite a Letra com o Dígito:");
	String s = sc.next();
	char letter = s.charAt(0);
	int digit = Integer.parseInt(s.substring(1));
	System.out.println("Agora um double qualquer:");
	double x = sc.nextDouble();
	
	
	System.out.println(n1);
	System.out.println(name);
	System.out.println(gender);
	System.out.println(letter);
	System.out.println(digit);
	System.out.println(x);
	
	
	sc.close();
	}

}
