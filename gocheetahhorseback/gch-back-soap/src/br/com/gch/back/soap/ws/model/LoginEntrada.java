package br.com.gch.back.soap.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logarEntrada", propOrder = {
	    "indAcesso",
	    "cpf",
	    "dtNascimento"
	})
public class LoginEntrada {

	@XmlElement(name="indAcesso", required=false)
    protected String indAcesso;
	
	@XmlElement(name="cpf", required=true)
    protected String cpf;
	
    @XmlSchemaType(name = "dtNascimento")
    protected XMLGregorianCalendar dtNascimento;
    
    public LoginEntrada() {}
    
	public LoginEntrada(String indAcesso, String cpf, XMLGregorianCalendar dtNascimento) {
		super();
		this.indAcesso = indAcesso;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
	}

	public String getIndAcesso() {
		return indAcesso;
	}

	public void setIndAcesso(String indAcesso) {
		this.indAcesso = indAcesso;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public XMLGregorianCalendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(XMLGregorianCalendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}   
	
}
