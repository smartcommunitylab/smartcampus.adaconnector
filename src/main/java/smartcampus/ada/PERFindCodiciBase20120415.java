
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rup_id_oga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruo_id_oga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sto_id_oga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tso_id_oga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fro_id_atr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="da_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="a_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rupIdOga",
    "ruoIdOga",
    "stoIdOga",
    "tsoIdOga",
    "froIdAtr",
    "daData",
    "aData"
})
@XmlRootElement(name = "PER_find_codici_base_20120415")
public class PERFindCodiciBase20120415 {

    @XmlElementRef(name = "rup_id_oga", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rupIdOga;
    @XmlElementRef(name = "ruo_id_oga", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ruoIdOga;
    @XmlElementRef(name = "sto_id_oga", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stoIdOga;
    @XmlElementRef(name = "tso_id_oga", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tsoIdOga;
    @XmlElementRef(name = "fro_id_atr", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> froIdAtr;
    @XmlElementRef(name = "da_data", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> daData;
    @XmlElementRef(name = "a_data", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> aData;

    /**
     * Gets the value of the rupIdOga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRupIdOga() {
        return rupIdOga;
    }

    /**
     * Sets the value of the rupIdOga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRupIdOga(JAXBElement<String> value) {
        this.rupIdOga = value;
    }

    /**
     * Gets the value of the ruoIdOga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRuoIdOga() {
        return ruoIdOga;
    }

    /**
     * Sets the value of the ruoIdOga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRuoIdOga(JAXBElement<String> value) {
        this.ruoIdOga = value;
    }

    /**
     * Gets the value of the stoIdOga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStoIdOga() {
        return stoIdOga;
    }

    /**
     * Sets the value of the stoIdOga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStoIdOga(JAXBElement<String> value) {
        this.stoIdOga = value;
    }

    /**
     * Gets the value of the tsoIdOga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTsoIdOga() {
        return tsoIdOga;
    }

    /**
     * Sets the value of the tsoIdOga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTsoIdOga(JAXBElement<String> value) {
        this.tsoIdOga = value;
    }

    /**
     * Gets the value of the froIdAtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFroIdAtr() {
        return froIdAtr;
    }

    /**
     * Sets the value of the froIdAtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFroIdAtr(JAXBElement<String> value) {
        this.froIdAtr = value;
    }

    /**
     * Gets the value of the daData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDaData() {
        return daData;
    }

    /**
     * Sets the value of the daData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDaData(JAXBElement<XMLGregorianCalendar> value) {
        this.daData = value;
    }

    /**
     * Gets the value of the aData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAData() {
        return aData;
    }

    /**
     * Sets the value of the aData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAData(JAXBElement<XMLGregorianCalendar> value) {
        this.aData = value;
    }

}
