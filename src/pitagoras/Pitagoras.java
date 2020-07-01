package pitagoras;
import java.util.Scanner;
public class Pitagoras {
	static void calculo(int a, int b) {
		 a*=a;		
		 b*=b;
		int calculo = a+b;
		
		double raiz = Math.sqrt(calculo);
		System.out.println("Hipotenusa: "+raiz);
	}

	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		System.out.println("Ingrese primer valor:");
		int valor1= num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("ingrese segundo valor:");
		int valor2= num1.nextInt();
		
		
		calculo(valor1,valor2);

	}

}
