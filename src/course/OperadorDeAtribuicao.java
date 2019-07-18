package course;

public class OperadorDeAtribuicao {

	public static void main(String[] args) {
	double n1= 10;
	n1 += 2;
	System.out.println(n1);
	n1 *= n1;
	System.out.println(n1);
	n1 /= n1;
	System.out.println(n1);
	
	String s = "ABC";
	
	s+= s;
	System.out.println(s);
	s += "DEFG";
	System.out.println(s);
	
	int count =0 ;
	for(count = 0;count<10;count++) {
		System.out.println(s+= "CU");
		System.out.println(s+="ZÃO");
	}

	}

}
