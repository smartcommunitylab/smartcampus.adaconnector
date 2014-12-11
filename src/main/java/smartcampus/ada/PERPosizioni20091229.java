
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per PER_Posizioni_20091229 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PER_Posizioni_20091229">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCRIZIONE_FRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_POR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_PPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_PRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_RUO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_RUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_SED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_STO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FINE_POR" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FINE_PPE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FINE_SOG" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FRO_ID_ATR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INIZIO_POR" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="INIZIO_PPE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="INIZIO_SOG" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LINGUA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PER_ID_OGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POR_ID_OGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PPE_ID_OGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRO_ID_OGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RUO_ID_OGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RUP_ID_OGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SED_ID_OGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STO_ID_OGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PER_Posizioni_20091229", propOrder = {
    "descrizionefro",
    "descrizionepor",
    "descrizioneppe",
    "descrizionepro",
    "descrizioneruo",
    "descrizionerup",
    "descrizionesed",
    "descrizionesto",
    "finepor",
    "fineppe",
    "finesog",
    "froidatr",
    "iniziopor",
    "inizioppe",
    "iniziosog",
    "lingua",
    "peridoga",
    "poridoga",
    "ppeidoga",
    "proidoga",
    "ruoidoga",
    "rupidoga",
    "sedidoga",
    "stoidoga"
})
public class PERPosizioni20091229 {

    @XmlElementRef(name = "DESCRIZIONE_FRO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionefro;
    @XmlElementRef(name = "DESCRIZIONE_POR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionepor;
    @XmlElementRef(name = "DESCRIZIONE_PPE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizioneppe;
    @XmlElementRef(name = "DESCRIZIONE_PRO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionepro;
    @XmlElementRef(name = "DESCRIZIONE_RUO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizioneruo;
    @XmlElementRef(name = "DESCRIZIONE_RUP", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionerup;
    @XmlElementRef(name = "DESCRIZIONE_SED", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionesed;
    @XmlElementRef(name = "DESCRIZIONE_STO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionesto;
    @XmlElementRef(name = "FINE_POR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finepor;
    @XmlElementRef(name = "FINE_PPE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fineppe;
    @XmlElementRef(name = "FINE_SOG", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finesog;
    @XmlElementRef(name = "FRO_ID_ATR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> froidatr;
    @XmlElementRef(name = "INIZIO_POR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> iniziopor;
    @XmlElementRef(name = "INIZIO_PPE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> inizioppe;
    @XmlElementRef(name = "INIZIO_SOG", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> iniziosog;
    @XmlElementRef(name = "LINGUA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lingua;
    @XmlElementRef(name = "PER_ID_OGA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> peridoga;
    @XmlElementRef(name = "POR_ID_OGA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poridoga;
    @XmlElementRef(name = "PPE_ID_OGA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ppeidoga;
    @XmlElementRef(name = "PRO_ID_OGA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proidoga;
    @XmlElementRef(name = "RUO_ID_OGA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ruoidoga;
    @XmlElementRef(name = "RUP_ID_OGA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rupidoga;
    @XmlElementRef(name = "SED_ID_OGA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sedidoga;
    @XmlElementRef(name = "STO_ID_OGA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stoidoga;

    /**
     * Recupera il valore della proprietà descrizionefro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONEFRO() {
        return descrizionefro;
    }

    /**
     * Imposta il valore della proprietà descrizionefro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONEFRO(JAXBElement<String> value) {
        this.descrizionefro = value;
    }

    /**
     * Recupera il valore della proprietà descrizionepor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONEPOR() {
        return descrizionepor;
    }

    /**
     * Imposta il valore della proprietà descrizionepor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONEPOR(JAXBElement<String> value) {
        this.descrizionepor = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneppe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONEPPE() {
        return descrizioneppe;
    }

    /**
     * Imposta il valore della proprietà descrizioneppe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONEPPE(JAXBElement<String> value) {
        this.descrizioneppe = value;
    }

    /**
     * Recupera il valore della proprietà descrizionepro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONEPRO() {
        return descrizionepro;
    }

    /**
     * Imposta il valore della proprietà descrizionepro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONEPRO(JAXBElement<String> value) {
        this.descrizionepro = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneruo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONERUO() {
        return descrizioneruo;
    }

    /**
     * Imposta il valore della proprietà descrizioneruo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONERUO(JAXBElement<String> value) {
        this.descrizioneruo = value;
    }

    /**
     * Recupera il valore della proprietà descrizionerup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONERUP() {
        return descrizionerup;
    }

    /**
     * Imposta il valore della proprietà descrizionerup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONERUP(JAXBElement<String> value) {
        this.descrizionerup = value;
    }

    /**
     * Recupera il valore della proprietà descrizionesed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONESED() {
        return descrizionesed;
    }

    /**
     * Imposta il valore della proprietà descrizionesed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONESED(JAXBElement<String> value) {
        this.descrizionesed = value;
    }

    /**
     * Recupera il valore della proprietà descrizionesto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONESTO() {
        return descrizionesto;
    }

    /**
     * Imposta il valore della proprietà descrizionesto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONESTO(JAXBElement<String> value) {
        this.descrizionesto = value;
    }

    /**
     * Recupera il valore della proprietà finepor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFINEPOR() {
        return finepor;
    }

    /**
     * Imposta il valore della proprietà finepor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFINEPOR(JAXBElement<XMLGregorianCalendar> value) {
        this.finepor = value;
    }

    /**
     * Recupera il valore della proprietà fineppe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFINEPPE() {
        return fineppe;
    }

    /**
     * Imposta il valore della proprietà fineppe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFINEPPE(JAXBElement<XMLGregorianCalendar> value) {
        this.fineppe = value;
    }

    /**
     * Recupera il valore della proprietà finesog.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFINESOG() {
        return finesog;
    }

    /**
     * Imposta il valore della proprietà finesog.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFINESOG(JAXBElement<XMLGregorianCalendar> value) {
        this.finesog = value;
    }

    /**
     * Recupera il valore della proprietà froidatr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFROIDATR() {
        return froidatr;
    }

    /**
     * Imposta il valore della proprietà froidatr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFROIDATR(JAXBElement<String> value) {
        this.froidatr = value;
    }

    /**
     * Recupera il valore della proprietà iniziopor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getINIZIOPOR() {
        return iniziopor;
    }

    /**
     * Imposta il valore della proprietà iniziopor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setINIZIOPOR(JAXBElement<XMLGregorianCalendar> value) {
        this.iniziopor = value;
    }

    /**
     * Recupera il valore della proprietà inizioppe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getINIZIOPPE() {
        return inizioppe;
    }

    /**
     * Imposta il valore della proprietà inizioppe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setINIZIOPPE(JAXBElement<XMLGregorianCalendar> value) {
        this.inizioppe = value;
    }

    /**
     * Recupera il valore della proprietà iniziosog.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getINIZIOSOG() {
        return iniziosog;
    }

    /**
     * Imposta il valore della proprietà iniziosog.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setINIZIOSOG(JAXBElement<XMLGregorianCalendar> value) {
        this.iniziosog = value;
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
     * Recupera il valore della proprietà peridoga.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPERIDOGA() {
        return peridoga;
    }

    /**
     * Imposta il valore della proprietà peridoga.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPERIDOGA(JAXBElement<String> value) {
        this.peridoga = value;
    }

    /**
     * Recupera il valore della proprietà poridoga.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPORIDOGA() {
        return poridoga;
    }

    /**
     * Imposta il valore della proprietà poridoga.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPORIDOGA(JAXBElement<String> value) {
        this.poridoga = value;
    }

    /**
     * Recupera il valore della proprietà ppeidoga.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPPEIDOGA() {
        return ppeidoga;
    }

    /**
     * Imposta il valore della proprietà ppeidoga.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPPEIDOGA(JAXBElement<String> value) {
        this.ppeidoga = value;
    }

    /**
     * Recupera il valore della proprietà proidoga.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPROIDOGA() {
        return proidoga;
    }

    /**
     * Imposta il valore della proprietà proidoga.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPROIDOGA(JAXBElement<String> value) {
        this.proidoga = value;
    }

    /**
     * Recupera il valore della proprietà ruoidoga.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRUOIDOGA() {
        return ruoidoga;
    }

    /**
     * Imposta il valore della proprietà ruoidoga.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRUOIDOGA(JAXBElement<String> value) {
        this.ruoidoga = value;
    }

    /**
     * Recupera il valore della proprietà rupidoga.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRUPIDOGA() {
        return rupidoga;
    }

    /**
     * Imposta il valore della proprietà rupidoga.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRUPIDOGA(JAXBElement<String> value) {
        this.rupidoga = value;
    }

    /**
     * Recupera il valore della proprietà sedidoga.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSEDIDOGA() {
        return sedidoga;
    }

    /**
     * Imposta il valore della proprietà sedidoga.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSEDIDOGA(JAXBElement<String> value) {
        this.sedidoga = value;
    }

    /**
     * Recupera il valore della proprietà stoidoga.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTOIDOGA() {
        return stoidoga;
    }

    /**
     * Imposta il valore della proprietà stoidoga.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTOIDOGA(JAXBElement<String> value) {
        this.stoidoga = value;
    }

}
