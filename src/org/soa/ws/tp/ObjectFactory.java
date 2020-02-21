
package org.soa.ws.tp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soa.ws.tp package. 
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

    private final static QName _ReadCategProductResponse_QNAME = new QName("http://tp.ws.soa.org/", "readCategProductResponse");
    private final static QName _ReadCategProduct_QNAME = new QName("http://tp.ws.soa.org/", "readCategProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soa.ws.tp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadCategProduct }
     * 
     */
    public ReadCategProduct createReadCategProduct() {
        return new ReadCategProduct();
    }

    /**
     * Create an instance of {@link ReadCategProductResponse }
     * 
     */
    public ReadCategProductResponse createReadCategProductResponse() {
        return new ReadCategProductResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCategProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "readCategProductResponse")
    public JAXBElement<ReadCategProductResponse> createReadCategProductResponse(ReadCategProductResponse value) {
        return new JAXBElement<ReadCategProductResponse>(_ReadCategProductResponse_QNAME, ReadCategProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCategProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "readCategProduct")
    public JAXBElement<ReadCategProduct> createReadCategProduct(ReadCategProduct value) {
        return new JAXBElement<ReadCategProduct>(_ReadCategProduct_QNAME, ReadCategProduct.class, null, value);
    }

}
