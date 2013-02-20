
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="PER_find_posizioni_id_adaResult" type="{http://Data.ADAWs.unitn.it}ArrayOfPER_Posizioni" minOccurs="0"/>
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
    "perFindPosizioniIdAdaResult"
})
@XmlRootElement(name = "PER_find_posizioni_id_adaResponse")
public class PERFindPosizioniIdAdaResponse {

    @XmlElementRef(name = "PER_find_posizioni_id_adaResult", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPERPosizioni> perFindPosizioniIdAdaResult;

    /**
     * Gets the value of the perFindPosizioniIdAdaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPERPosizioni> getPERFindPosizioniIdAdaResult() {
        return perFindPosizioniIdAdaResult;
    }

    /**
     * Sets the value of the perFindPosizioniIdAdaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni }{@code >}
     *     
     */
    public void setPERFindPosizioniIdAdaResult(JAXBElement<ArrayOfPERPosizioni> value) {
        this.perFindPosizioniIdAdaResult = value;
    }

}
