
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfPER_Posizioni complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPER_Posizioni">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PER_Posizioni" type="{http://Data.ADAWs.unitn.it}PER_Posizioni" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPER_Posizioni", propOrder = {
    "perPosizioni"
})
public class ArrayOfPERPosizioni {

    @XmlElement(name = "PER_Posizioni", nillable = true)
    protected List<PERPosizioni> perPosizioni;

    /**
     * Gets the value of the perPosizioni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perPosizioni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPERPosizioni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PERPosizioni }
     * 
     * 
     */
    public List<PERPosizioni> getPERPosizioni() {
        if (perPosizioni == null) {
            perPosizioni = new ArrayList<PERPosizioni>();
        }
        return this.perPosizioni;
    }

}
