
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLIBRETTO_STUDENTE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLIBRETTO_STUDENTE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIBRETTO_STUDENTE" type="{http://Data.ADAWs.unitn.it}LIBRETTO_STUDENTE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLIBRETTO_STUDENTE", propOrder = {
    "librettostudente"
})
public class ArrayOfLIBRETTOSTUDENTE {

    @XmlElement(name = "LIBRETTO_STUDENTE", nillable = true)
    protected List<LIBRETTOSTUDENTE> librettostudente;

    /**
     * Gets the value of the librettostudente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the librettostudente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLIBRETTOSTUDENTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIBRETTOSTUDENTE }
     * 
     * 
     */
    public List<LIBRETTOSTUDENTE> getLIBRETTOSTUDENTE() {
        if (librettostudente == null) {
            librettostudente = new ArrayList<LIBRETTOSTUDENTE>();
        }
        return this.librettostudente;
    }

}
