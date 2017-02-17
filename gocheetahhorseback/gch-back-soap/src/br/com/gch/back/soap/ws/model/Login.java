package br.com.gch.back.soap.ws.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Login {

	@XmlElement(name="codCia", required=false)
    protected String codCia;
	
	@XmlElement(name="codCpfCnpj", required=true)
    protected String codCpfCnpj;
	
    @XmlSchemaType(name = "dtNascimento")
    protected Date dtNascimento;
    
    public Login() {}
    
	public Login(String codCia, String codCpfCnpj, Date dtNascimento) {
		super();
		this.codCia = codCia;
		this.codCpfCnpj = codCpfCnpj;
		this.dtNascimento = dtNascimento;
	}

	public String getCodCia() {
		return codCia;
	}

	public void setCodCia(String codCia) {
		this.codCia = codCia;
	}

	public String getCodCpfCnpj() {
		return codCpfCnpj;
	}

	public void setCodCpfCnpj(String codCpfCnpj) {
		this.codCpfCnpj = codCpfCnpj;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}   
	
}
