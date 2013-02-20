
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
 *         &lt;element name="CODE_find_id_ada_20110214Result" type="{http://Data.ADAWs.unitn.it}ArrayOfCODE_relation" minOccurs="0"/>
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
    "codeFindIdAda20110214Result"
})
@XmlRootElement(name = "CODE_find_id_ada_20110214Response")
public class CODEFindIdAda20110214Response {

    @XmlElementRef(name = "CODE_find_id_ada_20110214Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCODERelation> codeFindIdAda20110214Result;

    /**
     * Gets the value of the codeFindIdAda20110214Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCODERelation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCODERelation> getCODEFindIdAda20110214Result() {
        return codeFindIdAda20110214Result;
    }

    /**
     * Sets the value of the codeFindIdAda20110214Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCODERelation }{@code >}
     *     
     */
    public void setCODEFindIdAda20110214Result(JAXBElement<ArrayOfCODERelation> value) {
        this.codeFindIdAda20110214Result = value;
    }

}
