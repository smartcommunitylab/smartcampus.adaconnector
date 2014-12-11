
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfPER_Posizioni_20091229 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPER_Posizioni_20091229">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PER_Posizioni_20091229" type="{http://Data.ADAWs.unitn.it}PER_Posizioni_20091229" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPER_Posizioni_20091229", propOrder = {
    "perPosizioni20091229"
})
public class ArrayOfPERPosizioni20091229 {

    @XmlElement(name = "PER_Posizioni_20091229", nillable = true)
    protected List<PERPosizioni20091229> perPosizioni20091229;

    /**
     * Gets the value of the perPosizioni20091229 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perPosizioni20091229 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPERPosizioni20091229().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PERPosizioni20091229 }
     * 
     * 
     */
    public List<PERPosizioni20091229> getPERPosizioni20091229() {
        if (perPosizioni20091229 == null) {
            perPosizioni20091229 = new ArrayList<PERPosizioni20091229>();
        }
        return this.perPosizioni20091229;
    }

}
