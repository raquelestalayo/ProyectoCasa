package programasJava;

import java.util.Scanner;

public class númeroMayor {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		int números;
		System.out.println("Introduce dos números");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		
		if (a<b) {
			System.out.println( b + " es mayor que " + a);
		} else if (b<a) {
			System.out.println(a + " es mayor que "+ b);
		}  else  {
			System.out.println(a + " y " + b + " son iguales" );
		}
}
}
