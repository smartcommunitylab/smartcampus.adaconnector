
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
 *         &lt;element name="PER_find_posizioni_id_ada_20110214Result" type="{http://Data.ADAWs.unitn.it}ArrayOfPER_Posizioni_20091229" minOccurs="0"/>
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
    "perFindPosizioniIdAda20110214Result"
})
@XmlRootElement(name = "PER_find_posizioni_id_ada_20110214Response")
public class PERFindPosizioniIdAda20110214Response {

    @XmlElementRef(name = "PER_find_posizioni_id_ada_20110214Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPERPosizioni20091229> perFindPosizioniIdAda20110214Result;

    /**
     * Recupera il valore della proprietà perFindPosizioniIdAda20110214Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPERPosizioni20091229> getPERFindPosizioniIdAda20110214Result() {
        return perFindPosizioniIdAda20110214Result;
    }

    /**
     * Imposta il valore della proprietà perFindPosizioniIdAda20110214Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}
     *     
     */
    public void setPERFindPosizioniIdAda20110214Result(JAXBElement<ArrayOfPERPosizioni20091229> value) {
        this.perFindPosizioniIdAda20110214Result = value;
    }

}
