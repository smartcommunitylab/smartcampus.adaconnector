
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
@XmlRootElement(name = "PER_find_codici_base_20110214")
public class PERFindCodiciBase20110214 {

    @XmlElementRef(name = "rup_id_oga", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> rupIdOga;
    @XmlElementRef(name = "ruo_id_oga", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> ruoIdOga;
    @XmlElementRef(name = "sto_id_oga", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> stoIdOga;
    @XmlElementRef(name = "tso_id_oga", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> tsoIdOga;
    @XmlElementRef(name = "fro_id_atr", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> froIdAtr;
    @XmlElementRef(name = "da_data", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> daData;
    @XmlElementRef(name = "a_data", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> aData;

    /**
     * Recupera il valore della proprietà rupIdOga.
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
     * Imposta il valore della proprietà rupIdOga.
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
     * Recupera il valore della proprietà ruoIdOga.
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
     * Imposta il valore della proprietà ruoIdOga.
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
     * Recupera il valore della proprietà stoIdOga.
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
     * Imposta il valore della proprietà stoIdOga.
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
     * Recupera il valore della proprietà tsoIdOga.
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
     * Imposta il valore della proprietà tsoIdOga.
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
     * Recupera il valore della proprietà froIdAtr.
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
     * Imposta il valore della proprietà froIdAtr.
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
     * Recupera il valore della proprietà daData.
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
     * Imposta il valore della proprietà daData.
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
     * Recupera il valore della proprietà aData.
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
     * Imposta il valore della proprietà aData.
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
