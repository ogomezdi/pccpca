
package org.ibit.wsproxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para setEstratificacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="setEstratificacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertaPca" type="{http://wsproxy.ibit.org}stringTypePca"/&gt;
 *         &lt;element name="alertaPcc" type="{http://wsproxy.ibit.org}stringType"/&gt;
 *         &lt;element name="VerifyPca" type="{http://wsproxy.ibit.org}stringTypeVerify"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setEstratificacionType", propOrder = {
    "alertaPca",
    "alertaPcc",
    "verifyPca"
})
public class SetEstratificacionType {

    @XmlElement(required = true, nillable = true)
    protected String alertaPca;
    @XmlElement(required = true, nillable = true)
    protected String alertaPcc;
    @XmlElement(name = "VerifyPca", required = true, nillable = true)
    protected String verifyPca;

    /**
     * Obtiene el valor de la propiedad alertaPca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertaPca() {
        return alertaPca;
    }

    /**
     * Define el valor de la propiedad alertaPca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertaPca(String value) {
        this.alertaPca = value;
    }

    /**
     * Obtiene el valor de la propiedad alertaPcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertaPcc() {
        return alertaPcc;
    }

    /**
     * Define el valor de la propiedad alertaPcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertaPcc(String value) {
        this.alertaPcc = value;
    }

    /**
     * Obtiene el valor de la propiedad verifyPca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyPca() {
        return verifyPca;
    }

    /**
     * Define el valor de la propiedad verifyPca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyPca(String value) {
        this.verifyPca = value;
    }

}
