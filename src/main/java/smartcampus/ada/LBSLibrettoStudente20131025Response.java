
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
 *         &lt;element name="LBS_libretto_studente_20131025Result" type="{http://Data.ADAWs.unitn.it}ArrayOfLIBRETTO_STUDENTE" minOccurs="0"/>
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
    "lbsLibrettoStudente20131025Result"
})
@XmlRootElement(name = "LBS_libretto_studente_20131025Response")
public class LBSLibrettoStudente20131025Response {

    @XmlElementRef(name = "LBS_libretto_studente_20131025Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLIBRETTOSTUDENTE> lbsLibrettoStudente20131025Result;

    /**
     * Recupera il valore della proprietà lbsLibrettoStudente20131025Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLIBRETTOSTUDENTE }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLIBRETTOSTUDENTE> getLBSLibrettoStudente20131025Result() {
        return lbsLibrettoStudente20131025Result;
    }

    /**
     * Imposta il valore della proprietà lbsLibrettoStudente20131025Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLIBRETTOSTUDENTE }{@code >}
     *     
     */
    public void setLBSLibrettoStudente20131025Result(JAXBElement<ArrayOfLIBRETTOSTUDENTE> value) {
        this.lbsLibrettoStudente20131025Result = value;
    }

}
