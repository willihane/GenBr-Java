package Lista2LacoRepeticao;

import java.util.Scanner;

public class Questao1 {
/* Informar todos os números de 1000 a 1999 
 * que quando divididos por 11 obtemos resto = 5. (FOR) */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resto=0; 
		
		Scanner leia = new Scanner(System.in);
		
		for(resto=1000;resto<=1999;resto++)
		{
			if(resto%11==5)
			{
				System.out.println(resto);
			}
			
		}
		
	}

}
