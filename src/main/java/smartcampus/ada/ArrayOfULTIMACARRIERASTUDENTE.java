
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfULTIMA_CARRIERA_STUDENTE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfULTIMA_CARRIERA_STUDENTE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ULTIMA_CARRIERA_STUDENTE" type="{http://Data.ADAWs.unitn.it}ULTIMA_CARRIERA_STUDENTE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfULTIMA_CARRIERA_STUDENTE", propOrder = {
    "ultimacarrierastudente"
})
public class ArrayOfULTIMACARRIERASTUDENTE {

    @XmlElement(name = "ULTIMA_CARRIERA_STUDENTE", nillable = true)
    protected List<ULTIMACARRIERASTUDENTE> ultimacarrierastudente;

    /**
     * Gets the value of the ultimacarrierastudente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ultimacarrierastudente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getULTIMACARRIERASTUDENTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ULTIMACARRIERASTUDENTE }
     * 
     * 
     */
    public List<ULTIMACARRIERASTUDENTE> getULTIMACARRIERASTUDENTE() {
        if (ultimacarrierastudente == null) {
            ultimacarrierastudente = new ArrayList<ULTIMACARRIERASTUDENTE>();
        }
        return this.ultimacarrierastudente;
    }

}
