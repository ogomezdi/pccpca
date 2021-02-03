
package org.ibit.wsproxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para getEstratificacionResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getEstratificacionResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://wsproxy.ibit.org}statusType"/&gt;
 *         &lt;element name="estratificacion" type="{http://wsproxy.ibit.org}estratificacionType" minOccurs="0"/&gt;
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
@XmlType(name = "getEstratificacionResponseType", propOrder = {
    "status",
    "estratificacion"
})
public class GetEstratificacionResponseType {

    @XmlElement(required = true)
    protected StatusType status;
    protected EstratificacionType estratificacion;
    @XmlAttribute(name = "cipAutonomico", required = true)
    protected String cipAutonomico;
    @XmlAttribute(name = "timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "lang")
    protected String lang;

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad estratificacion.
     * 
     * @return
     *     possible object is
     *     {@link EstratificacionType }
     *     
     */
    public EstratificacionType getEstratificacion() {
        return estratificacion;
    }

    /**
     * Define el valor de la propiedad estratificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link EstratificacionType }
     *     
     */
    public void setEstratificacion(EstratificacionType value) {
        this.estratificacion = value;
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
