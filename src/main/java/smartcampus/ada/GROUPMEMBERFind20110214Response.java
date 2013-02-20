
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
 *         &lt;element name="GROUP_MEMBER_find_20110214Result" type="{http://Data.ADAWs.unitn.it}ArrayOfGROUP_member" minOccurs="0"/>
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
    "groupmemberFind20110214Result"
})
@XmlRootElement(name = "GROUP_MEMBER_find_20110214Response")
public class GROUPMEMBERFind20110214Response {

    @XmlElementRef(name = "GROUP_MEMBER_find_20110214Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGROUPMember> groupmemberFind20110214Result;

    /**
     * Gets the value of the groupmemberFind20110214Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGROUPMember }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGROUPMember> getGROUPMEMBERFind20110214Result() {
        return groupmemberFind20110214Result;
    }

    /**
     * Sets the value of the groupmemberFind20110214Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGROUPMember }{@code >}
     *     
     */
    public void setGROUPMEMBERFind20110214Result(JAXBElement<ArrayOfGROUPMember> value) {
        this.groupmemberFind20110214Result = value;
    }

}
