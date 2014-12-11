
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per PER_Persona complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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

    @XmlElementRef(name = "COD_FIS_PER", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> codfisper;
    @XmlElementRef(name = "COGNOME", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> cognome;
    @XmlElementRef(name = "DATA_NASCITA_PER", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> datanascitaper;
    @XmlElementRef(name = "ID_OGA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> idoga;
    @XmlElementRef(name = "LUOGO_NASCITA_DESC_ATR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> luogonascitadescatr;
    @XmlElementRef(name = "LUOGO_NASCITA_ID_ATR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> luogonascitaidatr;
    @XmlElementRef(name = "MATCH_PROB", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> matchprob;
    @XmlElementRef(name = "NAZIONE_NASCITA_DESC_ATR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> nazionenascitadescatr;
    @XmlElementRef(name = "NAZIONE_NASCITA_ID_ATR", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> nazionenascitaidatr;
    @XmlElementRef(name = "NOME", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> nome;
    @XmlElementRef(name = "NOME_PADRE_PER", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> nomepadreper;
    @XmlElementRef(name = "SESSO_PER", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> sessoper;

    /**
     * Recupera il valore della proprietà codfisper.
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
     * Imposta il valore della proprietà codfisper.
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
     * Recupera il valore della proprietà cognome.
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
     * Imposta il valore della proprietà cognome.
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
     * Recupera il valore della proprietà datanascitaper.
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
     * Imposta il valore della proprietà datanascitaper.
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
     * Recupera il valore della proprietà idoga.
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
     * Imposta il valore della proprietà idoga.
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
     * Recupera il valore della proprietà luogonascitadescatr.
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
     * Imposta il valore della proprietà luogonascitadescatr.
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
     * Recupera il valore della proprietà luogonascitaidatr.
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
     * Imposta il valore della proprietà luogonascitaidatr.
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
     * Recupera il valore della proprietà matchprob.
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
     * Imposta il valore della proprietà matchprob.
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
     * Recupera il valore della proprietà nazionenascitadescatr.
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
     * Imposta il valore della proprietà nazionenascitadescatr.
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
     * Recupera il valore della proprietà nazionenascitaidatr.
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
     * Imposta il valore della proprietà nazionenascitaidatr.
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
     * Recupera il valore della proprietà nome.
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
     * Imposta il valore della proprietà nome.
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
     * Recupera il valore della proprietà nomepadreper.
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
     * Imposta il valore della proprietà nomepadreper.
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
     * Recupera il valore della proprietà sessoper.
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
     * Imposta il valore della proprietà sessoper.
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
