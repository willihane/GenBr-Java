package Lista7Colecoes;


/* Crie uma um programa para trabalhar com estoque de uma loja,
 *  o programa dever� trabalhar com Collection do tipo List do Java 
 *  para manipular os dados desse estoque, o programa dever� atender
 *   as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes {
	
	public static void main(String[] args) {

	int opcoes;
	Scanner leia = new Scanner(System.in);
	
	ArrayList<String> Estoque = new ArrayList();
	
	do
	{
		System.out.println("\n------------------------------------------------------");
		System.out.println("\n1) Armazenar produtos no estoque.  ");
		System.out.println("\n2) Remover produtos do estoque. ");
		System.out.println("\n3) Atualizar produtos do estoque. ");
		System.out.println("\n4) Apresentar produtos do estoque. ");
		System.out.println("\n0) Finalizar o programa. ");
		System.out.println("\n-------------------------------------------------------");
		System.out.println("\nDigite o que deseja fazer: ");
		opcoes = leia.nextInt();
		
		switch(opcoes)
		{
		
		case 1: 
			leia.nextLine();
			System.out.println("\nDigite nome do produto para adicionar ao estoque: ");
			String produto = leia.nextLine();
			Estoque.add(produto);
			break;
			
		case 2:
			leia.nextLine();
			System.out.println("\nDigite nome do produto para remover do estoque: ");
			String produtor = leia.nextLine();
			if(Estoque.contains(produtor))
			{
				Estoque.remove(produtor);
				
			}
			else
			{
				System.out.println("\nProduto n�o existente no sistema...");
			}
			break;
			
		case 3: 
			leia.nextLine();
			System.out.println("\nDigite produto que quer atualizar: ");
			String verifica = leia.nextLine();
			System.out.println("\nDigite o produto que vai entrar no lugar de "+verifica);
			String novo = leia.nextLine();
			if(Estoque.contains(verifica))
			{
				Estoque.remove(verifica);
				Estoque.add(novo);

			}
			else
			{
				System.out.println("\nProduto n�o existente no sistema.");
				
			}
			break;
			
		case 4:
			System.out.println("\nOs produtos do estoque s�o: ");
			System.out.println(Estoque);
			break;
			
			default:
				if(opcoes<0 || opcoes>4)
				{
					System.out.println("\\nOp��o inv�lida. Digite uma nova op��o: ");
				}
				else {
					System.out.println("\nFinalizou o programa.");
				}
		}
	}
	
	while(opcoes != 0);
	}
	}

