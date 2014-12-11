
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
 *         &lt;element name="PER_find_cognome_nomeResult" type="{http://Data.ADAWs.unitn.it}ArrayOfPER_Persona" minOccurs="0"/>
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
    "perFindCognomeNomeResult"
})
@XmlRootElement(name = "PER_find_cognome_nomeResponse")
public class PERFindCognomeNomeResponse {

    @XmlElementRef(name = "PER_find_cognome_nomeResult", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPERPersona> perFindCognomeNomeResult;

    /**
     * Recupera il valore della proprietà perFindCognomeNomeResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPERPersona> getPERFindCognomeNomeResult() {
        return perFindCognomeNomeResult;
    }

    /**
     * Imposta il valore della proprietà perFindCognomeNomeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}
     *     
     */
    public void setPERFindCognomeNomeResult(JAXBElement<ArrayOfPERPersona> value) {
        this.perFindCognomeNomeResult = value;
    }

}
