package course;

public class AulaBasicaCasting {

	public static void main(String[] args) {
		double a;
		float b;
		
		a = 5.7;
		b = (float)a;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = (int)a;
		System.out.println(c);
		
		int x, y , z;
		double resultado;
		
		x = 5;
		y = 2;
		
		resultado = x / y ;
		System.out.println(resultado);
		
		resultado = (double) x / y;
		System.out.println(resultado);
		
		String s = "33";
		System.out.println(Integer.parseInt(s));
		
		z = Integer.parseInt(s);
		System.out.println(z - 10);

	}

}
