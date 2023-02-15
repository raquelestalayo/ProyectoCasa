package programasJava;

import java.util.Scanner;

public class descuentoProducto {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		float precioFinal;
	
		
		System.out.println("Introduce el precio del producto en euros");
		Scanner sc=new Scanner(System.in);
		float precio=sc.nextFloat();
		System.out.println("Introduce el descuento que quiere aplicarle");
		int descuento=sc.nextInt();
		
		precioFinal= precio-(precio*descuento/100);
		
		System.out.println("El precio aplicado al descuento es: " + precioFinal);
	}

}
