
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ATTIVITA_DIDATTICA_SOSTENUTA complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà codesse3ATTIVITADIDATTICA.
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
     * Imposta il valore della proprietà codesse3ATTIVITADIDATTICA.
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
     * Recupera il valore della proprietà datasuperamento.
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
     * Imposta il valore della proprietà datasuperamento.
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
     * Recupera il valore della proprietà descrizioneattivitadidattica.
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
     * Imposta il valore della proprietà descrizioneattivitadidattica.
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
     * Recupera il valore della proprietà idesse3ATTIVITADIDATTICA.
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
     * Imposta il valore della proprietà idesse3ATTIVITADIDATTICA.
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
