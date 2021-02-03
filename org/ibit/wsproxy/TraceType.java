
package org.ibit.wsproxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para traceType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="traceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="info"/&gt;
 *     &lt;enumeration value="err"/&gt;
 *     &lt;enumeration value="war"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "traceType")
@XmlEnum
public enum TraceType {

    @XmlEnumValue("info")
    INFO("info"),
    @XmlEnumValue("err")
    ERR("err"),
    @XmlEnumValue("war")
    WAR("war");
    private final String value;

    TraceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TraceType fromValue(String v) {
        for (TraceType c: TraceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
