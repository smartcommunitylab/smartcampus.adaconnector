
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ATTIVITA_DIDATTICA_SOSTENUTA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATTIVITA_DIDATTICA_SOSTENUTA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_ESSE3_ATTIVITA_DIDATTICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_SUPERAMENTO" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_ATTIVITA_DIDATTICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ESSE3_ATTIVITA_DIDATTICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATTIVITA_DIDATTICA_SOSTENUTA", propOrder = {
    "codesse3ATTIVITADIDATTICA",
    "datasuperamento",
    "descrizioneattivitadidattica",
    "idada",
    "idesse3ATTIVITADIDATTICA"
})
public class ATTIVITADIDATTICASOSTENUTA {

    @XmlElementRef(name = "COD_ESSE3_ATTIVITA_DIDATTICA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codesse3ATTIVITADIDATTICA;
    @XmlElementRef(name = "DATA_SUPERAMENTO", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datasuperamento;
    @XmlElementRef(name = "DESCRIZIONE_ATTIVITA_DIDATTICA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizioneattivitadidattica;
    @XmlElementRef(name = "ID_ADA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idada;
    @XmlElementRef(name = "ID_ESSE3_ATTIVITA_DIDATTICA", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idesse3ATTIVITADIDATTICA;

    /**
     * Gets the value of the codesse3ATTIVITADIDATTICA property.
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
     * Sets the value of the codesse3ATTIVITADIDATTICA property.
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
     * Gets the value of the datasuperamento property.
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
     * Sets the value of the datasuperamento property.
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
     * Gets the value of the descrizioneattivitadidattica property.
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
     * Sets the value of the descrizioneattivitadidattica property.
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
     * Gets the value of the idesse3ATTIVITADIDATTICA property.
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
     * Sets the value of the idesse3ATTIVITADIDATTICA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDESSE3ATTIVITADIDATTICA(JAXBElement<String> value) {
        this.idesse3ATTIVITADIDATTICA = value;
    }

}
