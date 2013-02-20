
package smartcampus.ada;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IADAWsData_20120415", targetNamespace = "http://Data.ADAWs.unitn.it")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IADAWsData20120415 {


    /**
     * 
     * @param nome
     * @param cognome
     * @return
     *     returns smartcampus.ada.ArrayOfPERPersona
     */
    @WebMethod(operationName = "PER_find_cognome_nome_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/PER_find_cognome_nome_20120415")
    @WebResult(name = "PER_find_cognome_nome_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "PER_find_cognome_nome_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindCognomeNome20120415")
    @ResponseWrapper(localName = "PER_find_cognome_nome_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindCognomeNome20120415Response")
    public ArrayOfPERPersona perFindCognomeNome20120415(
        @WebParam(name = "cognome", targetNamespace = "http://Data.ADAWs.unitn.it")
        String cognome,
        @WebParam(name = "nome", targetNamespace = "http://Data.ADAWs.unitn.it")
        String nome);

    /**
     * 
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfPERPersona
     */
    @WebMethod(operationName = "PER_find_id_ada_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/PER_find_id_ada_20120415")
    @WebResult(name = "PER_find_id_ada_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "PER_find_id_ada_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindIdAda20120415")
    @ResponseWrapper(localName = "PER_find_id_ada_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindIdAda20120415Response")
    public ArrayOfPERPersona perFindIdAda20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda);

    /**
     * 
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfPERPosizioni20091229
     */
    @WebMethod(operationName = "PER_find_posizioni_id_ada_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/PER_find_posizioni_id_ada_20120415")
    @WebResult(name = "PER_find_posizioni_id_ada_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "PER_find_posizioni_id_ada_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindPosizioniIdAda20120415")
    @ResponseWrapper(localName = "PER_find_posizioni_id_ada_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindPosizioniIdAda20120415Response")
    public ArrayOfPERPosizioni20091229 perFindPosizioniIdAda20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda);

    /**
     * 
     * @param descrizione
     * @param idToa
     * @param dataRiferimento
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfVOIPEntity
     */
    @WebMethod(operationName = "VOIP_find_entity_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/VOIP_find_entity_20120415")
    @WebResult(name = "VOIP_find_entity_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "VOIP_find_entity_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.VOIPFindEntity20120415")
    @ResponseWrapper(localName = "VOIP_find_entity_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.VOIPFindEntity20120415Response")
    public ArrayOfVOIPEntity voipFindEntity20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda,
        @WebParam(name = "descrizione", targetNamespace = "http://Data.ADAWs.unitn.it")
        String descrizione,
        @WebParam(name = "data_riferimento", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar dataRiferimento,
        @WebParam(name = "id_toa", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idToa);

    /**
     * 
     * @param dataRiferimento
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfPERPosizioni20091229
     */
    @WebMethod(operationName = "PER_find_all_posizioni_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/PER_find_all_posizioni_20120415")
    @WebResult(name = "PER_find_all_posizioni_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "PER_find_all_posizioni_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindAllPosizioni20120415")
    @ResponseWrapper(localName = "PER_find_all_posizioni_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindAllPosizioni20120415Response")
    public ArrayOfPERPosizioni20091229 perFindAllPosizioni20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda,
        @WebParam(name = "data_riferimento", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar dataRiferimento);

    /**
     * 
     * @param idAccount
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfACCOUNTEntityBase
     */
    @WebMethod(operationName = "ACCOUNT_find_id_ada_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/ACCOUNT_find_id_ada_20120415")
    @WebResult(name = "ACCOUNT_find_id_ada_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "ACCOUNT_find_id_ada_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ACCOUNTFindIdAda20120415")
    @ResponseWrapper(localName = "ACCOUNT_find_id_ada_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ACCOUNTFindIdAda20120415Response")
    public ArrayOfACCOUNTEntityBase accountFindIdAda20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda,
        @WebParam(name = "id_account", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAccount);

    /**
     * 
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfGOGRelazioneGerarchica
     */
    @WebMethod(operationName = "GOG_gerarchia_sto_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/GOG_gerarchia_sto_20120415")
    @WebResult(name = "GOG_gerarchia_sto_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "GOG_gerarchia_sto_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.GOGGerarchiaSto20120415")
    @ResponseWrapper(localName = "GOG_gerarchia_sto_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.GOGGerarchiaSto20120415Response")
    public ArrayOfGOGRelazioneGerarchica gogGerarchiaSto20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda);

    /**
     * 
     * @param idFad
     * @param idToa
     * @param dataRiferimento
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfCODERelation
     */
    @WebMethod(operationName = "CODE_find_id_fonte_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/CODE_find_id_fonte_20120415")
    @WebResult(name = "CODE_find_id_fonte_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "CODE_find_id_fonte_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.CODEFindIdFonte20120415")
    @ResponseWrapper(localName = "CODE_find_id_fonte_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.CODEFindIdFonte20120415Response")
    public ArrayOfCODERelation codeFindIdFonte20120415(
        @WebParam(name = "id_toa", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idToa,
        @WebParam(name = "id_fad", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idFad,
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda,
        @WebParam(name = "data_riferimento", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar dataRiferimento);

    /**
     * 
     * @param idFad
     * @param idToa
     * @param dataRiferimento
     * @param idLocal
     * @return
     *     returns smartcampus.ada.ArrayOfCODERelation
     */
    @WebMethod(operationName = "CODE_find_id_ada_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/CODE_find_id_ada_20120415")
    @WebResult(name = "CODE_find_id_ada_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "CODE_find_id_ada_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.CODEFindIdAda20120415")
    @ResponseWrapper(localName = "CODE_find_id_ada_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.CODEFindIdAda20120415Response")
    public ArrayOfCODERelation codeFindIdAda20120415(
        @WebParam(name = "id_toa", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idToa,
        @WebParam(name = "id_fad", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idFad,
        @WebParam(name = "id_local", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idLocal,
        @WebParam(name = "data_riferimento", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar dataRiferimento);

    /**
     * 
     * @param idLingua
     * @param idToa
     * @param dataRiferimento
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfADADescription
     */
    @WebMethod(operationName = "DESCRIZIONE_find_oga_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/DESCRIZIONE_find_oga_20120415")
    @WebResult(name = "DESCRIZIONE_find_oga_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "DESCRIZIONE_find_oga_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.DESCRIZIONEFindOga20120415")
    @ResponseWrapper(localName = "DESCRIZIONE_find_oga_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.DESCRIZIONEFindOga20120415Response")
    public ArrayOfADADescription descrizioneFindOga20120415(
        @WebParam(name = "id_toa", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idToa,
        @WebParam(name = "id_lingua", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idLingua,
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda,
        @WebParam(name = "data_riferimento", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar dataRiferimento);

    /**
     * 
     * @param idLingua
     * @param idToa
     * @param dataRiferimento
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfADADescription
     */
    @WebMethod(operationName = "DESCRIZIONE_find_atr_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/DESCRIZIONE_find_atr_20120415")
    @WebResult(name = "DESCRIZIONE_find_atr_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "DESCRIZIONE_find_atr_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.DESCRIZIONEFindAtr20120415")
    @ResponseWrapper(localName = "DESCRIZIONE_find_atr_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.DESCRIZIONEFindAtr20120415Response")
    public ArrayOfADADescription descrizioneFindAtr20120415(
        @WebParam(name = "id_toa", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idToa,
        @WebParam(name = "id_lingua", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idLingua,
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda,
        @WebParam(name = "data_riferimento", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar dataRiferimento);

    /**
     * 
     * @param username
     * @return
     *     returns smartcampus.ada.ArrayOfADAObjectID
     */
    @WebMethod(operationName = "ADA_ID_find_id_acc_da_username_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/ADA_ID_find_id_acc_da_username_20120415")
    @WebResult(name = "ADA_ID_find_id_acc_da_username_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "ADA_ID_find_id_acc_da_username_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ADAIDFindIdAccDaUsername20120415")
    @ResponseWrapper(localName = "ADA_ID_find_id_acc_da_username_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ADAIDFindIdAccDaUsername20120415Response")
    public ArrayOfADAObjectID adaIDFindIdAccDaUsername20120415(
        @WebParam(name = "username", targetNamespace = "http://Data.ADAWs.unitn.it")
        String username);

    /**
     * 
     * @param username
     * @return
     *     returns smartcampus.ada.ArrayOfADAObjectID
     */
    @WebMethod(operationName = "ADA_ID_find_id_ada_da_username_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/ADA_ID_find_id_ada_da_username_20120415")
    @WebResult(name = "ADA_ID_find_id_ada_da_username_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "ADA_ID_find_id_ada_da_username_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ADAIDFindIdAdaDaUsername20120415")
    @ResponseWrapper(localName = "ADA_ID_find_id_ada_da_username_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ADAIDFindIdAdaDaUsername20120415Response")
    public ArrayOfADAObjectID adaIDFindIdAdaDaUsername20120415(
        @WebParam(name = "username", targetNamespace = "http://Data.ADAWs.unitn.it")
        String username);

    /**
     * 
     * @param accountTecnici
     * @param idAda
     * @param accountNonAttivi
     * @return
     *     returns smartcampus.ada.ArrayOfACCOUNTDetail
     */
    @WebMethod(operationName = "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20120415")
    @WebResult(name = "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ACCOUNTDETAILFINDIdAccListDaIdAda20120415")
    @ResponseWrapper(localName = "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ACCOUNTDETAILFINDIdAccListDaIdAda20120415Response")
    public ArrayOfACCOUNTDetail accountDETAILFINDIdAccListDaIdAda20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda,
        @WebParam(name = "account_tecnici", targetNamespace = "http://Data.ADAWs.unitn.it")
        String accountTecnici,
        @WebParam(name = "account_non_attivi", targetNamespace = "http://Data.ADAWs.unitn.it")
        String accountNonAttivi);

    /**
     * 
     * @param idAcc
     * @return
     *     returns smartcampus.ada.ArrayOfACCOUNTMembership
     */
    @WebMethod(operationName = "ACCOUNT_MEMBERSHIP_find_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/ACCOUNT_MEMBERSHIP_find_20120415")
    @WebResult(name = "ACCOUNT_MEMBERSHIP_find_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "ACCOUNT_MEMBERSHIP_find_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ACCOUNTMEMBERSHIPFind20120415")
    @ResponseWrapper(localName = "ACCOUNT_MEMBERSHIP_find_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ACCOUNTMEMBERSHIPFind20120415Response")
    public ArrayOfACCOUNTMembership accountMEMBERSHIPFind20120415(
        @WebParam(name = "id_acc", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAcc);

    /**
     * 
     * @param idGru
     * @return
     *     returns smartcampus.ada.ArrayOfGROUPMember
     */
    @WebMethod(operationName = "GROUP_MEMBER_find_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/GROUP_MEMBER_find_20120415")
    @WebResult(name = "GROUP_MEMBER_find_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "GROUP_MEMBER_find_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.GROUPMEMBERFind20120415")
    @ResponseWrapper(localName = "GROUP_MEMBER_find_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.GROUPMEMBERFind20120415Response")
    public ArrayOfGROUPMember groupMEMBERFind20120415(
        @WebParam(name = "id_gru", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idGru);

    /**
     * 
     * @param idTlm
     * @param idGru
     * @param descrizione
     * @param gid
     * @return
     *     returns smartcampus.ada.ArrayOfGROUPDetail
     */
    @WebMethod(operationName = "GROUP_find_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/GROUP_find_20120415")
    @WebResult(name = "GROUP_find_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "GROUP_find_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.GROUPFind20120415")
    @ResponseWrapper(localName = "GROUP_find_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.GROUPFind20120415Response")
    public ArrayOfGROUPDetail groupFind20120415(
        @WebParam(name = "id_gru", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idGru,
        @WebParam(name = "id_tlm", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idTlm,
        @WebParam(name = "descrizione", targetNamespace = "http://Data.ADAWs.unitn.it")
        String descrizione,
        @WebParam(name = "gid", targetNamespace = "http://Data.ADAWs.unitn.it")
        Long gid);

    /**
     * 
     * @param tsoIdOga
     * @param froIdAtr
     * @param aData
     * @param daData
     * @param rupIdOga
     * @param ruoIdOga
     * @param stoIdOga
     * @return
     *     returns smartcampus.ada.ArrayOfPERPersona
     */
    @WebMethod(operationName = "PER_find_codici_base_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/PER_find_codici_base_20120415")
    @WebResult(name = "PER_find_codici_base_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "PER_find_codici_base_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindCodiciBase20120415")
    @ResponseWrapper(localName = "PER_find_codici_base_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindCodiciBase20120415Response")
    public ArrayOfPERPersona perFindCodiciBase20120415(
        @WebParam(name = "rup_id_oga", targetNamespace = "http://Data.ADAWs.unitn.it")
        String rupIdOga,
        @WebParam(name = "ruo_id_oga", targetNamespace = "http://Data.ADAWs.unitn.it")
        String ruoIdOga,
        @WebParam(name = "sto_id_oga", targetNamespace = "http://Data.ADAWs.unitn.it")
        String stoIdOga,
        @WebParam(name = "tso_id_oga", targetNamespace = "http://Data.ADAWs.unitn.it")
        String tsoIdOga,
        @WebParam(name = "fro_id_atr", targetNamespace = "http://Data.ADAWs.unitn.it")
        String froIdAtr,
        @WebParam(name = "da_data", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar daData,
        @WebParam(name = "a_data", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar aData);

    /**
     * 
     * @param idAcc
     * @param idOga
     * @return
     *     returns smartcampus.ada.ArrayOfRECAPITO
     */
    @WebMethod(operationName = "RECAPITO_find_oga_acc_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/RECAPITO_find_oga_acc_20120415")
    @WebResult(name = "RECAPITO_find_oga_acc_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "RECAPITO_find_oga_acc_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.RECAPITOFindOgaAcc20120415")
    @ResponseWrapper(localName = "RECAPITO_find_oga_acc_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.RECAPITOFindOgaAcc20120415Response")
    public ArrayOfRECAPITO recapitoFindOgaAcc20120415(
        @WebParam(name = "id_oga", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idOga,
        @WebParam(name = "id_acc", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAcc);

    /**
     * 
     * @param aData
     * @param daData
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfPERPosizioni20091229
     */
    @WebMethod(operationName = "PER_find_all_posizioni_date_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/PER_find_all_posizioni_date_20120415")
    @WebResult(name = "PER_find_all_posizioni_date_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "PER_find_all_posizioni_date_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindAllPosizioniDate20120415")
    @ResponseWrapper(localName = "PER_find_all_posizioni_date_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERFindAllPosizioniDate20120415Response")
    public ArrayOfPERPosizioni20091229 perFindAllPosizioniDate20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda,
        @WebParam(name = "da_data", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar daData,
        @WebParam(name = "a_data", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar aData);

    /**
     * 
     * @param lingua
     * @param idAda
     * @param dataRif
     * @return
     *     returns smartcampus.ada.ArrayOfATTRIBUTIDIDATTICA
     */
    @WebMethod(operationName = "ADI_find_all_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/ADI_find_all_20120415")
    @WebResult(name = "ADI_find_all_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "ADI_find_all_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ADIFindAll20120415")
    @ResponseWrapper(localName = "ADI_find_all_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.ADIFindAll20120415Response")
    public ArrayOfATTRIBUTIDIDATTICA adiFindAll20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda,
        @WebParam(name = "lingua", targetNamespace = "http://Data.ADAWs.unitn.it")
        String lingua,
        @WebParam(name = "data_rif", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar dataRif);

    /**
     * 
     * @param idAtr
     * @param lingua
     * @param idSsd
     * @param idAcu
     * @return
     *     returns smartcampus.ada.ArrayOfSETTORESDAREACUN
     */
    @WebMethod(operationName = "SSD_find_all_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/SSD_find_all_20120415")
    @WebResult(name = "SSD_find_all_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "SSD_find_all_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.SSDFindAll20120415")
    @ResponseWrapper(localName = "SSD_find_all_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.SSDFindAll20120415Response")
    public ArrayOfSETTORESDAREACUN ssdFindAll20120415(
        @WebParam(name = "id_atr", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAtr,
        @WebParam(name = "id_ssd", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idSsd,
        @WebParam(name = "id_acu", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAcu,
        @WebParam(name = "lingua", targetNamespace = "http://Data.ADAWs.unitn.it")
        String lingua);

    /**
     * 
     * @param idAda
     * @param dataRif
     * @return
     *     returns smartcampus.ada.ArrayOfATTRIBUTIPERSONALI
     */
    @WebMethod(operationName = "APE_find_all_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/APE_find_all_20120415")
    @WebResult(name = "APE_find_all_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "APE_find_all_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.APEFindAll20120415")
    @ResponseWrapper(localName = "APE_find_all_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.APEFindAll20120415Response")
    public ArrayOfATTRIBUTIPERSONALI apeFindAll20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda,
        @WebParam(name = "data_rif", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar dataRif);

    /**
     * 
     * @param indiceRigiditaFuzzy
     * @param dataNasc
     * @param codfis
     * @param locIdAtr
     * @param nome
     * @param nazIdAtr
     * @param nomePadre
     * @param cognome
     * @param sesso
     * @return
     *     returns smartcampus.ada.ArrayOfPERPersona
     */
    @WebMethod(operationName = "PER_check_identity_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/PER_check_identity_20120415")
    @WebResult(name = "PER_check_identity_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "PER_check_identity_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERCheckIdentity20120415")
    @ResponseWrapper(localName = "PER_check_identity_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERCheckIdentity20120415Response")
    public ArrayOfPERPersona perCheckIdentity20120415(
        @WebParam(name = "cognome", targetNamespace = "http://Data.ADAWs.unitn.it")
        String cognome,
        @WebParam(name = "nome", targetNamespace = "http://Data.ADAWs.unitn.it")
        String nome,
        @WebParam(name = "codfis", targetNamespace = "http://Data.ADAWs.unitn.it")
        String codfis,
        @WebParam(name = "loc_id_atr", targetNamespace = "http://Data.ADAWs.unitn.it")
        String locIdAtr,
        @WebParam(name = "naz_id_atr", targetNamespace = "http://Data.ADAWs.unitn.it")
        String nazIdAtr,
        @WebParam(name = "data_nasc", targetNamespace = "http://Data.ADAWs.unitn.it")
        XMLGregorianCalendar dataNasc,
        @WebParam(name = "sesso", targetNamespace = "http://Data.ADAWs.unitn.it")
        String sesso,
        @WebParam(name = "nome_padre", targetNamespace = "http://Data.ADAWs.unitn.it")
        String nomePadre,
        @WebParam(name = "indice_rigidita_fuzzy", targetNamespace = "http://Data.ADAWs.unitn.it")
        Double indiceRigiditaFuzzy);

    /**
     * 
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfATTIVITADIDATTICASOSTENUTA
     */
    @WebMethod(operationName = "PER_attivita_didattiche_sostenute_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/PER_attivita_didattiche_sostenute_20120415")
    @WebResult(name = "PER_attivita_didattiche_sostenute_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "PER_attivita_didattiche_sostenute_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERAttivitaDidatticheSostenute20120415")
    @ResponseWrapper(localName = "PER_attivita_didattiche_sostenute_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.PERAttivitaDidatticheSostenute20120415Response")
    public ArrayOfATTIVITADIDATTICASOSTENUTA perAttivitaDidatticheSostenute20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda);

    /**
     * 
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfLIBRETTOSTUDENTE
     */
    @WebMethod(operationName = "LBS_libretto_studente_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/LBS_libretto_studente_20120415")
    @WebResult(name = "LBS_libretto_studente_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "LBS_libretto_studente_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.LBSLibrettoStudente20120415")
    @ResponseWrapper(localName = "LBS_libretto_studente_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.LBSLibrettoStudente20120415Response")
    public ArrayOfLIBRETTOSTUDENTE lbsLibrettoStudente20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda);

    /**
     * 
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfANAGRAFICAESTESA
     */
    @WebMethod(operationName = "AES_anagrafica_estesa_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/AES_anagrafica_estesa_20120415")
    @WebResult(name = "AES_anagrafica_estesa_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "AES_anagrafica_estesa_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.AESAnagraficaEstesa20120415")
    @ResponseWrapper(localName = "AES_anagrafica_estesa_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.AESAnagraficaEstesa20120415Response")
    public ArrayOfANAGRAFICAESTESA aesAnagraficaEstesa20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda);

    /**
     * 
     * @param idAda
     * @return
     *     returns smartcampus.ada.ArrayOfULTIMACARRIERASTUDENTE
     */
    @WebMethod(operationName = "UCS_ultima_carriera_studente_20120415", action = "http://Data.ADAWs.unitn.it/IADAWsData_20120415/UCS_ultima_carriera_studente_20120415")
    @WebResult(name = "UCS_ultima_carriera_studente_20120415Result", targetNamespace = "http://Data.ADAWs.unitn.it")
    @RequestWrapper(localName = "UCS_ultima_carriera_studente_20120415", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.UCSUltimaCarrieraStudente20120415")
    @ResponseWrapper(localName = "UCS_ultima_carriera_studente_20120415Response", targetNamespace = "http://Data.ADAWs.unitn.it", className = "smartcampus.ada.UCSUltimaCarrieraStudente20120415Response")
    public ArrayOfULTIMACARRIERASTUDENTE ucsUltimaCarrieraStudente20120415(
        @WebParam(name = "id_ada", targetNamespace = "http://Data.ADAWs.unitn.it")
        String idAda);

}
