
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
 *         &lt;element name="LBS_libretto_studente_20120415Result" type="{http://Data.ADAWs.unitn.it}ArrayOfLIBRETTO_STUDENTE" minOccurs="0"/>
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
    "lbsLibrettoStudente20120415Result"
})
@XmlRootElement(name = "LBS_libretto_studente_20120415Response")
public class LBSLibrettoStudente20120415Response {

    @XmlElementRef(name = "LBS_libretto_studente_20120415Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLIBRETTOSTUDENTE> lbsLibrettoStudente20120415Result;

    /**
     * Gets the value of the lbsLibrettoStudente20120415Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLIBRETTOSTUDENTE }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLIBRETTOSTUDENTE> getLBSLibrettoStudente20120415Result() {
        return lbsLibrettoStudente20120415Result;
    }

    /**
     * Sets the value of the lbsLibrettoStudente20120415Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLIBRETTOSTUDENTE }{@code >}
     *     
     */
    public void setLBSLibrettoStudente20120415Result(JAXBElement<ArrayOfLIBRETTOSTUDENTE> value) {
        this.lbsLibrettoStudente20120415Result = value;
    }

}
