
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PER_Posizioni_20091229 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the descrizionefro property.
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
     * Sets the value of the descrizionefro property.
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
     * Gets the value of the descrizionepor property.
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
     * Sets the value of the descrizionepor property.
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
     * Gets the value of the descrizioneppe property.
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
     * Sets the value of the descrizioneppe property.
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
     * Gets the value of the descrizionepro property.
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
     * Sets the value of the descrizionepro property.
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
     * Gets the value of the descrizioneruo property.
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
     * Sets the value of the descrizioneruo property.
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
     * Gets the value of the descrizionerup property.
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
     * Sets the value of the descrizionerup property.
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
     * Gets the value of the descrizionesed property.
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
     * Sets the value of the descrizionesed property.
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
     * Gets the value of the descrizionesto property.
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
     * Sets the value of the descrizionesto property.
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
     * Gets the value of the finepor property.
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
     * Sets the value of the finepor property.
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
     * Gets the value of the fineppe property.
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
     * Sets the value of the fineppe property.
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
     * Gets the value of the finesog property.
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
     * Sets the value of the finesog property.
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
     * Gets the value of the froidatr property.
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
     * Sets the value of the froidatr property.
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
     * Gets the value of the iniziopor property.
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
     * Sets the value of the iniziopor property.
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
     * Gets the value of the inizioppe property.
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
     * Sets the value of the inizioppe property.
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
     * Gets the value of the iniziosog property.
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
     * Sets the value of the iniziosog property.
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
     * Gets the value of the lingua property.
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
     * Sets the value of the lingua property.
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
     * Gets the value of the peridoga property.
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
     * Sets the value of the peridoga property.
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
     * Gets the value of the poridoga property.
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
     * Sets the value of the poridoga property.
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
     * Gets the value of the ppeidoga property.
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
     * Sets the value of the ppeidoga property.
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
     * Gets the value of the proidoga property.
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
     * Sets the value of the proidoga property.
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
     * Gets the value of the ruoidoga property.
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
     * Sets the value of the ruoidoga property.
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
     * Gets the value of the rupidoga property.
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
     * Sets the value of the rupidoga property.
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
     * Gets the value of the sedidoga property.
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
     * Sets the value of the sedidoga property.
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
     * Gets the value of the stoidoga property.
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
     * Sets the value of the stoidoga property.
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
