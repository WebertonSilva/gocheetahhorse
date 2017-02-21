package br.com.gch.back.rest.model;

public class Login {
	
	private String cpf;
	private long dataNascimento;
	private String indAcesso;

public Login() {}
	
	public long getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setDataNascimento(long dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCodCia() {
		return this.indAcesso;
	}

	public void setCodCia(String origem) {
		this.indAcesso = origem;
	}
}
