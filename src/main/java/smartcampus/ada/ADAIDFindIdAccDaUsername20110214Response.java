
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
 *         &lt;element name="ADA_ID_find_id_acc_da_username_20110214Result" type="{http://Data.ADAWs.unitn.it}ArrayOfADA_object_ID" minOccurs="0"/>
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
    "adaidFindIdAccDaUsername20110214Result"
})
@XmlRootElement(name = "ADA_ID_find_id_acc_da_username_20110214Response")
public class ADAIDFindIdAccDaUsername20110214Response {

    @XmlElementRef(name = "ADA_ID_find_id_acc_da_username_20110214Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfADAObjectID> adaidFindIdAccDaUsername20110214Result;

    /**
     * Gets the value of the adaidFindIdAccDaUsername20110214Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfADAObjectID }{@code >}
     *     
     */
    public JAXBElement<ArrayOfADAObjectID> getADAIDFindIdAccDaUsername20110214Result() {
        return adaidFindIdAccDaUsername20110214Result;
    }

    /**
     * Sets the value of the adaidFindIdAccDaUsername20110214Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfADAObjectID }{@code >}
     *     
     */
    public void setADAIDFindIdAccDaUsername20110214Result(JAXBElement<ArrayOfADAObjectID> value) {
        this.adaidFindIdAccDaUsername20110214Result = value;
    }

}