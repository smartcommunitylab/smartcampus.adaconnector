
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GOG_relazione_gerarchica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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

    @XmlElementRef(name = "FINE_GOG", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finegog;
    @XmlElementRef(name = "ID_ADA_FIGLIO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idadafiglio;
    @XmlElementRef(name = "ID_ADA_PADRE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idadapadre;
    @XmlElementRef(name = "ID_TSO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idtso;
    @XmlElementRef(name = "INIZIO_GOG", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> iniziogog;
    @XmlElementRef(name = "LIVELLO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> livello;
    @XmlElementRef(name = "ORDINE", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ordine;

    /**
     * Gets the value of the finegog property.
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
     * Sets the value of the finegog property.
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
     * Gets the value of the idadafiglio property.
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
     * Sets the value of the idadafiglio property.
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
     * Gets the value of the idadapadre property.
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
     * Sets the value of the idadapadre property.
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
     * Gets the value of the idtso property.
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
     * Sets the value of the idtso property.
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
     * Gets the value of the iniziogog property.
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
     * Sets the value of the iniziogog property.
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
     * Gets the value of the livello property.
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
     * Sets the value of the livello property.
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
     * Gets the value of the ordine property.
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
     * Sets the value of the ordine property.
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
