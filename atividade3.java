package Lista1.LacoCondicional;

import java.util.Scanner;

public class atividade3 {
/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
	10-14 infantil
	15-17 juvenil
	18-25 adulto*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();
				
		if(idade>10 && idade<14)
		{
			System.out.println("\nCategoria INFANTIL.");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nCategoria JUVENIL.");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("\nCategoria ADULTO.");
		}
		else
		{
			System.out.println("\nFora das categorias existentes.");
		}
	}

}
