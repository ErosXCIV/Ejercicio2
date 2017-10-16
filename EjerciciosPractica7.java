package Eros;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

import org.omg.CORBA.ORBPackage.InconsistentTypeCode;

public class EjerciciosPractica7 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a,b,c;
		double semip,area;
		
		System.out.println("Introduzca el lado a: ");
		a=scanner.nextInt();
		System.out.println("Introduzca el lado b: ");
		b=scanner.nextInt();
		System.out.println("Introduzca el lado c: ");
		c=scanner.nextInt();
		//logic
		semip=(a+b+c)/2;
		area=Math.sqrt( semip*(semip-a)*(semip-b)*(semip-c) );
		System.out.println("El area es: "+area);
		
	}

}
