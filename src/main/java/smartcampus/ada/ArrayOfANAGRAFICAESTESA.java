
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfANAGRAFICA_ESTESA complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfANAGRAFICA_ESTESA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ANAGRAFICA_ESTESA" type="{http://Data.ADAWs.unitn.it}ANAGRAFICA_ESTESA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfANAGRAFICA_ESTESA", propOrder = {
    "anagraficaestesa"
})
public class ArrayOfANAGRAFICAESTESA {

    @XmlElement(name = "ANAGRAFICA_ESTESA", nillable = true)
    protected List<ANAGRAFICAESTESA> anagraficaestesa;

    /**
     * Gets the value of the anagraficaestesa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anagraficaestesa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getANAGRAFICAESTESA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ANAGRAFICAESTESA }
     * 
     * 
     */
    public List<ANAGRAFICAESTESA> getANAGRAFICAESTESA() {
        if (anagraficaestesa == null) {
            anagraficaestesa = new ArrayList<ANAGRAFICAESTESA>();
        }
        return this.anagraficaestesa;
    }

}
