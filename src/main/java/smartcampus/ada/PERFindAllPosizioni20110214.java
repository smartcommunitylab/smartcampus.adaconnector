
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_ada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_riferimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idAda",
    "dataRiferimento"
})
@XmlRootElement(name = "PER_find_all_posizioni_20110214")
public class PERFindAllPosizioni20110214 {

    @XmlElementRef(name = "id_ada", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idAda;
    @XmlElementRef(name = "data_riferimento", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataRiferimento;

    /**
     * Gets the value of the idAda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdAda() {
        return idAda;
    }

    /**
     * Sets the value of the idAda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdAda(JAXBElement<String> value) {
        this.idAda = value;
    }

    /**
     * Gets the value of the dataRiferimento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataRiferimento() {
        return dataRiferimento;
    }

    /**
     * Sets the value of the dataRiferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataRiferimento(JAXBElement<XMLGregorianCalendar> value) {
        this.dataRiferimento = value;
    }

}
