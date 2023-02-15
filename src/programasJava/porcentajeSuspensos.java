package programasJava;

import java.util.Scanner;

public class porcentajeSuspensos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		int porcAprobados, porcSuspensos, total;
		
		System.out.println("Introduce el número de aprobados y suspensos de la clase");
		Scanner sc = new Scanner(System.in);
		int aprobados=sc.nextInt();
		int suspensos=sc.nextInt();
		
		total=aprobados+suspensos;
		porcAprobados=(aprobados*100)/total;
		porcSuspensos=(suspensos*100)/total;
		
		System.out.println("Han aprobado un " + porcAprobados + "% de la clase");
		System.out.println("Han suspendido un " + porcSuspensos + "% de la clase");
	}

}
