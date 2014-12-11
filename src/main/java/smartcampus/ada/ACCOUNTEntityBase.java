
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ACCOUNT_entity_base complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ACCOUNT_entity_base">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CELL_UFFICIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="E_MAIL_UFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAX_UFFICIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTERNO_CELL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEL_UFFICIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCOUNT_entity_base", propOrder = {
    "cellufficio",
    "emailuff",
    "faxufficio",
    "idaccount",
    "idada",
    "internocell",
    "mail",
    "telufficio",
    "username"
})
public class ACCOUNTEntityBase {

    @XmlElementRef(name = "CELL_UFFICIO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> cellufficio;
    @XmlElementRef(name = "E_MAIL_UFF", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> emailuff;
    @XmlElementRef(name = "FAX_UFFICIO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> faxufficio;
    @XmlElementRef(name = "ID_ACCOUNT", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> idaccount;
    @XmlElementRef(name = "ID_ADA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> idada;
    @XmlElementRef(name = "INTERNO_CELL", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> internocell;
    @XmlElementRef(name = "MAIL", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> mail;
    @XmlElementRef(name = "TEL_UFFICIO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> telufficio;
    @XmlElementRef(name = "USERNAME", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<String> username;

    /**
     * Recupera il valore della proprietà cellufficio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCELLUFFICIO() {
        return cellufficio;
    }

    /**
     * Imposta il valore della proprietà cellufficio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCELLUFFICIO(JAXBElement<String> value) {
        this.cellufficio = value;
    }

    /**
     * Recupera il valore della proprietà emailuff.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMAILUFF() {
        return emailuff;
    }

    /**
     * Imposta il valore della proprietà emailuff.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMAILUFF(JAXBElement<String> value) {
        this.emailuff = value;
    }

    /**
     * Recupera il valore della proprietà faxufficio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFAXUFFICIO() {
        return faxufficio;
    }

    /**
     * Imposta il valore della proprietà faxufficio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFAXUFFICIO(JAXBElement<String> value) {
        this.faxufficio = value;
    }

    /**
     * Recupera il valore della proprietà idaccount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDACCOUNT() {
        return idaccount;
    }

    /**
     * Imposta il valore della proprietà idaccount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDACCOUNT(JAXBElement<String> value) {
        this.idaccount = value;
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
     * Recupera il valore della proprietà internocell.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINTERNOCELL() {
        return internocell;
    }

    /**
     * Imposta il valore della proprietà internocell.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINTERNOCELL(JAXBElement<String> value) {
        this.internocell = value;
    }

    /**
     * Recupera il valore della proprietà mail.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMAIL() {
        return mail;
    }

    /**
     * Imposta il valore della proprietà mail.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMAIL(JAXBElement<String> value) {
        this.mail = value;
    }

    /**
     * Recupera il valore della proprietà telufficio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTELUFFICIO() {
        return telufficio;
    }

    /**
     * Imposta il valore della proprietà telufficio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTELUFFICIO(JAXBElement<String> value) {
        this.telufficio = value;
    }

    /**
     * Recupera il valore della proprietà username.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUSERNAME() {
        return username;
    }

    /**
     * Imposta il valore della proprietà username.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUSERNAME(JAXBElement<String> value) {
        this.username = value;
    }

}
