package Lista4POO;
/* 1) Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe,
 *  em seguida crie um objeto cliente, defina as instancias deste objeto 
 *  e apresente as informa��es deste objeto no console. */
public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private String endere�o;
	
	public Cliente (String nome, String cpf, String email, String endere�o)
	{
		this.nome=nome;
		this.cpf=cpf;
		this.email=email;
		this.endere�o=endere�o;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return (String) cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public void mostrarCliente()
	{
		System.out.println("\nCliente: "+nome+"\nCPF: "+cpf+"\nEmail: "+email+"\nReside em: "+endere�o);
	}
}
