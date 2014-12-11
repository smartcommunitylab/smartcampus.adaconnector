
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
 *         &lt;element name="AES_anagrafica_estesa_20131025Result" type="{http://Data.ADAWs.unitn.it}ArrayOfANAGRAFICA_ESTESA_20131025" minOccurs="0"/>
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
    "aesAnagraficaEstesa20131025Result"
})
@XmlRootElement(name = "AES_anagrafica_estesa_20131025Response")
public class AESAnagraficaEstesa20131025Response {

    @XmlElementRef(name = "AES_anagrafica_estesa_20131025Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfANAGRAFICAESTESA20131025> aesAnagraficaEstesa20131025Result;

    /**
     * Recupera il valore della proprietà aesAnagraficaEstesa20131025Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfANAGRAFICAESTESA20131025 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfANAGRAFICAESTESA20131025> getAESAnagraficaEstesa20131025Result() {
        return aesAnagraficaEstesa20131025Result;
    }

    /**
     * Imposta il valore della proprietà aesAnagraficaEstesa20131025Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfANAGRAFICAESTESA20131025 }{@code >}
     *     
     */
    public void setAESAnagraficaEstesa20131025Result(JAXBElement<ArrayOfANAGRAFICAESTESA20131025> value) {
        this.aesAnagraficaEstesa20131025Result = value;
    }

}
