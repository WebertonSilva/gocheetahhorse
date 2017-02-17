package br.com.gch.back.rest.model;

public class Login {
	
	private String cpf;

	public Login(String cpf) {
		super();
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
