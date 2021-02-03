
package org.ibit.wsproxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para getEstratificacionRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getEstratificacionRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="securityToken" type="{http://wsproxy.ibit.org}auth-objectsType" minOccurs="0"/&gt;
 *         &lt;element name="applicant" type="{http://wsproxy.ibit.org}applicantType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="cipAutonomico" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEstratificacionRequestType", propOrder = {
    "securityToken",
    "applicant"
})
public class GetEstratificacionRequestType {

    protected AuthObjectsType securityToken;
    @XmlElement(required = true)
    protected ApplicantType applicant;
    @XmlAttribute(name = "cipAutonomico", required = true)
    protected String cipAutonomico;
    @XmlAttribute(name = "timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "lang")
    protected String lang;

    /**
     * Obtiene el valor de la propiedad securityToken.
     * 
     * @return
     *     possible object is
     *     {@link AuthObjectsType }
     *     
     */
    public AuthObjectsType getSecurityToken() {
        return securityToken;
    }

    /**
     * Define el valor de la propiedad securityToken.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthObjectsType }
     *     
     */
    public void setSecurityToken(AuthObjectsType value) {
        this.securityToken = value;
    }

    /**
     * Obtiene el valor de la propiedad applicant.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantType }
     *     
     */
    public ApplicantType getApplicant() {
        return applicant;
    }

    /**
     * Define el valor de la propiedad applicant.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantType }
     *     
     */
    public void setApplicant(ApplicantType value) {
        this.applicant = value;
    }

    /**
     * Obtiene el valor de la propiedad cipAutonomico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCipAutonomico() {
        return cipAutonomico;
    }

    /**
     * Define el valor de la propiedad cipAutonomico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCipAutonomico(String value) {
        this.cipAutonomico = value;
    }

    /**
     * Obtiene el valor de la propiedad timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Define el valor de la propiedad timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Define el valor de la propiedad lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
