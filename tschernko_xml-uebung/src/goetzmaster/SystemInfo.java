//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.07 at 08:52:12 PM CET 
//


package goetzmaster;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="OS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="isWin7" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isWinVista" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isWinXP" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="rating" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="totalMemory" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="winMajorVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="winMinorVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="winPlatformID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "systemInfo")
public class SystemInfo {

    @XmlAttribute(name = "OS", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String os;
    @XmlAttribute(name = "isWin7", required = true)
    protected boolean isWin7;
    @XmlAttribute(name = "isWinVista", required = true)
    protected boolean isWinVista;
    @XmlAttribute(name = "isWinXP", required = true)
    protected boolean isWinXP;
    @XmlAttribute(name = "rating", required = true)
    protected BigInteger rating;
    @XmlAttribute(name = "totalMemory", required = true)
    protected BigInteger totalMemory;
    @XmlAttribute(name = "winMajorVersion", required = true)
    protected BigInteger winMajorVersion;
    @XmlAttribute(name = "winMinorVersion", required = true)
    protected BigInteger winMinorVersion;
    @XmlAttribute(name = "winPlatformID", required = true)
    protected BigInteger winPlatformID;

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOS() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOS(String value) {
        this.os = value;
    }

    /**
     * Gets the value of the isWin7 property.
     * 
     */
    public boolean isIsWin7() {
        return isWin7;
    }

    /**
     * Sets the value of the isWin7 property.
     * 
     */
    public void setIsWin7(boolean value) {
        this.isWin7 = value;
    }

    /**
     * Gets the value of the isWinVista property.
     * 
     */
    public boolean isIsWinVista() {
        return isWinVista;
    }

    /**
     * Sets the value of the isWinVista property.
     * 
     */
    public void setIsWinVista(boolean value) {
        this.isWinVista = value;
    }

    /**
     * Gets the value of the isWinXP property.
     * 
     */
    public boolean isIsWinXP() {
        return isWinXP;
    }

    /**
     * Sets the value of the isWinXP property.
     * 
     */
    public void setIsWinXP(boolean value) {
        this.isWinXP = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRating(BigInteger value) {
        this.rating = value;
    }

    /**
     * Gets the value of the totalMemory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMemory() {
        return totalMemory;
    }

    /**
     * Sets the value of the totalMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMemory(BigInteger value) {
        this.totalMemory = value;
    }

    /**
     * Gets the value of the winMajorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWinMajorVersion() {
        return winMajorVersion;
    }

    /**
     * Sets the value of the winMajorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWinMajorVersion(BigInteger value) {
        this.winMajorVersion = value;
    }

    /**
     * Gets the value of the winMinorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWinMinorVersion() {
        return winMinorVersion;
    }

    /**
     * Sets the value of the winMinorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWinMinorVersion(BigInteger value) {
        this.winMinorVersion = value;
    }

    /**
     * Gets the value of the winPlatformID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWinPlatformID() {
        return winPlatformID;
    }

    /**
     * Sets the value of the winPlatformID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWinPlatformID(BigInteger value) {
        this.winPlatformID = value;
    }

}
