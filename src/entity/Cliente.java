package entity;

public class Cliente {
	
	private Integer idCliente;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	private String dataNascimento;
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public Cliente(Integer idCliente, String nome, String endereco, String email, String telefone,
			String dataNascimento) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", endereco=" + endereco + ", email=" + email
				+ ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + "]";
	}

	
}
