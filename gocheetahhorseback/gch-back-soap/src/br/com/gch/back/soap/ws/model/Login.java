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
public class Login {

	@XmlElement(name="codCia", required=false)
    protected String codCia;
	
	@XmlElement(name="codCpfCnpj", required=true)
    protected String codCpfCnpj;
	
    @XmlSchemaType(name = "dtNascimento")
    protected XMLGregorianCalendar dtNascimento;
    
    public Login() {}
    
	public Login(String codCia, String codCpfCnpj, XMLGregorianCalendar dtNascimento) {
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

	public XMLGregorianCalendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(XMLGregorianCalendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}   
	
}
