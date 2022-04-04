package Lista2LacoRepeticao;

import java.util.Scanner;

public class Questao6 {

	/* Escrever um programa que receba vários números inteiros no teclado.
	E no final imprimir a média dos números múltiplos de 3. 
	Para sair digitar 0(zero).(DO...WHILE)  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, media, cont=0,soma=0;
		Scanner leia = new Scanner (System.in);
		
		do
		{
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			if(numero%3==0 && numero !=0)
			{
				soma += numero;
				cont++;
			}
		}
		while(numero != 0);
		media = soma/cont;
		System.out.println("\nMédia dos números multiplos de 3 é: "+media);
		
	}

}
