package Eros;

public class EjerciciosPractica4 {
	public static void main (String[] args) {
		
		int a=1, b=2, c=3, d=4;
		int aux;
		aux=b;
			
		b=c; //b=3
		c=a; //c=1
		a=d; //a=4
		d=b; //d=2
		System.out.println("Valor de a: "+a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
