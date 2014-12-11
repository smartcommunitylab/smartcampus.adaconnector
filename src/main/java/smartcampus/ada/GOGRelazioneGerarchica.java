
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per GOG_relazione_gerarchica complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GOG_relazione_gerarchica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FINE_GOG" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ID_ADA_FIGLIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ADA_PADRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_TSO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INIZIO_GOG" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LIVELLO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ORDINE" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GOG_relazione_gerarchica", propOrder = {
    "finegog",
    "idadafiglio",
    "idadapadre",
    "idtso",
    "iniziogog",
    "livello",
    "ordine"
})
public class GOGRelazioneGerarchica {

    @XmlElementRef(name = "FINE_GOG", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> finegog;
    @XmlElementRef(name = "ID_ADA_FIGLIO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> idadafiglio;
    @XmlElementRef(name = "ID_ADA_PADRE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> idadapadre;
    @XmlElementRef(name = "ID_TSO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> idtso;
    @XmlElementRef(name = "INIZIO_GOG", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> iniziogog;
    @XmlElementRef(name = "LIVELLO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> livello;
    @XmlElementRef(name = "ORDINE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<Long> ordine;

    /**
     * Recupera il valore della proprietà finegog.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFINEGOG() {
        return finegog;
    }

    /**
     * Imposta il valore della proprietà finegog.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFINEGOG(JAXBElement<XMLGregorianCalendar> value) {
        this.finegog = value;
    }

    /**
     * Recupera il valore della proprietà idadafiglio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDADAFIGLIO() {
        return idadafiglio;
    }

    /**
     * Imposta il valore della proprietà idadafiglio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDADAFIGLIO(JAXBElement<String> value) {
        this.idadafiglio = value;
    }

    /**
     * Recupera il valore della proprietà idadapadre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDADAPADRE() {
        return idadapadre;
    }

    /**
     * Imposta il valore della proprietà idadapadre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDADAPADRE(JAXBElement<String> value) {
        this.idadapadre = value;
    }

    /**
     * Recupera il valore della proprietà idtso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDTSO() {
        return idtso;
    }

    /**
     * Imposta il valore della proprietà idtso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDTSO(JAXBElement<String> value) {
        this.idtso = value;
    }

    /**
     * Recupera il valore della proprietà iniziogog.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getINIZIOGOG() {
        return iniziogog;
    }

    /**
     * Imposta il valore della proprietà iniziogog.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setINIZIOGOG(JAXBElement<XMLGregorianCalendar> value) {
        this.iniziogog = value;
    }

    /**
     * Recupera il valore della proprietà livello.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLIVELLO() {
        return livello;
    }

    /**
     * Imposta il valore della proprietà livello.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLIVELLO(JAXBElement<Long> value) {
        this.livello = value;
    }

    /**
     * Recupera il valore della proprietà ordine.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getORDINE() {
        return ordine;
    }

    /**
     * Imposta il valore della proprietà ordine.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setORDINE(JAXBElement<Long> value) {
        this.ordine = value;
    }

}
