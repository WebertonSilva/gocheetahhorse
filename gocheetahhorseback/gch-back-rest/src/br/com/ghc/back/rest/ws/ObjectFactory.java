
package br.com.ghc.back.rest.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ghc.back.rest.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Usuario_QNAME = new QName("http://service.ws.soap.back.gch.com.br/", "usuario");
    private final static QName _BuscarUsuarioResponse_QNAME = new QName("http://service.ws.soap.back.gch.com.br/", "BuscarUsuarioResponse");
    private final static QName _BuscarUsuario_QNAME = new QName("http://service.ws.soap.back.gch.com.br/", "BuscarUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ghc.back.rest.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarUsuarioResponse }
     * 
     */
    public BuscarUsuarioResponse createBuscarUsuarioResponse() {
        return new BuscarUsuarioResponse();
    }

    /**
     * Create an instance of {@link BuscarUsuario }
     * 
     */
    public BuscarUsuario createBuscarUsuario() {
        return new BuscarUsuario();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap.back.gch.com.br/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap.back.gch.com.br/", name = "BuscarUsuarioResponse")
    public JAXBElement<BuscarUsuarioResponse> createBuscarUsuarioResponse(BuscarUsuarioResponse value) {
        return new JAXBElement<BuscarUsuarioResponse>(_BuscarUsuarioResponse_QNAME, BuscarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap.back.gch.com.br/", name = "BuscarUsuario")
    public JAXBElement<BuscarUsuario> createBuscarUsuario(BuscarUsuario value) {
        return new JAXBElement<BuscarUsuario>(_BuscarUsuario_QNAME, BuscarUsuario.class, null, value);
    }

}
