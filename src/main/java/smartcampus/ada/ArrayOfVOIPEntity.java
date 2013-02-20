
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVOIP_entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVOIP_entity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VOIP_entity" type="{http://Data.ADAWs.unitn.it}VOIP_entity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVOIP_entity", propOrder = {
    "voipEntity"
})
public class ArrayOfVOIPEntity {

    @XmlElement(name = "VOIP_entity", nillable = true)
    protected List<VOIPEntity> voipEntity;

    /**
     * Gets the value of the voipEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voipEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOIPEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOIPEntity }
     * 
     * 
     */
    public List<VOIPEntity> getVOIPEntity() {
        if (voipEntity == null) {
            voipEntity = new ArrayList<VOIPEntity>();
        }
        return this.voipEntity;
    }

}
