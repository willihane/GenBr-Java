package Lista5Heranca;
/* Lista5Heranca */
public class Animal {
	
	private String nome;
	private int idade;
	private String DeveEmitirSom;
	
	public Animal (String nome, int idade, String DeveEmitirSom)
	{
		this.nome = nome;
		this.idade = idade;
		this.DeveEmitirSom = DeveEmitirSom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDeveEmitirSom() {
		return DeveEmitirSom;
	}

	public void setDeveEmitirSom(String deveEmitirSom) {
		DeveEmitirSom = deveEmitirSom;
	}
	
}
