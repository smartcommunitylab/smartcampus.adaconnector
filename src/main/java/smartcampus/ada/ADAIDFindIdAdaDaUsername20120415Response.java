
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
 *         &lt;element name="ADA_ID_find_id_ada_da_username_20120415Result" type="{http://Data.ADAWs.unitn.it}ArrayOfADA_object_ID" minOccurs="0"/>
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
    "adaidFindIdAdaDaUsername20120415Result"
})
@XmlRootElement(name = "ADA_ID_find_id_ada_da_username_20120415Response")
public class ADAIDFindIdAdaDaUsername20120415Response {

    @XmlElementRef(name = "ADA_ID_find_id_ada_da_username_20120415Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfADAObjectID> adaidFindIdAdaDaUsername20120415Result;

    /**
     * Gets the value of the adaidFindIdAdaDaUsername20120415Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfADAObjectID }{@code >}
     *     
     */
    public JAXBElement<ArrayOfADAObjectID> getADAIDFindIdAdaDaUsername20120415Result() {
        return adaidFindIdAdaDaUsername20120415Result;
    }

    /**
     * Sets the value of the adaidFindIdAdaDaUsername20120415Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfADAObjectID }{@code >}
     *     
     */
    public void setADAIDFindIdAdaDaUsername20120415Result(JAXBElement<ArrayOfADAObjectID> value) {
        this.adaidFindIdAdaDaUsername20120415Result = value;
    }

}
