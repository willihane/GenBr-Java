package Lista1.LacoCondicional;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		double res;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0)
		{
			res = Math.sqrt(numero);
		}
		else
		{
			res = Math.pow(numero, 2);
		}
		System.out.println("\nResultado: "+res);
	}

}
