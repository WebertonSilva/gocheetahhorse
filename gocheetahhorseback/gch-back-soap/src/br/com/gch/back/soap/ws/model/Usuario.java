package br.com.gch.back.soap.ws.model;

import java.time.LocalDate;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Usuario {
	
	@XmlElement(name="codRetorno", required=false)
    private String codRetorno;
	
	@XmlElement(name="codCpfCnpj", required=true)
    private String codCpfCnpj;
	
	@XmlElement(name="nome", required=false)
    private String nome;
	
	@XmlElement(name="email", required=false)
    private String email;
	
	@XmlElement(name="dtNascimento", required=false)
    protected Date dtNascimento;
	
	@XmlElement(name="endereco", required=false)
    private String endereco; 
	
	@XmlElement(name="lat", required=false)
    private double lat;
	
	@XmlElement(name="longe", required=false)
    private double longe;
    
    public Usuario() {}
    
	public Usuario(String codRetorno, String codCpfCnpj, String nome, String email, Date dtNascimento, String endereco, double lat,
			double longe) {
		super();
		
		this.codRetorno = codRetorno;
		this.codCpfCnpj = codCpfCnpj;
		this.nome = nome;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.endereco = endereco;
		this.lat = lat;
		this.longe = longe;
	}

	public String getCodRetorno() {
		return codRetorno;
	}

	public void setCodRetorno(String codRetorno) {
		this.codRetorno = codRetorno;
	}

	public String getCodCpfCnpj() {
		return codCpfCnpj;
	}

	public void setCodCpfCnpj(String codCpfCnpj) {
		this.codCpfCnpj = codCpfCnpj;
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
	
	
	public static class Builder{
		
	    private String codRetorno;
	    private String codCpfCnpj;
	    private String nome;
	    private String email;
	    private Date dtNascimento;
	    private String endereco; 
	    private double lat;
	    private double longe;
	    
	    public Usuario build() {
	    	return new Usuario(this.codRetorno, this.codCpfCnpj, this.nome, this.email , this.dtNascimento, this.endereco, this.lat, this.longe);
		}
		
	    
		public Builder comcodRetorno(String codRetorno) {
			this.codRetorno = codRetorno;
			return this;
		}
		
		public Builder comcodCpfCnpj(String codCpfCnpj) {
			this.codCpfCnpj = codCpfCnpj;
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
		
		public Builder comdtNascimento(Date dtNascimento) {
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
	}
	
}
