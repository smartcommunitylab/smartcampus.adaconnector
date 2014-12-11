
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per SETTORE_SD_AREA_CUN complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SETTORE_SD_AREA_CUN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCRIZIONE_AREA_CUN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_SSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FINE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ID_AREA_CUN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_SSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INIZIO" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LINGUA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSD_ID_ATR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SETTORE_SD_AREA_CUN", propOrder = {
    "descrizioneareacun",
    "descrizionessd",
    "fine",
    "idareacun",
    "idssd",
    "inizio",
    "lingua",
    "ssdidatr"
})
public class SETTORESDAREACUN {

    @XmlElementRef(name = "DESCRIZIONE_AREA_CUN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizioneareacun;
    @XmlElementRef(name = "DESCRIZIONE_SSD", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionessd;
    @XmlElementRef(name = "FINE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fine;
    @XmlElementRef(name = "ID_AREA_CUN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idareacun;
    @XmlElementRef(name = "ID_SSD", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idssd;
    @XmlElementRef(name = "INIZIO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> inizio;
    @XmlElementRef(name = "LINGUA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lingua;
    @XmlElementRef(name = "SSD_ID_ATR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ssdidatr;

    /**
     * Recupera il valore della proprietà descrizioneareacun.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONEAREACUN() {
        return descrizioneareacun;
    }

    /**
     * Imposta il valore della proprietà descrizioneareacun.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONEAREACUN(JAXBElement<String> value) {
        this.descrizioneareacun = value;
    }

    /**
     * Recupera il valore della proprietà descrizionessd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONESSD() {
        return descrizionessd;
    }

    /**
     * Imposta il valore della proprietà descrizionessd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONESSD(JAXBElement<String> value) {
        this.descrizionessd = value;
    }

    /**
     * Recupera il valore della proprietà fine.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFINE() {
        return fine;
    }

    /**
     * Imposta il valore della proprietà fine.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFINE(JAXBElement<XMLGregorianCalendar> value) {
        this.fine = value;
    }

    /**
     * Recupera il valore della proprietà idareacun.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDAREACUN() {
        return idareacun;
    }

    /**
     * Imposta il valore della proprietà idareacun.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDAREACUN(JAXBElement<String> value) {
        this.idareacun = value;
    }

    /**
     * Recupera il valore della proprietà idssd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDSSD() {
        return idssd;
    }

    /**
     * Imposta il valore della proprietà idssd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDSSD(JAXBElement<String> value) {
        this.idssd = value;
    }

    /**
     * Recupera il valore della proprietà inizio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getINIZIO() {
        return inizio;
    }

    /**
     * Imposta il valore della proprietà inizio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setINIZIO(JAXBElement<XMLGregorianCalendar> value) {
        this.inizio = value;
    }

    /**
     * Recupera il valore della proprietà lingua.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLINGUA() {
        return lingua;
    }

    /**
     * Imposta il valore della proprietà lingua.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLINGUA(JAXBElement<String> value) {
        this.lingua = value;
    }

    /**
     * Recupera il valore della proprietà ssdidatr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSDIDATR() {
        return ssdidatr;
    }

    /**
     * Imposta il valore della proprietà ssdidatr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSDIDATR(JAXBElement<String> value) {
        this.ssdidatr = value;
    }

}
