package br.com.gch.back.rest.model;

public class ValidaSegurado {
	
	private String cpfSegurado;
	private String cpfFuncResponsavel;
	private String jwtTokenFuncResponsavel;
	
	public ValidaSegurado () {}

	public String getCpfSegurado() {
		return cpfSegurado;
	}

	public void setCpfSegurado(String cpfSegurado) {
		this.cpfSegurado = cpfSegurado;
	}

	public String getCpfFuncResponsavel() {
		return cpfFuncResponsavel;
	}

	public void setCpfFuncResponsavel(String cpfFuncResponsavel) {
		this.cpfFuncResponsavel = cpfFuncResponsavel;
	}

	public String getJwttokenFuncResponsavel() {
		return jwtTokenFuncResponsavel;
	}

	public void setJwttokenFuncResponsavel(String jwtTokenFuncResponsavel) {
		this.jwtTokenFuncResponsavel = jwtTokenFuncResponsavel;
	}
}