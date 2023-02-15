package programasJava;

import java.util.Scanner;

public class notaFinal {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Introduce el módulo");
		Scanner sc= new Scanner(System.in);
		String módulo=sc.nextLine();
		System.out.println("Introduce la nota de la primera evaluación");
		float a=(int) sc.nextFloat();
		System.out.println("Introduce la nota de la segunda evaluación");
		float b=(int) sc.nextFloat();
		System.out.println("Introduce la nota de la tercera evaluación");
		float c=(int) sc.nextFloat();
		
		int notaFinal;
		
		notaFinal= (int) ((a + b + c) / 3);
		
		switch (notaFinal) {
		case 0,1,2,3,4:
			System.out.println("Suspenso, su nota media es un " + notaFinal + " en " + módulo);
			break;
		case 5:
			System.out.println("Aprobado, su nota media es un " + notaFinal + " en " + módulo);
			break;
		case 6:
			System.out.println("Bien, su nota media es un " + notaFinal + " en " + módulo);
			break;
		case 7,8:
			System.out.println("Notable, su nota media es un " + notaFinal + " en " + módulo);
			break;
		case 9,10:
			System.out.println("Sobresaliente, su nota media es un " + notaFinal + " en " + módulo);
			break;
		default:
			System.out.println("no válido");
		}	
	}

}
