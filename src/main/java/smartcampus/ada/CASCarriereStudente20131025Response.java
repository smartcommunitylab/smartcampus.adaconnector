
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
 *         &lt;element name="CAS_carriere_studente_20131025Result" type="{http://Data.ADAWs.unitn.it}ArrayOfCARRIERE_STUDENTE" minOccurs="0"/>
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
    "casCarriereStudente20131025Result"
})
@XmlRootElement(name = "CAS_carriere_studente_20131025Response")
public class CASCarriereStudente20131025Response {

    @XmlElementRef(name = "CAS_carriere_studente_20131025Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCARRIERESTUDENTE> casCarriereStudente20131025Result;

    /**
     * Recupera il valore della proprietà casCarriereStudente20131025Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCARRIERESTUDENTE }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCARRIERESTUDENTE> getCASCarriereStudente20131025Result() {
        return casCarriereStudente20131025Result;
    }

    /**
     * Imposta il valore della proprietà casCarriereStudente20131025Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCARRIERESTUDENTE }{@code >}
     *     
     */
    public void setCASCarriereStudente20131025Result(JAXBElement<ArrayOfCARRIERESTUDENTE> value) {
        this.casCarriereStudente20131025Result = value;
    }

}
