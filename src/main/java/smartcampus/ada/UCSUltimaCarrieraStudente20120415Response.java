
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
 *         &lt;element name="UCS_ultima_carriera_studente_20120415Result" type="{http://Data.ADAWs.unitn.it}ArrayOfULTIMA_CARRIERA_STUDENTE" minOccurs="0"/>
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
    "ucsUltimaCarrieraStudente20120415Result"
})
@XmlRootElement(name = "UCS_ultima_carriera_studente_20120415Response")
public class UCSUltimaCarrieraStudente20120415Response {

    @XmlElementRef(name = "UCS_ultima_carriera_studente_20120415Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<ArrayOfULTIMACARRIERASTUDENTE> ucsUltimaCarrieraStudente20120415Result;

    /**
     * Recupera il valore della proprietà ucsUltimaCarrieraStudente20120415Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfULTIMACARRIERASTUDENTE }{@code >}
     *     
     */
    public JAXBElement<ArrayOfULTIMACARRIERASTUDENTE> getUCSUltimaCarrieraStudente20120415Result() {
        return ucsUltimaCarrieraStudente20120415Result;
    }

    /**
     * Imposta il valore della proprietà ucsUltimaCarrieraStudente20120415Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfULTIMACARRIERASTUDENTE }{@code >}
     *     
     */
    public void setUCSUltimaCarrieraStudente20120415Result(JAXBElement<ArrayOfULTIMACARRIERASTUDENTE> value) {
        this.ucsUltimaCarrieraStudente20120415Result = value;
    }

}
