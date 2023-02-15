package programasJava;

import java.util.Scanner;

public class aforoCine {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		
		System.out.println("Introduce el aforo del cine");
		Scanner sc=new Scanner(System.in);
		int aforo=sc.nextInt();
		int menos;
		int disponibles=aforo;
		String respuesta="si";
		
		while (disponibles>0 && respuesta=="si") {
			System.out.println("Introduce el número de entradas que desea");
			int entradas=sc.nextInt();
			
			if (entradas>disponibles ) {
				System.out.println("Error, las entradas estan agotadas");
			}
			if  (disponibles<=(aforo*0.2) && disponibles!=0) {
				System.out.println("Quedan menos del 20% de las entradas disponibles");
			}
			disponibles=disponibles-entradas;
			System.out.println("Quedan " + disponibles + " entradas");
			
			System.out.println("¿Desea más entradas? (si/no)");
			respuesta = sc.next();
		}
		}
}



