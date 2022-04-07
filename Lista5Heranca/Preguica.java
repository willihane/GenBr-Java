package Lista5Heranca;

public class Preguica extends Animal {

	private String DeveSubirEmArvores;
	
	public Preguica (String nome, int idade, String DeveEmitirSom, String DeveSubirEmArvores)
	{
		super(nome,idade,DeveEmitirSom);
		this.DeveSubirEmArvores = DeveSubirEmArvores;
	}

	public String getDeveSubirEmArvores() {
		return DeveSubirEmArvores;
	}

	public void setDeveSubirEmArvores(String deveSubirEmArvores) {
		DeveSubirEmArvores = deveSubirEmArvores;
	}
	
}
