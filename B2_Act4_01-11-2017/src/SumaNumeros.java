import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {
		
		//Declaracion de variables
		int n1,n2,suma;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime el 1er numero");
		n1=teclado.nextInt();
		
		System.out.println("Dime el 2o numero");
		n2=teclado.nextInt();
		
		//Proceso
		suma=n1+n2;
		
		//Salida
		System.out.println("La suma es:" + suma);

	}

}
