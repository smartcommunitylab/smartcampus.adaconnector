
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
 *         &lt;element name="VOIP_find_entity_20120415Result" type="{http://Data.ADAWs.unitn.it}ArrayOfVOIP_entity" minOccurs="0"/>
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
    "voipFindEntity20120415Result"
})
@XmlRootElement(name = "VOIP_find_entity_20120415Response")
public class VOIPFindEntity20120415Response {

    @XmlElementRef(name = "VOIP_find_entity_20120415Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<ArrayOfVOIPEntity> voipFindEntity20120415Result;

    /**
     * Recupera il valore della proprietà voipFindEntity20120415Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVOIPEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVOIPEntity> getVOIPFindEntity20120415Result() {
        return voipFindEntity20120415Result;
    }

    /**
     * Imposta il valore della proprietà voipFindEntity20120415Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVOIPEntity }{@code >}
     *     
     */
    public void setVOIPFindEntity20120415Result(JAXBElement<ArrayOfVOIPEntity> value) {
        this.voipFindEntity20120415Result = value;
    }

}
