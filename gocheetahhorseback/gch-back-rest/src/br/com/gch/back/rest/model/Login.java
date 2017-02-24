package br.com.gch.back.rest.model;

public class Login {
	
	private String cpf;
	private long dtNascimento;
	private String indAcesso;

public Login() {}
	
	public long getDtNascimento() {
		return this.dtNascimento;
	}
	
	public void setDtNascimento(long dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getIndAcesso() {
		return this.indAcesso;
	}

	public void setIndAcesso(String indAcesso) {
		this.indAcesso = indAcesso;
	}
}
