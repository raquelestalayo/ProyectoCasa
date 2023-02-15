package programasJava;

import java.util.Scanner;

public class notaFinalparcticasyexamen {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println("Calcular nota final");
		System.out.println("Introduce la nota del examen");
		Scanner sc=new Scanner(System.in);
		float notaexamen=sc.nextFloat();
		System.out.println("¿Has realizado todas las prácticas? (si/no)?");
		String respuesta=sc.next();
		System.out.println("Introduce la nota media de las prácticas");
		float notapracticas=sc.nextFloat();
		int notafinalsi;
		int notafinalno;
		
		switch (respuesta) {
		case "si" :
			notafinalsi=(int) ((int) (notaexamen*0.7)+ (notapracticas*0.3));
			System.out.println("La nota final es: " + notafinalsi);
			break;
		case "no" :
			notafinalno=(int) ((int) (notaexamen*0.7) + (notapracticas*0.2));
			System.out.println("La nota final es: " + notafinalno);
			break;
			
		}
		
	}

}
