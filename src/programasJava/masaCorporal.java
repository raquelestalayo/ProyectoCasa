package programasJava;

import java.util.Scanner;

public class masaCorporal {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println("Introduce tu peso en kg");
		Scanner sc=new Scanner(System.in);
		float peso=sc.nextFloat();
		System.out.println("Introduce tu altura en metros");
		float altura=sc.nextFloat();
		
		int IMC;
		
		IMC= (int) ((int) (float) peso /(altura*altura));
	
		
		if (IMC<20) {
			System.out.println("Peso insuficiente");
		} else if  (IMC>=20 && IMC<25) {
			System.out.println("Peso normal");
		} else if (IMC>25 && IMC<30) {
			System.out.println("Sobrepeso");
		} else  {
			System.out.println("Obesidad");
		
		}
	}

}
