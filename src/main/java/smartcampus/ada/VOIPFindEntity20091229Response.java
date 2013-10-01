
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
 *         &lt;element name="VOIP_find_entity_20091229Result" type="{http://Data.ADAWs.unitn.it}ArrayOfVOIP_entity" minOccurs="0"/>
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
    "voipFindEntity20091229Result"
})
@XmlRootElement(name = "VOIP_find_entity_20091229Response")
public class VOIPFindEntity20091229Response {

    @XmlElementRef(name = "VOIP_find_entity_20091229Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVOIPEntity> voipFindEntity20091229Result;

    /**
     * Gets the value of the voipFindEntity20091229Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVOIPEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVOIPEntity> getVOIPFindEntity20091229Result() {
        return voipFindEntity20091229Result;
    }

    /**
     * Sets the value of the voipFindEntity20091229Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVOIPEntity }{@code >}
     *     
     */
    public void setVOIPFindEntity20091229Result(JAXBElement<ArrayOfVOIPEntity> value) {
        this.voipFindEntity20091229Result = value;
    }

}