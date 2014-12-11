
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
 *         &lt;element name="DESCRIZIONE_find_oga_20120415Result" type="{http://Data.ADAWs.unitn.it}ArrayOfADA_description" minOccurs="0"/>
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
    "descrizioneFindOga20120415Result"
})
@XmlRootElement(name = "DESCRIZIONE_find_oga_20120415Response")
public class DESCRIZIONEFindOga20120415Response {

    @XmlElementRef(name = "DESCRIZIONE_find_oga_20120415Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<ArrayOfADADescription> descrizioneFindOga20120415Result;

    /**
     * Recupera il valore della proprietà descrizioneFindOga20120415Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfADADescription }{@code >}
     *     
     */
    public JAXBElement<ArrayOfADADescription> getDESCRIZIONEFindOga20120415Result() {
        return descrizioneFindOga20120415Result;
    }

    /**
     * Imposta il valore della proprietà descrizioneFindOga20120415Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfADADescription }{@code >}
     *     
     */
    public void setDESCRIZIONEFindOga20120415Result(JAXBElement<ArrayOfADADescription> value) {
        this.descrizioneFindOga20120415Result = value;
    }

}
