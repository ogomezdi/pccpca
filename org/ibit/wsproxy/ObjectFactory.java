
package org.ibit.wsproxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ibit.wsproxy package. 
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

    private final static QName _GetEstratificacion_QNAME = new QName("http://wsproxy.ibit.org", "getEstratificacion");
    private final static QName _GetEstratificacionResponse_QNAME = new QName("http://wsproxy.ibit.org", "getEstratificacionResponse");
    private final static QName _SetEstratificacion_QNAME = new QName("http://wsproxy.ibit.org", "setEstratificacion");
    private final static QName _SetEstratificacionResponse_QNAME = new QName("http://wsproxy.ibit.org", "setEstratificacionResponse");
    private final static QName _EstratificacionTypeTpmUserMod_QNAME = new QName("http://wsproxy.ibit.org", "tpmUserMod");
    private final static QName _EstratificacionTypeTpmusermodnom_QNAME = new QName("http://wsproxy.ibit.org", "tpmusermodnom");
    private final static QName _EstratificacionTypeTpmusermodap1_QNAME = new QName("http://wsproxy.ibit.org", "tpmusermodap1");
    private final static QName _EstratificacionTypeTpmusermodap2_QNAME = new QName("http://wsproxy.ibit.org", "tpmusermodap2");
    private final static QName _EstratificacionTypeTpmusermodcat_QNAME = new QName("http://wsproxy.ibit.org", "tpmusermodcat");
    private final static QName _EstratificacionTypeTpmusermodloc_QNAME = new QName("http://wsproxy.ibit.org", "tpmusermodloc");
    private final static QName _EstratificacionTypeTpmFecMod_QNAME = new QName("http://wsproxy.ibit.org", "tpmFecMod");
    private final static QName _EstratificacionTypeTpmVerifyPca_QNAME = new QName("http://wsproxy.ibit.org", "tpmVerifyPca");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ibit.wsproxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEstratificacionRequestType }
     * 
     */
    public GetEstratificacionRequestType createGetEstratificacionRequestType() {
        return new GetEstratificacionRequestType();
    }

    /**
     * Create an instance of {@link GetEstratificacionResponseType }
     * 
     */
    public GetEstratificacionResponseType createGetEstratificacionResponseType() {
        return new GetEstratificacionResponseType();
    }

    /**
     * Create an instance of {@link SetEstratificacionRequestType }
     * 
     */
    public SetEstratificacionRequestType createSetEstratificacionRequestType() {
        return new SetEstratificacionRequestType();
    }

    /**
     * Create an instance of {@link SetEstratificacionResponseType }
     * 
     */
    public SetEstratificacionResponseType createSetEstratificacionResponseType() {
        return new SetEstratificacionResponseType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link EstratificacionType }
     * 
     */
    public EstratificacionType createEstratificacionType() {
        return new EstratificacionType();
    }

    /**
     * Create an instance of {@link SetEstratificacionType }
     * 
     */
    public SetEstratificacionType createSetEstratificacionType() {
        return new SetEstratificacionType();
    }

    /**
     * Create an instance of {@link ApplicantType }
     * 
     */
    public ApplicantType createApplicantType() {
        return new ApplicantType();
    }

    /**
     * Create an instance of {@link AuthObjectsType }
     * 
     */
    public AuthObjectsType createAuthObjectsType() {
        return new AuthObjectsType();
    }

    /**
     * Create an instance of {@link DniType }
     * 
     */
    public DniType createDniType() {
        return new DniType();
    }

    /**
     * Create an instance of {@link FnmtType }
     * 
     */
    public FnmtType createFnmtType() {
        return new FnmtType();
    }

    /**
     * Create an instance of {@link CertificateType }
     * 
     */
    public CertificateType createCertificateType() {
        return new CertificateType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstratificacionRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEstratificacionRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "getEstratificacion")
    public JAXBElement<GetEstratificacionRequestType> createGetEstratificacion(GetEstratificacionRequestType value) {
        return new JAXBElement<GetEstratificacionRequestType>(_GetEstratificacion_QNAME, GetEstratificacionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstratificacionResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEstratificacionResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "getEstratificacionResponse")
    public JAXBElement<GetEstratificacionResponseType> createGetEstratificacionResponse(GetEstratificacionResponseType value) {
        return new JAXBElement<GetEstratificacionResponseType>(_GetEstratificacionResponse_QNAME, GetEstratificacionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEstratificacionRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetEstratificacionRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "setEstratificacion")
    public JAXBElement<SetEstratificacionRequestType> createSetEstratificacion(SetEstratificacionRequestType value) {
        return new JAXBElement<SetEstratificacionRequestType>(_SetEstratificacion_QNAME, SetEstratificacionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEstratificacionResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetEstratificacionResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "setEstratificacionResponse")
    public JAXBElement<SetEstratificacionResponseType> createSetEstratificacionResponse(SetEstratificacionResponseType value) {
        return new JAXBElement<SetEstratificacionResponseType>(_SetEstratificacionResponse_QNAME, SetEstratificacionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "tpmUserMod", scope = EstratificacionType.class)
    public JAXBElement<String> createEstratificacionTypeTpmUserMod(String value) {
        return new JAXBElement<String>(_EstratificacionTypeTpmUserMod_QNAME, String.class, EstratificacionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "tpmusermodnom", scope = EstratificacionType.class)
    public JAXBElement<String> createEstratificacionTypeTpmusermodnom(String value) {
        return new JAXBElement<String>(_EstratificacionTypeTpmusermodnom_QNAME, String.class, EstratificacionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "tpmusermodap1", scope = EstratificacionType.class)
    public JAXBElement<String> createEstratificacionTypeTpmusermodap1(String value) {
        return new JAXBElement<String>(_EstratificacionTypeTpmusermodap1_QNAME, String.class, EstratificacionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "tpmusermodap2", scope = EstratificacionType.class)
    public JAXBElement<String> createEstratificacionTypeTpmusermodap2(String value) {
        return new JAXBElement<String>(_EstratificacionTypeTpmusermodap2_QNAME, String.class, EstratificacionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "tpmusermodcat", scope = EstratificacionType.class)
    public JAXBElement<String> createEstratificacionTypeTpmusermodcat(String value) {
        return new JAXBElement<String>(_EstratificacionTypeTpmusermodcat_QNAME, String.class, EstratificacionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "tpmusermodloc", scope = EstratificacionType.class)
    public JAXBElement<String> createEstratificacionTypeTpmusermodloc(String value) {
        return new JAXBElement<String>(_EstratificacionTypeTpmusermodloc_QNAME, String.class, EstratificacionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "tpmFecMod", scope = EstratificacionType.class)
    public JAXBElement<XMLGregorianCalendar> createEstratificacionTypeTpmFecMod(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EstratificacionTypeTpmFecMod_QNAME, XMLGregorianCalendar.class, EstratificacionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wsproxy.ibit.org", name = "tpmVerifyPca", scope = EstratificacionType.class)
    public JAXBElement<String> createEstratificacionTypeTpmVerifyPca(String value) {
        return new JAXBElement<String>(_EstratificacionTypeTpmVerifyPca_QNAME, String.class, EstratificacionType.class, value);
    }

}
