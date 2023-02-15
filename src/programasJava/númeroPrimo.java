package programasJava;

import java.util.Scanner;

public class númeroPrimo {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println("Introduce un número");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		
		if (esPrimo(n)) {
			System.out.println("El número introducido es primo");
		} else 
			System.out.println("El número introducido no es primo");
	}
		
		
		private static boolean esPrimo(int n) {
			
			int i=2;
			while ((n % i)!=0 &&(i<n) ) {
				i=i+1;
			}
			if (i==n) {	
				return true;
			} else {
				return false;
		     }
	}

}
