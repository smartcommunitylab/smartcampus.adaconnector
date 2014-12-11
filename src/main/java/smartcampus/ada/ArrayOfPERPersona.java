
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfPER_Persona complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPER_Persona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PER_Persona" type="{http://Data.ADAWs.unitn.it}PER_Persona" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPER_Persona", propOrder = {
    "perPersona"
})
public class ArrayOfPERPersona {

    @XmlElement(name = "PER_Persona", nillable = true)
    protected List<PERPersona> perPersona;

    /**
     * Gets the value of the perPersona property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perPersona property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPERPersona().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PERPersona }
     * 
     * 
     */
    public List<PERPersona> getPERPersona() {
        if (perPersona == null) {
            perPersona = new ArrayList<PERPersona>();
        }
        return this.perPersona;
    }

}
