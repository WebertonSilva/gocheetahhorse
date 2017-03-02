package br.com.gch.back.soap.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LoginSaida {
	
	@XmlElement(name="codRetorno", required=false)
    private String codRetorno;
	
	@XmlElement(name="cpf", required=true)
    private String cpf;
	
	@XmlElement(name="nome", required=false)
    private String nome;
	
	@XmlElement(name="email", required=false)
    private String email;
	
	@XmlSchemaType(name = "dateTime")
	@XmlElement(name="dtNascimento", required=false)
    protected XMLGregorianCalendar dtNascimento;
	
	@XmlElement(name="endereco", required=false)
    private String endereco; 
	
	@XmlElement(name="lat", required=false)
    private double lat;
	
	@XmlElement(name="longe", required=false)
    private double longe;
	
	@XmlElement(name="perfilAcesso", required=false)
	private String perfilAcesso;
    
    public LoginSaida() {}
    
	public LoginSaida(String codRetorno, String cpf, String nome, String email, XMLGregorianCalendar dtNascimento, String endereco, double lat,
			double longe, String perfilAcesso) {
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

	public XMLGregorianCalendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(XMLGregorianCalendar dtNascimento) {
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
	
	
	public static class Builder{
		
	    private String codRetorno;
	    private String cpf;
	    private String nome;
	    private String email;
	    @XmlSchemaType(name = "dateTime")
	    private XMLGregorianCalendar dtNascimento;
	    private String endereco; 
	    private double lat;
	    private double longe;
	    private String perfilAcesso;
	    
	    public LoginSaida build() {
	    	return new LoginSaida(this.codRetorno, this.cpf, this.nome, this.email , this.dtNascimento, this.endereco, this.lat, this.longe, this.perfilAcesso);
		}
		
	    
		public Builder comcodRetorno(String codRetorno) {
			this.codRetorno = codRetorno;
			return this;
		}
		
		public Builder comcpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
	    
		public Builder comnome(String nome) {
			this.nome = nome;
			return this;
		}
	    
		public Builder comemail(String email) {
			this.email = email;
			return this;
		}
		
		public Builder comdtNascimento(XMLGregorianCalendar dtNascimento) {
			this.dtNascimento = dtNascimento;
			return this;
		}
		
		public Builder comendereco(String endereco) {
			this.endereco = endereco;
			return this;
		}
		
		public Builder comlat(double lat) {
			this.lat = lat;
			return this;
		}
	    
		public Builder comlonge(double longe) {
			this.longe = longe;
			return this;
		}
		
		public Builder comperfilAcesso(String perfilAcesso) {
			this.perfilAcesso = perfilAcesso;
			return this;
		}
	}
	
}
