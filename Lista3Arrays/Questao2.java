package Lista3Arrays;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados. */
		
		int vetor[]= new int[6];
		int par=0, somaPar=0, impar=0, somaImpar=0,x,valor;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=0; x<6;x++)
		{
			System.out.println("\nInsira um valor: ");
			valor = leia.nextInt();
			
			if(valor != 0)
			{
				if (valor % 2 == 0)
				{
					par += 1;
					somaPar += valor;
				}
				else
				{
					impar +=1;
					somaImpar += valor;
				}
			}
			
		}
		
		System.out.println("\nA quantidade de n�meros pares � de : "+par);
		System.out.println("\nA soma dos n�meros pares � de: "+somaPar);
		System.out.println("\nA quantidade de n�meros �mpares � de: "+impar);
		System.out.println("\nA soma dos n�meros �mpares � de: "+somaImpar);
		
	}

}
