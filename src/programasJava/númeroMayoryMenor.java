package programasJava;

import java.util.Scanner;

public class númeroMayoryMenor {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println("Introduce números para comprobar cual es el mayor y el menor, cuando haya terminada introduzca el 0");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int numeromay=n, numeromen=n;
		
		while (n!=0) {
			if (n>numeromay) {
				numeromay=n;
				
			} if (n<numeromen) {
				numeromen=n;
			}
			n=sc.nextInt();
		}
		
		System.out.println("El número mayor es " + numeromay );
		System.out.println("El número menor es " + numeromen );
		
	}

}
