package CursoPt2;

import java.util.Scanner;

/**
 * @author Peixe
 *
 */
public class ExercícioCondicional {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre 3 número inteiros :");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	if (a >= b && a >= c) {
		System.out.printf("O maior valor é %d\n",a);
	}
	else if(a < b && b >= c) {
		System.out.printf("O maior valor é %d\n",b);
	}
	else {
		System.out.printf("O maior valor é %d\n",c);
	}
	
sc.close();
	}

}
