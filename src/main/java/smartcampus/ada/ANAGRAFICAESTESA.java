
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ANAGRAFICA_ESTESA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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

    @XmlElementRef(name = "ANAGRAFICA_VALIDA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> anagraficavalida;
    @XmlElementRef(name = "CELLULARE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cellulare;
    @XmlElementRef(name = "DESCRIZIONE_CITTADINANZA_EN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionecittadinanzaen;
    @XmlElementRef(name = "DESCRIZIONE_CITTADINANZA_IT", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizionecittadinanzait;
    @XmlElementRef(name = "DOMICILIO_CAP", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domiciliocap;
    @XmlElementRef(name = "DOMICILIO_CITTA_STRANIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domiciliocittastraniera;
    @XmlElementRef(name = "DOMICILIO_COMUNE_DESCRIZIONE_EN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domiciliocomunedescrizioneen;
    @XmlElementRef(name = "DOMICILIO_COMUNE_DESCRIZIONE_IT", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domiciliocomunedescrizioneit;
    @XmlElementRef(name = "DOMICILIO_FRAZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domiciliofrazione;
    @XmlElementRef(name = "DOMICILIO_ID_ADA_COMUNE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilioidadacomune;
    @XmlElementRef(name = "DOMICILIO_ID_ADA_NAZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilioidadanazione;
    @XmlElementRef(name = "DOMICILIO_NAZIONE_DESCRIZIONE_EN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilionazionedescrizioneen;
    @XmlElementRef(name = "DOMICILIO_NAZIONE_DESCRIZIONE_IT", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilionazionedescrizioneit;
    @XmlElementRef(name = "DOMICILIO_NUMERO_CIVICO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilionumerocivico;
    @XmlElementRef(name = "DOMICILIO_PREFISSO_INTERNAZIONALE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilioprefissointernazionale;
    @XmlElementRef(name = "DOMICILIO_PRESSO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domiciliopresso;
    @XmlElementRef(name = "DOMICILIO_PROVINCIA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilioprovincia;
    @XmlElementRef(name = "DOMICILIO_TELEFONO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domiciliotelefono;
    @XmlElementRef(name = "DOMICILIO_VIA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domiciliovia;
    @XmlElementRef(name = "FAX", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fax;
    @XmlElementRef(name = "ID_ADA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idada;
    @XmlElementRef(name = "ID_ADA_CITTADINANZA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idadacittadinanza;
    @XmlElementRef(name = "ID_GIADA_PERSONA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idgiadapersona;
    @XmlElementRef(name = "RESIDENZA_CAP", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzacap;
    @XmlElementRef(name = "RESIDENZA_CITTA_STRANIERA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzacittastraniera;
    @XmlElementRef(name = "RESIDENZA_COMUNE_DESCRIZIONE_EN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzacomunedescrizioneen;
    @XmlElementRef(name = "RESIDENZA_COMUNE_DESCRIZIONE_IT", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzacomunedescrizioneit;
    @XmlElementRef(name = "RESIDENZA_FRAZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzafrazione;
    @XmlElementRef(name = "RESIDENZA_ID_ADA_COMUNE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzaidadacomune;
    @XmlElementRef(name = "RESIDENZA_ID_ADA_NAZIONE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzaidadanazione;
    @XmlElementRef(name = "RESIDENZA_NAZIONE_DESCRIZIONE_EN", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzanazionedescrizioneen;
    @XmlElementRef(name = "RESIDENZA_NAZIONE_DESCRIZIONE_IT", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzanazionedescrizioneit;
    @XmlElementRef(name = "RESIDENZA_NUMERO_CIVICO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzanumerocivico;
    @XmlElementRef(name = "RESIDENZA_PREFISSO_INTERNAZIONALE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzaprefissointernazionale;
    @XmlElementRef(name = "RESIDENZA_PROVINCIA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzaprovincia;
    @XmlElementRef(name = "RESIDENZA_TELEFONO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzatelefono;
    @XmlElementRef(name = "RESIDENZA_VIA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residenzavia;

    /**
     * Gets the value of the anagraficavalida property.
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
     * Sets the value of the anagraficavalida property.
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
     * Gets the value of the cellulare property.
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
     * Sets the value of the cellulare property.
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
     * Gets the value of the descrizionecittadinanzaen property.
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
     * Sets the value of the descrizionecittadinanzaen property.
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
     * Gets the value of the descrizionecittadinanzait property.
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
     * Sets the value of the descrizionecittadinanzait property.
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
     * Gets the value of the domiciliocap property.
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
     * Sets the value of the domiciliocap property.
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
     * Gets the value of the domiciliocittastraniera property.
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
     * Sets the value of the domiciliocittastraniera property.
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
     * Gets the value of the domiciliocomunedescrizioneen property.
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
     * Sets the value of the domiciliocomunedescrizioneen property.
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
     * Gets the value of the domiciliocomunedescrizioneit property.
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
     * Sets the value of the domiciliocomunedescrizioneit property.
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
     * Gets the value of the domiciliofrazione property.
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
     * Sets the value of the domiciliofrazione property.
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
     * Gets the value of the domicilioidadacomune property.
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
     * Sets the value of the domicilioidadacomune property.
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
     * Gets the value of the domicilioidadanazione property.
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
     * Sets the value of the domicilioidadanazione property.
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
     * Gets the value of the domicilionazionedescrizioneen property.
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
     * Sets the value of the domicilionazionedescrizioneen property.
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
     * Gets the value of the domicilionazionedescrizioneit property.
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
     * Sets the value of the domicilionazionedescrizioneit property.
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
     * Gets the value of the domicilionumerocivico property.
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
     * Sets the value of the domicilionumerocivico property.
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
     * Gets the value of the domicilioprefissointernazionale property.
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
     * Sets the value of the domicilioprefissointernazionale property.
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
     * Gets the value of the domiciliopresso property.
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
     * Sets the value of the domiciliopresso property.
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
     * Gets the value of the domicilioprovincia property.
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
     * Sets the value of the domicilioprovincia property.
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
     * Gets the value of the domiciliotelefono property.
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
     * Sets the value of the domiciliotelefono property.
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
     * Gets the value of the domiciliovia property.
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
     * Sets the value of the domiciliovia property.
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
     * Gets the value of the fax property.
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
     * Sets the value of the fax property.
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
     * Gets the value of the idadacittadinanza property.
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
     * Sets the value of the idadacittadinanza property.
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
     * Gets the value of the residenzacap property.
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
     * Sets the value of the residenzacap property.
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
     * Gets the value of the residenzacittastraniera property.
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
     * Sets the value of the residenzacittastraniera property.
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
     * Gets the value of the residenzacomunedescrizioneen property.
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
     * Sets the value of the residenzacomunedescrizioneen property.
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
     * Gets the value of the residenzacomunedescrizioneit property.
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
     * Sets the value of the residenzacomunedescrizioneit property.
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
     * Gets the value of the residenzafrazione property.
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
     * Sets the value of the residenzafrazione property.
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
     * Gets the value of the residenzaidadacomune property.
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
     * Sets the value of the residenzaidadacomune property.
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
     * Gets the value of the residenzaidadanazione property.
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
     * Sets the value of the residenzaidadanazione property.
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
     * Gets the value of the residenzanazionedescrizioneen property.
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
     * Sets the value of the residenzanazionedescrizioneen property.
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
     * Gets the value of the residenzanazionedescrizioneit property.
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
     * Sets the value of the residenzanazionedescrizioneit property.
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
     * Gets the value of the residenzanumerocivico property.
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
     * Sets the value of the residenzanumerocivico property.
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
     * Gets the value of the residenzaprefissointernazionale property.
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
     * Sets the value of the residenzaprefissointernazionale property.
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
     * Gets the value of the residenzaprovincia property.
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
     * Sets the value of the residenzaprovincia property.
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
     * Gets the value of the residenzatelefono property.
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
     * Sets the value of the residenzatelefono property.
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
     * Gets the value of the residenzavia property.
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
     * Sets the value of the residenzavia property.
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
