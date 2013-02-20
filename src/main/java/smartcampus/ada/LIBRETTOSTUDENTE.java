
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LIBRETTO_STUDENTE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIBRETTO_STUDENTE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AA_OFFERTA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="COD_ESSE3_ATTIVITA_DIDATTICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_SUPERAMENTO" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_ATTIVITA_DIDATTICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ESSE3_ATTIVITA_DIDATTICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_GIADA_PERSONA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LODE" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MODALITA_VALUTAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NO_MEDIA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PESO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="STATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO_GIUDIZIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VOTO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIBRETTO_STUDENTE", propOrder = {
    "aaofferta",
    "codesse3ATTIVITADIDATTICA",
    "datasuperamento",
    "descrizioneattivitadidattica",
    "idada",
    "idesse3ATTIVITADIDATTICA",
    "idgiadapersona",
    "lode",
    "modalitavalutazione",
    "nomedia",
    "peso",
    "stato",
    "tipogiudizio",
    "voto"
})
public class LIBRETTOSTUDENTE {

    @XmlElementRef(name = "AA_OFFERTA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> aaofferta;
    @XmlElementRef(name = "COD_ESSE3_ATTIVITA_DIDATTICA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codesse3ATTIVITADIDATTICA;
    @XmlElementRef(name = "DATA_SUPERAMENTO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datasuperamento;
    @XmlElementRef(name = "DESCRIZIONE_ATTIVITA_DIDATTICA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizioneattivitadidattica;
    @XmlElementRef(name = "ID_ADA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idada;
    @XmlElementRef(name = "ID_ESSE3_ATTIVITA_DIDATTICA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idesse3ATTIVITADIDATTICA;
    @XmlElementRef(name = "ID_GIADA_PERSONA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idgiadapersona;
    @XmlElementRef(name = "LODE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lode;
    @XmlElementRef(name = "MODALITA_VALUTAZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modalitavalutazione;
    @XmlElementRef(name = "NO_MEDIA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> nomedia;
    @XmlElementRef(name = "PESO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> peso;
    @XmlElementRef(name = "STATO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stato;
    @XmlElementRef(name = "TIPO_GIUDIZIO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipogiudizio;
    @XmlElementRef(name = "VOTO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> voto;

    /**
     * Gets the value of the aaofferta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAAOFFERTA() {
        return aaofferta;
    }

    /**
     * Sets the value of the aaofferta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAAOFFERTA(JAXBElement<Long> value) {
        this.aaofferta = value;
    }

    /**
     * Gets the value of the codesse3ATTIVITADIDATTICA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCODESSE3ATTIVITADIDATTICA() {
        return codesse3ATTIVITADIDATTICA;
    }

    /**
     * Sets the value of the codesse3ATTIVITADIDATTICA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCODESSE3ATTIVITADIDATTICA(JAXBElement<String> value) {
        this.codesse3ATTIVITADIDATTICA = value;
    }

    /**
     * Gets the value of the datasuperamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDATASUPERAMENTO() {
        return datasuperamento;
    }

    /**
     * Sets the value of the datasuperamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDATASUPERAMENTO(JAXBElement<XMLGregorianCalendar> value) {
        this.datasuperamento = value;
    }

    /**
     * Gets the value of the descrizioneattivitadidattica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONEATTIVITADIDATTICA() {
        return descrizioneattivitadidattica;
    }

    /**
     * Sets the value of the descrizioneattivitadidattica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONEATTIVITADIDATTICA(JAXBElement<String> value) {
        this.descrizioneattivitadidattica = value;
    }

    /**
     * Gets the value of the idada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDADA() {
        return idada;
    }

    /**
     * Sets the value of the idada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDADA(JAXBElement<String> value) {
        this.idada = value;
    }

    /**
     * Gets the value of the idesse3ATTIVITADIDATTICA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDESSE3ATTIVITADIDATTICA() {
        return idesse3ATTIVITADIDATTICA;
    }

    /**
     * Sets the value of the idesse3ATTIVITADIDATTICA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDESSE3ATTIVITADIDATTICA(JAXBElement<String> value) {
        this.idesse3ATTIVITADIDATTICA = value;
    }

    /**
     * Gets the value of the idgiadapersona property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIDGIADAPERSONA() {
        return idgiadapersona;
    }

    /**
     * Sets the value of the idgiadapersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIDGIADAPERSONA(JAXBElement<Long> value) {
        this.idgiadapersona = value;
    }

    /**
     * Gets the value of the lode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLODE() {
        return lode;
    }

    /**
     * Sets the value of the lode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLODE(JAXBElement<Long> value) {
        this.lode = value;
    }

    /**
     * Gets the value of the modalitavalutazione property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMODALITAVALUTAZIONE() {
        return modalitavalutazione;
    }

    /**
     * Sets the value of the modalitavalutazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMODALITAVALUTAZIONE(JAXBElement<String> value) {
        this.modalitavalutazione = value;
    }

    /**
     * Gets the value of the nomedia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNOMEDIA() {
        return nomedia;
    }

    /**
     * Sets the value of the nomedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNOMEDIA(JAXBElement<Long> value) {
        this.nomedia = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPESO() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPESO(JAXBElement<Long> value) {
        this.peso = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATO() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATO(JAXBElement<String> value) {
        this.stato = value;
    }

    /**
     * Gets the value of the tipogiudizio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTIPOGIUDIZIO() {
        return tipogiudizio;
    }

    /**
     * Sets the value of the tipogiudizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTIPOGIUDIZIO(JAXBElement<String> value) {
        this.tipogiudizio = value;
    }

    /**
     * Gets the value of the voto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVOTO() {
        return voto;
    }

    /**
     * Sets the value of the voto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVOTO(JAXBElement<Long> value) {
        this.voto = value;
    }

}
