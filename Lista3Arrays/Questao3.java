package Lista3Arrays;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui. */
		
		int matriz[][] = new int[3][3],maior=0, linha, coluna;
		Scanner leia = new Scanner(System.in);
		
		for (linha=0; linha<3;linha++)
		{
			for (coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nDigite um número: ");
				matriz[linha][coluna] = leia.nextInt();
				
				if (matriz[linha][coluna] > 10)
				{
					maior += 1;
				}
				
			}
		}
		
		for (linha=0;linha <3; linha++)
		{
			System.out.println(" ");
			for (coluna=0;coluna<3; coluna++)
			{
				System.out.println(matriz[linha][coluna]+ " ");
			}
		}
		System.out.println("\nA quantidade de números digitados que são maiores que 10 é de: "+maior);

		
	}

}
