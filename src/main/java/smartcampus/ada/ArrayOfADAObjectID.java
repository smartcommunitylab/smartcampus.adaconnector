
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfADA_object_ID complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfADA_object_ID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADA_object_ID" type="{http://Data.ADAWs.unitn.it}ADA_object_ID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfADA_object_ID", propOrder = {
    "adaObjectID"
})
public class ArrayOfADAObjectID {

    @XmlElement(name = "ADA_object_ID", nillable = true)
    protected List<ADAObjectID> adaObjectID;

    /**
     * Gets the value of the adaObjectID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adaObjectID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADAObjectID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADAObjectID }
     * 
     * 
     */
    public List<ADAObjectID> getADAObjectID() {
        if (adaObjectID == null) {
            adaObjectID = new ArrayList<ADAObjectID>();
        }
        return this.adaObjectID;
    }

}
