
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PER_Persona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PER_Persona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_FIS_PER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COGNOME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_NASCITA_PER" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ID_OGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LUOGO_NASCITA_DESC_ATR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LUOGO_NASCITA_ID_ATR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATCH_PROB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAZIONE_NASCITA_DESC_ATR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAZIONE_NASCITA_ID_ATR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOME_PADRE_PER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SESSO_PER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PER_Persona", propOrder = {
    "codfisper",
    "cognome",
    "datanascitaper",
    "idoga",
    "luogonascitadescatr",
    "luogonascitaidatr",
    "matchprob",
    "nazionenascitadescatr",
    "nazionenascitaidatr",
    "nome",
    "nomepadreper",
    "sessoper"
})
public class PERPersona {

    @XmlElementRef(name = "COD_FIS_PER", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codfisper;
    @XmlElementRef(name = "COGNOME", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cognome;
    @XmlElementRef(name = "DATA_NASCITA_PER", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datanascitaper;
    @XmlElementRef(name = "ID_OGA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idoga;
    @XmlElementRef(name = "LUOGO_NASCITA_DESC_ATR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> luogonascitadescatr;
    @XmlElementRef(name = "LUOGO_NASCITA_ID_ATR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> luogonascitaidatr;
    @XmlElementRef(name = "MATCH_PROB", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> matchprob;
    @XmlElementRef(name = "NAZIONE_NASCITA_DESC_ATR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazionenascitadescatr;
    @XmlElementRef(name = "NAZIONE_NASCITA_ID_ATR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazionenascitaidatr;
    @XmlElementRef(name = "NOME", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nome;
    @XmlElementRef(name = "NOME_PADRE_PER", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomepadreper;
    @XmlElementRef(name = "SESSO_PER", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessoper;

    /**
     * Gets the value of the codfisper property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCODFISPER() {
        return codfisper;
    }

    /**
     * Sets the value of the codfisper property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCODFISPER(JAXBElement<String> value) {
        this.codfisper = value;
    }

    /**
     * Gets the value of the cognome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOGNOME() {
        return cognome;
    }

    /**
     * Sets the value of the cognome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOGNOME(JAXBElement<String> value) {
        this.cognome = value;
    }

    /**
     * Gets the value of the datanascitaper property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDATANASCITAPER() {
        return datanascitaper;
    }

    /**
     * Sets the value of the datanascitaper property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDATANASCITAPER(JAXBElement<XMLGregorianCalendar> value) {
        this.datanascitaper = value;
    }

    /**
     * Gets the value of the idoga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDOGA() {
        return idoga;
    }

    /**
     * Sets the value of the idoga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDOGA(JAXBElement<String> value) {
        this.idoga = value;
    }

    /**
     * Gets the value of the luogonascitadescatr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLUOGONASCITADESCATR() {
        return luogonascitadescatr;
    }

    /**
     * Sets the value of the luogonascitadescatr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLUOGONASCITADESCATR(JAXBElement<String> value) {
        this.luogonascitadescatr = value;
    }

    /**
     * Gets the value of the luogonascitaidatr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLUOGONASCITAIDATR() {
        return luogonascitaidatr;
    }

    /**
     * Sets the value of the luogonascitaidatr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLUOGONASCITAIDATR(JAXBElement<String> value) {
        this.luogonascitaidatr = value;
    }

    /**
     * Gets the value of the matchprob property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMATCHPROB() {
        return matchprob;
    }

    /**
     * Sets the value of the matchprob property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMATCHPROB(JAXBElement<String> value) {
        this.matchprob = value;
    }

    /**
     * Gets the value of the nazionenascitadescatr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAZIONENASCITADESCATR() {
        return nazionenascitadescatr;
    }

    /**
     * Sets the value of the nazionenascitadescatr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAZIONENASCITADESCATR(JAXBElement<String> value) {
        this.nazionenascitadescatr = value;
    }

    /**
     * Gets the value of the nazionenascitaidatr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAZIONENASCITAIDATR() {
        return nazionenascitaidatr;
    }

    /**
     * Sets the value of the nazionenascitaidatr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAZIONENASCITAIDATR(JAXBElement<String> value) {
        this.nazionenascitaidatr = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNOME() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNOME(JAXBElement<String> value) {
        this.nome = value;
    }

    /**
     * Gets the value of the nomepadreper property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNOMEPADREPER() {
        return nomepadreper;
    }

    /**
     * Sets the value of the nomepadreper property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNOMEPADREPER(JAXBElement<String> value) {
        this.nomepadreper = value;
    }

    /**
     * Gets the value of the sessoper property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSESSOPER() {
        return sessoper;
    }

    /**
     * Sets the value of the sessoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSESSOPER(JAXBElement<String> value) {
        this.sessoper = value;
    }

}
