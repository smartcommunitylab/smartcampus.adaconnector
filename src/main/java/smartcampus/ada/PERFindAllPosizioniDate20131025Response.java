
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
 *         &lt;element name="PER_find_all_posizioni_date_20131025Result" type="{http://Data.ADAWs.unitn.it}ArrayOfPER_Posizioni_20091229" minOccurs="0"/>
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
    "perFindAllPosizioniDate20131025Result"
})
@XmlRootElement(name = "PER_find_all_posizioni_date_20131025Response")
public class PERFindAllPosizioniDate20131025Response {

    @XmlElementRef(name = "PER_find_all_posizioni_date_20131025Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPERPosizioni20091229> perFindAllPosizioniDate20131025Result;

    /**
     * Recupera il valore della proprietà perFindAllPosizioniDate20131025Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPERPosizioni20091229> getPERFindAllPosizioniDate20131025Result() {
        return perFindAllPosizioniDate20131025Result;
    }

    /**
     * Imposta il valore della proprietà perFindAllPosizioniDate20131025Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}
     *     
     */
    public void setPERFindAllPosizioniDate20131025Result(JAXBElement<ArrayOfPERPosizioni20091229> value) {
        this.perFindAllPosizioniDate20131025Result = value;
    }

}
