package br.com.gch.back.rest.model;

public class Login {
	
	private String cpf;
	private long dataNascimento;
	private String codCia;
	private String jwtToken;

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
		return this.codCia;
	}

	public void setCodCia(String origem) {
		this.codCia = origem;
	}

	public String getJwtToken() {
		return this.jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
}
