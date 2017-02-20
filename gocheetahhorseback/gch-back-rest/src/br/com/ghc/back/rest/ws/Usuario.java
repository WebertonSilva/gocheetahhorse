
package br.com.ghc.back.rest.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de usuario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCpfCnpj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtNascimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longe" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "codRetorno",
    "codCpfCnpj",
    "nome",
    "email",
    "dtNascimento",
    "endereco",
    "lat",
    "longe"
})
public class Usuario {

    protected String codRetorno;
    @XmlElement(required = true)
    protected String codCpfCnpj;
    protected String nome;
    protected String email;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtNascimento;
    protected String endereco;
    protected double lat;
    protected double longe;

    /**
     * Obtém o valor da propriedade codRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRetorno() {
        return codRetorno;
    }

    /**
     * Define o valor da propriedade codRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRetorno(String value) {
        this.codRetorno = value;
    }

    /**
     * Obtém o valor da propriedade codCpfCnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCpfCnpj() {
        return codCpfCnpj;
    }

    /**
     * Define o valor da propriedade codCpfCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCpfCnpj(String value) {
        this.codCpfCnpj = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade dtNascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtNascimento() {
        return dtNascimento;
    }

    /**
     * Define o valor da propriedade dtNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtNascimento(XMLGregorianCalendar value) {
        this.dtNascimento = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade lat.
     * 
     */
    public double getLat() {
        return lat;
    }

    /**
     * Define o valor da propriedade lat.
     * 
     */
    public void setLat(double value) {
        this.lat = value;
    }

    /**
     * Obtém o valor da propriedade longe.
     * 
     */
    public double getLonge() {
        return longe;
    }

    /**
     * Define o valor da propriedade longe.
     * 
     */
    public void setLonge(double value) {
        this.longe = value;
    }

}
