package Lista1Extra;

import java.util.Scanner;

/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a express�o*/

public class atv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A,B,C;
		double r, s, d;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o primeiro n�mero: ");
		A = leia.nextInt();
		
		System.out.println("\nDigite o segundo n�mero: ");
		B = leia.nextInt();
		
		System.out.println("\nDigite o terceiro n�mero: ");
		C = leia.nextInt();
		
		r = Math.pow((A+B),2) ;
		s = Math.pow((B+C),2) ;
		
		d = (r + s)/2;
		
		System.out.println("\n"+d);
		
	}

}
