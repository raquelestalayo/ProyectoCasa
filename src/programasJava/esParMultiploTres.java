package programasJava;

import java.util.Scanner;

public class esParMultiploTres {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		int n;
		System.out.println("Introduce un número para comprobar si es par y múltiplo de tres");
		Scanner sc= new Scanner(System.in) ;
		n=sc.nextInt();
	
	while (n != 0) {
		if (ParMultiploTres(n)) {
		System.out.println("El número " + n + " es par y múltiplo de 3");
	} else {
		System.out.println("El número " + n +  " no cumple las condiciones para ser par y múltiplo de 3");
	}
		n=sc.nextInt();
	}
	
	if (n==0) {
		System.out.println("Fin Programa");
	}
	}

	private static boolean ParMultiploTres(int n) {
		if ((n%2==0) && (n%3==0)) {
			return true;	
		} else {
			return false;
		}
	}
}