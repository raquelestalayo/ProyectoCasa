package programasJava;

import java.util.Scanner;

public class intercambiarVariables {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

			int aux;
			
			System.out.println("Introduce dos números");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			aux=a;
			a=b;
			b=aux;
			
			System.out.println("El valor de " + b + " ahora es " + a);
			System.out.println("El valor de " + a + " ahora es " + b);
	}
}
