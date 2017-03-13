package br.com.gch.back.rest.model;

import java.util.Date;

public class Usuario {
	
	
    private String codRetorno;
    private String cpf;
    private String nome;
    private String email;
    protected Date dtNascimento;
    private String endereco; 
    private double lat;
    private double longe;
	private String perfilAcesso;
	private String empresa;
    
    public Usuario() {}
    
	public Usuario(String codRetorno, String cpf, String nome, String email, Date dtNascimento, String endereco, double lat,
			double longe, String perfilAcesso, String empresa) {
		
		super();
		
		this.codRetorno = codRetorno;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.endereco = endereco;
		this.lat = lat;
		this.longe = longe;
		this.perfilAcesso = perfilAcesso;
		this.empresa = empresa;
	}

	public String getCodRetorno() {
		return codRetorno;
	}

	public void setCodRetorno(String codRetorno) {
		this.codRetorno = codRetorno;
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

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(int lat) {
		this.lat = lat;
	}

	public double getLonge() {
		return longe;
	}

	public void setLonge(int longe) {
		this.longe = longe;
	}    
	
	public String getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(String perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
