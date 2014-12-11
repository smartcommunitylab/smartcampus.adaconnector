
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfSETTORE_SD_AREA_CUN complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSETTORE_SD_AREA_CUN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SETTORE_SD_AREA_CUN" type="{http://Data.ADAWs.unitn.it}SETTORE_SD_AREA_CUN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSETTORE_SD_AREA_CUN", propOrder = {
    "settoresdareacun"
})
public class ArrayOfSETTORESDAREACUN {

    @XmlElement(name = "SETTORE_SD_AREA_CUN", nillable = true)
    protected List<SETTORESDAREACUN> settoresdareacun;

    /**
     * Gets the value of the settoresdareacun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settoresdareacun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSETTORESDAREACUN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SETTORESDAREACUN }
     * 
     * 
     */
    public List<SETTORESDAREACUN> getSETTORESDAREACUN() {
        if (settoresdareacun == null) {
            settoresdareacun = new ArrayList<SETTORESDAREACUN>();
        }
        return this.settoresdareacun;
    }

}
