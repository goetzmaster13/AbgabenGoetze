//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.07 at 08:52:12 PM CET 
//


package goetzmaster;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the goetzmaster package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: goetzmaster
     * 
     */
    public ObjectFactory() {
    }

   
    /**
     * Create an instance of {@link Resolution }
     * 
     */
    public Resolution createResolution() {
        return new Resolution();
    }

    /**
     * Create an instance of {@link RefreshRate }
     * 
     */
    public RefreshRate createRefreshRate() {
        return new RefreshRate();
    }

    /**
     * Create an instance of {@link HardwareSettingsInfo }
     * 
     */
    public HardwareSettingsInfo createHardwareSettingsInfo() {
        return new HardwareSettingsInfo();
    }

    /**
     * Create an instance of {@link SystemInfo }
     * 
     */
    public SystemInfo createSystemInfo() {
        return new SystemInfo();
    }

    /**
     * Create an instance of {@link GraphicsCard }
     * 
     */
    public GraphicsCard createGraphicsCard() {
        return new GraphicsCard();
    }


}