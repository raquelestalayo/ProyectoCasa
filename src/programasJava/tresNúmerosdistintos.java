package programasJava;

import java.util.Scanner;

public class tresNúmerosdistintos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println("Introduce tres números para comprobar cual es mayor");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println(n1 + " es mayor que " + n2 + " y que " + n3);
		} else if (n2>n1 && n2>n3) {
			System.out.println(n2 + " es mayor que " + n1 + " y que " + n3);
		} else {
			System.out.println(n3 + " es mayor que " + n1 + " y que " + n2);
		}
		
	}

}
