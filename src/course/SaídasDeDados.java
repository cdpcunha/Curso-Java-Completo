package course;

public class Sa�dasDeDados {

	public static void main(String[] args) {
		System.out.print("Bom dia manim, tudo certo? ");
		System.out.printf("Boa tarde brother, tudo ok? ");
		System.out.println("Boa noite fi, tudo b�o? ");
		
		char genero = 'F';
		int idade = 30;
		double balance = 10.555;
		String name = "Maria";
		
		System.out.println("-----------------------------------------------------------");
		System.out.printf("%.2f",balance); //f � abrevia��o de FLOAT , %.XF , %.XS...
		//Para saltar uma linha %n ou \n , %n parece n�o estar funcionando
		System.out.print("\nAqui est� ");
		System.out.print("\nAqui tamb�m est�");
		System.out.print("\n\n\n________________________________________________________");
		System.out.printf("\nMaria is 30 years old and is Female");
		System.out.printf("\n%s is %d years old and is %cemale", name,idade,genero);
	}

}
