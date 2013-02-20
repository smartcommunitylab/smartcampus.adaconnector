
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
 *         &lt;element name="GROUP_find_20110214Result" type="{http://Data.ADAWs.unitn.it}ArrayOfGROUP_detail" minOccurs="0"/>
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
    "groupFind20110214Result"
})
@XmlRootElement(name = "GROUP_find_20110214Response")
public class GROUPFind20110214Response {

    @XmlElementRef(name = "GROUP_find_20110214Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGROUPDetail> groupFind20110214Result;

    /**
     * Gets the value of the groupFind20110214Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGROUPDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGROUPDetail> getGROUPFind20110214Result() {
        return groupFind20110214Result;
    }

    /**
     * Sets the value of the groupFind20110214Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGROUPDetail }{@code >}
     *     
     */
    public void setGROUPFind20110214Result(JAXBElement<ArrayOfGROUPDetail> value) {
        this.groupFind20110214Result = value;
    }

}
