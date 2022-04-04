package Lista2LacoRepeticao;

import java.util.Scanner;

public class Questao3 {
	
	/* Solicitar a idade de várias pessoas e imprimir:
	 * Total de pessoas com menos de 21 anos. 
	 * Total de pessoas com mais de 50 anos.
	 * O programa termina quando idade for =-99. (WHILE) */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade=0, menor=0, maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade!=-99)
		{
			System.out.println("\nInsira a idade: ");
			idade = leia.nextInt();
			if(idade<0)
			{
				System.out.println("\n...");
			}
			else
			{
				if(idade<21)
				{
					menor++;
				}
				else if(idade>50)
				{
					maior++;
				}
			}
			
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+menor);
		System.out.println("Total de pessoas com mais de 50 anos: "+maior);
	}

}
