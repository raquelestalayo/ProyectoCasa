package programasJava;

import java.util.Scanner;

public class mediaAritmética {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println("Introduce un número, cuando quieras acabar introduce un -1");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int suma=0;
		int contador=0;
		
		while (n!=-1) {
			suma=suma+n;
			contador++;
			n=sc.nextInt();
		}
		System.out.println("La media aritmética es: "+ suma/contador);	
	}
}