package CursoPt2;

public class OperadoresLógicos {

	public static void main(String[] args) {
	boolean c1 = 2 > 3;
	System.out.println(c1);
	boolean c2 = 2 > 3 || 4!=5;
	System.out.println(c2);
	boolean c3 = 10 > 5;
	System.out.println(c3);
	System.out.println("--------------------------------");
	
	
	boolean c4 = c1 || c2 && c3;
	System.out.println(c4);
	

	}

}
