package Lista1Extra;

import java.util.Scanner;

/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a expressão*/

public class atv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A,B,C;
		double r, s, d;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		A = leia.nextInt();
		
		System.out.println("\nDigite o segundo número: ");
		B = leia.nextInt();
		
		System.out.println("\nDigite o terceiro número: ");
		C = leia.nextInt();
		
		r = Math.pow((A+B),2) ;
		s = Math.pow((B+C),2) ;
		
		d = (r + s)/2;
		
		System.out.println("\n"+d);
		
	}

}
