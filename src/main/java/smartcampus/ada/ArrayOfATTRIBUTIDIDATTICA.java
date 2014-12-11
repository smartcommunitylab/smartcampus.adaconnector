
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfATTRIBUTI_DIDATTICA complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfATTRIBUTI_DIDATTICA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ATTRIBUTI_DIDATTICA" type="{http://Data.ADAWs.unitn.it}ATTRIBUTI_DIDATTICA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfATTRIBUTI_DIDATTICA", propOrder = {
    "attributididattica"
})
public class ArrayOfATTRIBUTIDIDATTICA {

    @XmlElement(name = "ATTRIBUTI_DIDATTICA", nillable = true)
    protected List<ATTRIBUTIDIDATTICA> attributididattica;

    /**
     * Gets the value of the attributididattica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributididattica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTRIBUTIDIDATTICA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATTRIBUTIDIDATTICA }
     * 
     * 
     */
    public List<ATTRIBUTIDIDATTICA> getATTRIBUTIDIDATTICA() {
        if (attributididattica == null) {
            attributididattica = new ArrayList<ATTRIBUTIDIDATTICA>();
        }
        return this.attributididattica;
    }

}
