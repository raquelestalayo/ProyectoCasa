package programasJava;

import java.util.Scanner;

public class multiplos3 {

	public static void main(String[] args) {
		int suma=0;
		int i;
	 System.out.println("Introduce un número");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 
	 for (i=1; i<=n; i++) {
	 	suma= suma + (i*3);
	 }
	 System.out.println("La suma de los números múltiplos de 3 es: " + suma);

}
}
	



