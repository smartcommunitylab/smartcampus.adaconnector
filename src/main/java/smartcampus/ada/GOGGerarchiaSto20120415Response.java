
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
 *         &lt;element name="GOG_gerarchia_sto_20120415Result" type="{http://Data.ADAWs.unitn.it}ArrayOfGOG_relazione_gerarchica" minOccurs="0"/>
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
    "gogGerarchiaSto20120415Result"
})
@XmlRootElement(name = "GOG_gerarchia_sto_20120415Response")
public class GOGGerarchiaSto20120415Response {

    @XmlElementRef(name = "GOG_gerarchia_sto_20120415Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGOGRelazioneGerarchica> gogGerarchiaSto20120415Result;

    /**
     * Recupera il valore della proprietà gogGerarchiaSto20120415Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGOGRelazioneGerarchica }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGOGRelazioneGerarchica> getGOGGerarchiaSto20120415Result() {
        return gogGerarchiaSto20120415Result;
    }

    /**
     * Imposta il valore della proprietà gogGerarchiaSto20120415Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGOGRelazioneGerarchica }{@code >}
     *     
     */
    public void setGOGGerarchiaSto20120415Result(JAXBElement<ArrayOfGOGRelazioneGerarchica> value) {
        this.gogGerarchiaSto20120415Result = value;
    }

}
