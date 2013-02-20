
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfACCOUNT_entity_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfACCOUNT_entity_base">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCOUNT_entity_base" type="{http://Data.ADAWs.unitn.it}ACCOUNT_entity_base" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfACCOUNT_entity_base", propOrder = {
    "accountEntityBase"
})
public class ArrayOfACCOUNTEntityBase {

    @XmlElement(name = "ACCOUNT_entity_base", nillable = true)
    protected List<ACCOUNTEntityBase> accountEntityBase;

    /**
     * Gets the value of the accountEntityBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountEntityBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACCOUNTEntityBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCOUNTEntityBase }
     * 
     * 
     */
    public List<ACCOUNTEntityBase> getACCOUNTEntityBase() {
        if (accountEntityBase == null) {
            accountEntityBase = new ArrayList<ACCOUNTEntityBase>();
        }
        return this.accountEntityBase;
    }

}
