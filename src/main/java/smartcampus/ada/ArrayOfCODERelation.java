
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfCODE_relation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCODE_relation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE_relation" type="{http://Data.ADAWs.unitn.it}CODE_relation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCODE_relation", propOrder = {
    "codeRelation"
})
public class ArrayOfCODERelation {

    @XmlElement(name = "CODE_relation", nillable = true)
    protected List<CODERelation> codeRelation;

    /**
     * Gets the value of the codeRelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeRelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCODERelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CODERelation }
     * 
     * 
     */
    public List<CODERelation> getCODERelation() {
        if (codeRelation == null) {
            codeRelation = new ArrayList<CODERelation>();
        }
        return this.codeRelation;
    }

}
