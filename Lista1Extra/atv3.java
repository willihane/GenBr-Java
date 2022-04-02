package Lista1Extra;

import java.util.Scanner;

public class atv3 {
/* 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
 * e mostre-o expresso em horas, minutos e segundos.  */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hr, min, seg;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("\nTempo de duração do evento em segundos: ");
		seg = leia.nextInt();
		
		hr = seg / 3600;
		min = ((seg % 3600) / 60);
		seg = ((seg % 3600) / 60);
		
		System.out.println("\nA duração do evento foi de "+ hr + " horas, " + min +" minutos e " + seg + " segundos.");
		
		
	}

}
