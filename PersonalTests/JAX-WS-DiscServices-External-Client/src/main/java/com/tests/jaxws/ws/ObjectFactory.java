
package com.tests.jaxws.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tests.jaxws.ws package. 
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

    private final static QName _GetDiscsById_QNAME = new QName("http://ws.jaxws.tests.com/", "getDiscsById");
    private final static QName _AddDiscResponse_QNAME = new QName("http://ws.jaxws.tests.com/", "addDiscResponse");
    private final static QName _GetDiscsList_QNAME = new QName("http://ws.jaxws.tests.com/", "getDiscsList");
    private final static QName _AddDisc_QNAME = new QName("http://ws.jaxws.tests.com/", "addDisc");
    private final static QName _GetDiscsListResponse_QNAME = new QName("http://ws.jaxws.tests.com/", "getDiscsListResponse");
    private final static QName _GetDiscsByIdResponse_QNAME = new QName("http://ws.jaxws.tests.com/", "getDiscsByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tests.jaxws.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDiscsByIdResponse }
     * 
     */
    public GetDiscsByIdResponse createGetDiscsByIdResponse() {
        return new GetDiscsByIdResponse();
    }

    /**
     * Create an instance of {@link AddDisc }
     * 
     */
    public AddDisc createAddDisc() {
        return new AddDisc();
    }

    /**
     * Create an instance of {@link GetDiscsListResponse }
     * 
     */
    public GetDiscsListResponse createGetDiscsListResponse() {
        return new GetDiscsListResponse();
    }

    /**
     * Create an instance of {@link GetDiscsById }
     * 
     */
    public GetDiscsById createGetDiscsById() {
        return new GetDiscsById();
    }

    /**
     * Create an instance of {@link AddDiscResponse }
     * 
     */
    public AddDiscResponse createAddDiscResponse() {
        return new AddDiscResponse();
    }

    /**
     * Create an instance of {@link GetDiscsList }
     * 
     */
    public GetDiscsList createGetDiscsList() {
        return new GetDiscsList();
    }

    /**
     * Create an instance of {@link Disc }
     * 
     */
    public Disc createDisc() {
        return new Disc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiscsById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.tests.com/", name = "getDiscsById")
    public JAXBElement<GetDiscsById> createGetDiscsById(GetDiscsById value) {
        return new JAXBElement<GetDiscsById>(_GetDiscsById_QNAME, GetDiscsById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDiscResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.tests.com/", name = "addDiscResponse")
    public JAXBElement<AddDiscResponse> createAddDiscResponse(AddDiscResponse value) {
        return new JAXBElement<AddDiscResponse>(_AddDiscResponse_QNAME, AddDiscResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiscsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.tests.com/", name = "getDiscsList")
    public JAXBElement<GetDiscsList> createGetDiscsList(GetDiscsList value) {
        return new JAXBElement<GetDiscsList>(_GetDiscsList_QNAME, GetDiscsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDisc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.tests.com/", name = "addDisc")
    public JAXBElement<AddDisc> createAddDisc(AddDisc value) {
        return new JAXBElement<AddDisc>(_AddDisc_QNAME, AddDisc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiscsListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.tests.com/", name = "getDiscsListResponse")
    public JAXBElement<GetDiscsListResponse> createGetDiscsListResponse(GetDiscsListResponse value) {
        return new JAXBElement<GetDiscsListResponse>(_GetDiscsListResponse_QNAME, GetDiscsListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiscsByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.tests.com/", name = "getDiscsByIdResponse")
    public JAXBElement<GetDiscsByIdResponse> createGetDiscsByIdResponse(GetDiscsByIdResponse value) {
        return new JAXBElement<GetDiscsByIdResponse>(_GetDiscsByIdResponse_QNAME, GetDiscsByIdResponse.class, null, value);
    }

}
