
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
 *         &lt;element name="SSD_find_all_20120415Result" type="{http://Data.ADAWs.unitn.it}ArrayOfSETTORE_SD_AREA_CUN" minOccurs="0"/>
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
    "ssdFindAll20120415Result"
})
@XmlRootElement(name = "SSD_find_all_20120415Response")
public class SSDFindAll20120415Response {

    @XmlElementRef(name = "SSD_find_all_20120415Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSETTORESDAREACUN> ssdFindAll20120415Result;

    /**
     * Gets the value of the ssdFindAll20120415Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSETTORESDAREACUN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSETTORESDAREACUN> getSSDFindAll20120415Result() {
        return ssdFindAll20120415Result;
    }

    /**
     * Sets the value of the ssdFindAll20120415Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSETTORESDAREACUN }{@code >}
     *     
     */
    public void setSSDFindAll20120415Result(JAXBElement<ArrayOfSETTORESDAREACUN> value) {
        this.ssdFindAll20120415Result = value;
    }

}
