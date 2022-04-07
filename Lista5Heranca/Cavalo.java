package Lista5Heranca;

public class Cavalo extends Animal {
	
	private String DeveCorrer;
	
	public Cavalo (String nome, int idade, String DeveEmitirSom, String DeveCorrer)
	{
		super(nome, idade, DeveEmitirSom);
		this.DeveCorrer = DeveCorrer;
	}

	public String getDeveCorrer() {
		return DeveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		DeveCorrer = deveCorrer;
	}
	
}
