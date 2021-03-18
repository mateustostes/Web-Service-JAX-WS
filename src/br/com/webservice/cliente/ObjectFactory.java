
package br.com.webservice.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.webservice.cliente package. 
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

    private final static QName _MeuNome_QNAME = new QName("http://webservice.com.br/", "meuNome");
    private final static QName _Calcula_QNAME = new QName("http://webservice.com.br/", "calcula");
    private final static QName _CalculaResponse_QNAME = new QName("http://webservice.com.br/", "calculaResponse");
    private final static QName _MeuNomeResponse_QNAME = new QName("http://webservice.com.br/", "meuNomeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.webservice.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MeuNome }
     * 
     */
    public MeuNome createMeuNome() {
        return new MeuNome();
    }

    /**
     * Create an instance of {@link CalculaResponse }
     * 
     */
    public CalculaResponse createCalculaResponse() {
        return new CalculaResponse();
    }

    /**
     * Create an instance of {@link MeuNomeResponse }
     * 
     */
    public MeuNomeResponse createMeuNomeResponse() {
        return new MeuNomeResponse();
    }

    /**
     * Create an instance of {@link Calcula }
     * 
     */
    public Calcula createCalcula() {
        return new Calcula();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeuNome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com.br/", name = "meuNome")
    public JAXBElement<MeuNome> createMeuNome(MeuNome value) {
        return new JAXBElement<MeuNome>(_MeuNome_QNAME, MeuNome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calcula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com.br/", name = "calcula")
    public JAXBElement<Calcula> createCalcula(Calcula value) {
        return new JAXBElement<Calcula>(_Calcula_QNAME, Calcula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com.br/", name = "calculaResponse")
    public JAXBElement<CalculaResponse> createCalculaResponse(CalculaResponse value) {
        return new JAXBElement<CalculaResponse>(_CalculaResponse_QNAME, CalculaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeuNomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com.br/", name = "meuNomeResponse")
    public JAXBElement<MeuNomeResponse> createMeuNomeResponse(MeuNomeResponse value) {
        return new JAXBElement<MeuNomeResponse>(_MeuNomeResponse_QNAME, MeuNomeResponse.class, null, value);
    }

}
