package course;

import java.util.Scanner;

public class EntradaDeDados3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite Nome, Genero, Idade e Altura:");
		String name = sc.next();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		double heigh = sc.nextDouble();
		
	System.out.println(name);
	System.out.println(gender);
	System.out.println(age);
	System.out.println(heigh);
	
	
	sc.close();
	}

}
