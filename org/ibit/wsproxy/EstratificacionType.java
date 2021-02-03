
package org.ibit.wsproxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para estratificacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estratificacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpmId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tpmEstratificacion" type="{http://wsproxy.ibit.org}numType"/&gt;
 *         &lt;element name="tpmEstratificacionText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tpmAlertaPcaValMan" type="{http://wsproxy.ibit.org}stringTypePca"/&gt;
 *         &lt;element name="tpmAlertaPccValMan" type="{http://wsproxy.ibit.org}stringType"/&gt;
 *         &lt;element name="tpmUserMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpmusermodnom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpmusermodap1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpmusermodap2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpmusermodcat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpmusermodloc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpmFecMod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tpmVerifyPca" type="{http://wsproxy.ibit.org}stringTypeVerify" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estratificacionType", propOrder = {
    "tpmId",
    "tpmEstratificacion",
    "tpmEstratificacionText",
    "tpmAlertaPcaValMan",
    "tpmAlertaPccValMan",
    "tpmUserMod",
    "tpmusermodnom",
    "tpmusermodap1",
    "tpmusermodap2",
    "tpmusermodcat",
    "tpmusermodloc",
    "tpmFecMod",
    "tpmVerifyPca"
})
public class EstratificacionType {

    @XmlElement(required = true)
    protected String tpmId;
    @XmlElement(required = true, nillable = true)
    protected String tpmEstratificacion;
    @XmlElement(required = true, nillable = true)
    protected String tpmEstratificacionText;
    @XmlElement(required = true)
    protected String tpmAlertaPcaValMan;
    @XmlElement(required = true)
    protected String tpmAlertaPccValMan;
    @XmlElementRef(name = "tpmUserMod", namespace = "http://wsproxy.ibit.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tpmUserMod;
    @XmlElementRef(name = "tpmusermodnom", namespace = "http://wsproxy.ibit.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tpmusermodnom;
    @XmlElementRef(name = "tpmusermodap1", namespace = "http://wsproxy.ibit.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tpmusermodap1;
    @XmlElementRef(name = "tpmusermodap2", namespace = "http://wsproxy.ibit.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tpmusermodap2;
    @XmlElementRef(name = "tpmusermodcat", namespace = "http://wsproxy.ibit.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tpmusermodcat;
    @XmlElementRef(name = "tpmusermodloc", namespace = "http://wsproxy.ibit.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tpmusermodloc;
    @XmlElementRef(name = "tpmFecMod", namespace = "http://wsproxy.ibit.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> tpmFecMod;
    @XmlElementRef(name = "tpmVerifyPca", namespace = "http://wsproxy.ibit.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tpmVerifyPca;

    /**
     * Obtiene el valor de la propiedad tpmId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpmId() {
        return tpmId;
    }

    /**
     * Define el valor de la propiedad tpmId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpmId(String value) {
        this.tpmId = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmEstratificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpmEstratificacion() {
        return tpmEstratificacion;
    }

    /**
     * Define el valor de la propiedad tpmEstratificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpmEstratificacion(String value) {
        this.tpmEstratificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmEstratificacionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpmEstratificacionText() {
        return tpmEstratificacionText;
    }

    /**
     * Define el valor de la propiedad tpmEstratificacionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpmEstratificacionText(String value) {
        this.tpmEstratificacionText = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmAlertaPcaValMan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpmAlertaPcaValMan() {
        return tpmAlertaPcaValMan;
    }

    /**
     * Define el valor de la propiedad tpmAlertaPcaValMan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpmAlertaPcaValMan(String value) {
        this.tpmAlertaPcaValMan = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmAlertaPccValMan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpmAlertaPccValMan() {
        return tpmAlertaPccValMan;
    }

    /**
     * Define el valor de la propiedad tpmAlertaPccValMan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpmAlertaPccValMan(String value) {
        this.tpmAlertaPccValMan = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmUserMod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTpmUserMod() {
        return tpmUserMod;
    }

    /**
     * Define el valor de la propiedad tpmUserMod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTpmUserMod(JAXBElement<String> value) {
        this.tpmUserMod = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmusermodnom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTpmusermodnom() {
        return tpmusermodnom;
    }

    /**
     * Define el valor de la propiedad tpmusermodnom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTpmusermodnom(JAXBElement<String> value) {
        this.tpmusermodnom = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmusermodap1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTpmusermodap1() {
        return tpmusermodap1;
    }

    /**
     * Define el valor de la propiedad tpmusermodap1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTpmusermodap1(JAXBElement<String> value) {
        this.tpmusermodap1 = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmusermodap2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTpmusermodap2() {
        return tpmusermodap2;
    }

    /**
     * Define el valor de la propiedad tpmusermodap2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTpmusermodap2(JAXBElement<String> value) {
        this.tpmusermodap2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmusermodcat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTpmusermodcat() {
        return tpmusermodcat;
    }

    /**
     * Define el valor de la propiedad tpmusermodcat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTpmusermodcat(JAXBElement<String> value) {
        this.tpmusermodcat = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmusermodloc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTpmusermodloc() {
        return tpmusermodloc;
    }

    /**
     * Define el valor de la propiedad tpmusermodloc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTpmusermodloc(JAXBElement<String> value) {
        this.tpmusermodloc = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmFecMod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTpmFecMod() {
        return tpmFecMod;
    }

    /**
     * Define el valor de la propiedad tpmFecMod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTpmFecMod(JAXBElement<XMLGregorianCalendar> value) {
        this.tpmFecMod = value;
    }

    /**
     * Obtiene el valor de la propiedad tpmVerifyPca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTpmVerifyPca() {
        return tpmVerifyPca;
    }

    /**
     * Define el valor de la propiedad tpmVerifyPca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTpmVerifyPca(JAXBElement<String> value) {
        this.tpmVerifyPca = value;
    }

}
