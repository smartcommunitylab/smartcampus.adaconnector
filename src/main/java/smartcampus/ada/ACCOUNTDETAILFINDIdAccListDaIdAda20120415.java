
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
 *         &lt;element name="id_ada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account_tecnici" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account_non_attivi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idAda",
    "accountTecnici",
    "accountNonAttivi"
})
@XmlRootElement(name = "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20120415")
public class ACCOUNTDETAILFINDIdAccListDaIdAda20120415 {

    @XmlElementRef(name = "id_ada", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idAda;
    @XmlElementRef(name = "account_tecnici", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountTecnici;
    @XmlElementRef(name = "account_non_attivi", namespace = "http://Data.ADAWs.unitn.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountNonAttivi;

    /**
     * Recupera il valore della proprietà idAda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdAda() {
        return idAda;
    }

    /**
     * Imposta il valore della proprietà idAda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdAda(JAXBElement<String> value) {
        this.idAda = value;
    }

    /**
     * Recupera il valore della proprietà accountTecnici.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountTecnici() {
        return accountTecnici;
    }

    /**
     * Imposta il valore della proprietà accountTecnici.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountTecnici(JAXBElement<String> value) {
        this.accountTecnici = value;
    }

    /**
     * Recupera il valore della proprietà accountNonAttivi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountNonAttivi() {
        return accountNonAttivi;
    }

    /**
     * Imposta il valore della proprietà accountNonAttivi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountNonAttivi(JAXBElement<String> value) {
        this.accountNonAttivi = value;
    }

}
