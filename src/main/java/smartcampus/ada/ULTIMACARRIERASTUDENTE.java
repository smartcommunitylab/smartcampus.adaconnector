
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ULTIMA_CARRIERA_STUDENTE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ULTIMA_CARRIERA_STUDENTE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ANNO_CORSO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ANNO_ISCRIZIONE" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ATTESA_DI_LAUREA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CICLO_DOTTORATO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="COD_ESSE3_CDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_ESSE3_MOTIVO_STATO_CARRIERA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_ESSE3_STATO_CARRIERA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDITI" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CREDITI_IN_PIANO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DATA_CHIUSURA_CARRIERA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_CDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_MOTIVO_STATO_CARRIERA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_STATO_CARRIERA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESSE3_MATRICOLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_GIADA_PERSONA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MEDIA_ARITMETICA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MEDIA_PONDERATA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NUMERO_ESAMI_PIANO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NUMERO_ESAMI_SUPERATI" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ULTIMA_CARRIERA_STUDENTE", propOrder = {
    "annocorso",
    "annoiscrizione",
    "attesadilaurea",
    "ciclodottorato",
    "codesse3CDS",
    "codesse3MOTIVOSTATOCARRIERA",
    "codesse3STATOCARRIERA",
    "crediti",
    "creditiinpiano",
    "datachiusuracarriera",
    "descrizionecds",
    "descrizionemotivostatocarriera",
    "descrizionestatocarriera",
    "esse3MATRICOLA",
    "idada",
    "idgiadapersona",
    "mediaaritmetica",
    "mediaponderata",
    "numeroesamipiano",
    "numeroesamisuperati"
})
public class ULTIMACARRIERASTUDENTE {

    @XmlElementRef(name = "ANNO_CORSO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> annocorso;
    @XmlElementRef(name = "ANNO_ISCRIZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> annoiscrizione;
    @XmlElementRef(name = "ATTESA_DI_LAUREA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> attesadilaurea;
    @XmlElementRef(name = "CICLO_DOTTORATO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ciclodottorato;
    @XmlElementRef(name = "COD_ESSE3_CDS", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codesse3CDS;
    @XmlElementRef(name = "COD_ESSE3_MOTIVO_STATO_CARRIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codesse3MOTIVOSTATOCARRIERA;
    @XmlElementRef(name = "COD_ESSE3_STATO_CARRIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codesse3STATOCARRIERA;
    @XmlElementRef(name = "CREDITI", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> crediti;
    @XmlElementRef(name = "CREDITI_IN_PIANO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> creditiinpiano;
    @XmlElementRef(name = "DATA_CHIUSURA_CARRIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datachiusuracarriera;
    @XmlElementRef(name = "DESCRIZIONE_CDS", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionecds;
    @XmlElementRef(name = "DESCRIZIONE_MOTIVO_STATO_CARRIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionemotivostatocarriera;
    @XmlElementRef(name = "DESCRIZIONE_STATO_CARRIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionestatocarriera;
    @XmlElementRef(name = "ESSE3_MATRICOLA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> esse3MATRICOLA;
    @XmlElementRef(name = "ID_ADA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idada;
    @XmlElementRef(name = "ID_GIADA_PERSONA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idgiadapersona;
    @XmlElementRef(name = "MEDIA_ARITMETICA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mediaaritmetica;
    @XmlElementRef(name = "MEDIA_PONDERATA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mediaponderata;
    @XmlElementRef(name = "NUMERO_ESAMI_PIANO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numeroesamipiano;
    @XmlElementRef(name = "NUMERO_ESAMI_SUPERATI", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numeroesamisuperati;

    /**
     * Gets the value of the annocorso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getANNOCORSO() {
        return annocorso;
    }

    /**
     * Sets the value of the annocorso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setANNOCORSO(JAXBElement<Long> value) {
        this.annocorso = value;
    }

    /**
     * Gets the value of the annoiscrizione property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getANNOISCRIZIONE() {
        return annoiscrizione;
    }

    /**
     * Sets the value of the annoiscrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setANNOISCRIZIONE(JAXBElement<Long> value) {
        this.annoiscrizione = value;
    }

    /**
     * Gets the value of the attesadilaurea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getATTESADILAUREA() {
        return attesadilaurea;
    }

    /**
     * Sets the value of the attesadilaurea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setATTESADILAUREA(JAXBElement<Long> value) {
        this.attesadilaurea = value;
    }

    /**
     * Gets the value of the ciclodottorato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCICLODOTTORATO() {
        return ciclodottorato;
    }

    /**
     * Sets the value of the ciclodottorato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCICLODOTTORATO(JAXBElement<Long> value) {
        this.ciclodottorato = value;
    }

    /**
     * Gets the value of the codesse3CDS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCODESSE3CDS() {
        return codesse3CDS;
    }

    /**
     * Sets the value of the codesse3CDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCODESSE3CDS(JAXBElement<String> value) {
        this.codesse3CDS = value;
    }

    /**
     * Gets the value of the codesse3MOTIVOSTATOCARRIERA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCODESSE3MOTIVOSTATOCARRIERA() {
        return codesse3MOTIVOSTATOCARRIERA;
    }

    /**
     * Sets the value of the codesse3MOTIVOSTATOCARRIERA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCODESSE3MOTIVOSTATOCARRIERA(JAXBElement<String> value) {
        this.codesse3MOTIVOSTATOCARRIERA = value;
    }

    /**
     * Gets the value of the codesse3STATOCARRIERA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCODESSE3STATOCARRIERA() {
        return codesse3STATOCARRIERA;
    }

    /**
     * Sets the value of the codesse3STATOCARRIERA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCODESSE3STATOCARRIERA(JAXBElement<String> value) {
        this.codesse3STATOCARRIERA = value;
    }

    /**
     * Gets the value of the crediti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCREDITI() {
        return crediti;
    }

    /**
     * Sets the value of the crediti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCREDITI(JAXBElement<Double> value) {
        this.crediti = value;
    }

    /**
     * Gets the value of the creditiinpiano property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCREDITIINPIANO() {
        return creditiinpiano;
    }

    /**
     * Sets the value of the creditiinpiano property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCREDITIINPIANO(JAXBElement<Double> value) {
        this.creditiinpiano = value;
    }

    /**
     * Gets the value of the datachiusuracarriera property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDATACHIUSURACARRIERA() {
        return datachiusuracarriera;
    }

    /**
     * Sets the value of the datachiusuracarriera property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDATACHIUSURACARRIERA(JAXBElement<XMLGregorianCalendar> value) {
        this.datachiusuracarriera = value;
    }

    /**
     * Gets the value of the descrizionecds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONECDS() {
        return descrizionecds;
    }

    /**
     * Sets the value of the descrizionecds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONECDS(JAXBElement<String> value) {
        this.descrizionecds = value;
    }

    /**
     * Gets the value of the descrizionemotivostatocarriera property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONEMOTIVOSTATOCARRIERA() {
        return descrizionemotivostatocarriera;
    }

    /**
     * Sets the value of the descrizionemotivostatocarriera property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONEMOTIVOSTATOCARRIERA(JAXBElement<String> value) {
        this.descrizionemotivostatocarriera = value;
    }

    /**
     * Gets the value of the descrizionestatocarriera property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONESTATOCARRIERA() {
        return descrizionestatocarriera;
    }

    /**
     * Sets the value of the descrizionestatocarriera property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONESTATOCARRIERA(JAXBElement<String> value) {
        this.descrizionestatocarriera = value;
    }

    /**
     * Gets the value of the esse3MATRICOLA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getESSE3MATRICOLA() {
        return esse3MATRICOLA;
    }

    /**
     * Sets the value of the esse3MATRICOLA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setESSE3MATRICOLA(JAXBElement<String> value) {
        this.esse3MATRICOLA = value;
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
     * Gets the value of the mediaaritmetica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMEDIAARITMETICA() {
        return mediaaritmetica;
    }

    /**
     * Sets the value of the mediaaritmetica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMEDIAARITMETICA(JAXBElement<Double> value) {
        this.mediaaritmetica = value;
    }

    /**
     * Gets the value of the mediaponderata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMEDIAPONDERATA() {
        return mediaponderata;
    }

    /**
     * Sets the value of the mediaponderata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMEDIAPONDERATA(JAXBElement<Double> value) {
        this.mediaponderata = value;
    }

    /**
     * Gets the value of the numeroesamipiano property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNUMEROESAMIPIANO() {
        return numeroesamipiano;
    }

    /**
     * Sets the value of the numeroesamipiano property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNUMEROESAMIPIANO(JAXBElement<Long> value) {
        this.numeroesamipiano = value;
    }

    /**
     * Gets the value of the numeroesamisuperati property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNUMEROESAMISUPERATI() {
        return numeroesamisuperati;
    }

    /**
     * Sets the value of the numeroesamisuperati property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNUMEROESAMISUPERATI(JAXBElement<Long> value) {
        this.numeroesamisuperati = value;
    }

}
