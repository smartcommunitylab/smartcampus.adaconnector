
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfGOG_relazione_gerarchica complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGOG_relazione_gerarchica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GOG_relazione_gerarchica" type="{http://Data.ADAWs.unitn.it}GOG_relazione_gerarchica" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGOG_relazione_gerarchica", propOrder = {
    "gogRelazioneGerarchica"
})
public class ArrayOfGOGRelazioneGerarchica {

    @XmlElement(name = "GOG_relazione_gerarchica", nillable = true)
    protected List<GOGRelazioneGerarchica> gogRelazioneGerarchica;

    /**
     * Gets the value of the gogRelazioneGerarchica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gogRelazioneGerarchica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGOGRelazioneGerarchica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GOGRelazioneGerarchica }
     * 
     * 
     */
    public List<GOGRelazioneGerarchica> getGOGRelazioneGerarchica() {
        if (gogRelazioneGerarchica == null) {
            gogRelazioneGerarchica = new ArrayList<GOGRelazioneGerarchica>();
        }
        return this.gogRelazioneGerarchica;
    }

}
