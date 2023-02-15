package programasJava;

import java.util.Scanner;

public class tablaMultiplicar {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		int n=0;
		Scanner sc=new Scanner(System.in);
		
		 while ((n<1) || (n>10)) {
			 System.out.println("Introduce un número del 1 al 10");
			 n =sc.nextInt();
		 }
		
		for (int i=1; i<11; i++) {  
			System.out.println(n + "X" + i + "=" + n*i);
		}
	}
}
