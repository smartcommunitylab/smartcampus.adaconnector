
package smartcampus.ada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20120415Result" type="{http://Data.ADAWs.unitn.it}ArrayOfACCOUNT_detail" minOccurs="0"/>
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
    "accountdetailfindIdAccListDaIdAda20120415Result"
})
@XmlRootElement(name = "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20120415Response")
public class ACCOUNTDETAILFINDIdAccListDaIdAda20120415Response {

    @XmlElementRef(name = "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20120415Result", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfACCOUNTDetail> accountdetailfindIdAccListDaIdAda20120415Result;

    /**
     * Gets the value of the accountdetailfindIdAccListDaIdAda20120415Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfACCOUNTDetail> getACCOUNTDETAILFINDIdAccListDaIdAda20120415Result() {
        return accountdetailfindIdAccListDaIdAda20120415Result;
    }

    /**
     * Sets the value of the accountdetailfindIdAccListDaIdAda20120415Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTDetail }{@code >}
     *     
     */
    public void setACCOUNTDETAILFINDIdAccListDaIdAda20120415Result(JAXBElement<ArrayOfACCOUNTDetail> value) {
        this.accountdetailfindIdAccListDaIdAda20120415Result = value;
    }

}
