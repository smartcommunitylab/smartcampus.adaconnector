
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ULTIMA_CARRIERA_STUDENTE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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

    @XmlElementRef(name = "ANNO_CORSO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> annocorso;
    @XmlElementRef(name = "ANNO_ISCRIZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> annoiscrizione;
    @XmlElementRef(name = "ATTESA_DI_LAUREA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> attesadilaurea;
    @XmlElementRef(name = "CICLO_DOTTORATO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> ciclodottorato;
    @XmlElementRef(name = "COD_ESSE3_CDS", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> codesse3CDS;
    @XmlElementRef(name = "COD_ESSE3_MOTIVO_STATO_CARRIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> codesse3MOTIVOSTATOCARRIERA;
    @XmlElementRef(name = "COD_ESSE3_STATO_CARRIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> codesse3STATOCARRIERA;
    @XmlElementRef(name = "CREDITI", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Double> crediti;
    @XmlElementRef(name = "CREDITI_IN_PIANO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Double> creditiinpiano;
    @XmlElementRef(name = "DATA_CHIUSURA_CARRIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> datachiusuracarriera;
    @XmlElementRef(name = "DESCRIZIONE_CDS", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> descrizionecds;
    @XmlElementRef(name = "DESCRIZIONE_MOTIVO_STATO_CARRIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> descrizionemotivostatocarriera;
    @XmlElementRef(name = "DESCRIZIONE_STATO_CARRIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> descrizionestatocarriera;
    @XmlElementRef(name = "ESSE3_MATRICOLA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> esse3MATRICOLA;
    @XmlElementRef(name = "ID_ADA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> idada;
    @XmlElementRef(name = "ID_GIADA_PERSONA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> idgiadapersona;
    @XmlElementRef(name = "MEDIA_ARITMETICA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Double> mediaaritmetica;
    @XmlElementRef(name = "MEDIA_PONDERATA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Double> mediaponderata;
    @XmlElementRef(name = "NUMERO_ESAMI_PIANO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> numeroesamipiano;
    @XmlElementRef(name = "NUMERO_ESAMI_SUPERATI", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> numeroesamisuperati;

    /**
     * Recupera il valore della proprietà annocorso.
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
     * Imposta il valore della proprietà annocorso.
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
     * Recupera il valore della proprietà annoiscrizione.
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
     * Imposta il valore della proprietà annoiscrizione.
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
     * Recupera il valore della proprietà attesadilaurea.
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
     * Imposta il valore della proprietà attesadilaurea.
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
     * Recupera il valore della proprietà ciclodottorato.
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
     * Imposta il valore della proprietà ciclodottorato.
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
     * Recupera il valore della proprietà codesse3CDS.
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
     * Imposta il valore della proprietà codesse3CDS.
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
     * Recupera il valore della proprietà codesse3MOTIVOSTATOCARRIERA.
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
     * Imposta il valore della proprietà codesse3MOTIVOSTATOCARRIERA.
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
     * Recupera il valore della proprietà codesse3STATOCARRIERA.
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
     * Imposta il valore della proprietà codesse3STATOCARRIERA.
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
     * Recupera il valore della proprietà crediti.
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
     * Imposta il valore della proprietà crediti.
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
     * Recupera il valore della proprietà creditiinpiano.
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
     * Imposta il valore della proprietà creditiinpiano.
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
     * Recupera il valore della proprietà datachiusuracarriera.
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
     * Imposta il valore della proprietà datachiusuracarriera.
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
     * Recupera il valore della proprietà descrizionecds.
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
     * Imposta il valore della proprietà descrizionecds.
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
     * Recupera il valore della proprietà descrizionemotivostatocarriera.
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
     * Imposta il valore della proprietà descrizionemotivostatocarriera.
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
     * Recupera il valore della proprietà descrizionestatocarriera.
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
     * Imposta il valore della proprietà descrizionestatocarriera.
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
     * Recupera il valore della proprietà esse3MATRICOLA.
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
     * Imposta il valore della proprietà esse3MATRICOLA.
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
     * Recupera il valore della proprietà mediaaritmetica.
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
     * Imposta il valore della proprietà mediaaritmetica.
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
     * Recupera il valore della proprietà mediaponderata.
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
     * Imposta il valore della proprietà mediaponderata.
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
     * Recupera il valore della proprietà numeroesamipiano.
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
     * Imposta il valore della proprietà numeroesamipiano.
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
     * Recupera il valore della proprietà numeroesamisuperati.
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
     * Imposta il valore della proprietà numeroesamisuperati.
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
