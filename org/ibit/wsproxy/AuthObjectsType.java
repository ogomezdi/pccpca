
package org.ibit.wsproxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para auth-objectsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="auth-objectsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="dni" type="{http://wsproxy.ibit.org}dniType"/&gt;
 *         &lt;element name="fnmt" type="{http://wsproxy.ibit.org}fnmtType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auth-objectsType", propOrder = {
    "dni",
    "fnmt"
})
public class AuthObjectsType {

    protected DniType dni;
    protected FnmtType fnmt;

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link DniType }
     *     
     */
    public DniType getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link DniType }
     *     
     */
    public void setDni(DniType value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad fnmt.
     * 
     * @return
     *     possible object is
     *     {@link FnmtType }
     *     
     */
    public FnmtType getFnmt() {
        return fnmt;
    }

    /**
     * Define el valor de la propiedad fnmt.
     * 
     * @param value
     *     allowed object is
     *     {@link FnmtType }
     *     
     */
    public void setFnmt(FnmtType value) {
        this.fnmt = value;
    }

}
