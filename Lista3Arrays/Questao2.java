package Lista3Arrays;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados. */
		
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
		
		System.out.println("\nA quantidade de números pares é de : "+par);
		System.out.println("\nA soma dos números pares é de: "+somaPar);
		System.out.println("\nA quantidade de números ímpares é de: "+impar);
		System.out.println("\nA soma dos números ímpares é de: "+somaImpar);
		
	}

}
