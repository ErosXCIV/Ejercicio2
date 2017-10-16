package Eros;

import java.util.Scanner;

public class EjerciciosPractica6 {
	public static void main (String[] args) {
		Scanner scanner=new Scanner(System.in);
		int radio=scanner.nextInt();
		double volumen;
		
		System.out.println("Introduzca un radio entero positivo: ");
		
		volumen=4*Math.PI*Math.pow(radio, 3)/3;
		System.out.println("El volumen es: " + volumen);

	}

}
