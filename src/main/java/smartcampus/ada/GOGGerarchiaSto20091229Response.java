
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
 *         &lt;element name="GOG_gerarchia_sto_20091229Result" type="{http://Data.ADAWs.unitn.it}ArrayOfGOG_relazione_gerarchica" minOccurs="0"/>
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
    "gogGerarchiaSto20091229Result"
})
@XmlRootElement(name = "GOG_gerarchia_sto_20091229Response")
public class GOGGerarchiaSto20091229Response {

    @XmlElementRef(name = "GOG_gerarchia_sto_20091229Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGOGRelazioneGerarchica> gogGerarchiaSto20091229Result;

    /**
     * Recupera il valore della proprietà gogGerarchiaSto20091229Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGOGRelazioneGerarchica }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGOGRelazioneGerarchica> getGOGGerarchiaSto20091229Result() {
        return gogGerarchiaSto20091229Result;
    }

    /**
     * Imposta il valore della proprietà gogGerarchiaSto20091229Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGOGRelazioneGerarchica }{@code >}
     *     
     */
    public void setGOGGerarchiaSto20091229Result(JAXBElement<ArrayOfGOGRelazioneGerarchica> value) {
        this.gogGerarchiaSto20091229Result = value;
    }

}
