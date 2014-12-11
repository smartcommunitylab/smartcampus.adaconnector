
package smartcampus.ada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfACCOUNT_detail complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfACCOUNT_detail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCOUNT_detail" type="{http://Data.ADAWs.unitn.it}ACCOUNT_detail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfACCOUNT_detail", propOrder = {
    "accountDetail"
})
public class ArrayOfACCOUNTDetail {

    @XmlElement(name = "ACCOUNT_detail", nillable = true)
    protected List<ACCOUNTDetail> accountDetail;

    /**
     * Gets the value of the accountDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACCOUNTDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCOUNTDetail }
     * 
     * 
     */
    public List<ACCOUNTDetail> getACCOUNTDetail() {
        if (accountDetail == null) {
            accountDetail = new ArrayList<ACCOUNTDetail>();
        }
        return this.accountDetail;
    }

}
