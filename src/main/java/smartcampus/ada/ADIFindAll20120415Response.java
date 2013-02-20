
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
 *         &lt;element name="ADI_find_all_20120415Result" type="{http://Data.ADAWs.unitn.it}ArrayOfATTRIBUTI_DIDATTICA" minOccurs="0"/>
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
    "adiFindAll20120415Result"
})
@XmlRootElement(name = "ADI_find_all_20120415Response")
public class ADIFindAll20120415Response {

    @XmlElementRef(name = "ADI_find_all_20120415Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfATTRIBUTIDIDATTICA> adiFindAll20120415Result;

    /**
     * Gets the value of the adiFindAll20120415Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfATTRIBUTIDIDATTICA }{@code >}
     *     
     */
    public JAXBElement<ArrayOfATTRIBUTIDIDATTICA> getADIFindAll20120415Result() {
        return adiFindAll20120415Result;
    }

    /**
     * Sets the value of the adiFindAll20120415Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfATTRIBUTIDIDATTICA }{@code >}
     *     
     */
    public void setADIFindAll20120415Result(JAXBElement<ArrayOfATTRIBUTIDIDATTICA> value) {
        this.adiFindAll20120415Result = value;
    }

}
