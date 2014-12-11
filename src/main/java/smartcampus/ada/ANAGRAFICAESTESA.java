
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ANAGRAFICA_ESTESA complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ANAGRAFICA_ESTESA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ANAGRAFICA_VALIDA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CELLULARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_CITTADINANZA_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_CITTADINANZA_IT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_CAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_CITTA_STRANIERA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_COMUNE_DESCRIZIONE_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_COMUNE_DESCRIZIONE_IT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_FRAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_ID_ADA_COMUNE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_ID_ADA_NAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_NAZIONE_DESCRIZIONE_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_NAZIONE_DESCRIZIONE_IT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_NUMERO_CIVICO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_PREFISSO_INTERNAZIONALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_PRESSO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_PROVINCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_TELEFONO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO_VIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ADA_CITTADINANZA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_GIADA_PERSONA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_CAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_CITTA_STRANIERA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_COMUNE_DESCRIZIONE_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_COMUNE_DESCRIZIONE_IT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_FRAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_ID_ADA_COMUNE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_ID_ADA_NAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_NAZIONE_DESCRIZIONE_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_NAZIONE_DESCRIZIONE_IT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_NUMERO_CIVICO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_PREFISSO_INTERNAZIONALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_PROVINCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_TELEFONO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENZA_VIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANAGRAFICA_ESTESA", propOrder = {
    "anagraficavalida",
    "cellulare",
    "descrizionecittadinanzaen",
    "descrizionecittadinanzait",
    "domiciliocap",
    "domiciliocittastraniera",
    "domiciliocomunedescrizioneen",
    "domiciliocomunedescrizioneit",
    "domiciliofrazione",
    "domicilioidadacomune",
    "domicilioidadanazione",
    "domicilionazionedescrizioneen",
    "domicilionazionedescrizioneit",
    "domicilionumerocivico",
    "domicilioprefissointernazionale",
    "domiciliopresso",
    "domicilioprovincia",
    "domiciliotelefono",
    "domiciliovia",
    "fax",
    "idada",
    "idadacittadinanza",
    "idgiadapersona",
    "residenzacap",
    "residenzacittastraniera",
    "residenzacomunedescrizioneen",
    "residenzacomunedescrizioneit",
    "residenzafrazione",
    "residenzaidadacomune",
    "residenzaidadanazione",
    "residenzanazionedescrizioneen",
    "residenzanazionedescrizioneit",
    "residenzanumerocivico",
    "residenzaprefissointernazionale",
    "residenzaprovincia",
    "residenzatelefono",
    "residenzavia"
})
public class ANAGRAFICAESTESA {

    @XmlElementRef(name = "ANAGRAFICA_VALIDA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Boolean> anagraficavalida;
    @XmlElementRef(name = "CELLULARE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> cellulare;
    @XmlElementRef(name = "DESCRIZIONE_CITTADINANZA_EN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> descrizionecittadinanzaen;
    @XmlElementRef(name = "DESCRIZIONE_CITTADINANZA_IT", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> descrizionecittadinanzait;
    @XmlElementRef(name = "DOMICILIO_CAP", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domiciliocap;
    @XmlElementRef(name = "DOMICILIO_CITTA_STRANIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domiciliocittastraniera;
    @XmlElementRef(name = "DOMICILIO_COMUNE_DESCRIZIONE_EN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domiciliocomunedescrizioneen;
    @XmlElementRef(name = "DOMICILIO_COMUNE_DESCRIZIONE_IT", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domiciliocomunedescrizioneit;
    @XmlElementRef(name = "DOMICILIO_FRAZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domiciliofrazione;
    @XmlElementRef(name = "DOMICILIO_ID_ADA_COMUNE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domicilioidadacomune;
    @XmlElementRef(name = "DOMICILIO_ID_ADA_NAZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domicilioidadanazione;
    @XmlElementRef(name = "DOMICILIO_NAZIONE_DESCRIZIONE_EN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domicilionazionedescrizioneen;
    @XmlElementRef(name = "DOMICILIO_NAZIONE_DESCRIZIONE_IT", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domicilionazionedescrizioneit;
    @XmlElementRef(name = "DOMICILIO_NUMERO_CIVICO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domicilionumerocivico;
    @XmlElementRef(name = "DOMICILIO_PREFISSO_INTERNAZIONALE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domicilioprefissointernazionale;
    @XmlElementRef(name = "DOMICILIO_PRESSO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domiciliopresso;
    @XmlElementRef(name = "DOMICILIO_PROVINCIA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domicilioprovincia;
    @XmlElementRef(name = "DOMICILIO_TELEFONO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domiciliotelefono;
    @XmlElementRef(name = "DOMICILIO_VIA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> domiciliovia;
    @XmlElementRef(name = "FAX", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> fax;
    @XmlElementRef(name = "ID_ADA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> idada;
    @XmlElementRef(name = "ID_ADA_CITTADINANZA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> idadacittadinanza;
    @XmlElementRef(name = "ID_GIADA_PERSONA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> idgiadapersona;
    @XmlElementRef(name = "RESIDENZA_CAP", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzacap;
    @XmlElementRef(name = "RESIDENZA_CITTA_STRANIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzacittastraniera;
    @XmlElementRef(name = "RESIDENZA_COMUNE_DESCRIZIONE_EN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzacomunedescrizioneen;
    @XmlElementRef(name = "RESIDENZA_COMUNE_DESCRIZIONE_IT", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzacomunedescrizioneit;
    @XmlElementRef(name = "RESIDENZA_FRAZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzafrazione;
    @XmlElementRef(name = "RESIDENZA_ID_ADA_COMUNE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzaidadacomune;
    @XmlElementRef(name = "RESIDENZA_ID_ADA_NAZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzaidadanazione;
    @XmlElementRef(name = "RESIDENZA_NAZIONE_DESCRIZIONE_EN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzanazionedescrizioneen;
    @XmlElementRef(name = "RESIDENZA_NAZIONE_DESCRIZIONE_IT", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzanazionedescrizioneit;
    @XmlElementRef(name = "RESIDENZA_NUMERO_CIVICO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzanumerocivico;
    @XmlElementRef(name = "RESIDENZA_PREFISSO_INTERNAZIONALE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzaprefissointernazionale;
    @XmlElementRef(name = "RESIDENZA_PROVINCIA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzaprovincia;
    @XmlElementRef(name = "RESIDENZA_TELEFONO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzatelefono;
    @XmlElementRef(name = "RESIDENZA_VIA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> residenzavia;

    /**
     * Recupera il valore della proprietà anagraficavalida.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getANAGRAFICAVALIDA() {
        return anagraficavalida;
    }

    /**
     * Imposta il valore della proprietà anagraficavalida.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setANAGRAFICAVALIDA(JAXBElement<Boolean> value) {
        this.anagraficavalida = value;
    }

    /**
     * Recupera il valore della proprietà cellulare.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCELLULARE() {
        return cellulare;
    }

    /**
     * Imposta il valore della proprietà cellulare.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCELLULARE(JAXBElement<String> value) {
        this.cellulare = value;
    }

    /**
     * Recupera il valore della proprietà descrizionecittadinanzaen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONECITTADINANZAEN() {
        return descrizionecittadinanzaen;
    }

    /**
     * Imposta il valore della proprietà descrizionecittadinanzaen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONECITTADINANZAEN(JAXBElement<String> value) {
        this.descrizionecittadinanzaen = value;
    }

    /**
     * Recupera il valore della proprietà descrizionecittadinanzait.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIZIONECITTADINANZAIT() {
        return descrizionecittadinanzait;
    }

    /**
     * Imposta il valore della proprietà descrizionecittadinanzait.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIZIONECITTADINANZAIT(JAXBElement<String> value) {
        this.descrizionecittadinanzait = value;
    }

    /**
     * Recupera il valore della proprietà domiciliocap.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOCAP() {
        return domiciliocap;
    }

    /**
     * Imposta il valore della proprietà domiciliocap.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOCAP(JAXBElement<String> value) {
        this.domiciliocap = value;
    }

    /**
     * Recupera il valore della proprietà domiciliocittastraniera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOCITTASTRANIERA() {
        return domiciliocittastraniera;
    }

    /**
     * Imposta il valore della proprietà domiciliocittastraniera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOCITTASTRANIERA(JAXBElement<String> value) {
        this.domiciliocittastraniera = value;
    }

    /**
     * Recupera il valore della proprietà domiciliocomunedescrizioneen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOCOMUNEDESCRIZIONEEN() {
        return domiciliocomunedescrizioneen;
    }

    /**
     * Imposta il valore della proprietà domiciliocomunedescrizioneen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOCOMUNEDESCRIZIONEEN(JAXBElement<String> value) {
        this.domiciliocomunedescrizioneen = value;
    }

    /**
     * Recupera il valore della proprietà domiciliocomunedescrizioneit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOCOMUNEDESCRIZIONEIT() {
        return domiciliocomunedescrizioneit;
    }

    /**
     * Imposta il valore della proprietà domiciliocomunedescrizioneit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOCOMUNEDESCRIZIONEIT(JAXBElement<String> value) {
        this.domiciliocomunedescrizioneit = value;
    }

    /**
     * Recupera il valore della proprietà domiciliofrazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOFRAZIONE() {
        return domiciliofrazione;
    }

    /**
     * Imposta il valore della proprietà domiciliofrazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOFRAZIONE(JAXBElement<String> value) {
        this.domiciliofrazione = value;
    }

    /**
     * Recupera il valore della proprietà domicilioidadacomune.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOIDADACOMUNE() {
        return domicilioidadacomune;
    }

    /**
     * Imposta il valore della proprietà domicilioidadacomune.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOIDADACOMUNE(JAXBElement<String> value) {
        this.domicilioidadacomune = value;
    }

    /**
     * Recupera il valore della proprietà domicilioidadanazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOIDADANAZIONE() {
        return domicilioidadanazione;
    }

    /**
     * Imposta il valore della proprietà domicilioidadanazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOIDADANAZIONE(JAXBElement<String> value) {
        this.domicilioidadanazione = value;
    }

    /**
     * Recupera il valore della proprietà domicilionazionedescrizioneen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIONAZIONEDESCRIZIONEEN() {
        return domicilionazionedescrizioneen;
    }

    /**
     * Imposta il valore della proprietà domicilionazionedescrizioneen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIONAZIONEDESCRIZIONEEN(JAXBElement<String> value) {
        this.domicilionazionedescrizioneen = value;
    }

    /**
     * Recupera il valore della proprietà domicilionazionedescrizioneit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIONAZIONEDESCRIZIONEIT() {
        return domicilionazionedescrizioneit;
    }

    /**
     * Imposta il valore della proprietà domicilionazionedescrizioneit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIONAZIONEDESCRIZIONEIT(JAXBElement<String> value) {
        this.domicilionazionedescrizioneit = value;
    }

    /**
     * Recupera il valore della proprietà domicilionumerocivico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIONUMEROCIVICO() {
        return domicilionumerocivico;
    }

    /**
     * Imposta il valore della proprietà domicilionumerocivico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIONUMEROCIVICO(JAXBElement<String> value) {
        this.domicilionumerocivico = value;
    }

    /**
     * Recupera il valore della proprietà domicilioprefissointernazionale.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOPREFISSOINTERNAZIONALE() {
        return domicilioprefissointernazionale;
    }

    /**
     * Imposta il valore della proprietà domicilioprefissointernazionale.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOPREFISSOINTERNAZIONALE(JAXBElement<String> value) {
        this.domicilioprefissointernazionale = value;
    }

    /**
     * Recupera il valore della proprietà domiciliopresso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOPRESSO() {
        return domiciliopresso;
    }

    /**
     * Imposta il valore della proprietà domiciliopresso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOPRESSO(JAXBElement<String> value) {
        this.domiciliopresso = value;
    }

    /**
     * Recupera il valore della proprietà domicilioprovincia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOPROVINCIA() {
        return domicilioprovincia;
    }

    /**
     * Imposta il valore della proprietà domicilioprovincia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOPROVINCIA(JAXBElement<String> value) {
        this.domicilioprovincia = value;
    }

    /**
     * Recupera il valore della proprietà domiciliotelefono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOTELEFONO() {
        return domiciliotelefono;
    }

    /**
     * Imposta il valore della proprietà domiciliotelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOTELEFONO(JAXBElement<String> value) {
        this.domiciliotelefono = value;
    }

    /**
     * Recupera il valore della proprietà domiciliovia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMICILIOVIA() {
        return domiciliovia;
    }

    /**
     * Imposta il valore della proprietà domiciliovia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMICILIOVIA(JAXBElement<String> value) {
        this.domiciliovia = value;
    }

    /**
     * Recupera il valore della proprietà fax.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFAX() {
        return fax;
    }

    /**
     * Imposta il valore della proprietà fax.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFAX(JAXBElement<String> value) {
        this.fax = value;
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
     * Recupera il valore della proprietà idadacittadinanza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDADACITTADINANZA() {
        return idadacittadinanza;
    }

    /**
     * Imposta il valore della proprietà idadacittadinanza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDADACITTADINANZA(JAXBElement<String> value) {
        this.idadacittadinanza = value;
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
     * Recupera il valore della proprietà residenzacap.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZACAP() {
        return residenzacap;
    }

    /**
     * Imposta il valore della proprietà residenzacap.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZACAP(JAXBElement<String> value) {
        this.residenzacap = value;
    }

    /**
     * Recupera il valore della proprietà residenzacittastraniera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZACITTASTRANIERA() {
        return residenzacittastraniera;
    }

    /**
     * Imposta il valore della proprietà residenzacittastraniera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZACITTASTRANIERA(JAXBElement<String> value) {
        this.residenzacittastraniera = value;
    }

    /**
     * Recupera il valore della proprietà residenzacomunedescrizioneen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZACOMUNEDESCRIZIONEEN() {
        return residenzacomunedescrizioneen;
    }

    /**
     * Imposta il valore della proprietà residenzacomunedescrizioneen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZACOMUNEDESCRIZIONEEN(JAXBElement<String> value) {
        this.residenzacomunedescrizioneen = value;
    }

    /**
     * Recupera il valore della proprietà residenzacomunedescrizioneit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZACOMUNEDESCRIZIONEIT() {
        return residenzacomunedescrizioneit;
    }

    /**
     * Imposta il valore della proprietà residenzacomunedescrizioneit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZACOMUNEDESCRIZIONEIT(JAXBElement<String> value) {
        this.residenzacomunedescrizioneit = value;
    }

    /**
     * Recupera il valore della proprietà residenzafrazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZAFRAZIONE() {
        return residenzafrazione;
    }

    /**
     * Imposta il valore della proprietà residenzafrazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZAFRAZIONE(JAXBElement<String> value) {
        this.residenzafrazione = value;
    }

    /**
     * Recupera il valore della proprietà residenzaidadacomune.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZAIDADACOMUNE() {
        return residenzaidadacomune;
    }

    /**
     * Imposta il valore della proprietà residenzaidadacomune.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZAIDADACOMUNE(JAXBElement<String> value) {
        this.residenzaidadacomune = value;
    }

    /**
     * Recupera il valore della proprietà residenzaidadanazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZAIDADANAZIONE() {
        return residenzaidadanazione;
    }

    /**
     * Imposta il valore della proprietà residenzaidadanazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZAIDADANAZIONE(JAXBElement<String> value) {
        this.residenzaidadanazione = value;
    }

    /**
     * Recupera il valore della proprietà residenzanazionedescrizioneen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZANAZIONEDESCRIZIONEEN() {
        return residenzanazionedescrizioneen;
    }

    /**
     * Imposta il valore della proprietà residenzanazionedescrizioneen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZANAZIONEDESCRIZIONEEN(JAXBElement<String> value) {
        this.residenzanazionedescrizioneen = value;
    }

    /**
     * Recupera il valore della proprietà residenzanazionedescrizioneit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZANAZIONEDESCRIZIONEIT() {
        return residenzanazionedescrizioneit;
    }

    /**
     * Imposta il valore della proprietà residenzanazionedescrizioneit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZANAZIONEDESCRIZIONEIT(JAXBElement<String> value) {
        this.residenzanazionedescrizioneit = value;
    }

    /**
     * Recupera il valore della proprietà residenzanumerocivico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZANUMEROCIVICO() {
        return residenzanumerocivico;
    }

    /**
     * Imposta il valore della proprietà residenzanumerocivico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZANUMEROCIVICO(JAXBElement<String> value) {
        this.residenzanumerocivico = value;
    }

    /**
     * Recupera il valore della proprietà residenzaprefissointernazionale.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZAPREFISSOINTERNAZIONALE() {
        return residenzaprefissointernazionale;
    }

    /**
     * Imposta il valore della proprietà residenzaprefissointernazionale.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZAPREFISSOINTERNAZIONALE(JAXBElement<String> value) {
        this.residenzaprefissointernazionale = value;
    }

    /**
     * Recupera il valore della proprietà residenzaprovincia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZAPROVINCIA() {
        return residenzaprovincia;
    }

    /**
     * Imposta il valore della proprietà residenzaprovincia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZAPROVINCIA(JAXBElement<String> value) {
        this.residenzaprovincia = value;
    }

    /**
     * Recupera il valore della proprietà residenzatelefono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZATELEFONO() {
        return residenzatelefono;
    }

    /**
     * Imposta il valore della proprietà residenzatelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZATELEFONO(JAXBElement<String> value) {
        this.residenzatelefono = value;
    }

    /**
     * Recupera il valore della proprietà residenzavia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENZAVIA() {
        return residenzavia;
    }

    /**
     * Imposta il valore della proprietà residenzavia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENZAVIA(JAXBElement<String> value) {
        this.residenzavia = value;
    }

}
