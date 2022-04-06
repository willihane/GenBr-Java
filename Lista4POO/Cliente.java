package Lista4POO;
/* 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
 *  em seguida crie um objeto cliente, defina as instancias deste objeto 
 *  e apresente as informações deste objeto no console. */
public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private String endereço;
	
	public Cliente (String nome, String cpf, String email, String endereço)
	{
		this.nome=nome;
		this.cpf=cpf;
		this.email=email;
		this.endereço=endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public void mostrarCliente()
	{
		System.out.println("\nCliente: "+nome+"\nCPF: "+cpf+"\nEmail: "+email+"\nReside em: "+endereço);
	}
}
