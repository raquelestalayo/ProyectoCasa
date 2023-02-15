package programasJava;

import java.util.Scanner;

public class areaTriangulo {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println("Vamos a calcular el área de un triángulo en m2" );
		System.out.println("Introduce la base");
		Scanner sc=new Scanner(System.in);
		float base=sc.nextFloat();
		System.out.println("Introduce la altura");
		float altura=sc.nextFloat();
		
		float area;
		
		area=(base*altura)/2;
		
		System.out.println("El área del triángulo es: " + area + "m2");
		
	}

}
