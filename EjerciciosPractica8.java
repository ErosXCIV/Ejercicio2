package Eros;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class EjerciciosPractica8 {
	public static void main(String[] args) {
		
		int a;
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("Introduzca un número de tres cifras: ");
		a=sc.nextInt();}
		while(a>=1000||a<=100);
		
		System.out.println("La centena es: "+a/100);
		System.out.println("La decena es: " +(a%100)/10);
		System.out.println("La unidad es: " +(a%100)%1);
		
		//logic
		
	}

}
