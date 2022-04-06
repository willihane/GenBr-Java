package Lista4POO;

public class Empregado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado ("Kamilia Lima",5000);
		lista[1] = new Empregado ("Lavinia Amorin",20000);
		lista[2] = new Empregado ("Claudio Pereira",13000);
		
		for(Empregado roda:lista)
		{
			roda.imprimir();
		}
		System.out.println("\n*****************************************************");
		
		for(Empregado roda:lista)
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

}
