
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
 *         &lt;element name="APE_find_all_20110214Result" type="{http://Data.ADAWs.unitn.it}ArrayOfATTRIBUTI_PERSONALI" minOccurs="0"/>
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
    "apeFindAll20110214Result"
})
@XmlRootElement(name = "APE_find_all_20110214Response")
public class APEFindAll20110214Response {

    @XmlElementRef(name = "APE_find_all_20110214Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfATTRIBUTIPERSONALI> apeFindAll20110214Result;

    /**
     * Recupera il valore della proprietà apeFindAll20110214Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfATTRIBUTIPERSONALI }{@code >}
     *     
     */
    public JAXBElement<ArrayOfATTRIBUTIPERSONALI> getAPEFindAll20110214Result() {
        return apeFindAll20110214Result;
    }

    /**
     * Imposta il valore della proprietà apeFindAll20110214Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfATTRIBUTIPERSONALI }{@code >}
     *     
     */
    public void setAPEFindAll20110214Result(JAXBElement<ArrayOfATTRIBUTIPERSONALI> value) {
        this.apeFindAll20110214Result = value;
    }

}
