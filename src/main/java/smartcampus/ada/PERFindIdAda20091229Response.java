
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
 *         &lt;element name="PER_find_id_ada_20091229Result" type="{http://Data.ADAWs.unitn.it}ArrayOfPER_Persona" minOccurs="0"/>
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
    "perFindIdAda20091229Result"
})
@XmlRootElement(name = "PER_find_id_ada_20091229Response")
public class PERFindIdAda20091229Response {

    @XmlElementRef(name = "PER_find_id_ada_20091229Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPERPersona> perFindIdAda20091229Result;

    /**
     * Recupera il valore della proprietà perFindIdAda20091229Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPERPersona> getPERFindIdAda20091229Result() {
        return perFindIdAda20091229Result;
    }

    /**
     * Imposta il valore della proprietà perFindIdAda20091229Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}
     *     
     */
    public void setPERFindIdAda20091229Result(JAXBElement<ArrayOfPERPersona> value) {
        this.perFindIdAda20091229Result = value;
    }

}
