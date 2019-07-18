package course;

public class ExercicioDeSaída {

	public static void main(String[] args) {
	String prod1 = "Computador", prod2 = "Mesa de Escritório";
	int idade = 30;
	int cod = 52990;
	char genero = 'M';
	double preco1 = 2100.00 , preco2 = 650.50 , medicao = 52.23456;
	
	System.out.printf("Produtos :\n%s, com preço $%.2f\n%s, com preço $%.2f",prod1,preco1,prod2,preco2);
	System.out.printf("\n\nRegistro : %d anos de idade, código %d e gênero: %c ",idade,cod,genero);
	System.out.printf("\n\nMedido com 8 decimais : %.8f ",medicao);
	System.out.printf("\nArredondado para 3 casas : %.3f",medicao);
	

	}

}
