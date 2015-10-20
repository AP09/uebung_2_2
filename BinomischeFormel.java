
public class BinomischeFormel {

	public static void main(String[] args) {
		
			double a = 8;
			double b = 3;
			
			double loesung1 = a*a;
			double loesung2 = 2*a*b;
			double loesung3 = b*b;
			
			double loesung = (a+b)*(a+b);

			System.out.println("(" + a + "+" + b + ")² = " + loesung1 + "+" + loesung2 + "+" + loesung3 + " = " + loesung );
	
	}

}
