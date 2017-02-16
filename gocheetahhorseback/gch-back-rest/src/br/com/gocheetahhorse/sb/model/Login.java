package br.com.gocheetahhorse.sb.model;

import java.io.Serializable;
import java.util.Date;

public class Login implements Serializable{

	private static final long serialVersionUID = -650474750009651138L;
	
	private String cpf;
	private Date dataNascimento;
	private String jwt;
	private String origem;
	
	public Login() {}
	
	public Date getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getJwt() {
		return this.jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public String getOrigem() {
		return this.origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
}