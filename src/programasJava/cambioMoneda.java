package programasJava;

import java.util.Scanner;

public class cambioMoneda {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc= new Scanner(System.in);
		float cambio;
		
		System.out.println("Introduce a la moneda que quiere hacer el cambio");
		String moneda=sc.next();
		System.out.println("Introduce la cantidad");
		float cantidad=sc.nextFloat();
		
	
		System.out.println("Su cambio de moneda da valor a: " + cambioMoneda(cantidad,moneda));
	
	}
		
		
		private static float cambioMoneda(float cantidad, String moneda) {
		float cambio=0;
		
			switch (moneda) {
				case "dólar":
					cambio= (float) (cantidad*1.18);
					break;
				case "libra":
					cambio=(float) (cantidad*0.91);
					break;
				case "yuan":
					cambio=(float) (cantidad*7.89);
					break;
			
			}
			return cambio;
	}

}
