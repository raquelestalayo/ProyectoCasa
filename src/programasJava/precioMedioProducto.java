package programasJava;

import java.util.Scanner;

public class precioMedioProducto {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el precio del primer establecimiento");
		float precio1=sc.nextFloat();
		System.out.println("Introduce el precio del segundo establecimiento");
		float precio2=sc.nextFloat();
		System.out.println("Introduce el precio del tercer establecimiento");
		float precio3=sc.nextFloat();
		
		float preciomedio;
		preciomedio=(precio1+precio2+precio3)/3;
		
		System.out.println("El precio medio del producto es " + preciomedio);
		
	}

}
