package pitagoras;

public class Pitagoras {
	static void calculo(int a, int b) {
		 a*=a;		
		 b*=b;
		int calculo = a+b;
		System.out.println("La suma es : "+calculo);
		double raiz = Math.sqrt(calculo);
		System.out.println("La raiz es: "+raiz);
	}

	public static void main(String[] args) {
		calculo(5,5);

	}

}
