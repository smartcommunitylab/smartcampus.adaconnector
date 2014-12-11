
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
 *         &lt;element name="ADA_ID_find_id_acc_da_username_20131025Result" type="{http://Data.ADAWs.unitn.it}ArrayOfADA_object_ID" minOccurs="0"/>
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
    "adaidFindIdAccDaUsername20131025Result"
})
@XmlRootElement(name = "ADA_ID_find_id_acc_da_username_20131025Response")
public class ADAIDFindIdAccDaUsername20131025Response {

    @XmlElementRef(name = "ADA_ID_find_id_acc_da_username_20131025Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfADAObjectID> adaidFindIdAccDaUsername20131025Result;

    /**
     * Recupera il valore della proprietà adaidFindIdAccDaUsername20131025Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfADAObjectID }{@code >}
     *     
     */
    public JAXBElement<ArrayOfADAObjectID> getADAIDFindIdAccDaUsername20131025Result() {
        return adaidFindIdAccDaUsername20131025Result;
    }

    /**
     * Imposta il valore della proprietà adaidFindIdAccDaUsername20131025Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfADAObjectID }{@code >}
     *     
     */
    public void setADAIDFindIdAccDaUsername20131025Result(JAXBElement<ArrayOfADAObjectID> value) {
        this.adaidFindIdAccDaUsername20131025Result = value;
    }

}
