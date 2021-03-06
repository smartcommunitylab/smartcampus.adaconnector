
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GROUP_find_20131025Result" type="{http://Data.ADAWs.unitn.it}ArrayOfGROUP_detail" minOccurs="0"/>
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
    "groupFind20131025Result"
})
@XmlRootElement(name = "GROUP_find_20131025Response")
public class GROUPFind20131025Response {

    @XmlElementRef(name = "GROUP_find_20131025Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGROUPDetail> groupFind20131025Result;

    /**
     * Recupera il valore della proprietà groupFind20131025Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGROUPDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGROUPDetail> getGROUPFind20131025Result() {
        return groupFind20131025Result;
    }

    /**
     * Imposta il valore della proprietà groupFind20131025Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGROUPDetail }{@code >}
     *     
     */
    public void setGROUPFind20131025Result(JAXBElement<ArrayOfGROUPDetail> value) {
        this.groupFind20131025Result = value;
    }

}
