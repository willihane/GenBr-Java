package Lista1.LacoCondicional;

import java.util.Scanner;

public class atividade1 {
//1) Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3,maior;
	
		Scanner leia = new Scanner (System.in);
		System.out.println("\nDigite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("\nDigite o primeiro n�mero: ");
		n3 = leia.nextInt();
		
		maior = n1;	
		if(maior<n2)
		{
			maior = n2;
		}
		if(maior<n3)
		{
			maior = n3;
		}
		System.out.println("\nO maior n�mero �: "+ maior);
	}

}
