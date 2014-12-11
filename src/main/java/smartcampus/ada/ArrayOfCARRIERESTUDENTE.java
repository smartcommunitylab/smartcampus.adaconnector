
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfCARRIERE_STUDENTE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCARRIERE_STUDENTE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARRIERE_STUDENTE" type="{http://Data.ADAWs.unitn.it}CARRIERE_STUDENTE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCARRIERE_STUDENTE", propOrder = {
    "carrierestudente"
})
public class ArrayOfCARRIERESTUDENTE {

    @XmlElement(name = "CARRIERE_STUDENTE", nillable = true)
    protected List<CARRIERESTUDENTE> carrierestudente;

    /**
     * Gets the value of the carrierestudente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierestudente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCARRIERESTUDENTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CARRIERESTUDENTE }
     * 
     * 
     */
    public List<CARRIERESTUDENTE> getCARRIERESTUDENTE() {
        if (carrierestudente == null) {
            carrierestudente = new ArrayList<CARRIERESTUDENTE>();
        }
        return this.carrierestudente;
    }

}
