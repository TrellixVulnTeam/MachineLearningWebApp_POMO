//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 12:48:21 PM GMT 
//


package com.weka.core.pmml.jaxbbindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for INTERPOLATION-METHOD.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="INTERPOLATION-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="linear"/>
 *     &lt;enumeration value="exponentialSpline"/>
 *     &lt;enumeration value="cubicSpline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum INTERPOLATIONMETHOD {

    @XmlEnumValue("cubicSpline")
    CUBIC_SPLINE("cubicSpline"),
    @XmlEnumValue("exponentialSpline")
    EXPONENTIAL_SPLINE("exponentialSpline"),
    @XmlEnumValue("linear")
    LINEAR("linear"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    INTERPOLATIONMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static INTERPOLATIONMETHOD fromValue(String v) {
        for (INTERPOLATIONMETHOD c: INTERPOLATIONMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}