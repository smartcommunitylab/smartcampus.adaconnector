
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRECAPITO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRECAPITO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECAPITO" type="{http://Data.ADAWs.unitn.it}RECAPITO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRECAPITO", propOrder = {
    "recapito"
})
public class ArrayOfRECAPITO {

    @XmlElement(name = "RECAPITO", nillable = true)
    protected List<RECAPITO> recapito;

    /**
     * Gets the value of the recapito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recapito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECAPITO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECAPITO }
     * 
     * 
     */
    public List<RECAPITO> getRECAPITO() {
        if (recapito == null) {
            recapito = new ArrayList<RECAPITO>();
        }
        return this.recapito;
    }

}
