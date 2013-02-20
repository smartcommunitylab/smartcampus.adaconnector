
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfATTIVITA_DIDATTICA_SOSTENUTA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfATTIVITA_DIDATTICA_SOSTENUTA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ATTIVITA_DIDATTICA_SOSTENUTA" type="{http://Data.ADAWs.unitn.it}ATTIVITA_DIDATTICA_SOSTENUTA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfATTIVITA_DIDATTICA_SOSTENUTA", propOrder = {
    "attivitadidatticasostenuta"
})
public class ArrayOfATTIVITADIDATTICASOSTENUTA {

    @XmlElement(name = "ATTIVITA_DIDATTICA_SOSTENUTA", nillable = true)
    protected List<ATTIVITADIDATTICASOSTENUTA> attivitadidatticasostenuta;

    /**
     * Gets the value of the attivitadidatticasostenuta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attivitadidatticasostenuta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTIVITADIDATTICASOSTENUTA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATTIVITADIDATTICASOSTENUTA }
     * 
     * 
     */
    public List<ATTIVITADIDATTICASOSTENUTA> getATTIVITADIDATTICASOSTENUTA() {
        if (attivitadidatticasostenuta == null) {
            attivitadidatticasostenuta = new ArrayList<ATTIVITADIDATTICASOSTENUTA>();
        }
        return this.attivitadidatticasostenuta;
    }

}
