
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
 *         &lt;element name="GROUP_MEMBER_find_20120415Result" type="{http://Data.ADAWs.unitn.it}ArrayOfGROUP_member" minOccurs="0"/>
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
    "groupmemberFind20120415Result"
})
@XmlRootElement(name = "GROUP_MEMBER_find_20120415Response")
public class GROUPMEMBERFind20120415Response {

    @XmlElementRef(name = "GROUP_MEMBER_find_20120415Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGROUPMember> groupmemberFind20120415Result;

    /**
     * Recupera il valore della proprietà groupmemberFind20120415Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGROUPMember }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGROUPMember> getGROUPMEMBERFind20120415Result() {
        return groupmemberFind20120415Result;
    }

    /**
     * Imposta il valore della proprietà groupmemberFind20120415Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGROUPMember }{@code >}
     *     
     */
    public void setGROUPMEMBERFind20120415Result(JAXBElement<ArrayOfGROUPMember> value) {
        this.groupmemberFind20120415Result = value;
    }

}
