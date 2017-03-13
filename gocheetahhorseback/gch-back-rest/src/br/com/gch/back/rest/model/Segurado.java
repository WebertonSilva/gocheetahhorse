package br.com.gch.back.rest.model;

import java.util.Date;

public class Segurado {
	
	private String cpf;
    private String nome;
    private String email;
    protected Date dtNascimento;
    private String endereco;
    private String cpfFuncResponsavel;
    
	public Segurado() {}

	public Segurado(String cpf, String nome, String email, Date dtNascimento, String endereco, String cpfFuncResponsavel) {
		
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.endereco = endereco;
		this.cpfFuncResponsavel = cpfFuncResponsavel;
	}


	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDtNascimento() {
		return dtNascimento;
	}
	
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpfFuncResponsavel() {
		return cpfFuncResponsavel;
	}

	public void setCpfFuncResponsavel(String cpfFuncResponsavel) {
		this.cpfFuncResponsavel = cpfFuncResponsavel;
	} 
}