package Lista5Heranca;

public class Cachorro extends Animal {
	
	private String deveCorrer;
	
	public Cachorro(String nome, int idade, String DeveEmitirSom, String deveCorrer)
	{
		super(nome,idade,DeveEmitirSom);
		this.deveCorrer = deveCorrer;
	}

	public String getDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	
}
