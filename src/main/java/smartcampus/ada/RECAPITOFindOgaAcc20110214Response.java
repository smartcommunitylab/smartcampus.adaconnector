
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
 *         &lt;element name="RECAPITO_find_oga_acc_20110214Result" type="{http://Data.ADAWs.unitn.it}ArrayOfRECAPITO" minOccurs="0"/>
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
    "recapitoFindOgaAcc20110214Result"
})
@XmlRootElement(name = "RECAPITO_find_oga_acc_20110214Response")
public class RECAPITOFindOgaAcc20110214Response {

    @XmlElementRef(name = "RECAPITO_find_oga_acc_20110214Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRECAPITO> recapitoFindOgaAcc20110214Result;

    /**
     * Recupera il valore della proprietà recapitoFindOgaAcc20110214Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRECAPITO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRECAPITO> getRECAPITOFindOgaAcc20110214Result() {
        return recapitoFindOgaAcc20110214Result;
    }

    /**
     * Imposta il valore della proprietà recapitoFindOgaAcc20110214Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRECAPITO }{@code >}
     *     
     */
    public void setRECAPITOFindOgaAcc20110214Result(JAXBElement<ArrayOfRECAPITO> value) {
        this.recapitoFindOgaAcc20110214Result = value;
    }

}
