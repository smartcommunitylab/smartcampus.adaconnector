
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per LIBRETTO_STUDENTE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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

    @XmlElementRef(name = "AA_OFFERTA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> aaofferta;
    @XmlElementRef(name = "COD_ESSE3_ATTIVITA_DIDATTICA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> codesse3ATTIVITADIDATTICA;
    @XmlElementRef(name = "DATA_SUPERAMENTO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> datasuperamento;
    @XmlElementRef(name = "DESCRIZIONE_ATTIVITA_DIDATTICA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> descrizioneattivitadidattica;
    @XmlElementRef(name = "ID_ADA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> idada;
    @XmlElementRef(name = "ID_ESSE3_ATTIVITA_DIDATTICA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> idesse3ATTIVITADIDATTICA;
    @XmlElementRef(name = "ID_GIADA_PERSONA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> idgiadapersona;
    @XmlElementRef(name = "LODE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> lode;
    @XmlElementRef(name = "MODALITA_VALUTAZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> modalitavalutazione;
    @XmlElementRef(name = "NO_MEDIA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> nomedia;
    @XmlElementRef(name = "PESO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> peso;
    @XmlElementRef(name = "STATO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> stato;
    @XmlElementRef(name = "TIPO_GIUDIZIO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> tipogiudizio;
    @XmlElementRef(name = "VOTO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> voto;

    /**
     * Recupera il valore della proprietà aaofferta.
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
     * Imposta il valore della proprietà aaofferta.
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
     * Recupera il valore della proprietà codesse3ATTIVITADIDATTICA.
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
     * Imposta il valore della proprietà codesse3ATTIVITADIDATTICA.
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
     * Recupera il valore della proprietà datasuperamento.
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
     * Imposta il valore della proprietà datasuperamento.
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
     * Recupera il valore della proprietà descrizioneattivitadidattica.
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
     * Imposta il valore della proprietà descrizioneattivitadidattica.
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
     * Recupera il valore della proprietà idada.
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
     * Imposta il valore della proprietà idada.
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
     * Recupera il valore della proprietà idesse3ATTIVITADIDATTICA.
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
     * Imposta il valore della proprietà idesse3ATTIVITADIDATTICA.
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
     * Recupera il valore della proprietà idgiadapersona.
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
     * Imposta il valore della proprietà idgiadapersona.
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
     * Recupera il valore della proprietà lode.
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
     * Imposta il valore della proprietà lode.
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
     * Recupera il valore della proprietà modalitavalutazione.
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
     * Imposta il valore della proprietà modalitavalutazione.
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
     * Recupera il valore della proprietà nomedia.
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
     * Imposta il valore della proprietà nomedia.
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
     * Recupera il valore della proprietà peso.
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
     * Imposta il valore della proprietà peso.
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
     * Recupera il valore della proprietà stato.
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
     * Imposta il valore della proprietà stato.
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
     * Recupera il valore della proprietà tipogiudizio.
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
     * Imposta il valore della proprietà tipogiudizio.
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
     * Recupera il valore della proprietà voto.
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
     * Imposta il valore della proprietà voto.
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
