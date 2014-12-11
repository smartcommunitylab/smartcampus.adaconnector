
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20110214Result" type="{http://Data.ADAWs.unitn.it}ArrayOfACCOUNT_detail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountdetailfindIdAccListDaIdAda20110214Result"
})
@XmlRootElement(name = "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20110214Response")
public class ACCOUNTDETAILFINDIdAccListDaIdAda20110214Response {

    @XmlElementRef(name = "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20110214Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfACCOUNTDetail> accountdetailfindIdAccListDaIdAda20110214Result;

    /**
     * Recupera il valore della proprietà accountdetailfindIdAccListDaIdAda20110214Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfACCOUNTDetail> getACCOUNTDETAILFINDIdAccListDaIdAda20110214Result() {
        return accountdetailfindIdAccListDaIdAda20110214Result;
    }

    /**
     * Imposta il valore della proprietà accountdetailfindIdAccListDaIdAda20110214Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTDetail }{@code >}
     *     
     */
    public void setACCOUNTDETAILFINDIdAccListDaIdAda20110214Result(JAXBElement<ArrayOfACCOUNTDetail> value) {
        this.accountdetailfindIdAccListDaIdAda20110214Result = value;
    }

}
