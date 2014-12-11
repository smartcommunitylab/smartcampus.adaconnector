
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfANAGRAFICA_ESTESA_20131025 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfANAGRAFICA_ESTESA_20131025">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ANAGRAFICA_ESTESA_20131025" type="{http://Data.ADAWs.unitn.it}ANAGRAFICA_ESTESA_20131025" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfANAGRAFICA_ESTESA_20131025", propOrder = {
    "anagraficaestesa20131025"
})
public class ArrayOfANAGRAFICAESTESA20131025 {

    @XmlElement(name = "ANAGRAFICA_ESTESA_20131025", nillable = true)
    protected List<ANAGRAFICAESTESA20131025> anagraficaestesa20131025;

    /**
     * Gets the value of the anagraficaestesa20131025 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anagraficaestesa20131025 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getANAGRAFICAESTESA20131025().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ANAGRAFICAESTESA20131025 }
     * 
     * 
     */
    public List<ANAGRAFICAESTESA20131025> getANAGRAFICAESTESA20131025() {
        if (anagraficaestesa20131025 == null) {
            anagraficaestesa20131025 = new ArrayList<ANAGRAFICAESTESA20131025>();
        }
        return this.anagraficaestesa20131025;
    }

}
