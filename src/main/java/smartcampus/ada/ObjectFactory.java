
package smartcampus.ada;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the smartcampus.ada package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CODEFindIdFonte20110214ResponseCODEFindIdFonte20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "CODE_find_id_fonte_20110214Result");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _ATTRIBUTIDIDATTICA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ATTRIBUTI_DIDATTICA");
    private final static QName _ACCOUNTMembership_QNAME = new QName("http://Data.ADAWs.unitn.it", "ACCOUNT_membership");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ArrayOfADAObjectID_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfADA_object_ID");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ULTIMACARRIERASTUDENTE_QNAME = new QName("http://Data.ADAWs.unitn.it", "ULTIMA_CARRIERA_STUDENTE");
    private final static QName _SETTORESDAREACUN_QNAME = new QName("http://Data.ADAWs.unitn.it", "SETTORE_SD_AREA_CUN");
    private final static QName _ArrayOfANAGRAFICAESTESA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfANAGRAFICA_ESTESA");
    private final static QName _ArrayOfGROUPDetail_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfGROUP_detail");
    private final static QName _ArrayOfVOIPEntity_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfVOIP_entity");
    private final static QName _ATTRIBUTIPERSONALI_QNAME = new QName("http://Data.ADAWs.unitn.it", "ATTRIBUTI_PERSONALI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _PERPersona_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_Persona");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _PERPosizioni_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_Posizioni");
    private final static QName _GOGRelazioneGerarchica_QNAME = new QName("http://Data.ADAWs.unitn.it", "GOG_relazione_gerarchica");
    private final static QName _ArrayOfRECAPITO_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfRECAPITO");
    private final static QName _LIBRETTOSTUDENTE_QNAME = new QName("http://Data.ADAWs.unitn.it", "LIBRETTO_STUDENTE");
    private final static QName _PERPosizioni20091229_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_Posizioni_20091229");
    private final static QName _RECAPITO_QNAME = new QName("http://Data.ADAWs.unitn.it", "RECAPITO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ArrayOfADADescription_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfADA_description");
    private final static QName _ArrayOfCODERelation_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfCODE_relation");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ADADescription_QNAME = new QName("http://Data.ADAWs.unitn.it", "ADA_description");
    private final static QName _ACCOUNTDetail_QNAME = new QName("http://Data.ADAWs.unitn.it", "ACCOUNT_detail");
    private final static QName _ArrayOfATTIVITADIDATTICASOSTENUTA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfATTIVITA_DIDATTICA_SOSTENUTA");
    private final static QName _ArrayOfLIBRETTOSTUDENTE_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfLIBRETTO_STUDENTE");
    private final static QName _ArrayOfATTRIBUTIDIDATTICA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfATTRIBUTI_DIDATTICA");
    private final static QName _ANAGRAFICAESTESA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ANAGRAFICA_ESTESA");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfPERPersona_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfPER_Persona");
    private final static QName _ArrayOfGOGRelazioneGerarchica_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfGOG_relazione_gerarchica");
    private final static QName _ArrayOfPERPosizioni20091229_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfPER_Posizioni_20091229");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfATTRIBUTIPERSONALI_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfATTRIBUTI_PERSONALI");
    private final static QName _ArrayOfACCOUNTMembership_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfACCOUNT_membership");
    private final static QName _ArrayOfGROUPMember_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfGROUP_member");
    private final static QName _GROUPDetail_QNAME = new QName("http://Data.ADAWs.unitn.it", "GROUP_detail");
    private final static QName _ArrayOfACCOUNTEntityBase_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfACCOUNT_entity_base");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _GROUPMember_QNAME = new QName("http://Data.ADAWs.unitn.it", "GROUP_member");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfPERPosizioni_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfPER_Posizioni");
    private final static QName _ATTIVITADIDATTICASOSTENUTA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ATTIVITA_DIDATTICA_SOSTENUTA");
    private final static QName _ACCOUNTEntityBase_QNAME = new QName("http://Data.ADAWs.unitn.it", "ACCOUNT_entity_base");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfSETTORESDAREACUN_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfSETTORE_SD_AREA_CUN");
    private final static QName _ArrayOfULTIMACARRIERASTUDENTE_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfULTIMA_CARRIERA_STUDENTE");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ADAObjectID_QNAME = new QName("http://Data.ADAWs.unitn.it", "ADA_object_ID");
    private final static QName _CODERelation_QNAME = new QName("http://Data.ADAWs.unitn.it", "CODE_relation");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _VOIPEntity_QNAME = new QName("http://Data.ADAWs.unitn.it", "VOIP_entity");
    private final static QName _ArrayOfACCOUNTDetail_QNAME = new QName("http://Data.ADAWs.unitn.it", "ArrayOfACCOUNT_detail");
    private final static QName _GOGRelazioneGerarchicaIDADAFIGLIO_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_ADA_FIGLIO");
    private final static QName _GOGRelazioneGerarchicaLIVELLO_QNAME = new QName("http://Data.ADAWs.unitn.it", "LIVELLO");
    private final static QName _GOGRelazioneGerarchicaIDADAPADRE_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_ADA_PADRE");
    private final static QName _GOGRelazioneGerarchicaIDTSO_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_TSO");
    private final static QName _GOGRelazioneGerarchicaORDINE_QNAME = new QName("http://Data.ADAWs.unitn.it", "ORDINE");
    private final static QName _GOGRelazioneGerarchicaFINEGOG_QNAME = new QName("http://Data.ADAWs.unitn.it", "FINE_GOG");
    private final static QName _GOGRelazioneGerarchicaINIZIOGOG_QNAME = new QName("http://Data.ADAWs.unitn.it", "INIZIO_GOG");
    private final static QName _GROUPMEMBERFind20110214ResponseGROUPMEMBERFind20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "GROUP_MEMBER_find_20110214Result");
    private final static QName _ACCOUNTMEMBERSHIPFind20120415ResponseACCOUNTMEMBERSHIPFind20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ACCOUNT_MEMBERSHIP_find_20120415Result");
    private final static QName _ATTRIBUTIPERSONALIFINE_QNAME = new QName("http://Data.ADAWs.unitn.it", "FINE");
    private final static QName _ATTRIBUTIPERSONALIIDADA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_ADA");
    private final static QName _ATTRIBUTIPERSONALIALIASNOME_QNAME = new QName("http://Data.ADAWs.unitn.it", "ALIAS_NOME");
    private final static QName _ATTRIBUTIPERSONALIALIASCOGNOME_QNAME = new QName("http://Data.ADAWs.unitn.it", "ALIAS_COGNOME");
    private final static QName _ATTRIBUTIPERSONALIINIZIO_QNAME = new QName("http://Data.ADAWs.unitn.it", "INIZIO");
    private final static QName _UCSUltimaCarrieraStudente20120415ResponseUCSUltimaCarrieraStudente20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "UCS_ultima_carriera_studente_20120415Result");
    private final static QName _PERPosizioni20091229PPEIDOGA_QNAME = new QName("http://Data.ADAWs.unitn.it", "PPE_ID_OGA");
    private final static QName _PERPosizioni20091229FROIDATR_QNAME = new QName("http://Data.ADAWs.unitn.it", "FRO_ID_ATR");
    private final static QName _PERPosizioni20091229PORIDOGA_QNAME = new QName("http://Data.ADAWs.unitn.it", "POR_ID_OGA");
    private final static QName _PERPosizioni20091229INIZIOPPE_QNAME = new QName("http://Data.ADAWs.unitn.it", "INIZIO_PPE");
    private final static QName _PERPosizioni20091229DESCRIZIONEPOR_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_POR");
    private final static QName _PERPosizioni20091229FINEPPE_QNAME = new QName("http://Data.ADAWs.unitn.it", "FINE_PPE");
    private final static QName _PERPosizioni20091229PERIDOGA_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_ID_OGA");
    private final static QName _PERPosizioni20091229RUPIDOGA_QNAME = new QName("http://Data.ADAWs.unitn.it", "RUP_ID_OGA");
    private final static QName _PERPosizioni20091229DESCRIZIONESTO_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_STO");
    private final static QName _PERPosizioni20091229LINGUA_QNAME = new QName("http://Data.ADAWs.unitn.it", "LINGUA");
    private final static QName _PERPosizioni20091229DESCRIZIONERUO_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_RUO");
    private final static QName _PERPosizioni20091229DESCRIZIONERUP_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_RUP");
    private final static QName _PERPosizioni20091229INIZIOSOG_QNAME = new QName("http://Data.ADAWs.unitn.it", "INIZIO_SOG");
    private final static QName _PERPosizioni20091229FINEPOR_QNAME = new QName("http://Data.ADAWs.unitn.it", "FINE_POR");
    private final static QName _PERPosizioni20091229DESCRIZIONESED_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_SED");
    private final static QName _PERPosizioni20091229RUOIDOGA_QNAME = new QName("http://Data.ADAWs.unitn.it", "RUO_ID_OGA");
    private final static QName _PERPosizioni20091229PROIDOGA_QNAME = new QName("http://Data.ADAWs.unitn.it", "PRO_ID_OGA");
    private final static QName _PERPosizioni20091229STOIDOGA_QNAME = new QName("http://Data.ADAWs.unitn.it", "STO_ID_OGA");
    private final static QName _PERPosizioni20091229DESCRIZIONEPPE_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_PPE");
    private final static QName _PERPosizioni20091229DESCRIZIONEFRO_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_FRO");
    private final static QName _PERPosizioni20091229INIZIOPOR_QNAME = new QName("http://Data.ADAWs.unitn.it", "INIZIO_POR");
    private final static QName _PERPosizioni20091229SEDIDOGA_QNAME = new QName("http://Data.ADAWs.unitn.it", "SED_ID_OGA");
    private final static QName _PERPosizioni20091229DESCRIZIONEPRO_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_PRO");
    private final static QName _PERPosizioni20091229FINESOG_QNAME = new QName("http://Data.ADAWs.unitn.it", "FINE_SOG");
    private final static QName _GROUPMEMBERFind20120415ResponseGROUPMEMBERFind20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "GROUP_MEMBER_find_20120415Result");
    private final static QName _ADIFindAll20110214ResponseADIFindAll20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ADI_find_all_20110214Result");
    private final static QName _PERFindCognomeNome20091229ResponsePERFindCognomeNome20091229Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_cognome_nome_20091229Result");
    private final static QName _VOIPFindEntity20110214ResponseVOIPFindEntity20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "VOIP_find_entity_20110214Result");
    private final static QName _PERAttivitaDidatticheSostenute20120415ResponsePERAttivitaDidatticheSostenute20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_attivita_didattiche_sostenute_20120415Result");
    private final static QName _VOIPFindEntity20091229Descrizione_QNAME = new QName("http://Data.ADAWs.unitn.it", "descrizione");
    private final static QName _VOIPFindEntity20091229DataRiferimento_QNAME = new QName("http://Data.ADAWs.unitn.it", "data_riferimento");
    private final static QName _VOIPFindEntity20091229IdAda_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_ada");
    private final static QName _VOIPFindEntity20091229IdToa_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_toa");
    private final static QName _GROUPMEMBERFind20120415IdGru_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_gru");
    private final static QName _SSDFindAll20120415IdAtr_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_atr");
    private final static QName _SSDFindAll20120415Lingua_QNAME = new QName("http://Data.ADAWs.unitn.it", "lingua");
    private final static QName _SSDFindAll20120415IdSsd_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_ssd");
    private final static QName _SSDFindAll20120415IdAcu_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_acu");
    private final static QName _ANAGRAFICAESTESADOMICILIOPRESSO_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_PRESSO");
    private final static QName _ANAGRAFICAESTESARESIDENZAFRAZIONE_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_FRAZIONE");
    private final static QName _ANAGRAFICAESTESAANAGRAFICAVALIDA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ANAGRAFICA_VALIDA");
    private final static QName _ANAGRAFICAESTESAIDADACITTADINANZA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_ADA_CITTADINANZA");
    private final static QName _ANAGRAFICAESTESADOMICILIOPREFISSOINTERNAZIONALE_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_PREFISSO_INTERNAZIONALE");
    private final static QName _ANAGRAFICAESTESARESIDENZANAZIONEDESCRIZIONEIT_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_NAZIONE_DESCRIZIONE_IT");
    private final static QName _ANAGRAFICAESTESARESIDENZAVIA_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_VIA");
    private final static QName _ANAGRAFICAESTESAIDGIADAPERSONA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_GIADA_PERSONA");
    private final static QName _ANAGRAFICAESTESARESIDENZAIDADACOMUNE_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_ID_ADA_COMUNE");
    private final static QName _ANAGRAFICAESTESADOMICILIOIDADANAZIONE_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_ID_ADA_NAZIONE");
    private final static QName _ANAGRAFICAESTESAFAX_QNAME = new QName("http://Data.ADAWs.unitn.it", "FAX");
    private final static QName _ANAGRAFICAESTESADOMICILIONUMEROCIVICO_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_NUMERO_CIVICO");
    private final static QName _ANAGRAFICAESTESARESIDENZACITTASTRANIERA_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_CITTA_STRANIERA");
    private final static QName _ANAGRAFICAESTESARESIDENZAPROVINCIA_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_PROVINCIA");
    private final static QName _ANAGRAFICAESTESADESCRIZIONECITTADINANZAIT_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_CITTADINANZA_IT");
    private final static QName _ANAGRAFICAESTESACELLULARE_QNAME = new QName("http://Data.ADAWs.unitn.it", "CELLULARE");
    private final static QName _ANAGRAFICAESTESARESIDENZAIDADANAZIONE_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_ID_ADA_NAZIONE");
    private final static QName _ANAGRAFICAESTESADOMICILIOCOMUNEDESCRIZIONEEN_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_COMUNE_DESCRIZIONE_EN");
    private final static QName _ANAGRAFICAESTESADOMICILIOTELEFONO_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_TELEFONO");
    private final static QName _ANAGRAFICAESTESARESIDENZACAP_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_CAP");
    private final static QName _ANAGRAFICAESTESARESIDENZACOMUNEDESCRIZIONEEN_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_COMUNE_DESCRIZIONE_EN");
    private final static QName _ANAGRAFICAESTESARESIDENZATELEFONO_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_TELEFONO");
    private final static QName _ANAGRAFICAESTESADOMICILIOCITTASTRANIERA_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_CITTA_STRANIERA");
    private final static QName _ANAGRAFICAESTESARESIDENZANUMEROCIVICO_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_NUMERO_CIVICO");
    private final static QName _ANAGRAFICAESTESADOMICILIONAZIONEDESCRIZIONEEN_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_NAZIONE_DESCRIZIONE_EN");
    private final static QName _ANAGRAFICAESTESADOMICILIOCOMUNEDESCRIZIONEIT_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_COMUNE_DESCRIZIONE_IT");
    private final static QName _ANAGRAFICAESTESARESIDENZACOMUNEDESCRIZIONEIT_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_COMUNE_DESCRIZIONE_IT");
    private final static QName _ANAGRAFICAESTESADOMICILIOVIA_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_VIA");
    private final static QName _ANAGRAFICAESTESADOMICILIONAZIONEDESCRIZIONEIT_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_NAZIONE_DESCRIZIONE_IT");
    private final static QName _ANAGRAFICAESTESADOMICILIOFRAZIONE_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_FRAZIONE");
    private final static QName _ANAGRAFICAESTESADOMICILIOIDADACOMUNE_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_ID_ADA_COMUNE");
    private final static QName _ANAGRAFICAESTESARESIDENZANAZIONEDESCRIZIONEEN_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_NAZIONE_DESCRIZIONE_EN");
    private final static QName _ANAGRAFICAESTESADESCRIZIONECITTADINANZAEN_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_CITTADINANZA_EN");
    private final static QName _ANAGRAFICAESTESADOMICILIOPROVINCIA_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_PROVINCIA");
    private final static QName _ANAGRAFICAESTESADOMICILIOCAP_QNAME = new QName("http://Data.ADAWs.unitn.it", "DOMICILIO_CAP");
    private final static QName _ANAGRAFICAESTESARESIDENZAPREFISSOINTERNAZIONALE_QNAME = new QName("http://Data.ADAWs.unitn.it", "RESIDENZA_PREFISSO_INTERNAZIONALE");
    private final static QName _ADAIDFindIdAdaDaUsername20110214ResponseADAIDFindIdAdaDaUsername20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ADA_ID_find_id_ada_da_username_20110214Result");
    private final static QName _PERFindCognomeNome20110214ResponsePERFindCognomeNome20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_cognome_nome_20110214Result");
    private final static QName _GROUPFind20110214ResponseGROUPFind20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "GROUP_find_20110214Result");
    private final static QName _ACCOUNTMembershipIDGRU_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_GRU");
    private final static QName _ACCOUNTMembershipDESCRIZIONE_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE");
    private final static QName _ACCOUNTMembershipGID_QNAME = new QName("http://Data.ADAWs.unitn.it", "GID");
    private final static QName _GROUPFind20120415ResponseGROUPFind20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "GROUP_find_20120415Result");
    private final static QName _VOIPFindEntity20091229ResponseVOIPFindEntity20091229Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "VOIP_find_entity_20091229Result");
    private final static QName _PERFindAllPosizioniDate20120415ResponsePERFindAllPosizioniDate20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_all_posizioni_date_20120415Result");
    private final static QName _PERFindAllPosizioni20120415ResponsePERFindAllPosizioni20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_all_posizioni_20120415Result");
    private final static QName _PERFindIdAda20110214ResponsePERFindIdAda20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_id_ada_20110214Result");
    private final static QName _APEFindAll20110214DataRif_QNAME = new QName("http://Data.ADAWs.unitn.it", "data_rif");
    private final static QName _DESCRIZIONEFindAtr20120415IdLingua_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_lingua");
    private final static QName _PERCheckIdentity20120415ResponsePERCheckIdentity20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_check_identity_20120415Result");
    private final static QName _PERFindCognomeNome20091229Nome_QNAME = new QName("http://Data.ADAWs.unitn.it", "nome");
    private final static QName _PERFindCognomeNome20091229Cognome_QNAME = new QName("http://Data.ADAWs.unitn.it", "cognome");
    private final static QName _ACCOUNTFindIdAda20110214ResponseACCOUNTFindIdAda20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ACCOUNT_find_id_ada_20110214Result");
    private final static QName _ADAIDFindIdAccDaUsername20120415Username_QNAME = new QName("http://Data.ADAWs.unitn.it", "username");
    private final static QName _PERFindAllPosizioni20110214ResponsePERFindAllPosizioni20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_all_posizioni_20110214Result");
    private final static QName _PERFindCognomeNome20120415ResponsePERFindCognomeNome20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_cognome_nome_20120415Result");
    private final static QName _PERFindAllPosizioniDate20110214ResponsePERFindAllPosizioniDate20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_all_posizioni_date_20110214Result");
    private final static QName _APEFindAll20120415ResponseAPEFindAll20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "APE_find_all_20120415Result");
    private final static QName _ADAIDFindIdAdaDaUsername20120415ResponseADAIDFindIdAdaDaUsername20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ADA_ID_find_id_ada_da_username_20120415Result");
    private final static QName _CODEFindIdFonte20120415IdFad_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_fad");
    private final static QName _PERFindIdAdaResponsePERFindIdAdaResult_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_id_adaResult");
    private final static QName _ADADescriptionIDTOA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_TOA");
    private final static QName _PERFindCognomeNomeResponsePERFindCognomeNomeResult_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_cognome_nomeResult");
    private final static QName _CODEFindIdAda20120415ResponseCODEFindIdAda20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "CODE_find_id_ada_20120415Result");
    private final static QName _APEFindAll20110214ResponseAPEFindAll20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "APE_find_all_20110214Result");
    private final static QName _RECAPITOFindOgaAcc20110214IdOga_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_oga");
    private final static QName _RECAPITOFindOgaAcc20110214IdAcc_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_acc");
    private final static QName _PERCheckIdentity20110214ResponsePERCheckIdentity20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_check_identity_20110214Result");
    private final static QName _VOIPFindEntity20120415ResponseVOIPFindEntity20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "VOIP_find_entity_20120415Result");
    private final static QName _ACCOUNTFindIdAda20110214IdAccount_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_account");
    private final static QName _ATTIVITADIDATTICASOSTENUTADATASUPERAMENTO_QNAME = new QName("http://Data.ADAWs.unitn.it", "DATA_SUPERAMENTO");
    private final static QName _ATTIVITADIDATTICASOSTENUTADESCRIZIONEATTIVITADIDATTICA_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_ATTIVITA_DIDATTICA");
    private final static QName _ATTIVITADIDATTICASOSTENUTAIDESSE3ATTIVITADIDATTICA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_ESSE3_ATTIVITA_DIDATTICA");
    private final static QName _ATTIVITADIDATTICASOSTENUTACODESSE3ATTIVITADIDATTICA_QNAME = new QName("http://Data.ADAWs.unitn.it", "COD_ESSE3_ATTIVITA_DIDATTICA");
    private final static QName _PERCheckIdentity20120415NomePadre_QNAME = new QName("http://Data.ADAWs.unitn.it", "nome_padre");
    private final static QName _PERCheckIdentity20120415NazIdAtr_QNAME = new QName("http://Data.ADAWs.unitn.it", "naz_id_atr");
    private final static QName _PERCheckIdentity20120415IndiceRigiditaFuzzy_QNAME = new QName("http://Data.ADAWs.unitn.it", "indice_rigidita_fuzzy");
    private final static QName _PERCheckIdentity20120415DataNasc_QNAME = new QName("http://Data.ADAWs.unitn.it", "data_nasc");
    private final static QName _PERCheckIdentity20120415LocIdAtr_QNAME = new QName("http://Data.ADAWs.unitn.it", "loc_id_atr");
    private final static QName _PERCheckIdentity20120415Codfis_QNAME = new QName("http://Data.ADAWs.unitn.it", "codfis");
    private final static QName _PERCheckIdentity20120415Sesso_QNAME = new QName("http://Data.ADAWs.unitn.it", "sesso");
    private final static QName _GROUPFind20110214Gid_QNAME = new QName("http://Data.ADAWs.unitn.it", "gid");
    private final static QName _GROUPFind20110214IdTlm_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_tlm");
    private final static QName _SSDFindAll20110214ResponseSSDFindAll20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "SSD_find_all_20110214Result");
    private final static QName _RECAPITOFindOgaAcc20110214ResponseRECAPITOFindOgaAcc20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "RECAPITO_find_oga_acc_20110214Result");
    private final static QName _RECAPITOMAILUNITN_QNAME = new QName("http://Data.ADAWs.unitn.it", "MAIL_UNITN");
    private final static QName _RECAPITOLINKISTIT_QNAME = new QName("http://Data.ADAWs.unitn.it", "LINK_ISTIT");
    private final static QName _RECAPITOFAXUFFICIO_QNAME = new QName("http://Data.ADAWs.unitn.it", "FAX_UFFICIO");
    private final static QName _RECAPITOIDACCOUNT_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_ACCOUNT");
    private final static QName _RECAPITOCELLUFFICIO_QNAME = new QName("http://Data.ADAWs.unitn.it", "CELL_UFFICIO");
    private final static QName _RECAPITOUSERNAME_QNAME = new QName("http://Data.ADAWs.unitn.it", "USERNAME");
    private final static QName _RECAPITOMAILFISICA_QNAME = new QName("http://Data.ADAWs.unitn.it", "MAIL_FISICA");
    private final static QName _RECAPITOINTERNOCELL_QNAME = new QName("http://Data.ADAWs.unitn.it", "INTERNO_CELL");
    private final static QName _RECAPITOTELUFFICIO_QNAME = new QName("http://Data.ADAWs.unitn.it", "TEL_UFFICIO");
    private final static QName _RECAPITOHOMEPAGEPERS_QNAME = new QName("http://Data.ADAWs.unitn.it", "HOMEPAGE_PERS");
    private final static QName _GROUPDetailIDTLM_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_TLM");
    private final static QName _GROUPDetailDESCRIZIONETLM_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_TLM");
    private final static QName _PERFindPosizioniIdAda20120415ResponsePERFindPosizioniIdAda20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_posizioni_id_ada_20120415Result");
    private final static QName _ACCOUNTEntityBaseEMAILUFF_QNAME = new QName("http://Data.ADAWs.unitn.it", "E_MAIL_UFF");
    private final static QName _ACCOUNTEntityBaseMAIL_QNAME = new QName("http://Data.ADAWs.unitn.it", "MAIL");
    private final static QName _ACCOUNTDETAILFINDIdAccListDaIdAda20110214ResponseACCOUNTDETAILFINDIdAccListDaIdAda20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20110214Result");
    private final static QName _PERPersonaSESSOPER_QNAME = new QName("http://Data.ADAWs.unitn.it", "SESSO_PER");
    private final static QName _PERPersonaLUOGONASCITAIDATR_QNAME = new QName("http://Data.ADAWs.unitn.it", "LUOGO_NASCITA_ID_ATR");
    private final static QName _PERPersonaNAZIONENASCITAIDATR_QNAME = new QName("http://Data.ADAWs.unitn.it", "NAZIONE_NASCITA_ID_ATR");
    private final static QName _PERPersonaNAZIONENASCITADESCATR_QNAME = new QName("http://Data.ADAWs.unitn.it", "NAZIONE_NASCITA_DESC_ATR");
    private final static QName _PERPersonaNOMEPADREPER_QNAME = new QName("http://Data.ADAWs.unitn.it", "NOME_PADRE_PER");
    private final static QName _PERPersonaCODFISPER_QNAME = new QName("http://Data.ADAWs.unitn.it", "COD_FIS_PER");
    private final static QName _PERPersonaIDOGA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_OGA");
    private final static QName _PERPersonaLUOGONASCITADESCATR_QNAME = new QName("http://Data.ADAWs.unitn.it", "LUOGO_NASCITA_DESC_ATR");
    private final static QName _PERPersonaDATANASCITAPER_QNAME = new QName("http://Data.ADAWs.unitn.it", "DATA_NASCITA_PER");
    private final static QName _PERPersonaNOME_QNAME = new QName("http://Data.ADAWs.unitn.it", "NOME");
    private final static QName _PERPersonaCOGNOME_QNAME = new QName("http://Data.ADAWs.unitn.it", "COGNOME");
    private final static QName _PERPersonaMATCHPROB_QNAME = new QName("http://Data.ADAWs.unitn.it", "MATCH_PROB");
    private final static QName _ATTRIBUTIDIDATTICADESCRIZIONESSD_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_SSD");
    private final static QName _ATTRIBUTIDIDATTICASSDIDATR_QNAME = new QName("http://Data.ADAWs.unitn.it", "SSD_ID_ATR");
    private final static QName _ATTRIBUTIDIDATTICADESCRIZIONEAREACUN_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_AREA_CUN");
    private final static QName _ATTRIBUTIDIDATTICAIDSSD_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_SSD");
    private final static QName _ATTRIBUTIDIDATTICAIDAREACUN_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_AREA_CUN");
    private final static QName _AESAnagraficaEstesa20120415ResponseAESAnagraficaEstesa20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "AES_anagrafica_estesa_20120415Result");
    private final static QName _CODERelationIDFONTE_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_FONTE");
    private final static QName _CODERelationIDFAD_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_FAD");
    private final static QName _LBSLibrettoStudente20120415ResponseLBSLibrettoStudente20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "LBS_libretto_studente_20120415Result");
    private final static QName _DESCRIZIONEFindOga20110214ResponseDESCRIZIONEFindOga20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_find_oga_20110214Result");
    private final static QName _SSDFindAll20120415ResponseSSDFindAll20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "SSD_find_all_20120415Result");
    private final static QName _ADAIDFindIdAccDaUsername20120415ResponseADAIDFindIdAccDaUsername20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ADA_ID_find_id_acc_da_username_20120415Result");
    private final static QName _LIBRETTOSTUDENTELODE_QNAME = new QName("http://Data.ADAWs.unitn.it", "LODE");
    private final static QName _LIBRETTOSTUDENTEMODALITAVALUTAZIONE_QNAME = new QName("http://Data.ADAWs.unitn.it", "MODALITA_VALUTAZIONE");
    private final static QName _LIBRETTOSTUDENTEAAOFFERTA_QNAME = new QName("http://Data.ADAWs.unitn.it", "AA_OFFERTA");
    private final static QName _LIBRETTOSTUDENTEPESO_QNAME = new QName("http://Data.ADAWs.unitn.it", "PESO");
    private final static QName _LIBRETTOSTUDENTEVOTO_QNAME = new QName("http://Data.ADAWs.unitn.it", "VOTO");
    private final static QName _LIBRETTOSTUDENTESTATO_QNAME = new QName("http://Data.ADAWs.unitn.it", "STATO");
    private final static QName _LIBRETTOSTUDENTENOMEDIA_QNAME = new QName("http://Data.ADAWs.unitn.it", "NO_MEDIA");
    private final static QName _LIBRETTOSTUDENTETIPOGIUDIZIO_QNAME = new QName("http://Data.ADAWs.unitn.it", "TIPO_GIUDIZIO");
    private final static QName _ACCOUNTFindIdAda20091229ResponseACCOUNTFindIdAda20091229Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ACCOUNT_find_id_ada_20091229Result");
    private final static QName _PERFindAllPosizioniDate20110214DaData_QNAME = new QName("http://Data.ADAWs.unitn.it", "da_data");
    private final static QName _PERFindAllPosizioniDate20110214AData_QNAME = new QName("http://Data.ADAWs.unitn.it", "a_data");
    private final static QName _ADAIDFindIdAccDaUsername20110214ResponseADAIDFindIdAccDaUsername20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ADA_ID_find_id_acc_da_username_20110214Result");
    private final static QName _ACCOUNTDetailIDPOA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_POA");
    private final static QName _ACCOUNTDetailIDACC_QNAME = new QName("http://Data.ADAWs.unitn.it", "ID_ACC");
    private final static QName _ACCOUNTMEMBERSHIPFind20110214ResponseACCOUNTMEMBERSHIPFind20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ACCOUNT_MEMBERSHIP_find_20110214Result");
    private final static QName _GOGGerarchiaSto20110214ResponseGOGGerarchiaSto20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "GOG_gerarchia_sto_20110214Result");
    private final static QName _CODEFindIdFonte20120415ResponseCODEFindIdFonte20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "CODE_find_id_fonte_20120415Result");
    private final static QName _GOGGerarchiaSto20120415ResponseGOGGerarchiaSto20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "GOG_gerarchia_sto_20120415Result");
    private final static QName _PERFindCodiciBase20110214TsoIdOga_QNAME = new QName("http://Data.ADAWs.unitn.it", "tso_id_oga");
    private final static QName _PERFindCodiciBase20110214RupIdOga_QNAME = new QName("http://Data.ADAWs.unitn.it", "rup_id_oga");
    private final static QName _PERFindCodiciBase20110214FroIdAtr_QNAME = new QName("http://Data.ADAWs.unitn.it", "fro_id_atr");
    private final static QName _PERFindCodiciBase20110214StoIdOga_QNAME = new QName("http://Data.ADAWs.unitn.it", "sto_id_oga");
    private final static QName _PERFindCodiciBase20110214RuoIdOga_QNAME = new QName("http://Data.ADAWs.unitn.it", "ruo_id_oga");
    private final static QName _PERFindPosizioniIdAdaResponsePERFindPosizioniIdAdaResult_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_posizioni_id_adaResult");
    private final static QName _ACCOUNTDETAILFINDIdAccListDaIdAda20110214AccountNonAttivi_QNAME = new QName("http://Data.ADAWs.unitn.it", "account_non_attivi");
    private final static QName _ACCOUNTDETAILFINDIdAccListDaIdAda20110214AccountTecnici_QNAME = new QName("http://Data.ADAWs.unitn.it", "account_tecnici");
    private final static QName _PERFindCodiciBase20120415ResponsePERFindCodiciBase20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_codici_base_20120415Result");
    private final static QName _PERFindIdAda20091229ResponsePERFindIdAda20091229Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_id_ada_20091229Result");
    private final static QName _ULTIMACARRIERASTUDENTECODESSE3STATOCARRIERA_QNAME = new QName("http://Data.ADAWs.unitn.it", "COD_ESSE3_STATO_CARRIERA");
    private final static QName _ULTIMACARRIERASTUDENTEDESCRIZIONECDS_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_CDS");
    private final static QName _ULTIMACARRIERASTUDENTEMEDIAPONDERATA_QNAME = new QName("http://Data.ADAWs.unitn.it", "MEDIA_PONDERATA");
    private final static QName _ULTIMACARRIERASTUDENTEANNOCORSO_QNAME = new QName("http://Data.ADAWs.unitn.it", "ANNO_CORSO");
    private final static QName _ULTIMACARRIERASTUDENTECREDITIINPIANO_QNAME = new QName("http://Data.ADAWs.unitn.it", "CREDITI_IN_PIANO");
    private final static QName _ULTIMACARRIERASTUDENTEDESCRIZIONEMOTIVOSTATOCARRIERA_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_MOTIVO_STATO_CARRIERA");
    private final static QName _ULTIMACARRIERASTUDENTENUMEROESAMISUPERATI_QNAME = new QName("http://Data.ADAWs.unitn.it", "NUMERO_ESAMI_SUPERATI");
    private final static QName _ULTIMACARRIERASTUDENTEDATACHIUSURACARRIERA_QNAME = new QName("http://Data.ADAWs.unitn.it", "DATA_CHIUSURA_CARRIERA");
    private final static QName _ULTIMACARRIERASTUDENTEMEDIAARITMETICA_QNAME = new QName("http://Data.ADAWs.unitn.it", "MEDIA_ARITMETICA");
    private final static QName _ULTIMACARRIERASTUDENTEATTESADILAUREA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ATTESA_DI_LAUREA");
    private final static QName _ULTIMACARRIERASTUDENTECREDITI_QNAME = new QName("http://Data.ADAWs.unitn.it", "CREDITI");
    private final static QName _ULTIMACARRIERASTUDENTECODESSE3MOTIVOSTATOCARRIERA_QNAME = new QName("http://Data.ADAWs.unitn.it", "COD_ESSE3_MOTIVO_STATO_CARRIERA");
    private final static QName _ULTIMACARRIERASTUDENTENUMEROESAMIPIANO_QNAME = new QName("http://Data.ADAWs.unitn.it", "NUMERO_ESAMI_PIANO");
    private final static QName _ULTIMACARRIERASTUDENTECICLODOTTORATO_QNAME = new QName("http://Data.ADAWs.unitn.it", "CICLO_DOTTORATO");
    private final static QName _ULTIMACARRIERASTUDENTECODESSE3CDS_QNAME = new QName("http://Data.ADAWs.unitn.it", "COD_ESSE3_CDS");
    private final static QName _ULTIMACARRIERASTUDENTEESSE3MATRICOLA_QNAME = new QName("http://Data.ADAWs.unitn.it", "ESSE3_MATRICOLA");
    private final static QName _ULTIMACARRIERASTUDENTEANNOISCRIZIONE_QNAME = new QName("http://Data.ADAWs.unitn.it", "ANNO_ISCRIZIONE");
    private final static QName _ULTIMACARRIERASTUDENTEDESCRIZIONESTATOCARRIERA_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_STATO_CARRIERA");
    private final static QName _PERFindIdAda20120415ResponsePERFindIdAda20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_id_ada_20120415Result");
    private final static QName _DESCRIZIONEFindAtr20110214ResponseDESCRIZIONEFindAtr20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_find_atr_20110214Result");
    private final static QName _CODEFindIdAda20110214ResponseCODEFindIdAda20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "CODE_find_id_ada_20110214Result");
    private final static QName _ADIFindAll20120415ResponseADIFindAll20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ADI_find_all_20120415Result");
    private final static QName _GOGGerarchiaSto20091229ResponseGOGGerarchiaSto20091229Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "GOG_gerarchia_sto_20091229Result");
    private final static QName _CODEFindIdAda20120415IdLocal_QNAME = new QName("http://Data.ADAWs.unitn.it", "id_local");
    private final static QName _PERFindAllPosizioni20091229ResponsePERFindAllPosizioni20091229Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_all_posizioni_20091229Result");
    private final static QName _RECAPITOFindOgaAcc20120415ResponseRECAPITOFindOgaAcc20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "RECAPITO_find_oga_acc_20120415Result");
    private final static QName _ACCOUNTDETAILFINDIdAccListDaIdAda20120415ResponseACCOUNTDETAILFINDIdAccListDaIdAda20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20120415Result");
    private final static QName _ACCOUNTFindIdAda20120415ResponseACCOUNTFindIdAda20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "ACCOUNT_find_id_ada_20120415Result");
    private final static QName _DESCRIZIONEFindAtr20120415ResponseDESCRIZIONEFindAtr20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_find_atr_20120415Result");
    private final static QName _PERFindCodiciBase20110214ResponsePERFindCodiciBase20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_codici_base_20110214Result");
    private final static QName _PERFindPosizioniIdAda20091229ResponsePERFindPosizioniIdAda20091229Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_posizioni_id_ada_20091229Result");
    private final static QName _DESCRIZIONEFindOga20120415ResponseDESCRIZIONEFindOga20120415Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "DESCRIZIONE_find_oga_20120415Result");
    private final static QName _PERFindPosizioniIdAda20110214ResponsePERFindPosizioniIdAda20110214Result_QNAME = new QName("http://Data.ADAWs.unitn.it", "PER_find_posizioni_id_ada_20110214Result");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: smartcampus.ada
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AESAnagraficaEstesa20120415 }
     * 
     */
    public AESAnagraficaEstesa20120415 createAESAnagraficaEstesa20120415() {
        return new AESAnagraficaEstesa20120415();
    }

    /**
     * Create an instance of {@link CODEFindIdFonte20120415 }
     * 
     */
    public CODEFindIdFonte20120415 createCODEFindIdFonte20120415() {
        return new CODEFindIdFonte20120415();
    }

    /**
     * Create an instance of {@link ACCOUNTMEMBERSHIPFind20110214 }
     * 
     */
    public ACCOUNTMEMBERSHIPFind20110214 createACCOUNTMEMBERSHIPFind20110214() {
        return new ACCOUNTMEMBERSHIPFind20110214();
    }

    /**
     * Create an instance of {@link ArrayOfATTRIBUTIPERSONALI }
     * 
     */
    public ArrayOfATTRIBUTIPERSONALI createArrayOfATTRIBUTIPERSONALI() {
        return new ArrayOfATTRIBUTIPERSONALI();
    }

    /**
     * Create an instance of {@link ArrayOfACCOUNTMembership }
     * 
     */
    public ArrayOfACCOUNTMembership createArrayOfACCOUNTMembership() {
        return new ArrayOfACCOUNTMembership();
    }

    /**
     * Create an instance of {@link PERFindAllPosizioni20091229 }
     * 
     */
    public PERFindAllPosizioni20091229 createPERFindAllPosizioni20091229() {
        return new PERFindAllPosizioni20091229();
    }

    /**
     * Create an instance of {@link ArrayOfGROUPMember }
     * 
     */
    public ArrayOfGROUPMember createArrayOfGROUPMember() {
        return new ArrayOfGROUPMember();
    }

    /**
     * Create an instance of {@link DESCRIZIONEFindAtr20110214 }
     * 
     */
    public DESCRIZIONEFindAtr20110214 createDESCRIZIONEFindAtr20110214() {
        return new DESCRIZIONEFindAtr20110214();
    }

    /**
     * Create an instance of {@link RECAPITOFindOgaAcc20120415 }
     * 
     */
    public RECAPITOFindOgaAcc20120415 createRECAPITOFindOgaAcc20120415() {
        return new RECAPITOFindOgaAcc20120415();
    }

    /**
     * Create an instance of {@link SSDFindAll20110214Response }
     * 
     */
    public SSDFindAll20110214Response createSSDFindAll20110214Response() {
        return new SSDFindAll20110214Response();
    }

    /**
     * Create an instance of {@link ArrayOfSETTORESDAREACUN }
     * 
     */
    public ArrayOfSETTORESDAREACUN createArrayOfSETTORESDAREACUN() {
        return new ArrayOfSETTORESDAREACUN();
    }

    /**
     * Create an instance of {@link ArrayOfLIBRETTOSTUDENTE }
     * 
     */
    public ArrayOfLIBRETTOSTUDENTE createArrayOfLIBRETTOSTUDENTE() {
        return new ArrayOfLIBRETTOSTUDENTE();
    }

    /**
     * Create an instance of {@link ArrayOfATTRIBUTIDIDATTICA }
     * 
     */
    public ArrayOfATTRIBUTIDIDATTICA createArrayOfATTRIBUTIDIDATTICA() {
        return new ArrayOfATTRIBUTIDIDATTICA();
    }

    /**
     * Create an instance of {@link VOIPFindEntity20091229 }
     * 
     */
    public VOIPFindEntity20091229 createVOIPFindEntity20091229() {
        return new VOIPFindEntity20091229();
    }

    /**
     * Create an instance of {@link ANAGRAFICAESTESA }
     * 
     */
    public ANAGRAFICAESTESA createANAGRAFICAESTESA() {
        return new ANAGRAFICAESTESA();
    }

    /**
     * Create an instance of {@link PERFindPosizioniIdAda20091229 }
     * 
     */
    public PERFindPosizioniIdAda20091229 createPERFindPosizioniIdAda20091229() {
        return new PERFindPosizioniIdAda20091229();
    }

    /**
     * Create an instance of {@link PERFindAllPosizioni20120415 }
     * 
     */
    public PERFindAllPosizioni20120415 createPERFindAllPosizioni20120415() {
        return new PERFindAllPosizioni20120415();
    }

    /**
     * Create an instance of {@link PERFindPosizioniIdAda20110214Response }
     * 
     */
    public PERFindPosizioniIdAda20110214Response createPERFindPosizioniIdAda20110214Response() {
        return new PERFindPosizioniIdAda20110214Response();
    }

    /**
     * Create an instance of {@link ArrayOfPERPosizioni20091229 }
     * 
     */
    public ArrayOfPERPosizioni20091229 createArrayOfPERPosizioni20091229() {
        return new ArrayOfPERPosizioni20091229();
    }

    /**
     * Create an instance of {@link PERFindIdAda20091229 }
     * 
     */
    public PERFindIdAda20091229 createPERFindIdAda20091229() {
        return new PERFindIdAda20091229();
    }

    /**
     * Create an instance of {@link ArrayOfPERPersona }
     * 
     */
    public ArrayOfPERPersona createArrayOfPERPersona() {
        return new ArrayOfPERPersona();
    }

    /**
     * Create an instance of {@link ADAIDFindIdAdaDaUsername20110214Response }
     * 
     */
    public ADAIDFindIdAdaDaUsername20110214Response createADAIDFindIdAdaDaUsername20110214Response() {
        return new ADAIDFindIdAdaDaUsername20110214Response();
    }

    /**
     * Create an instance of {@link ArrayOfADAObjectID }
     * 
     */
    public ArrayOfADAObjectID createArrayOfADAObjectID() {
        return new ArrayOfADAObjectID();
    }

    /**
     * Create an instance of {@link ACCOUNTFindIdAda20120415 }
     * 
     */
    public ACCOUNTFindIdAda20120415 createACCOUNTFindIdAda20120415() {
        return new ACCOUNTFindIdAda20120415();
    }

    /**
     * Create an instance of {@link ArrayOfULTIMACARRIERASTUDENTE }
     * 
     */
    public ArrayOfULTIMACARRIERASTUDENTE createArrayOfULTIMACARRIERASTUDENTE() {
        return new ArrayOfULTIMACARRIERASTUDENTE();
    }

    /**
     * Create an instance of {@link APEFindAll20110214 }
     * 
     */
    public APEFindAll20110214 createAPEFindAll20110214() {
        return new APEFindAll20110214();
    }

    /**
     * Create an instance of {@link LBSLibrettoStudente20120415Response }
     * 
     */
    public LBSLibrettoStudente20120415Response createLBSLibrettoStudente20120415Response() {
        return new LBSLibrettoStudente20120415Response();
    }

    /**
     * Create an instance of {@link ADIFindAll20120415Response }
     * 
     */
    public ADIFindAll20120415Response createADIFindAll20120415Response() {
        return new ADIFindAll20120415Response();
    }

    /**
     * Create an instance of {@link GOGGerarchiaSto20091229Response }
     * 
     */
    public GOGGerarchiaSto20091229Response createGOGGerarchiaSto20091229Response() {
        return new GOGGerarchiaSto20091229Response();
    }

    /**
     * Create an instance of {@link ArrayOfGOGRelazioneGerarchica }
     * 
     */
    public ArrayOfGOGRelazioneGerarchica createArrayOfGOGRelazioneGerarchica() {
        return new ArrayOfGOGRelazioneGerarchica();
    }

    /**
     * Create an instance of {@link GOGGerarchiaSto20091229 }
     * 
     */
    public GOGGerarchiaSto20091229 createGOGGerarchiaSto20091229() {
        return new GOGGerarchiaSto20091229();
    }

    /**
     * Create an instance of {@link ACCOUNTFindIdAda20120415Response }
     * 
     */
    public ACCOUNTFindIdAda20120415Response createACCOUNTFindIdAda20120415Response() {
        return new ACCOUNTFindIdAda20120415Response();
    }

    /**
     * Create an instance of {@link ArrayOfACCOUNTEntityBase }
     * 
     */
    public ArrayOfACCOUNTEntityBase createArrayOfACCOUNTEntityBase() {
        return new ArrayOfACCOUNTEntityBase();
    }

    /**
     * Create an instance of {@link CODERelation }
     * 
     */
    public CODERelation createCODERelation() {
        return new CODERelation();
    }

    /**
     * Create an instance of {@link RECAPITOFindOgaAcc20110214Response }
     * 
     */
    public RECAPITOFindOgaAcc20110214Response createRECAPITOFindOgaAcc20110214Response() {
        return new RECAPITOFindOgaAcc20110214Response();
    }

    /**
     * Create an instance of {@link ArrayOfRECAPITO }
     * 
     */
    public ArrayOfRECAPITO createArrayOfRECAPITO() {
        return new ArrayOfRECAPITO();
    }

    /**
     * Create an instance of {@link VOIPEntity }
     * 
     */
    public VOIPEntity createVOIPEntity() {
        return new VOIPEntity();
    }

    /**
     * Create an instance of {@link PERFindCognomeNome20110214 }
     * 
     */
    public PERFindCognomeNome20110214 createPERFindCognomeNome20110214() {
        return new PERFindCognomeNome20110214();
    }

    /**
     * Create an instance of {@link ADAIDFindIdAdaDaUsername20120415 }
     * 
     */
    public ADAIDFindIdAdaDaUsername20120415 createADAIDFindIdAdaDaUsername20120415() {
        return new ADAIDFindIdAdaDaUsername20120415();
    }

    /**
     * Create an instance of {@link PERFindCodiciBase20120415 }
     * 
     */
    public PERFindCodiciBase20120415 createPERFindCodiciBase20120415() {
        return new PERFindCodiciBase20120415();
    }

    /**
     * Create an instance of {@link VOIPFindEntity20110214 }
     * 
     */
    public VOIPFindEntity20110214 createVOIPFindEntity20110214() {
        return new VOIPFindEntity20110214();
    }

    /**
     * Create an instance of {@link CODEFindIdAda20120415Response }
     * 
     */
    public CODEFindIdAda20120415Response createCODEFindIdAda20120415Response() {
        return new CODEFindIdAda20120415Response();
    }

    /**
     * Create an instance of {@link ArrayOfCODERelation }
     * 
     */
    public ArrayOfCODERelation createArrayOfCODERelation() {
        return new ArrayOfCODERelation();
    }

    /**
     * Create an instance of {@link SSDFindAll20120415Response }
     * 
     */
    public SSDFindAll20120415Response createSSDFindAll20120415Response() {
        return new SSDFindAll20120415Response();
    }

    /**
     * Create an instance of {@link PERFindIdAda20110214 }
     * 
     */
    public PERFindIdAda20110214 createPERFindIdAda20110214() {
        return new PERFindIdAda20110214();
    }

    /**
     * Create an instance of {@link ATTIVITADIDATTICASOSTENUTA }
     * 
     */
    public ATTIVITADIDATTICASOSTENUTA createATTIVITADIDATTICASOSTENUTA() {
        return new ATTIVITADIDATTICASOSTENUTA();
    }

    /**
     * Create an instance of {@link ACCOUNTEntityBase }
     * 
     */
    public ACCOUNTEntityBase createACCOUNTEntityBase() {
        return new ACCOUNTEntityBase();
    }

    /**
     * Create an instance of {@link PERFindCognomeNome }
     * 
     */
    public PERFindCognomeNome createPERFindCognomeNome() {
        return new PERFindCognomeNome();
    }

    /**
     * Create an instance of {@link PERFindAllPosizioniDate20120415Response }
     * 
     */
    public PERFindAllPosizioniDate20120415Response createPERFindAllPosizioniDate20120415Response() {
        return new PERFindAllPosizioniDate20120415Response();
    }

    /**
     * Create an instance of {@link ArrayOfVOIPEntity }
     * 
     */
    public ArrayOfVOIPEntity createArrayOfVOIPEntity() {
        return new ArrayOfVOIPEntity();
    }

    /**
     * Create an instance of {@link ACCOUNTMEMBERSHIPFind20120415 }
     * 
     */
    public ACCOUNTMEMBERSHIPFind20120415 createACCOUNTMEMBERSHIPFind20120415() {
        return new ACCOUNTMEMBERSHIPFind20120415();
    }

    /**
     * Create an instance of {@link PERFindPosizioniIdAda20120415Response }
     * 
     */
    public PERFindPosizioniIdAda20120415Response createPERFindPosizioniIdAda20120415Response() {
        return new PERFindPosizioniIdAda20120415Response();
    }

    /**
     * Create an instance of {@link PERPersona }
     * 
     */
    public PERPersona createPERPersona() {
        return new PERPersona();
    }

    /**
     * Create an instance of {@link CODEFindIdFonte20120415Response }
     * 
     */
    public CODEFindIdFonte20120415Response createCODEFindIdFonte20120415Response() {
        return new CODEFindIdFonte20120415Response();
    }

    /**
     * Create an instance of {@link PERPosizioni }
     * 
     */
    public PERPosizioni createPERPosizioni() {
        return new PERPosizioni();
    }

    /**
     * Create an instance of {@link VOIPFindEntity20110214Response }
     * 
     */
    public VOIPFindEntity20110214Response createVOIPFindEntity20110214Response() {
        return new VOIPFindEntity20110214Response();
    }

    /**
     * Create an instance of {@link ACCOUNTDETAILFINDIdAccListDaIdAda20110214Response }
     * 
     */
    public ACCOUNTDETAILFINDIdAccListDaIdAda20110214Response createACCOUNTDETAILFINDIdAccListDaIdAda20110214Response() {
        return new ACCOUNTDETAILFINDIdAccListDaIdAda20110214Response();
    }

    /**
     * Create an instance of {@link ArrayOfACCOUNTDetail }
     * 
     */
    public ArrayOfACCOUNTDetail createArrayOfACCOUNTDetail() {
        return new ArrayOfACCOUNTDetail();
    }

    /**
     * Create an instance of {@link PERCheckIdentity20120415Response }
     * 
     */
    public PERCheckIdentity20120415Response createPERCheckIdentity20120415Response() {
        return new PERCheckIdentity20120415Response();
    }

    /**
     * Create an instance of {@link GROUPMEMBERFind20120415Response }
     * 
     */
    public GROUPMEMBERFind20120415Response createGROUPMEMBERFind20120415Response() {
        return new GROUPMEMBERFind20120415Response();
    }

    /**
     * Create an instance of {@link APEFindAll20120415 }
     * 
     */
    public APEFindAll20120415 createAPEFindAll20120415() {
        return new APEFindAll20120415();
    }

    /**
     * Create an instance of {@link APEFindAll20120415Response }
     * 
     */
    public APEFindAll20120415Response createAPEFindAll20120415Response() {
        return new APEFindAll20120415Response();
    }

    /**
     * Create an instance of {@link PERFindPosizioniIdAdaResponse }
     * 
     */
    public PERFindPosizioniIdAdaResponse createPERFindPosizioniIdAdaResponse() {
        return new PERFindPosizioniIdAdaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPERPosizioni }
     * 
     */
    public ArrayOfPERPosizioni createArrayOfPERPosizioni() {
        return new ArrayOfPERPosizioni();
    }

    /**
     * Create an instance of {@link CODEFindIdFonte20110214Response }
     * 
     */
    public CODEFindIdFonte20110214Response createCODEFindIdFonte20110214Response() {
        return new CODEFindIdFonte20110214Response();
    }

    /**
     * Create an instance of {@link PERFindPosizioniIdAda20091229Response }
     * 
     */
    public PERFindPosizioniIdAda20091229Response createPERFindPosizioniIdAda20091229Response() {
        return new PERFindPosizioniIdAda20091229Response();
    }

    /**
     * Create an instance of {@link DESCRIZIONEFindOga20120415 }
     * 
     */
    public DESCRIZIONEFindOga20120415 createDESCRIZIONEFindOga20120415() {
        return new DESCRIZIONEFindOga20120415();
    }

    /**
     * Create an instance of {@link PERFindPosizioniIdAda }
     * 
     */
    public PERFindPosizioniIdAda createPERFindPosizioniIdAda() {
        return new PERFindPosizioniIdAda();
    }

    /**
     * Create an instance of {@link ACCOUNTDetail }
     * 
     */
    public ACCOUNTDetail createACCOUNTDetail() {
        return new ACCOUNTDetail();
    }

    /**
     * Create an instance of {@link GROUPFind20110214Response }
     * 
     */
    public GROUPFind20110214Response createGROUPFind20110214Response() {
        return new GROUPFind20110214Response();
    }

    /**
     * Create an instance of {@link ArrayOfGROUPDetail }
     * 
     */
    public ArrayOfGROUPDetail createArrayOfGROUPDetail() {
        return new ArrayOfGROUPDetail();
    }

    /**
     * Create an instance of {@link DESCRIZIONEFindOga20110214 }
     * 
     */
    public DESCRIZIONEFindOga20110214 createDESCRIZIONEFindOga20110214() {
        return new DESCRIZIONEFindOga20110214();
    }

    /**
     * Create an instance of {@link UCSUltimaCarrieraStudente20120415Response }
     * 
     */
    public UCSUltimaCarrieraStudente20120415Response createUCSUltimaCarrieraStudente20120415Response() {
        return new UCSUltimaCarrieraStudente20120415Response();
    }

    /**
     * Create an instance of {@link PERFindIdAda }
     * 
     */
    public PERFindIdAda createPERFindIdAda() {
        return new PERFindIdAda();
    }

    /**
     * Create an instance of {@link PERFindCognomeNome20091229Response }
     * 
     */
    public PERFindCognomeNome20091229Response createPERFindCognomeNome20091229Response() {
        return new PERFindCognomeNome20091229Response();
    }

    /**
     * Create an instance of {@link ACCOUNTFindIdAda20091229 }
     * 
     */
    public ACCOUNTFindIdAda20091229 createACCOUNTFindIdAda20091229() {
        return new ACCOUNTFindIdAda20091229();
    }

    /**
     * Create an instance of {@link PERFindCognomeNome20120415 }
     * 
     */
    public PERFindCognomeNome20120415 createPERFindCognomeNome20120415() {
        return new PERFindCognomeNome20120415();
    }

    /**
     * Create an instance of {@link PERCheckIdentity20120415 }
     * 
     */
    public PERCheckIdentity20120415 createPERCheckIdentity20120415() {
        return new PERCheckIdentity20120415();
    }

    /**
     * Create an instance of {@link ACCOUNTFindIdAda20110214Response }
     * 
     */
    public ACCOUNTFindIdAda20110214Response createACCOUNTFindIdAda20110214Response() {
        return new ACCOUNTFindIdAda20110214Response();
    }

    /**
     * Create an instance of {@link ArrayOfADADescription }
     * 
     */
    public ArrayOfADADescription createArrayOfADADescription() {
        return new ArrayOfADADescription();
    }

    /**
     * Create an instance of {@link PERFindPosizioniIdAda20110214 }
     * 
     */
    public PERFindPosizioniIdAda20110214 createPERFindPosizioniIdAda20110214() {
        return new PERFindPosizioniIdAda20110214();
    }

    /**
     * Create an instance of {@link PERFindCodiciBase20110214Response }
     * 
     */
    public PERFindCodiciBase20110214Response createPERFindCodiciBase20110214Response() {
        return new PERFindCodiciBase20110214Response();
    }

    /**
     * Create an instance of {@link PERAttivitaDidatticheSostenute20120415Response }
     * 
     */
    public PERAttivitaDidatticheSostenute20120415Response createPERAttivitaDidatticheSostenute20120415Response() {
        return new PERAttivitaDidatticheSostenute20120415Response();
    }

    /**
     * Create an instance of {@link ArrayOfATTIVITADIDATTICASOSTENUTA }
     * 
     */
    public ArrayOfATTIVITADIDATTICASOSTENUTA createArrayOfATTIVITADIDATTICASOSTENUTA() {
        return new ArrayOfATTIVITADIDATTICASOSTENUTA();
    }

    /**
     * Create an instance of {@link PERFindAllPosizioni20120415Response }
     * 
     */
    public PERFindAllPosizioni20120415Response createPERFindAllPosizioni20120415Response() {
        return new PERFindAllPosizioni20120415Response();
    }

    /**
     * Create an instance of {@link PERFindAllPosizioniDate20120415 }
     * 
     */
    public PERFindAllPosizioniDate20120415 createPERFindAllPosizioniDate20120415() {
        return new PERFindAllPosizioniDate20120415();
    }

    /**
     * Create an instance of {@link PERFindIdAda20120415Response }
     * 
     */
    public PERFindIdAda20120415Response createPERFindIdAda20120415Response() {
        return new PERFindIdAda20120415Response();
    }

    /**
     * Create an instance of {@link ADADescription }
     * 
     */
    public ADADescription createADADescription() {
        return new ADADescription();
    }

    /**
     * Create an instance of {@link GROUPMEMBERFind20110214Response }
     * 
     */
    public GROUPMEMBERFind20110214Response createGROUPMEMBERFind20110214Response() {
        return new GROUPMEMBERFind20110214Response();
    }

    /**
     * Create an instance of {@link PERFindCognomeNome20110214Response }
     * 
     */
    public PERFindCognomeNome20110214Response createPERFindCognomeNome20110214Response() {
        return new PERFindCognomeNome20110214Response();
    }

    /**
     * Create an instance of {@link CODEFindIdAda20110214Response }
     * 
     */
    public CODEFindIdAda20110214Response createCODEFindIdAda20110214Response() {
        return new CODEFindIdAda20110214Response();
    }

    /**
     * Create an instance of {@link GROUPDetail }
     * 
     */
    public GROUPDetail createGROUPDetail() {
        return new GROUPDetail();
    }

    /**
     * Create an instance of {@link PERCheckIdentity20110214Response }
     * 
     */
    public PERCheckIdentity20110214Response createPERCheckIdentity20110214Response() {
        return new PERCheckIdentity20110214Response();
    }

    /**
     * Create an instance of {@link DESCRIZIONEFindOga20120415Response }
     * 
     */
    public DESCRIZIONEFindOga20120415Response createDESCRIZIONEFindOga20120415Response() {
        return new DESCRIZIONEFindOga20120415Response();
    }

    /**
     * Create an instance of {@link CODEFindIdAda20110214 }
     * 
     */
    public CODEFindIdAda20110214 createCODEFindIdAda20110214() {
        return new CODEFindIdAda20110214();
    }

    /**
     * Create an instance of {@link PERFindCodiciBase20110214 }
     * 
     */
    public PERFindCodiciBase20110214 createPERFindCodiciBase20110214() {
        return new PERFindCodiciBase20110214();
    }

    /**
     * Create an instance of {@link ADAIDFindIdAccDaUsername20120415 }
     * 
     */
    public ADAIDFindIdAccDaUsername20120415 createADAIDFindIdAccDaUsername20120415() {
        return new ADAIDFindIdAccDaUsername20120415();
    }

    /**
     * Create an instance of {@link ADAIDFindIdAccDaUsername20110214 }
     * 
     */
    public ADAIDFindIdAccDaUsername20110214 createADAIDFindIdAccDaUsername20110214() {
        return new ADAIDFindIdAccDaUsername20110214();
    }

    /**
     * Create an instance of {@link GROUPMEMBERFind20110214 }
     * 
     */
    public GROUPMEMBERFind20110214 createGROUPMEMBERFind20110214() {
        return new GROUPMEMBERFind20110214();
    }

    /**
     * Create an instance of {@link ACCOUNTMEMBERSHIPFind20110214Response }
     * 
     */
    public ACCOUNTMEMBERSHIPFind20110214Response createACCOUNTMEMBERSHIPFind20110214Response() {
        return new ACCOUNTMEMBERSHIPFind20110214Response();
    }

    /**
     * Create an instance of {@link GOGGerarchiaSto20120415 }
     * 
     */
    public GOGGerarchiaSto20120415 createGOGGerarchiaSto20120415() {
        return new GOGGerarchiaSto20120415();
    }

    /**
     * Create an instance of {@link ACCOUNTFindIdAda20091229Response }
     * 
     */
    public ACCOUNTFindIdAda20091229Response createACCOUNTFindIdAda20091229Response() {
        return new ACCOUNTFindIdAda20091229Response();
    }

    /**
     * Create an instance of {@link GOGGerarchiaSto20110214 }
     * 
     */
    public GOGGerarchiaSto20110214 createGOGGerarchiaSto20110214() {
        return new GOGGerarchiaSto20110214();
    }

    /**
     * Create an instance of {@link PERFindAllPosizioniDate20110214Response }
     * 
     */
    public PERFindAllPosizioniDate20110214Response createPERFindAllPosizioniDate20110214Response() {
        return new PERFindAllPosizioniDate20110214Response();
    }

    /**
     * Create an instance of {@link ADAIDFindIdAdaDaUsername20120415Response }
     * 
     */
    public ADAIDFindIdAdaDaUsername20120415Response createADAIDFindIdAdaDaUsername20120415Response() {
        return new ADAIDFindIdAdaDaUsername20120415Response();
    }

    /**
     * Create an instance of {@link PERFindAllPosizioni20091229Response }
     * 
     */
    public PERFindAllPosizioni20091229Response createPERFindAllPosizioni20091229Response() {
        return new PERFindAllPosizioni20091229Response();
    }

    /**
     * Create an instance of {@link ADAObjectID }
     * 
     */
    public ADAObjectID createADAObjectID() {
        return new ADAObjectID();
    }

    /**
     * Create an instance of {@link ACCOUNTMEMBERSHIPFind20120415Response }
     * 
     */
    public ACCOUNTMEMBERSHIPFind20120415Response createACCOUNTMEMBERSHIPFind20120415Response() {
        return new ACCOUNTMEMBERSHIPFind20120415Response();
    }

    /**
     * Create an instance of {@link PERFindIdAda20110214Response }
     * 
     */
    public PERFindIdAda20110214Response createPERFindIdAda20110214Response() {
        return new PERFindIdAda20110214Response();
    }

    /**
     * Create an instance of {@link ACCOUNTFindIdAda20110214 }
     * 
     */
    public ACCOUNTFindIdAda20110214 createACCOUNTFindIdAda20110214() {
        return new ACCOUNTFindIdAda20110214();
    }

    /**
     * Create an instance of {@link VOIPFindEntity20091229Response }
     * 
     */
    public VOIPFindEntity20091229Response createVOIPFindEntity20091229Response() {
        return new VOIPFindEntity20091229Response();
    }

    /**
     * Create an instance of {@link SSDFindAll20120415 }
     * 
     */
    public SSDFindAll20120415 createSSDFindAll20120415() {
        return new SSDFindAll20120415();
    }

    /**
     * Create an instance of {@link APEFindAll20110214Response }
     * 
     */
    public APEFindAll20110214Response createAPEFindAll20110214Response() {
        return new APEFindAll20110214Response();
    }

    /**
     * Create an instance of {@link PERFindCodiciBase20120415Response }
     * 
     */
    public PERFindCodiciBase20120415Response createPERFindCodiciBase20120415Response() {
        return new PERFindCodiciBase20120415Response();
    }

    /**
     * Create an instance of {@link GROUPMember }
     * 
     */
    public GROUPMember createGROUPMember() {
        return new GROUPMember();
    }

    /**
     * Create an instance of {@link GROUPFind20120415Response }
     * 
     */
    public GROUPFind20120415Response createGROUPFind20120415Response() {
        return new GROUPFind20120415Response();
    }

    /**
     * Create an instance of {@link ArrayOfANAGRAFICAESTESA }
     * 
     */
    public ArrayOfANAGRAFICAESTESA createArrayOfANAGRAFICAESTESA() {
        return new ArrayOfANAGRAFICAESTESA();
    }

    /**
     * Create an instance of {@link ADIFindAll20120415 }
     * 
     */
    public ADIFindAll20120415 createADIFindAll20120415() {
        return new ADIFindAll20120415();
    }

    /**
     * Create an instance of {@link ATTRIBUTIPERSONALI }
     * 
     */
    public ATTRIBUTIPERSONALI createATTRIBUTIPERSONALI() {
        return new ATTRIBUTIPERSONALI();
    }

    /**
     * Create an instance of {@link PERFindAllPosizioniDate20110214 }
     * 
     */
    public PERFindAllPosizioniDate20110214 createPERFindAllPosizioniDate20110214() {
        return new PERFindAllPosizioniDate20110214();
    }

    /**
     * Create an instance of {@link AESAnagraficaEstesa20120415Response }
     * 
     */
    public AESAnagraficaEstesa20120415Response createAESAnagraficaEstesa20120415Response() {
        return new AESAnagraficaEstesa20120415Response();
    }

    /**
     * Create an instance of {@link DESCRIZIONEFindAtr20120415Response }
     * 
     */
    public DESCRIZIONEFindAtr20120415Response createDESCRIZIONEFindAtr20120415Response() {
        return new DESCRIZIONEFindAtr20120415Response();
    }

    /**
     * Create an instance of {@link GROUPFind20120415 }
     * 
     */
    public GROUPFind20120415 createGROUPFind20120415() {
        return new GROUPFind20120415();
    }

    /**
     * Create an instance of {@link PERFindPosizioniIdAda20120415 }
     * 
     */
    public PERFindPosizioniIdAda20120415 createPERFindPosizioniIdAda20120415() {
        return new PERFindPosizioniIdAda20120415();
    }

    /**
     * Create an instance of {@link ACCOUNTDETAILFINDIdAccListDaIdAda20110214 }
     * 
     */
    public ACCOUNTDETAILFINDIdAccListDaIdAda20110214 createACCOUNTDETAILFINDIdAccListDaIdAda20110214() {
        return new ACCOUNTDETAILFINDIdAccListDaIdAda20110214();
    }

    /**
     * Create an instance of {@link RECAPITOFindOgaAcc20110214 }
     * 
     */
    public RECAPITOFindOgaAcc20110214 createRECAPITOFindOgaAcc20110214() {
        return new RECAPITOFindOgaAcc20110214();
    }

    /**
     * Create an instance of {@link ADAIDFindIdAdaDaUsername20110214 }
     * 
     */
    public ADAIDFindIdAdaDaUsername20110214 createADAIDFindIdAdaDaUsername20110214() {
        return new ADAIDFindIdAdaDaUsername20110214();
    }

    /**
     * Create an instance of {@link GOGGerarchiaSto20110214Response }
     * 
     */
    public GOGGerarchiaSto20110214Response createGOGGerarchiaSto20110214Response() {
        return new GOGGerarchiaSto20110214Response();
    }

    /**
     * Create an instance of {@link DESCRIZIONEFindOga20110214Response }
     * 
     */
    public DESCRIZIONEFindOga20110214Response createDESCRIZIONEFindOga20110214Response() {
        return new DESCRIZIONEFindOga20110214Response();
    }

    /**
     * Create an instance of {@link RECAPITOFindOgaAcc20120415Response }
     * 
     */
    public RECAPITOFindOgaAcc20120415Response createRECAPITOFindOgaAcc20120415Response() {
        return new RECAPITOFindOgaAcc20120415Response();
    }

    /**
     * Create an instance of {@link UCSUltimaCarrieraStudente20120415 }
     * 
     */
    public UCSUltimaCarrieraStudente20120415 createUCSUltimaCarrieraStudente20120415() {
        return new UCSUltimaCarrieraStudente20120415();
    }

    /**
     * Create an instance of {@link PERFindIdAda20091229Response }
     * 
     */
    public PERFindIdAda20091229Response createPERFindIdAda20091229Response() {
        return new PERFindIdAda20091229Response();
    }

    /**
     * Create an instance of {@link ADIFindAll20110214Response }
     * 
     */
    public ADIFindAll20110214Response createADIFindAll20110214Response() {
        return new ADIFindAll20110214Response();
    }

    /**
     * Create an instance of {@link PERFindAllPosizioni20110214 }
     * 
     */
    public PERFindAllPosizioni20110214 createPERFindAllPosizioni20110214() {
        return new PERFindAllPosizioni20110214();
    }

    /**
     * Create an instance of {@link PERFindCognomeNome20120415Response }
     * 
     */
    public PERFindCognomeNome20120415Response createPERFindCognomeNome20120415Response() {
        return new PERFindCognomeNome20120415Response();
    }

    /**
     * Create an instance of {@link ATTRIBUTIDIDATTICA }
     * 
     */
    public ATTRIBUTIDIDATTICA createATTRIBUTIDIDATTICA() {
        return new ATTRIBUTIDIDATTICA();
    }

    /**
     * Create an instance of {@link PERCheckIdentity20110214 }
     * 
     */
    public PERCheckIdentity20110214 createPERCheckIdentity20110214() {
        return new PERCheckIdentity20110214();
    }

    /**
     * Create an instance of {@link CODEFindIdFonte20110214 }
     * 
     */
    public CODEFindIdFonte20110214 createCODEFindIdFonte20110214() {
        return new CODEFindIdFonte20110214();
    }

    /**
     * Create an instance of {@link ACCOUNTMembership }
     * 
     */
    public ACCOUNTMembership createACCOUNTMembership() {
        return new ACCOUNTMembership();
    }

    /**
     * Create an instance of {@link GROUPMEMBERFind20120415 }
     * 
     */
    public GROUPMEMBERFind20120415 createGROUPMEMBERFind20120415() {
        return new GROUPMEMBERFind20120415();
    }

    /**
     * Create an instance of {@link DESCRIZIONEFindAtr20110214Response }
     * 
     */
    public DESCRIZIONEFindAtr20110214Response createDESCRIZIONEFindAtr20110214Response() {
        return new DESCRIZIONEFindAtr20110214Response();
    }

    /**
     * Create an instance of {@link ADAIDFindIdAccDaUsername20110214Response }
     * 
     */
    public ADAIDFindIdAccDaUsername20110214Response createADAIDFindIdAccDaUsername20110214Response() {
        return new ADAIDFindIdAccDaUsername20110214Response();
    }

    /**
     * Create an instance of {@link ULTIMACARRIERASTUDENTE }
     * 
     */
    public ULTIMACARRIERASTUDENTE createULTIMACARRIERASTUDENTE() {
        return new ULTIMACARRIERASTUDENTE();
    }

    /**
     * Create an instance of {@link SETTORESDAREACUN }
     * 
     */
    public SETTORESDAREACUN createSETTORESDAREACUN() {
        return new SETTORESDAREACUN();
    }

    /**
     * Create an instance of {@link CODEFindIdAda20120415 }
     * 
     */
    public CODEFindIdAda20120415 createCODEFindIdAda20120415() {
        return new CODEFindIdAda20120415();
    }

    /**
     * Create an instance of {@link ADAIDFindIdAccDaUsername20120415Response }
     * 
     */
    public ADAIDFindIdAccDaUsername20120415Response createADAIDFindIdAccDaUsername20120415Response() {
        return new ADAIDFindIdAccDaUsername20120415Response();
    }

    /**
     * Create an instance of {@link ADIFindAll20110214 }
     * 
     */
    public ADIFindAll20110214 createADIFindAll20110214() {
        return new ADIFindAll20110214();
    }

    /**
     * Create an instance of {@link GROUPFind20110214 }
     * 
     */
    public GROUPFind20110214 createGROUPFind20110214() {
        return new GROUPFind20110214();
    }

    /**
     * Create an instance of {@link PERFindCognomeNomeResponse }
     * 
     */
    public PERFindCognomeNomeResponse createPERFindCognomeNomeResponse() {
        return new PERFindCognomeNomeResponse();
    }

    /**
     * Create an instance of {@link GOGGerarchiaSto20120415Response }
     * 
     */
    public GOGGerarchiaSto20120415Response createGOGGerarchiaSto20120415Response() {
        return new GOGGerarchiaSto20120415Response();
    }

    /**
     * Create an instance of {@link PERFindCognomeNome20091229 }
     * 
     */
    public PERFindCognomeNome20091229 createPERFindCognomeNome20091229() {
        return new PERFindCognomeNome20091229();
    }

    /**
     * Create an instance of {@link ACCOUNTDETAILFINDIdAccListDaIdAda20120415 }
     * 
     */
    public ACCOUNTDETAILFINDIdAccListDaIdAda20120415 createACCOUNTDETAILFINDIdAccListDaIdAda20120415() {
        return new ACCOUNTDETAILFINDIdAccListDaIdAda20120415();
    }

    /**
     * Create an instance of {@link SSDFindAll20110214 }
     * 
     */
    public SSDFindAll20110214 createSSDFindAll20110214() {
        return new SSDFindAll20110214();
    }

    /**
     * Create an instance of {@link ACCOUNTDETAILFINDIdAccListDaIdAda20120415Response }
     * 
     */
    public ACCOUNTDETAILFINDIdAccListDaIdAda20120415Response createACCOUNTDETAILFINDIdAccListDaIdAda20120415Response() {
        return new ACCOUNTDETAILFINDIdAccListDaIdAda20120415Response();
    }

    /**
     * Create an instance of {@link GOGRelazioneGerarchica }
     * 
     */
    public GOGRelazioneGerarchica createGOGRelazioneGerarchica() {
        return new GOGRelazioneGerarchica();
    }

    /**
     * Create an instance of {@link LIBRETTOSTUDENTE }
     * 
     */
    public LIBRETTOSTUDENTE createLIBRETTOSTUDENTE() {
        return new LIBRETTOSTUDENTE();
    }

    /**
     * Create an instance of {@link PERPosizioni20091229 }
     * 
     */
    public PERPosizioni20091229 createPERPosizioni20091229() {
        return new PERPosizioni20091229();
    }

    /**
     * Create an instance of {@link LBSLibrettoStudente20120415 }
     * 
     */
    public LBSLibrettoStudente20120415 createLBSLibrettoStudente20120415() {
        return new LBSLibrettoStudente20120415();
    }

    /**
     * Create an instance of {@link VOIPFindEntity20120415 }
     * 
     */
    public VOIPFindEntity20120415 createVOIPFindEntity20120415() {
        return new VOIPFindEntity20120415();
    }

    /**
     * Create an instance of {@link RECAPITO }
     * 
     */
    public RECAPITO createRECAPITO() {
        return new RECAPITO();
    }

    /**
     * Create an instance of {@link VOIPFindEntity20120415Response }
     * 
     */
    public VOIPFindEntity20120415Response createVOIPFindEntity20120415Response() {
        return new VOIPFindEntity20120415Response();
    }

    /**
     * Create an instance of {@link PERFindIdAda20120415 }
     * 
     */
    public PERFindIdAda20120415 createPERFindIdAda20120415() {
        return new PERFindIdAda20120415();
    }

    /**
     * Create an instance of {@link PERFindIdAdaResponse }
     * 
     */
    public PERFindIdAdaResponse createPERFindIdAdaResponse() {
        return new PERFindIdAdaResponse();
    }

    /**
     * Create an instance of {@link DESCRIZIONEFindAtr20120415 }
     * 
     */
    public DESCRIZIONEFindAtr20120415 createDESCRIZIONEFindAtr20120415() {
        return new DESCRIZIONEFindAtr20120415();
    }

    /**
     * Create an instance of {@link PERAttivitaDidatticheSostenute20120415 }
     * 
     */
    public PERAttivitaDidatticheSostenute20120415 createPERAttivitaDidatticheSostenute20120415() {
        return new PERAttivitaDidatticheSostenute20120415();
    }

    /**
     * Create an instance of {@link PERFindAllPosizioni20110214Response }
     * 
     */
    public PERFindAllPosizioni20110214Response createPERFindAllPosizioni20110214Response() {
        return new PERFindAllPosizioni20110214Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCODERelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "CODE_find_id_fonte_20110214Result", scope = CODEFindIdFonte20110214Response.class)
    public JAXBElement<ArrayOfCODERelation> createCODEFindIdFonte20110214ResponseCODEFindIdFonte20110214Result(ArrayOfCODERelation value) {
        return new JAXBElement<ArrayOfCODERelation>(_CODEFindIdFonte20110214ResponseCODEFindIdFonte20110214Result_QNAME, ArrayOfCODERelation.class, CODEFindIdFonte20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATTRIBUTIDIDATTICA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ATTRIBUTI_DIDATTICA")
    public JAXBElement<ATTRIBUTIDIDATTICA> createATTRIBUTIDIDATTICA(ATTRIBUTIDIDATTICA value) {
        return new JAXBElement<ATTRIBUTIDIDATTICA>(_ATTRIBUTIDIDATTICA_QNAME, ATTRIBUTIDIDATTICA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACCOUNTMembership }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ACCOUNT_membership")
    public JAXBElement<ACCOUNTMembership> createACCOUNTMembership(ACCOUNTMembership value) {
        return new JAXBElement<ACCOUNTMembership>(_ACCOUNTMembership_QNAME, ACCOUNTMembership.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADAObjectID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfADA_object_ID")
    public JAXBElement<ArrayOfADAObjectID> createArrayOfADAObjectID(ArrayOfADAObjectID value) {
        return new JAXBElement<ArrayOfADAObjectID>(_ArrayOfADAObjectID_QNAME, ArrayOfADAObjectID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ULTIMACARRIERASTUDENTE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ULTIMA_CARRIERA_STUDENTE")
    public JAXBElement<ULTIMACARRIERASTUDENTE> createULTIMACARRIERASTUDENTE(ULTIMACARRIERASTUDENTE value) {
        return new JAXBElement<ULTIMACARRIERASTUDENTE>(_ULTIMACARRIERASTUDENTE_QNAME, ULTIMACARRIERASTUDENTE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SETTORESDAREACUN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "SETTORE_SD_AREA_CUN")
    public JAXBElement<SETTORESDAREACUN> createSETTORESDAREACUN(SETTORESDAREACUN value) {
        return new JAXBElement<SETTORESDAREACUN>(_SETTORESDAREACUN_QNAME, SETTORESDAREACUN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfANAGRAFICAESTESA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfANAGRAFICA_ESTESA")
    public JAXBElement<ArrayOfANAGRAFICAESTESA> createArrayOfANAGRAFICAESTESA(ArrayOfANAGRAFICAESTESA value) {
        return new JAXBElement<ArrayOfANAGRAFICAESTESA>(_ArrayOfANAGRAFICAESTESA_QNAME, ArrayOfANAGRAFICAESTESA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGROUPDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfGROUP_detail")
    public JAXBElement<ArrayOfGROUPDetail> createArrayOfGROUPDetail(ArrayOfGROUPDetail value) {
        return new JAXBElement<ArrayOfGROUPDetail>(_ArrayOfGROUPDetail_QNAME, ArrayOfGROUPDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVOIPEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfVOIP_entity")
    public JAXBElement<ArrayOfVOIPEntity> createArrayOfVOIPEntity(ArrayOfVOIPEntity value) {
        return new JAXBElement<ArrayOfVOIPEntity>(_ArrayOfVOIPEntity_QNAME, ArrayOfVOIPEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATTRIBUTIPERSONALI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ATTRIBUTI_PERSONALI")
    public JAXBElement<ATTRIBUTIPERSONALI> createATTRIBUTIPERSONALI(ATTRIBUTIPERSONALI value) {
        return new JAXBElement<ATTRIBUTIPERSONALI>(_ATTRIBUTIPERSONALI_QNAME, ATTRIBUTIPERSONALI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_Persona")
    public JAXBElement<PERPersona> createPERPersona(PERPersona value) {
        return new JAXBElement<PERPersona>(_PERPersona_QNAME, PERPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PERPosizioni }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_Posizioni")
    public JAXBElement<PERPosizioni> createPERPosizioni(PERPosizioni value) {
        return new JAXBElement<PERPosizioni>(_PERPosizioni_QNAME, PERPosizioni.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GOGRelazioneGerarchica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GOG_relazione_gerarchica")
    public JAXBElement<GOGRelazioneGerarchica> createGOGRelazioneGerarchica(GOGRelazioneGerarchica value) {
        return new JAXBElement<GOGRelazioneGerarchica>(_GOGRelazioneGerarchica_QNAME, GOGRelazioneGerarchica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRECAPITO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfRECAPITO")
    public JAXBElement<ArrayOfRECAPITO> createArrayOfRECAPITO(ArrayOfRECAPITO value) {
        return new JAXBElement<ArrayOfRECAPITO>(_ArrayOfRECAPITO_QNAME, ArrayOfRECAPITO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LIBRETTOSTUDENTE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LIBRETTO_STUDENTE")
    public JAXBElement<LIBRETTOSTUDENTE> createLIBRETTOSTUDENTE(LIBRETTOSTUDENTE value) {
        return new JAXBElement<LIBRETTOSTUDENTE>(_LIBRETTOSTUDENTE_QNAME, LIBRETTOSTUDENTE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PERPosizioni20091229 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_Posizioni_20091229")
    public JAXBElement<PERPosizioni20091229> createPERPosizioni20091229(PERPosizioni20091229 value) {
        return new JAXBElement<PERPosizioni20091229>(_PERPosizioni20091229_QNAME, PERPosizioni20091229 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RECAPITO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RECAPITO")
    public JAXBElement<RECAPITO> createRECAPITO(RECAPITO value) {
        return new JAXBElement<RECAPITO>(_RECAPITO_QNAME, RECAPITO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADADescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfADA_description")
    public JAXBElement<ArrayOfADADescription> createArrayOfADADescription(ArrayOfADADescription value) {
        return new JAXBElement<ArrayOfADADescription>(_ArrayOfADADescription_QNAME, ArrayOfADADescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCODERelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfCODE_relation")
    public JAXBElement<ArrayOfCODERelation> createArrayOfCODERelation(ArrayOfCODERelation value) {
        return new JAXBElement<ArrayOfCODERelation>(_ArrayOfCODERelation_QNAME, ArrayOfCODERelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ADADescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ADA_description")
    public JAXBElement<ADADescription> createADADescription(ADADescription value) {
        return new JAXBElement<ADADescription>(_ADADescription_QNAME, ADADescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACCOUNTDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ACCOUNT_detail")
    public JAXBElement<ACCOUNTDetail> createACCOUNTDetail(ACCOUNTDetail value) {
        return new JAXBElement<ACCOUNTDetail>(_ACCOUNTDetail_QNAME, ACCOUNTDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfATTIVITADIDATTICASOSTENUTA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfATTIVITA_DIDATTICA_SOSTENUTA")
    public JAXBElement<ArrayOfATTIVITADIDATTICASOSTENUTA> createArrayOfATTIVITADIDATTICASOSTENUTA(ArrayOfATTIVITADIDATTICASOSTENUTA value) {
        return new JAXBElement<ArrayOfATTIVITADIDATTICASOSTENUTA>(_ArrayOfATTIVITADIDATTICASOSTENUTA_QNAME, ArrayOfATTIVITADIDATTICASOSTENUTA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLIBRETTOSTUDENTE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfLIBRETTO_STUDENTE")
    public JAXBElement<ArrayOfLIBRETTOSTUDENTE> createArrayOfLIBRETTOSTUDENTE(ArrayOfLIBRETTOSTUDENTE value) {
        return new JAXBElement<ArrayOfLIBRETTOSTUDENTE>(_ArrayOfLIBRETTOSTUDENTE_QNAME, ArrayOfLIBRETTOSTUDENTE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfATTRIBUTIDIDATTICA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfATTRIBUTI_DIDATTICA")
    public JAXBElement<ArrayOfATTRIBUTIDIDATTICA> createArrayOfATTRIBUTIDIDATTICA(ArrayOfATTRIBUTIDIDATTICA value) {
        return new JAXBElement<ArrayOfATTRIBUTIDIDATTICA>(_ArrayOfATTRIBUTIDIDATTICA_QNAME, ArrayOfATTRIBUTIDIDATTICA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANAGRAFICAESTESA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ANAGRAFICA_ESTESA")
    public JAXBElement<ANAGRAFICAESTESA> createANAGRAFICAESTESA(ANAGRAFICAESTESA value) {
        return new JAXBElement<ANAGRAFICAESTESA>(_ANAGRAFICAESTESA_QNAME, ANAGRAFICAESTESA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfPER_Persona")
    public JAXBElement<ArrayOfPERPersona> createArrayOfPERPersona(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_ArrayOfPERPersona_QNAME, ArrayOfPERPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGOGRelazioneGerarchica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfGOG_relazione_gerarchica")
    public JAXBElement<ArrayOfGOGRelazioneGerarchica> createArrayOfGOGRelazioneGerarchica(ArrayOfGOGRelazioneGerarchica value) {
        return new JAXBElement<ArrayOfGOGRelazioneGerarchica>(_ArrayOfGOGRelazioneGerarchica_QNAME, ArrayOfGOGRelazioneGerarchica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfPER_Posizioni_20091229")
    public JAXBElement<ArrayOfPERPosizioni20091229> createArrayOfPERPosizioni20091229(ArrayOfPERPosizioni20091229 value) {
        return new JAXBElement<ArrayOfPERPosizioni20091229>(_ArrayOfPERPosizioni20091229_QNAME, ArrayOfPERPosizioni20091229 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfATTRIBUTIPERSONALI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfATTRIBUTI_PERSONALI")
    public JAXBElement<ArrayOfATTRIBUTIPERSONALI> createArrayOfATTRIBUTIPERSONALI(ArrayOfATTRIBUTIPERSONALI value) {
        return new JAXBElement<ArrayOfATTRIBUTIPERSONALI>(_ArrayOfATTRIBUTIPERSONALI_QNAME, ArrayOfATTRIBUTIPERSONALI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTMembership }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfACCOUNT_membership")
    public JAXBElement<ArrayOfACCOUNTMembership> createArrayOfACCOUNTMembership(ArrayOfACCOUNTMembership value) {
        return new JAXBElement<ArrayOfACCOUNTMembership>(_ArrayOfACCOUNTMembership_QNAME, ArrayOfACCOUNTMembership.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGROUPMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfGROUP_member")
    public JAXBElement<ArrayOfGROUPMember> createArrayOfGROUPMember(ArrayOfGROUPMember value) {
        return new JAXBElement<ArrayOfGROUPMember>(_ArrayOfGROUPMember_QNAME, ArrayOfGROUPMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GROUPDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GROUP_detail")
    public JAXBElement<GROUPDetail> createGROUPDetail(GROUPDetail value) {
        return new JAXBElement<GROUPDetail>(_GROUPDetail_QNAME, GROUPDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTEntityBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfACCOUNT_entity_base")
    public JAXBElement<ArrayOfACCOUNTEntityBase> createArrayOfACCOUNTEntityBase(ArrayOfACCOUNTEntityBase value) {
        return new JAXBElement<ArrayOfACCOUNTEntityBase>(_ArrayOfACCOUNTEntityBase_QNAME, ArrayOfACCOUNTEntityBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GROUPMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GROUP_member")
    public JAXBElement<GROUPMember> createGROUPMember(GROUPMember value) {
        return new JAXBElement<GROUPMember>(_GROUPMember_QNAME, GROUPMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfPER_Posizioni")
    public JAXBElement<ArrayOfPERPosizioni> createArrayOfPERPosizioni(ArrayOfPERPosizioni value) {
        return new JAXBElement<ArrayOfPERPosizioni>(_ArrayOfPERPosizioni_QNAME, ArrayOfPERPosizioni.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATTIVITADIDATTICASOSTENUTA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ATTIVITA_DIDATTICA_SOSTENUTA")
    public JAXBElement<ATTIVITADIDATTICASOSTENUTA> createATTIVITADIDATTICASOSTENUTA(ATTIVITADIDATTICASOSTENUTA value) {
        return new JAXBElement<ATTIVITADIDATTICASOSTENUTA>(_ATTIVITADIDATTICASOSTENUTA_QNAME, ATTIVITADIDATTICASOSTENUTA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACCOUNTEntityBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ACCOUNT_entity_base")
    public JAXBElement<ACCOUNTEntityBase> createACCOUNTEntityBase(ACCOUNTEntityBase value) {
        return new JAXBElement<ACCOUNTEntityBase>(_ACCOUNTEntityBase_QNAME, ACCOUNTEntityBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSETTORESDAREACUN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfSETTORE_SD_AREA_CUN")
    public JAXBElement<ArrayOfSETTORESDAREACUN> createArrayOfSETTORESDAREACUN(ArrayOfSETTORESDAREACUN value) {
        return new JAXBElement<ArrayOfSETTORESDAREACUN>(_ArrayOfSETTORESDAREACUN_QNAME, ArrayOfSETTORESDAREACUN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfULTIMACARRIERASTUDENTE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfULTIMA_CARRIERA_STUDENTE")
    public JAXBElement<ArrayOfULTIMACARRIERASTUDENTE> createArrayOfULTIMACARRIERASTUDENTE(ArrayOfULTIMACARRIERASTUDENTE value) {
        return new JAXBElement<ArrayOfULTIMACARRIERASTUDENTE>(_ArrayOfULTIMACARRIERASTUDENTE_QNAME, ArrayOfULTIMACARRIERASTUDENTE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ADAObjectID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ADA_object_ID")
    public JAXBElement<ADAObjectID> createADAObjectID(ADAObjectID value) {
        return new JAXBElement<ADAObjectID>(_ADAObjectID_QNAME, ADAObjectID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CODERelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "CODE_relation")
    public JAXBElement<CODERelation> createCODERelation(CODERelation value) {
        return new JAXBElement<CODERelation>(_CODERelation_QNAME, CODERelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VOIPEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "VOIP_entity")
    public JAXBElement<VOIPEntity> createVOIPEntity(VOIPEntity value) {
        return new JAXBElement<VOIPEntity>(_VOIPEntity_QNAME, VOIPEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ArrayOfACCOUNT_detail")
    public JAXBElement<ArrayOfACCOUNTDetail> createArrayOfACCOUNTDetail(ArrayOfACCOUNTDetail value) {
        return new JAXBElement<ArrayOfACCOUNTDetail>(_ArrayOfACCOUNTDetail_QNAME, ArrayOfACCOUNTDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA_FIGLIO", scope = GOGRelazioneGerarchica.class)
    public JAXBElement<String> createGOGRelazioneGerarchicaIDADAFIGLIO(String value) {
        return new JAXBElement<String>(_GOGRelazioneGerarchicaIDADAFIGLIO_QNAME, String.class, GOGRelazioneGerarchica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LIVELLO", scope = GOGRelazioneGerarchica.class)
    public JAXBElement<Long> createGOGRelazioneGerarchicaLIVELLO(Long value) {
        return new JAXBElement<Long>(_GOGRelazioneGerarchicaLIVELLO_QNAME, Long.class, GOGRelazioneGerarchica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA_PADRE", scope = GOGRelazioneGerarchica.class)
    public JAXBElement<String> createGOGRelazioneGerarchicaIDADAPADRE(String value) {
        return new JAXBElement<String>(_GOGRelazioneGerarchicaIDADAPADRE_QNAME, String.class, GOGRelazioneGerarchica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_TSO", scope = GOGRelazioneGerarchica.class)
    public JAXBElement<String> createGOGRelazioneGerarchicaIDTSO(String value) {
        return new JAXBElement<String>(_GOGRelazioneGerarchicaIDTSO_QNAME, String.class, GOGRelazioneGerarchica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ORDINE", scope = GOGRelazioneGerarchica.class)
    public JAXBElement<Long> createGOGRelazioneGerarchicaORDINE(Long value) {
        return new JAXBElement<Long>(_GOGRelazioneGerarchicaORDINE_QNAME, Long.class, GOGRelazioneGerarchica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE_GOG", scope = GOGRelazioneGerarchica.class)
    public JAXBElement<XMLGregorianCalendar> createGOGRelazioneGerarchicaFINEGOG(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GOGRelazioneGerarchicaFINEGOG_QNAME, XMLGregorianCalendar.class, GOGRelazioneGerarchica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO_GOG", scope = GOGRelazioneGerarchica.class)
    public JAXBElement<XMLGregorianCalendar> createGOGRelazioneGerarchicaINIZIOGOG(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GOGRelazioneGerarchicaINIZIOGOG_QNAME, XMLGregorianCalendar.class, GOGRelazioneGerarchica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGROUPMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GROUP_MEMBER_find_20110214Result", scope = GROUPMEMBERFind20110214Response.class)
    public JAXBElement<ArrayOfGROUPMember> createGROUPMEMBERFind20110214ResponseGROUPMEMBERFind20110214Result(ArrayOfGROUPMember value) {
        return new JAXBElement<ArrayOfGROUPMember>(_GROUPMEMBERFind20110214ResponseGROUPMEMBERFind20110214Result_QNAME, ArrayOfGROUPMember.class, GROUPMEMBERFind20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTMembership }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ACCOUNT_MEMBERSHIP_find_20120415Result", scope = ACCOUNTMEMBERSHIPFind20120415Response.class)
    public JAXBElement<ArrayOfACCOUNTMembership> createACCOUNTMEMBERSHIPFind20120415ResponseACCOUNTMEMBERSHIPFind20120415Result(ArrayOfACCOUNTMembership value) {
        return new JAXBElement<ArrayOfACCOUNTMembership>(_ACCOUNTMEMBERSHIPFind20120415ResponseACCOUNTMEMBERSHIPFind20120415Result_QNAME, ArrayOfACCOUNTMembership.class, ACCOUNTMEMBERSHIPFind20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE", scope = ATTRIBUTIPERSONALI.class)
    public JAXBElement<XMLGregorianCalendar> createATTRIBUTIPERSONALIFINE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIFINE_QNAME, XMLGregorianCalendar.class, ATTRIBUTIPERSONALI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = ATTRIBUTIPERSONALI.class)
    public JAXBElement<String> createATTRIBUTIPERSONALIIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, ATTRIBUTIPERSONALI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ALIAS_NOME", scope = ATTRIBUTIPERSONALI.class)
    public JAXBElement<String> createATTRIBUTIPERSONALIALIASNOME(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIALIASNOME_QNAME, String.class, ATTRIBUTIPERSONALI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ALIAS_COGNOME", scope = ATTRIBUTIPERSONALI.class)
    public JAXBElement<String> createATTRIBUTIPERSONALIALIASCOGNOME(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIALIASCOGNOME_QNAME, String.class, ATTRIBUTIPERSONALI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO", scope = ATTRIBUTIPERSONALI.class)
    public JAXBElement<XMLGregorianCalendar> createATTRIBUTIPERSONALIINIZIO(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIINIZIO_QNAME, XMLGregorianCalendar.class, ATTRIBUTIPERSONALI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfULTIMACARRIERASTUDENTE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "UCS_ultima_carriera_studente_20120415Result", scope = UCSUltimaCarrieraStudente20120415Response.class)
    public JAXBElement<ArrayOfULTIMACARRIERASTUDENTE> createUCSUltimaCarrieraStudente20120415ResponseUCSUltimaCarrieraStudente20120415Result(ArrayOfULTIMACARRIERASTUDENTE value) {
        return new JAXBElement<ArrayOfULTIMACARRIERASTUDENTE>(_UCSUltimaCarrieraStudente20120415ResponseUCSUltimaCarrieraStudente20120415Result_QNAME, ArrayOfULTIMACARRIERASTUDENTE.class, UCSUltimaCarrieraStudente20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PPE_ID_OGA", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229PPEIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229PPEIDOGA_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FRO_ID_ATR", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229FROIDATR(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229FROIDATR_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "POR_ID_OGA", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229PORIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229PORIDOGA_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO_PPE", scope = PERPosizioni20091229 .class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioni20091229INIZIOPPE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229INIZIOPPE_QNAME, XMLGregorianCalendar.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_POR", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229DESCRIZIONEPOR(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONEPOR_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE_PPE", scope = PERPosizioni20091229 .class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioni20091229FINEPPE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229FINEPPE_QNAME, XMLGregorianCalendar.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_ID_OGA", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229PERIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229PERIDOGA_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RUP_ID_OGA", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229RUPIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229RUPIDOGA_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_STO", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229DESCRIZIONESTO(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONESTO_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LINGUA", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229LINGUA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229LINGUA_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_RUO", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229DESCRIZIONERUO(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONERUO_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_RUP", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229DESCRIZIONERUP(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONERUP_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO_SOG", scope = PERPosizioni20091229 .class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioni20091229INIZIOSOG(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229INIZIOSOG_QNAME, XMLGregorianCalendar.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE_POR", scope = PERPosizioni20091229 .class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioni20091229FINEPOR(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229FINEPOR_QNAME, XMLGregorianCalendar.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_SED", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229DESCRIZIONESED(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONESED_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RUO_ID_OGA", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229RUOIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229RUOIDOGA_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PRO_ID_OGA", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229PROIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229PROIDOGA_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "STO_ID_OGA", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229STOIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229STOIDOGA_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_PPE", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229DESCRIZIONEPPE(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONEPPE_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_FRO", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229DESCRIZIONEFRO(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONEFRO_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO_POR", scope = PERPosizioni20091229 .class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioni20091229INIZIOPOR(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229INIZIOPOR_QNAME, XMLGregorianCalendar.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "SED_ID_OGA", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229SEDIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229SEDIDOGA_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_PRO", scope = PERPosizioni20091229 .class)
    public JAXBElement<String> createPERPosizioni20091229DESCRIZIONEPRO(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONEPRO_QNAME, String.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE_SOG", scope = PERPosizioni20091229 .class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioni20091229FINESOG(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229FINESOG_QNAME, XMLGregorianCalendar.class, PERPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGROUPMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GROUP_MEMBER_find_20120415Result", scope = GROUPMEMBERFind20120415Response.class)
    public JAXBElement<ArrayOfGROUPMember> createGROUPMEMBERFind20120415ResponseGROUPMEMBERFind20120415Result(ArrayOfGROUPMember value) {
        return new JAXBElement<ArrayOfGROUPMember>(_GROUPMEMBERFind20120415ResponseGROUPMEMBERFind20120415Result_QNAME, ArrayOfGROUPMember.class, GROUPMEMBERFind20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfATTRIBUTIDIDATTICA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ADI_find_all_20110214Result", scope = ADIFindAll20110214Response.class)
    public JAXBElement<ArrayOfATTRIBUTIDIDATTICA> createADIFindAll20110214ResponseADIFindAll20110214Result(ArrayOfATTRIBUTIDIDATTICA value) {
        return new JAXBElement<ArrayOfATTRIBUTIDIDATTICA>(_ADIFindAll20110214ResponseADIFindAll20110214Result_QNAME, ArrayOfATTRIBUTIDIDATTICA.class, ADIFindAll20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_cognome_nome_20091229Result", scope = PERFindCognomeNome20091229Response.class)
    public JAXBElement<ArrayOfPERPersona> createPERFindCognomeNome20091229ResponsePERFindCognomeNome20091229Result(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERFindCognomeNome20091229ResponsePERFindCognomeNome20091229Result_QNAME, ArrayOfPERPersona.class, PERFindCognomeNome20091229Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVOIPEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "VOIP_find_entity_20110214Result", scope = VOIPFindEntity20110214Response.class)
    public JAXBElement<ArrayOfVOIPEntity> createVOIPFindEntity20110214ResponseVOIPFindEntity20110214Result(ArrayOfVOIPEntity value) {
        return new JAXBElement<ArrayOfVOIPEntity>(_VOIPFindEntity20110214ResponseVOIPFindEntity20110214Result_QNAME, ArrayOfVOIPEntity.class, VOIPFindEntity20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfATTIVITADIDATTICASOSTENUTA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_attivita_didattiche_sostenute_20120415Result", scope = PERAttivitaDidatticheSostenute20120415Response.class)
    public JAXBElement<ArrayOfATTIVITADIDATTICASOSTENUTA> createPERAttivitaDidatticheSostenute20120415ResponsePERAttivitaDidatticheSostenute20120415Result(ArrayOfATTIVITADIDATTICASOSTENUTA value) {
        return new JAXBElement<ArrayOfATTIVITADIDATTICASOSTENUTA>(_PERAttivitaDidatticheSostenute20120415ResponsePERAttivitaDidatticheSostenute20120415Result_QNAME, ArrayOfATTIVITADIDATTICASOSTENUTA.class, PERAttivitaDidatticheSostenute20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "descrizione", scope = VOIPFindEntity20091229 .class)
    public JAXBElement<String> createVOIPFindEntity20091229Descrizione(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229Descrizione_QNAME, String.class, VOIPFindEntity20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = VOIPFindEntity20091229 .class)
    public JAXBElement<XMLGregorianCalendar> createVOIPFindEntity20091229DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, VOIPFindEntity20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = VOIPFindEntity20091229 .class)
    public JAXBElement<String> createVOIPFindEntity20091229IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, VOIPFindEntity20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_toa", scope = VOIPFindEntity20091229 .class)
    public JAXBElement<String> createVOIPFindEntity20091229IdToa(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdToa_QNAME, String.class, VOIPFindEntity20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindPosizioniIdAda20091229 .class)
    public JAXBElement<String> createPERFindPosizioniIdAda20091229IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindPosizioniIdAda20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_gru", scope = GROUPMEMBERFind20120415 .class)
    public JAXBElement<String> createGROUPMEMBERFind20120415IdGru(String value) {
        return new JAXBElement<String>(_GROUPMEMBERFind20120415IdGru_QNAME, String.class, GROUPMEMBERFind20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_atr", scope = SSDFindAll20120415 .class)
    public JAXBElement<String> createSSDFindAll20120415IdAtr(String value) {
        return new JAXBElement<String>(_SSDFindAll20120415IdAtr_QNAME, String.class, SSDFindAll20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "lingua", scope = SSDFindAll20120415 .class)
    public JAXBElement<String> createSSDFindAll20120415Lingua(String value) {
        return new JAXBElement<String>(_SSDFindAll20120415Lingua_QNAME, String.class, SSDFindAll20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ssd", scope = SSDFindAll20120415 .class)
    public JAXBElement<String> createSSDFindAll20120415IdSsd(String value) {
        return new JAXBElement<String>(_SSDFindAll20120415IdSsd_QNAME, String.class, SSDFindAll20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_acu", scope = SSDFindAll20120415 .class)
    public JAXBElement<String> createSSDFindAll20120415IdAcu(String value) {
        return new JAXBElement<String>(_SSDFindAll20120415IdAcu_QNAME, String.class, SSDFindAll20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_PRESSO", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOPRESSO(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOPRESSO_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_FRAZIONE", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZAFRAZIONE(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZAFRAZIONE_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ANAGRAFICA_VALIDA", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<Boolean> createANAGRAFICAESTESAANAGRAFICAVALIDA(Boolean value) {
        return new JAXBElement<Boolean>(_ANAGRAFICAESTESAANAGRAFICAVALIDA_QNAME, Boolean.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA_CITTADINANZA", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESAIDADACITTADINANZA(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESAIDADACITTADINANZA_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_PREFISSO_INTERNAZIONALE", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOPREFISSOINTERNAZIONALE(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOPREFISSOINTERNAZIONALE_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESAIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_NAZIONE_DESCRIZIONE_IT", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZANAZIONEDESCRIZIONEIT(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZANAZIONEDESCRIZIONEIT_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_VIA", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZAVIA(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZAVIA_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_GIADA_PERSONA", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<Long> createANAGRAFICAESTESAIDGIADAPERSONA(Long value) {
        return new JAXBElement<Long>(_ANAGRAFICAESTESAIDGIADAPERSONA_QNAME, Long.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_ID_ADA_COMUNE", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZAIDADACOMUNE(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZAIDADACOMUNE_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_ID_ADA_NAZIONE", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOIDADANAZIONE(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOIDADANAZIONE_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FAX", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESAFAX(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESAFAX_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_NUMERO_CIVICO", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIONUMEROCIVICO(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIONUMEROCIVICO_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_CITTA_STRANIERA", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZACITTASTRANIERA(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZACITTASTRANIERA_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_PROVINCIA", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZAPROVINCIA(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZAPROVINCIA_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_CITTADINANZA_IT", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADESCRIZIONECITTADINANZAIT(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADESCRIZIONECITTADINANZAIT_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "CELLULARE", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESACELLULARE(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESACELLULARE_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_ID_ADA_NAZIONE", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZAIDADANAZIONE(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZAIDADANAZIONE_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_COMUNE_DESCRIZIONE_EN", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOCOMUNEDESCRIZIONEEN(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOCOMUNEDESCRIZIONEEN_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_TELEFONO", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOTELEFONO(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOTELEFONO_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_CAP", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZACAP(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZACAP_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_COMUNE_DESCRIZIONE_EN", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZACOMUNEDESCRIZIONEEN(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZACOMUNEDESCRIZIONEEN_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_TELEFONO", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZATELEFONO(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZATELEFONO_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_CITTA_STRANIERA", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOCITTASTRANIERA(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOCITTASTRANIERA_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_NUMERO_CIVICO", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZANUMEROCIVICO(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZANUMEROCIVICO_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_NAZIONE_DESCRIZIONE_EN", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIONAZIONEDESCRIZIONEEN(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIONAZIONEDESCRIZIONEEN_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_COMUNE_DESCRIZIONE_IT", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOCOMUNEDESCRIZIONEIT(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOCOMUNEDESCRIZIONEIT_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_COMUNE_DESCRIZIONE_IT", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZACOMUNEDESCRIZIONEIT(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZACOMUNEDESCRIZIONEIT_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_VIA", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOVIA(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOVIA_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_NAZIONE_DESCRIZIONE_IT", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIONAZIONEDESCRIZIONEIT(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIONAZIONEDESCRIZIONEIT_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_FRAZIONE", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOFRAZIONE(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOFRAZIONE_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_ID_ADA_COMUNE", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOIDADACOMUNE(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOIDADACOMUNE_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_NAZIONE_DESCRIZIONE_EN", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZANAZIONEDESCRIZIONEEN(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZANAZIONEDESCRIZIONEEN_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_CITTADINANZA_EN", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADESCRIZIONECITTADINANZAEN(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADESCRIZIONECITTADINANZAEN_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_PROVINCIA", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOPROVINCIA(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOPROVINCIA_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DOMICILIO_CAP", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESADOMICILIOCAP(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESADOMICILIOCAP_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RESIDENZA_PREFISSO_INTERNAZIONALE", scope = ANAGRAFICAESTESA.class)
    public JAXBElement<String> createANAGRAFICAESTESARESIDENZAPREFISSOINTERNAZIONALE(String value) {
        return new JAXBElement<String>(_ANAGRAFICAESTESARESIDENZAPREFISSOINTERNAZIONALE_QNAME, String.class, ANAGRAFICAESTESA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADAObjectID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ADA_ID_find_id_ada_da_username_20110214Result", scope = ADAIDFindIdAdaDaUsername20110214Response.class)
    public JAXBElement<ArrayOfADAObjectID> createADAIDFindIdAdaDaUsername20110214ResponseADAIDFindIdAdaDaUsername20110214Result(ArrayOfADAObjectID value) {
        return new JAXBElement<ArrayOfADAObjectID>(_ADAIDFindIdAdaDaUsername20110214ResponseADAIDFindIdAdaDaUsername20110214Result_QNAME, ArrayOfADAObjectID.class, ADAIDFindIdAdaDaUsername20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_cognome_nome_20110214Result", scope = PERFindCognomeNome20110214Response.class)
    public JAXBElement<ArrayOfPERPersona> createPERFindCognomeNome20110214ResponsePERFindCognomeNome20110214Result(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERFindCognomeNome20110214ResponsePERFindCognomeNome20110214Result_QNAME, ArrayOfPERPersona.class, PERFindCognomeNome20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "descrizione", scope = VOIPFindEntity20110214 .class)
    public JAXBElement<String> createVOIPFindEntity20110214Descrizione(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229Descrizione_QNAME, String.class, VOIPFindEntity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = VOIPFindEntity20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createVOIPFindEntity20110214DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, VOIPFindEntity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = VOIPFindEntity20110214 .class)
    public JAXBElement<String> createVOIPFindEntity20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, VOIPFindEntity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_toa", scope = VOIPFindEntity20110214 .class)
    public JAXBElement<String> createVOIPFindEntity20110214IdToa(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdToa_QNAME, String.class, VOIPFindEntity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGROUPDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GROUP_find_20110214Result", scope = GROUPFind20110214Response.class)
    public JAXBElement<ArrayOfGROUPDetail> createGROUPFind20110214ResponseGROUPFind20110214Result(ArrayOfGROUPDetail value) {
        return new JAXBElement<ArrayOfGROUPDetail>(_GROUPFind20110214ResponseGROUPFind20110214Result_QNAME, ArrayOfGROUPDetail.class, GROUPFind20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_GRU", scope = ACCOUNTMembership.class)
    public JAXBElement<String> createACCOUNTMembershipIDGRU(String value) {
        return new JAXBElement<String>(_ACCOUNTMembershipIDGRU_QNAME, String.class, ACCOUNTMembership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE", scope = ACCOUNTMembership.class)
    public JAXBElement<String> createACCOUNTMembershipDESCRIZIONE(String value) {
        return new JAXBElement<String>(_ACCOUNTMembershipDESCRIZIONE_QNAME, String.class, ACCOUNTMembership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GID", scope = ACCOUNTMembership.class)
    public JAXBElement<Long> createACCOUNTMembershipGID(Long value) {
        return new JAXBElement<Long>(_ACCOUNTMembershipGID_QNAME, Long.class, ACCOUNTMembership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = PERFindAllPosizioni20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createPERFindAllPosizioni20120415DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, PERFindAllPosizioni20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindAllPosizioni20120415 .class)
    public JAXBElement<String> createPERFindAllPosizioni20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindAllPosizioni20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGROUPDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GROUP_find_20120415Result", scope = GROUPFind20120415Response.class)
    public JAXBElement<ArrayOfGROUPDetail> createGROUPFind20120415ResponseGROUPFind20120415Result(ArrayOfGROUPDetail value) {
        return new JAXBElement<ArrayOfGROUPDetail>(_GROUPFind20120415ResponseGROUPFind20120415Result_QNAME, ArrayOfGROUPDetail.class, GROUPFind20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVOIPEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "VOIP_find_entity_20091229Result", scope = VOIPFindEntity20091229Response.class)
    public JAXBElement<ArrayOfVOIPEntity> createVOIPFindEntity20091229ResponseVOIPFindEntity20091229Result(ArrayOfVOIPEntity value) {
        return new JAXBElement<ArrayOfVOIPEntity>(_VOIPFindEntity20091229ResponseVOIPFindEntity20091229Result_QNAME, ArrayOfVOIPEntity.class, VOIPFindEntity20091229Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = LBSLibrettoStudente20120415 .class)
    public JAXBElement<String> createLBSLibrettoStudente20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, LBSLibrettoStudente20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_all_posizioni_date_20120415Result", scope = PERFindAllPosizioniDate20120415Response.class)
    public JAXBElement<ArrayOfPERPosizioni20091229> createPERFindAllPosizioniDate20120415ResponsePERFindAllPosizioniDate20120415Result(ArrayOfPERPosizioni20091229 value) {
        return new JAXBElement<ArrayOfPERPosizioni20091229>(_PERFindAllPosizioniDate20120415ResponsePERFindAllPosizioniDate20120415Result_QNAME, ArrayOfPERPosizioni20091229 .class, PERFindAllPosizioniDate20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_all_posizioni_20120415Result", scope = PERFindAllPosizioni20120415Response.class)
    public JAXBElement<ArrayOfPERPosizioni20091229> createPERFindAllPosizioni20120415ResponsePERFindAllPosizioni20120415Result(ArrayOfPERPosizioni20091229 value) {
        return new JAXBElement<ArrayOfPERPosizioni20091229>(_PERFindAllPosizioni20120415ResponsePERFindAllPosizioni20120415Result_QNAME, ArrayOfPERPosizioni20091229 .class, PERFindAllPosizioni20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_id_ada_20110214Result", scope = PERFindIdAda20110214Response.class)
    public JAXBElement<ArrayOfPERPersona> createPERFindIdAda20110214ResponsePERFindIdAda20110214Result(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERFindIdAda20110214ResponsePERFindIdAda20110214Result_QNAME, ArrayOfPERPersona.class, PERFindIdAda20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindPosizioniIdAda20110214 .class)
    public JAXBElement<String> createPERFindPosizioniIdAda20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindPosizioniIdAda20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_rif", scope = APEFindAll20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createAPEFindAll20110214DataRif(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_APEFindAll20110214DataRif_QNAME, XMLGregorianCalendar.class, APEFindAll20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = APEFindAll20110214 .class)
    public JAXBElement<String> createAPEFindAll20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, APEFindAll20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_lingua", scope = DESCRIZIONEFindAtr20120415 .class)
    public JAXBElement<String> createDESCRIZIONEFindAtr20120415IdLingua(String value) {
        return new JAXBElement<String>(_DESCRIZIONEFindAtr20120415IdLingua_QNAME, String.class, DESCRIZIONEFindAtr20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = DESCRIZIONEFindAtr20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createDESCRIZIONEFindAtr20120415DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, DESCRIZIONEFindAtr20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = DESCRIZIONEFindAtr20120415 .class)
    public JAXBElement<String> createDESCRIZIONEFindAtr20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, DESCRIZIONEFindAtr20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_toa", scope = DESCRIZIONEFindAtr20120415 .class)
    public JAXBElement<String> createDESCRIZIONEFindAtr20120415IdToa(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdToa_QNAME, String.class, DESCRIZIONEFindAtr20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_check_identity_20120415Result", scope = PERCheckIdentity20120415Response.class)
    public JAXBElement<ArrayOfPERPersona> createPERCheckIdentity20120415ResponsePERCheckIdentity20120415Result(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERCheckIdentity20120415ResponsePERCheckIdentity20120415Result_QNAME, ArrayOfPERPersona.class, PERCheckIdentity20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "nome", scope = PERFindCognomeNome20091229 .class)
    public JAXBElement<String> createPERFindCognomeNome20091229Nome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Nome_QNAME, String.class, PERFindCognomeNome20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "cognome", scope = PERFindCognomeNome20091229 .class)
    public JAXBElement<String> createPERFindCognomeNome20091229Cognome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Cognome_QNAME, String.class, PERFindCognomeNome20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTEntityBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ACCOUNT_find_id_ada_20110214Result", scope = ACCOUNTFindIdAda20110214Response.class)
    public JAXBElement<ArrayOfACCOUNTEntityBase> createACCOUNTFindIdAda20110214ResponseACCOUNTFindIdAda20110214Result(ArrayOfACCOUNTEntityBase value) {
        return new JAXBElement<ArrayOfACCOUNTEntityBase>(_ACCOUNTFindIdAda20110214ResponseACCOUNTFindIdAda20110214Result_QNAME, ArrayOfACCOUNTEntityBase.class, ACCOUNTFindIdAda20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "username", scope = ADAIDFindIdAccDaUsername20120415 .class)
    public JAXBElement<String> createADAIDFindIdAccDaUsername20120415Username(String value) {
        return new JAXBElement<String>(_ADAIDFindIdAccDaUsername20120415Username_QNAME, String.class, ADAIDFindIdAccDaUsername20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = UCSUltimaCarrieraStudente20120415 .class)
    public JAXBElement<String> createUCSUltimaCarrieraStudente20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, UCSUltimaCarrieraStudente20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindIdAda20110214 .class)
    public JAXBElement<String> createPERFindIdAda20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindIdAda20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindIdAda20091229 .class)
    public JAXBElement<String> createPERFindIdAda20091229IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindIdAda20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_all_posizioni_20110214Result", scope = PERFindAllPosizioni20110214Response.class)
    public JAXBElement<ArrayOfPERPosizioni20091229> createPERFindAllPosizioni20110214ResponsePERFindAllPosizioni20110214Result(ArrayOfPERPosizioni20091229 value) {
        return new JAXBElement<ArrayOfPERPosizioni20091229>(_PERFindAllPosizioni20110214ResponsePERFindAllPosizioni20110214Result_QNAME, ArrayOfPERPosizioni20091229 .class, PERFindAllPosizioni20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_cognome_nome_20120415Result", scope = PERFindCognomeNome20120415Response.class)
    public JAXBElement<ArrayOfPERPersona> createPERFindCognomeNome20120415ResponsePERFindCognomeNome20120415Result(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERFindCognomeNome20120415ResponsePERFindCognomeNome20120415Result_QNAME, ArrayOfPERPersona.class, PERFindCognomeNome20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_all_posizioni_date_20110214Result", scope = PERFindAllPosizioniDate20110214Response.class)
    public JAXBElement<ArrayOfPERPosizioni20091229> createPERFindAllPosizioniDate20110214ResponsePERFindAllPosizioniDate20110214Result(ArrayOfPERPosizioni20091229 value) {
        return new JAXBElement<ArrayOfPERPosizioni20091229>(_PERFindAllPosizioniDate20110214ResponsePERFindAllPosizioniDate20110214Result_QNAME, ArrayOfPERPosizioni20091229 .class, PERFindAllPosizioniDate20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfATTRIBUTIPERSONALI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "APE_find_all_20120415Result", scope = APEFindAll20120415Response.class)
    public JAXBElement<ArrayOfATTRIBUTIPERSONALI> createAPEFindAll20120415ResponseAPEFindAll20120415Result(ArrayOfATTRIBUTIPERSONALI value) {
        return new JAXBElement<ArrayOfATTRIBUTIPERSONALI>(_APEFindAll20120415ResponseAPEFindAll20120415Result_QNAME, ArrayOfATTRIBUTIPERSONALI.class, APEFindAll20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADAObjectID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ADA_ID_find_id_ada_da_username_20120415Result", scope = ADAIDFindIdAdaDaUsername20120415Response.class)
    public JAXBElement<ArrayOfADAObjectID> createADAIDFindIdAdaDaUsername20120415ResponseADAIDFindIdAdaDaUsername20120415Result(ArrayOfADAObjectID value) {
        return new JAXBElement<ArrayOfADAObjectID>(_ADAIDFindIdAdaDaUsername20120415ResponseADAIDFindIdAdaDaUsername20120415Result_QNAME, ArrayOfADAObjectID.class, ADAIDFindIdAdaDaUsername20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = CODEFindIdFonte20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createCODEFindIdFonte20120415DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, CODEFindIdFonte20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_fad", scope = CODEFindIdFonte20120415 .class)
    public JAXBElement<String> createCODEFindIdFonte20120415IdFad(String value) {
        return new JAXBElement<String>(_CODEFindIdFonte20120415IdFad_QNAME, String.class, CODEFindIdFonte20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = CODEFindIdFonte20120415 .class)
    public JAXBElement<String> createCODEFindIdFonte20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, CODEFindIdFonte20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_toa", scope = CODEFindIdFonte20120415 .class)
    public JAXBElement<String> createCODEFindIdFonte20120415IdToa(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdToa_QNAME, String.class, CODEFindIdFonte20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_id_adaResult", scope = PERFindIdAdaResponse.class)
    public JAXBElement<ArrayOfPERPersona> createPERFindIdAdaResponsePERFindIdAdaResult(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERFindIdAdaResponsePERFindIdAdaResult_QNAME, ArrayOfPERPersona.class, PERFindIdAdaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_TOA", scope = ADADescription.class)
    public JAXBElement<String> createADADescriptionIDTOA(String value) {
        return new JAXBElement<String>(_ADADescriptionIDTOA_QNAME, String.class, ADADescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE", scope = ADADescription.class)
    public JAXBElement<XMLGregorianCalendar> createADADescriptionFINE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIFINE_QNAME, XMLGregorianCalendar.class, ADADescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE", scope = ADADescription.class)
    public JAXBElement<String> createADADescriptionDESCRIZIONE(String value) {
        return new JAXBElement<String>(_ACCOUNTMembershipDESCRIZIONE_QNAME, String.class, ADADescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = ADADescription.class)
    public JAXBElement<String> createADADescriptionIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, ADADescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LINGUA", scope = ADADescription.class)
    public JAXBElement<String> createADADescriptionLINGUA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229LINGUA_QNAME, String.class, ADADescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO", scope = ADADescription.class)
    public JAXBElement<XMLGregorianCalendar> createADADescriptionINIZIO(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIINIZIO_QNAME, XMLGregorianCalendar.class, ADADescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_cognome_nomeResult", scope = PERFindCognomeNomeResponse.class)
    public JAXBElement<ArrayOfPERPersona> createPERFindCognomeNomeResponsePERFindCognomeNomeResult(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERFindCognomeNomeResponsePERFindCognomeNomeResult_QNAME, ArrayOfPERPersona.class, PERFindCognomeNomeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCODERelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "CODE_find_id_ada_20120415Result", scope = CODEFindIdAda20120415Response.class)
    public JAXBElement<ArrayOfCODERelation> createCODEFindIdAda20120415ResponseCODEFindIdAda20120415Result(ArrayOfCODERelation value) {
        return new JAXBElement<ArrayOfCODERelation>(_CODEFindIdAda20120415ResponseCODEFindIdAda20120415Result_QNAME, ArrayOfCODERelation.class, CODEFindIdAda20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfATTRIBUTIPERSONALI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "APE_find_all_20110214Result", scope = APEFindAll20110214Response.class)
    public JAXBElement<ArrayOfATTRIBUTIPERSONALI> createAPEFindAll20110214ResponseAPEFindAll20110214Result(ArrayOfATTRIBUTIPERSONALI value) {
        return new JAXBElement<ArrayOfATTRIBUTIPERSONALI>(_APEFindAll20110214ResponseAPEFindAll20110214Result_QNAME, ArrayOfATTRIBUTIPERSONALI.class, APEFindAll20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindIdAda20120415 .class)
    public JAXBElement<String> createPERFindIdAda20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindIdAda20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "nome", scope = PERFindCognomeNome.class)
    public JAXBElement<String> createPERFindCognomeNomeNome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Nome_QNAME, String.class, PERFindCognomeNome.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "cognome", scope = PERFindCognomeNome.class)
    public JAXBElement<String> createPERFindCognomeNomeCognome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Cognome_QNAME, String.class, PERFindCognomeNome.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_oga", scope = RECAPITOFindOgaAcc20110214 .class)
    public JAXBElement<String> createRECAPITOFindOgaAcc20110214IdOga(String value) {
        return new JAXBElement<String>(_RECAPITOFindOgaAcc20110214IdOga_QNAME, String.class, RECAPITOFindOgaAcc20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_acc", scope = RECAPITOFindOgaAcc20110214 .class)
    public JAXBElement<String> createRECAPITOFindOgaAcc20110214IdAcc(String value) {
        return new JAXBElement<String>(_RECAPITOFindOgaAcc20110214IdAcc_QNAME, String.class, RECAPITOFindOgaAcc20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_check_identity_20110214Result", scope = PERCheckIdentity20110214Response.class)
    public JAXBElement<ArrayOfPERPersona> createPERCheckIdentity20110214ResponsePERCheckIdentity20110214Result(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERCheckIdentity20110214ResponsePERCheckIdentity20110214Result_QNAME, ArrayOfPERPersona.class, PERCheckIdentity20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "nome", scope = PERFindCognomeNome20120415 .class)
    public JAXBElement<String> createPERFindCognomeNome20120415Nome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Nome_QNAME, String.class, PERFindCognomeNome20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "cognome", scope = PERFindCognomeNome20120415 .class)
    public JAXBElement<String> createPERFindCognomeNome20120415Cognome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Cognome_QNAME, String.class, PERFindCognomeNome20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVOIPEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "VOIP_find_entity_20120415Result", scope = VOIPFindEntity20120415Response.class)
    public JAXBElement<ArrayOfVOIPEntity> createVOIPFindEntity20120415ResponseVOIPFindEntity20120415Result(ArrayOfVOIPEntity value) {
        return new JAXBElement<ArrayOfVOIPEntity>(_VOIPFindEntity20120415ResponseVOIPFindEntity20120415Result_QNAME, ArrayOfVOIPEntity.class, VOIPFindEntity20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = PERFindAllPosizioni20091229 .class)
    public JAXBElement<XMLGregorianCalendar> createPERFindAllPosizioni20091229DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, PERFindAllPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindAllPosizioni20091229 .class)
    public JAXBElement<String> createPERFindAllPosizioni20091229IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindAllPosizioni20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_account", scope = ACCOUNTFindIdAda20110214 .class)
    public JAXBElement<String> createACCOUNTFindIdAda20110214IdAccount(String value) {
        return new JAXBElement<String>(_ACCOUNTFindIdAda20110214IdAccount_QNAME, String.class, ACCOUNTFindIdAda20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = ACCOUNTFindIdAda20110214 .class)
    public JAXBElement<String> createACCOUNTFindIdAda20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, ACCOUNTFindIdAda20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_rif", scope = APEFindAll20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createAPEFindAll20120415DataRif(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_APEFindAll20110214DataRif_QNAME, XMLGregorianCalendar.class, APEFindAll20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = APEFindAll20120415 .class)
    public JAXBElement<String> createAPEFindAll20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, APEFindAll20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = ATTIVITADIDATTICASOSTENUTA.class)
    public JAXBElement<String> createATTIVITADIDATTICASOSTENUTAIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, ATTIVITADIDATTICASOSTENUTA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DATA_SUPERAMENTO", scope = ATTIVITADIDATTICASOSTENUTA.class)
    public JAXBElement<XMLGregorianCalendar> createATTIVITADIDATTICASOSTENUTADATASUPERAMENTO(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTIVITADIDATTICASOSTENUTADATASUPERAMENTO_QNAME, XMLGregorianCalendar.class, ATTIVITADIDATTICASOSTENUTA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_ATTIVITA_DIDATTICA", scope = ATTIVITADIDATTICASOSTENUTA.class)
    public JAXBElement<String> createATTIVITADIDATTICASOSTENUTADESCRIZIONEATTIVITADIDATTICA(String value) {
        return new JAXBElement<String>(_ATTIVITADIDATTICASOSTENUTADESCRIZIONEATTIVITADIDATTICA_QNAME, String.class, ATTIVITADIDATTICASOSTENUTA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ESSE3_ATTIVITA_DIDATTICA", scope = ATTIVITADIDATTICASOSTENUTA.class)
    public JAXBElement<String> createATTIVITADIDATTICASOSTENUTAIDESSE3ATTIVITADIDATTICA(String value) {
        return new JAXBElement<String>(_ATTIVITADIDATTICASOSTENUTAIDESSE3ATTIVITADIDATTICA_QNAME, String.class, ATTIVITADIDATTICASOSTENUTA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "COD_ESSE3_ATTIVITA_DIDATTICA", scope = ATTIVITADIDATTICASOSTENUTA.class)
    public JAXBElement<String> createATTIVITADIDATTICASOSTENUTACODESSE3ATTIVITADIDATTICA(String value) {
        return new JAXBElement<String>(_ATTIVITADIDATTICASOSTENUTACODESSE3ATTIVITADIDATTICA_QNAME, String.class, ATTIVITADIDATTICASOSTENUTA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "nome_padre", scope = PERCheckIdentity20120415 .class)
    public JAXBElement<String> createPERCheckIdentity20120415NomePadre(String value) {
        return new JAXBElement<String>(_PERCheckIdentity20120415NomePadre_QNAME, String.class, PERCheckIdentity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "naz_id_atr", scope = PERCheckIdentity20120415 .class)
    public JAXBElement<String> createPERCheckIdentity20120415NazIdAtr(String value) {
        return new JAXBElement<String>(_PERCheckIdentity20120415NazIdAtr_QNAME, String.class, PERCheckIdentity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "indice_rigidita_fuzzy", scope = PERCheckIdentity20120415 .class)
    public JAXBElement<Double> createPERCheckIdentity20120415IndiceRigiditaFuzzy(Double value) {
        return new JAXBElement<Double>(_PERCheckIdentity20120415IndiceRigiditaFuzzy_QNAME, Double.class, PERCheckIdentity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_nasc", scope = PERCheckIdentity20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createPERCheckIdentity20120415DataNasc(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERCheckIdentity20120415DataNasc_QNAME, XMLGregorianCalendar.class, PERCheckIdentity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "loc_id_atr", scope = PERCheckIdentity20120415 .class)
    public JAXBElement<String> createPERCheckIdentity20120415LocIdAtr(String value) {
        return new JAXBElement<String>(_PERCheckIdentity20120415LocIdAtr_QNAME, String.class, PERCheckIdentity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "codfis", scope = PERCheckIdentity20120415 .class)
    public JAXBElement<String> createPERCheckIdentity20120415Codfis(String value) {
        return new JAXBElement<String>(_PERCheckIdentity20120415Codfis_QNAME, String.class, PERCheckIdentity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "nome", scope = PERCheckIdentity20120415 .class)
    public JAXBElement<String> createPERCheckIdentity20120415Nome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Nome_QNAME, String.class, PERCheckIdentity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "cognome", scope = PERCheckIdentity20120415 .class)
    public JAXBElement<String> createPERCheckIdentity20120415Cognome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Cognome_QNAME, String.class, PERCheckIdentity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "sesso", scope = PERCheckIdentity20120415 .class)
    public JAXBElement<String> createPERCheckIdentity20120415Sesso(String value) {
        return new JAXBElement<String>(_PERCheckIdentity20120415Sesso_QNAME, String.class, PERCheckIdentity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "descrizione", scope = GROUPFind20110214 .class)
    public JAXBElement<String> createGROUPFind20110214Descrizione(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229Descrizione_QNAME, String.class, GROUPFind20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "gid", scope = GROUPFind20110214 .class)
    public JAXBElement<Long> createGROUPFind20110214Gid(Long value) {
        return new JAXBElement<Long>(_GROUPFind20110214Gid_QNAME, Long.class, GROUPFind20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_gru", scope = GROUPFind20110214 .class)
    public JAXBElement<String> createGROUPFind20110214IdGru(String value) {
        return new JAXBElement<String>(_GROUPMEMBERFind20120415IdGru_QNAME, String.class, GROUPFind20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_tlm", scope = GROUPFind20110214 .class)
    public JAXBElement<String> createGROUPFind20110214IdTlm(String value) {
        return new JAXBElement<String>(_GROUPFind20110214IdTlm_QNAME, String.class, GROUPFind20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindPosizioniIdAda20120415 .class)
    public JAXBElement<String> createPERFindPosizioniIdAda20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindPosizioniIdAda20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSETTORESDAREACUN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "SSD_find_all_20110214Result", scope = SSDFindAll20110214Response.class)
    public JAXBElement<ArrayOfSETTORESDAREACUN> createSSDFindAll20110214ResponseSSDFindAll20110214Result(ArrayOfSETTORESDAREACUN value) {
        return new JAXBElement<ArrayOfSETTORESDAREACUN>(_SSDFindAll20110214ResponseSSDFindAll20110214Result_QNAME, ArrayOfSETTORESDAREACUN.class, SSDFindAll20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = AESAnagraficaEstesa20120415 .class)
    public JAXBElement<String> createAESAnagraficaEstesa20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, AESAnagraficaEstesa20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRECAPITO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RECAPITO_find_oga_acc_20110214Result", scope = RECAPITOFindOgaAcc20110214Response.class)
    public JAXBElement<ArrayOfRECAPITO> createRECAPITOFindOgaAcc20110214ResponseRECAPITOFindOgaAcc20110214Result(ArrayOfRECAPITO value) {
        return new JAXBElement<ArrayOfRECAPITO>(_RECAPITOFindOgaAcc20110214ResponseRECAPITOFindOgaAcc20110214Result_QNAME, ArrayOfRECAPITO.class, RECAPITOFindOgaAcc20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "MAIL_UNITN", scope = RECAPITO.class)
    public JAXBElement<String> createRECAPITOMAILUNITN(String value) {
        return new JAXBElement<String>(_RECAPITOMAILUNITN_QNAME, String.class, RECAPITO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LINK_ISTIT", scope = RECAPITO.class)
    public JAXBElement<String> createRECAPITOLINKISTIT(String value) {
        return new JAXBElement<String>(_RECAPITOLINKISTIT_QNAME, String.class, RECAPITO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FAX_UFFICIO", scope = RECAPITO.class)
    public JAXBElement<String> createRECAPITOFAXUFFICIO(String value) {
        return new JAXBElement<String>(_RECAPITOFAXUFFICIO_QNAME, String.class, RECAPITO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ACCOUNT", scope = RECAPITO.class)
    public JAXBElement<String> createRECAPITOIDACCOUNT(String value) {
        return new JAXBElement<String>(_RECAPITOIDACCOUNT_QNAME, String.class, RECAPITO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = RECAPITO.class)
    public JAXBElement<String> createRECAPITOIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, RECAPITO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "CELL_UFFICIO", scope = RECAPITO.class)
    public JAXBElement<String> createRECAPITOCELLUFFICIO(String value) {
        return new JAXBElement<String>(_RECAPITOCELLUFFICIO_QNAME, String.class, RECAPITO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "USERNAME", scope = RECAPITO.class)
    public JAXBElement<String> createRECAPITOUSERNAME(String value) {
        return new JAXBElement<String>(_RECAPITOUSERNAME_QNAME, String.class, RECAPITO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "MAIL_FISICA", scope = RECAPITO.class)
    public JAXBElement<String> createRECAPITOMAILFISICA(String value) {
        return new JAXBElement<String>(_RECAPITOMAILFISICA_QNAME, String.class, RECAPITO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INTERNO_CELL", scope = RECAPITO.class)
    public JAXBElement<String> createRECAPITOINTERNOCELL(String value) {
        return new JAXBElement<String>(_RECAPITOINTERNOCELL_QNAME, String.class, RECAPITO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "TEL_UFFICIO", scope = RECAPITO.class)
    public JAXBElement<String> createRECAPITOTELUFFICIO(String value) {
        return new JAXBElement<String>(_RECAPITOTELUFFICIO_QNAME, String.class, RECAPITO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "HOMEPAGE_PERS", scope = RECAPITO.class)
    public JAXBElement<String> createRECAPITOHOMEPAGEPERS(String value) {
        return new JAXBElement<String>(_RECAPITOHOMEPAGEPERS_QNAME, String.class, RECAPITO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE", scope = GROUPDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGROUPDetailFINE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIFINE_QNAME, XMLGregorianCalendar.class, GROUPDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_GRU", scope = GROUPDetail.class)
    public JAXBElement<String> createGROUPDetailIDGRU(String value) {
        return new JAXBElement<String>(_ACCOUNTMembershipIDGRU_QNAME, String.class, GROUPDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE", scope = GROUPDetail.class)
    public JAXBElement<String> createGROUPDetailDESCRIZIONE(String value) {
        return new JAXBElement<String>(_ACCOUNTMembershipDESCRIZIONE_QNAME, String.class, GROUPDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_TLM", scope = GROUPDetail.class)
    public JAXBElement<String> createGROUPDetailIDTLM(String value) {
        return new JAXBElement<String>(_GROUPDetailIDTLM_QNAME, String.class, GROUPDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO", scope = GROUPDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGROUPDetailINIZIO(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIINIZIO_QNAME, XMLGregorianCalendar.class, GROUPDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GID", scope = GROUPDetail.class)
    public JAXBElement<Long> createGROUPDetailGID(Long value) {
        return new JAXBElement<Long>(_ACCOUNTMembershipGID_QNAME, Long.class, GROUPDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_TLM", scope = GROUPDetail.class)
    public JAXBElement<String> createGROUPDetailDESCRIZIONETLM(String value) {
        return new JAXBElement<String>(_GROUPDetailDESCRIZIONETLM_QNAME, String.class, GROUPDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_posizioni_id_ada_20120415Result", scope = PERFindPosizioniIdAda20120415Response.class)
    public JAXBElement<ArrayOfPERPosizioni20091229> createPERFindPosizioniIdAda20120415ResponsePERFindPosizioniIdAda20120415Result(ArrayOfPERPosizioni20091229 value) {
        return new JAXBElement<ArrayOfPERPosizioni20091229>(_PERFindPosizioniIdAda20120415ResponsePERFindPosizioniIdAda20120415Result_QNAME, ArrayOfPERPosizioni20091229 .class, PERFindPosizioniIdAda20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FAX_UFFICIO", scope = ACCOUNTEntityBase.class)
    public JAXBElement<String> createACCOUNTEntityBaseFAXUFFICIO(String value) {
        return new JAXBElement<String>(_RECAPITOFAXUFFICIO_QNAME, String.class, ACCOUNTEntityBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ACCOUNT", scope = ACCOUNTEntityBase.class)
    public JAXBElement<String> createACCOUNTEntityBaseIDACCOUNT(String value) {
        return new JAXBElement<String>(_RECAPITOIDACCOUNT_QNAME, String.class, ACCOUNTEntityBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = ACCOUNTEntityBase.class)
    public JAXBElement<String> createACCOUNTEntityBaseIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, ACCOUNTEntityBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "CELL_UFFICIO", scope = ACCOUNTEntityBase.class)
    public JAXBElement<String> createACCOUNTEntityBaseCELLUFFICIO(String value) {
        return new JAXBElement<String>(_RECAPITOCELLUFFICIO_QNAME, String.class, ACCOUNTEntityBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "USERNAME", scope = ACCOUNTEntityBase.class)
    public JAXBElement<String> createACCOUNTEntityBaseUSERNAME(String value) {
        return new JAXBElement<String>(_RECAPITOUSERNAME_QNAME, String.class, ACCOUNTEntityBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INTERNO_CELL", scope = ACCOUNTEntityBase.class)
    public JAXBElement<String> createACCOUNTEntityBaseINTERNOCELL(String value) {
        return new JAXBElement<String>(_RECAPITOINTERNOCELL_QNAME, String.class, ACCOUNTEntityBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "E_MAIL_UFF", scope = ACCOUNTEntityBase.class)
    public JAXBElement<String> createACCOUNTEntityBaseEMAILUFF(String value) {
        return new JAXBElement<String>(_ACCOUNTEntityBaseEMAILUFF_QNAME, String.class, ACCOUNTEntityBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "TEL_UFFICIO", scope = ACCOUNTEntityBase.class)
    public JAXBElement<String> createACCOUNTEntityBaseTELUFFICIO(String value) {
        return new JAXBElement<String>(_RECAPITOTELUFFICIO_QNAME, String.class, ACCOUNTEntityBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "MAIL", scope = ACCOUNTEntityBase.class)
    public JAXBElement<String> createACCOUNTEntityBaseMAIL(String value) {
        return new JAXBElement<String>(_ACCOUNTEntityBaseMAIL_QNAME, String.class, ACCOUNTEntityBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20110214Result", scope = ACCOUNTDETAILFINDIdAccListDaIdAda20110214Response.class)
    public JAXBElement<ArrayOfACCOUNTDetail> createACCOUNTDETAILFINDIdAccListDaIdAda20110214ResponseACCOUNTDETAILFINDIdAccListDaIdAda20110214Result(ArrayOfACCOUNTDetail value) {
        return new JAXBElement<ArrayOfACCOUNTDetail>(_ACCOUNTDETAILFINDIdAccListDaIdAda20110214ResponseACCOUNTDETAILFINDIdAccListDaIdAda20110214Result_QNAME, ArrayOfACCOUNTDetail.class, ACCOUNTDETAILFINDIdAccListDaIdAda20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_oga", scope = RECAPITOFindOgaAcc20120415 .class)
    public JAXBElement<String> createRECAPITOFindOgaAcc20120415IdOga(String value) {
        return new JAXBElement<String>(_RECAPITOFindOgaAcc20110214IdOga_QNAME, String.class, RECAPITOFindOgaAcc20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_acc", scope = RECAPITOFindOgaAcc20120415 .class)
    public JAXBElement<String> createRECAPITOFindOgaAcc20120415IdAcc(String value) {
        return new JAXBElement<String>(_RECAPITOFindOgaAcc20110214IdAcc_QNAME, String.class, RECAPITOFindOgaAcc20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_lingua", scope = DESCRIZIONEFindAtr20110214 .class)
    public JAXBElement<String> createDESCRIZIONEFindAtr20110214IdLingua(String value) {
        return new JAXBElement<String>(_DESCRIZIONEFindAtr20120415IdLingua_QNAME, String.class, DESCRIZIONEFindAtr20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = DESCRIZIONEFindAtr20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createDESCRIZIONEFindAtr20110214DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, DESCRIZIONEFindAtr20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = DESCRIZIONEFindAtr20110214 .class)
    public JAXBElement<String> createDESCRIZIONEFindAtr20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, DESCRIZIONEFindAtr20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_toa", scope = DESCRIZIONEFindAtr20110214 .class)
    public JAXBElement<String> createDESCRIZIONEFindAtr20110214IdToa(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdToa_QNAME, String.class, DESCRIZIONEFindAtr20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "SESSO_PER", scope = PERPersona.class)
    public JAXBElement<String> createPERPersonaSESSOPER(String value) {
        return new JAXBElement<String>(_PERPersonaSESSOPER_QNAME, String.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LUOGO_NASCITA_ID_ATR", scope = PERPersona.class)
    public JAXBElement<String> createPERPersonaLUOGONASCITAIDATR(String value) {
        return new JAXBElement<String>(_PERPersonaLUOGONASCITAIDATR_QNAME, String.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "NAZIONE_NASCITA_ID_ATR", scope = PERPersona.class)
    public JAXBElement<String> createPERPersonaNAZIONENASCITAIDATR(String value) {
        return new JAXBElement<String>(_PERPersonaNAZIONENASCITAIDATR_QNAME, String.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "NAZIONE_NASCITA_DESC_ATR", scope = PERPersona.class)
    public JAXBElement<String> createPERPersonaNAZIONENASCITADESCATR(String value) {
        return new JAXBElement<String>(_PERPersonaNAZIONENASCITADESCATR_QNAME, String.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "NOME_PADRE_PER", scope = PERPersona.class)
    public JAXBElement<String> createPERPersonaNOMEPADREPER(String value) {
        return new JAXBElement<String>(_PERPersonaNOMEPADREPER_QNAME, String.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "COD_FIS_PER", scope = PERPersona.class)
    public JAXBElement<String> createPERPersonaCODFISPER(String value) {
        return new JAXBElement<String>(_PERPersonaCODFISPER_QNAME, String.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_OGA", scope = PERPersona.class)
    public JAXBElement<String> createPERPersonaIDOGA(String value) {
        return new JAXBElement<String>(_PERPersonaIDOGA_QNAME, String.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LUOGO_NASCITA_DESC_ATR", scope = PERPersona.class)
    public JAXBElement<String> createPERPersonaLUOGONASCITADESCATR(String value) {
        return new JAXBElement<String>(_PERPersonaLUOGONASCITADESCATR_QNAME, String.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DATA_NASCITA_PER", scope = PERPersona.class)
    public JAXBElement<XMLGregorianCalendar> createPERPersonaDATANASCITAPER(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPersonaDATANASCITAPER_QNAME, XMLGregorianCalendar.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "NOME", scope = PERPersona.class)
    public JAXBElement<String> createPERPersonaNOME(String value) {
        return new JAXBElement<String>(_PERPersonaNOME_QNAME, String.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "COGNOME", scope = PERPersona.class)
    public JAXBElement<String> createPERPersonaCOGNOME(String value) {
        return new JAXBElement<String>(_PERPersonaCOGNOME_QNAME, String.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "MATCH_PROB", scope = PERPersona.class)
    public JAXBElement<String> createPERPersonaMATCHPROB(String value) {
        return new JAXBElement<String>(_PERPersonaMATCHPROB_QNAME, String.class, PERPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_SSD", scope = ATTRIBUTIDIDATTICA.class)
    public JAXBElement<String> createATTRIBUTIDIDATTICADESCRIZIONESSD(String value) {
        return new JAXBElement<String>(_ATTRIBUTIDIDATTICADESCRIZIONESSD_QNAME, String.class, ATTRIBUTIDIDATTICA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE", scope = ATTRIBUTIDIDATTICA.class)
    public JAXBElement<XMLGregorianCalendar> createATTRIBUTIDIDATTICAFINE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIFINE_QNAME, XMLGregorianCalendar.class, ATTRIBUTIDIDATTICA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "SSD_ID_ATR", scope = ATTRIBUTIDIDATTICA.class)
    public JAXBElement<String> createATTRIBUTIDIDATTICASSDIDATR(String value) {
        return new JAXBElement<String>(_ATTRIBUTIDIDATTICASSDIDATR_QNAME, String.class, ATTRIBUTIDIDATTICA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_AREA_CUN", scope = ATTRIBUTIDIDATTICA.class)
    public JAXBElement<String> createATTRIBUTIDIDATTICADESCRIZIONEAREACUN(String value) {
        return new JAXBElement<String>(_ATTRIBUTIDIDATTICADESCRIZIONEAREACUN_QNAME, String.class, ATTRIBUTIDIDATTICA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_SSD", scope = ATTRIBUTIDIDATTICA.class)
    public JAXBElement<String> createATTRIBUTIDIDATTICAIDSSD(String value) {
        return new JAXBElement<String>(_ATTRIBUTIDIDATTICAIDSSD_QNAME, String.class, ATTRIBUTIDIDATTICA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = ATTRIBUTIDIDATTICA.class)
    public JAXBElement<String> createATTRIBUTIDIDATTICAIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, ATTRIBUTIDIDATTICA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LINGUA", scope = ATTRIBUTIDIDATTICA.class)
    public JAXBElement<String> createATTRIBUTIDIDATTICALINGUA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229LINGUA_QNAME, String.class, ATTRIBUTIDIDATTICA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_AREA_CUN", scope = ATTRIBUTIDIDATTICA.class)
    public JAXBElement<String> createATTRIBUTIDIDATTICAIDAREACUN(String value) {
        return new JAXBElement<String>(_ATTRIBUTIDIDATTICAIDAREACUN_QNAME, String.class, ATTRIBUTIDIDATTICA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO", scope = ATTRIBUTIDIDATTICA.class)
    public JAXBElement<XMLGregorianCalendar> createATTRIBUTIDIDATTICAINIZIO(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIINIZIO_QNAME, XMLGregorianCalendar.class, ATTRIBUTIDIDATTICA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfANAGRAFICAESTESA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "AES_anagrafica_estesa_20120415Result", scope = AESAnagraficaEstesa20120415Response.class)
    public JAXBElement<ArrayOfANAGRAFICAESTESA> createAESAnagraficaEstesa20120415ResponseAESAnagraficaEstesa20120415Result(ArrayOfANAGRAFICAESTESA value) {
        return new JAXBElement<ArrayOfANAGRAFICAESTESA>(_AESAnagraficaEstesa20120415ResponseAESAnagraficaEstesa20120415Result_QNAME, ArrayOfANAGRAFICAESTESA.class, AESAnagraficaEstesa20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE", scope = CODERelation.class)
    public JAXBElement<XMLGregorianCalendar> createCODERelationFINE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIFINE_QNAME, XMLGregorianCalendar.class, CODERelation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_FONTE", scope = CODERelation.class)
    public JAXBElement<String> createCODERelationIDFONTE(String value) {
        return new JAXBElement<String>(_CODERelationIDFONTE_QNAME, String.class, CODERelation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = CODERelation.class)
    public JAXBElement<String> createCODERelationIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, CODERelation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_FAD", scope = CODERelation.class)
    public JAXBElement<String> createCODERelationIDFAD(String value) {
        return new JAXBElement<String>(_CODERelationIDFAD_QNAME, String.class, CODERelation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO", scope = CODERelation.class)
    public JAXBElement<XMLGregorianCalendar> createCODERelationINIZIO(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIINIZIO_QNAME, XMLGregorianCalendar.class, CODERelation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLIBRETTOSTUDENTE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LBS_libretto_studente_20120415Result", scope = LBSLibrettoStudente20120415Response.class)
    public JAXBElement<ArrayOfLIBRETTOSTUDENTE> createLBSLibrettoStudente20120415ResponseLBSLibrettoStudente20120415Result(ArrayOfLIBRETTOSTUDENTE value) {
        return new JAXBElement<ArrayOfLIBRETTOSTUDENTE>(_LBSLibrettoStudente20120415ResponseLBSLibrettoStudente20120415Result_QNAME, ArrayOfLIBRETTOSTUDENTE.class, LBSLibrettoStudente20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADADescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_find_oga_20110214Result", scope = DESCRIZIONEFindOga20110214Response.class)
    public JAXBElement<ArrayOfADADescription> createDESCRIZIONEFindOga20110214ResponseDESCRIZIONEFindOga20110214Result(ArrayOfADADescription value) {
        return new JAXBElement<ArrayOfADADescription>(_DESCRIZIONEFindOga20110214ResponseDESCRIZIONEFindOga20110214Result_QNAME, ArrayOfADADescription.class, DESCRIZIONEFindOga20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSETTORESDAREACUN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "SSD_find_all_20120415Result", scope = SSDFindAll20120415Response.class)
    public JAXBElement<ArrayOfSETTORESDAREACUN> createSSDFindAll20120415ResponseSSDFindAll20120415Result(ArrayOfSETTORESDAREACUN value) {
        return new JAXBElement<ArrayOfSETTORESDAREACUN>(_SSDFindAll20120415ResponseSSDFindAll20120415Result_QNAME, ArrayOfSETTORESDAREACUN.class, SSDFindAll20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADAObjectID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ADA_ID_find_id_acc_da_username_20120415Result", scope = ADAIDFindIdAccDaUsername20120415Response.class)
    public JAXBElement<ArrayOfADAObjectID> createADAIDFindIdAccDaUsername20120415ResponseADAIDFindIdAccDaUsername20120415Result(ArrayOfADAObjectID value) {
        return new JAXBElement<ArrayOfADAObjectID>(_ADAIDFindIdAccDaUsername20120415ResponseADAIDFindIdAccDaUsername20120415Result_QNAME, ArrayOfADAObjectID.class, ADAIDFindIdAccDaUsername20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LODE", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<Long> createLIBRETTOSTUDENTELODE(Long value) {
        return new JAXBElement<Long>(_LIBRETTOSTUDENTELODE_QNAME, Long.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<String> createLIBRETTOSTUDENTEIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "MODALITA_VALUTAZIONE", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<String> createLIBRETTOSTUDENTEMODALITAVALUTAZIONE(String value) {
        return new JAXBElement<String>(_LIBRETTOSTUDENTEMODALITAVALUTAZIONE_QNAME, String.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_ATTIVITA_DIDATTICA", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<String> createLIBRETTOSTUDENTEDESCRIZIONEATTIVITADIDATTICA(String value) {
        return new JAXBElement<String>(_ATTIVITADIDATTICASOSTENUTADESCRIZIONEATTIVITADIDATTICA_QNAME, String.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_GIADA_PERSONA", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<Long> createLIBRETTOSTUDENTEIDGIADAPERSONA(Long value) {
        return new JAXBElement<Long>(_ANAGRAFICAESTESAIDGIADAPERSONA_QNAME, Long.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "AA_OFFERTA", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<Long> createLIBRETTOSTUDENTEAAOFFERTA(Long value) {
        return new JAXBElement<Long>(_LIBRETTOSTUDENTEAAOFFERTA_QNAME, Long.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PESO", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<Long> createLIBRETTOSTUDENTEPESO(Long value) {
        return new JAXBElement<Long>(_LIBRETTOSTUDENTEPESO_QNAME, Long.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "VOTO", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<Long> createLIBRETTOSTUDENTEVOTO(Long value) {
        return new JAXBElement<Long>(_LIBRETTOSTUDENTEVOTO_QNAME, Long.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DATA_SUPERAMENTO", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<XMLGregorianCalendar> createLIBRETTOSTUDENTEDATASUPERAMENTO(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTIVITADIDATTICASOSTENUTADATASUPERAMENTO_QNAME, XMLGregorianCalendar.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "STATO", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<String> createLIBRETTOSTUDENTESTATO(String value) {
        return new JAXBElement<String>(_LIBRETTOSTUDENTESTATO_QNAME, String.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "NO_MEDIA", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<Long> createLIBRETTOSTUDENTENOMEDIA(Long value) {
        return new JAXBElement<Long>(_LIBRETTOSTUDENTENOMEDIA_QNAME, Long.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "TIPO_GIUDIZIO", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<String> createLIBRETTOSTUDENTETIPOGIUDIZIO(String value) {
        return new JAXBElement<String>(_LIBRETTOSTUDENTETIPOGIUDIZIO_QNAME, String.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "COD_ESSE3_ATTIVITA_DIDATTICA", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<String> createLIBRETTOSTUDENTECODESSE3ATTIVITADIDATTICA(String value) {
        return new JAXBElement<String>(_ATTIVITADIDATTICASOSTENUTACODESSE3ATTIVITADIDATTICA_QNAME, String.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ESSE3_ATTIVITA_DIDATTICA", scope = LIBRETTOSTUDENTE.class)
    public JAXBElement<String> createLIBRETTOSTUDENTEIDESSE3ATTIVITADIDATTICA(String value) {
        return new JAXBElement<String>(_ATTIVITADIDATTICASOSTENUTAIDESSE3ATTIVITADIDATTICA_QNAME, String.class, LIBRETTOSTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = GOGGerarchiaSto20091229 .class)
    public JAXBElement<String> createGOGGerarchiaSto20091229IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, GOGGerarchiaSto20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTEntityBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ACCOUNT_find_id_ada_20091229Result", scope = ACCOUNTFindIdAda20091229Response.class)
    public JAXBElement<ArrayOfACCOUNTEntityBase> createACCOUNTFindIdAda20091229ResponseACCOUNTFindIdAda20091229Result(ArrayOfACCOUNTEntityBase value) {
        return new JAXBElement<ArrayOfACCOUNTEntityBase>(_ACCOUNTFindIdAda20091229ResponseACCOUNTFindIdAda20091229Result_QNAME, ArrayOfACCOUNTEntityBase.class, ACCOUNTFindIdAda20091229Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_acc", scope = ACCOUNTMEMBERSHIPFind20110214 .class)
    public JAXBElement<String> createACCOUNTMEMBERSHIPFind20110214IdAcc(String value) {
        return new JAXBElement<String>(_RECAPITOFindOgaAcc20110214IdAcc_QNAME, String.class, ACCOUNTMEMBERSHIPFind20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "da_data", scope = PERFindAllPosizioniDate20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createPERFindAllPosizioniDate20110214DaData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERFindAllPosizioniDate20110214DaData_QNAME, XMLGregorianCalendar.class, PERFindAllPosizioniDate20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "a_data", scope = PERFindAllPosizioniDate20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createPERFindAllPosizioniDate20110214AData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERFindAllPosizioniDate20110214AData_QNAME, XMLGregorianCalendar.class, PERFindAllPosizioniDate20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindAllPosizioniDate20110214 .class)
    public JAXBElement<String> createPERFindAllPosizioniDate20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindAllPosizioniDate20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "descrizione", scope = GROUPFind20120415 .class)
    public JAXBElement<String> createGROUPFind20120415Descrizione(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229Descrizione_QNAME, String.class, GROUPFind20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "gid", scope = GROUPFind20120415 .class)
    public JAXBElement<Long> createGROUPFind20120415Gid(Long value) {
        return new JAXBElement<Long>(_GROUPFind20110214Gid_QNAME, Long.class, GROUPFind20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_gru", scope = GROUPFind20120415 .class)
    public JAXBElement<String> createGROUPFind20120415IdGru(String value) {
        return new JAXBElement<String>(_GROUPMEMBERFind20120415IdGru_QNAME, String.class, GROUPFind20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_tlm", scope = GROUPFind20120415 .class)
    public JAXBElement<String> createGROUPFind20120415IdTlm(String value) {
        return new JAXBElement<String>(_GROUPFind20110214IdTlm_QNAME, String.class, GROUPFind20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADAObjectID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ADA_ID_find_id_acc_da_username_20110214Result", scope = ADAIDFindIdAccDaUsername20110214Response.class)
    public JAXBElement<ArrayOfADAObjectID> createADAIDFindIdAccDaUsername20110214ResponseADAIDFindIdAccDaUsername20110214Result(ArrayOfADAObjectID value) {
        return new JAXBElement<ArrayOfADAObjectID>(_ADAIDFindIdAccDaUsername20110214ResponseADAIDFindIdAccDaUsername20110214Result_QNAME, ArrayOfADAObjectID.class, ADAIDFindIdAccDaUsername20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_TOA", scope = ACCOUNTDetail.class)
    public JAXBElement<String> createACCOUNTDetailIDTOA(String value) {
        return new JAXBElement<String>(_ADADescriptionIDTOA_QNAME, String.class, ACCOUNTDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_POA", scope = ACCOUNTDetail.class)
    public JAXBElement<String> createACCOUNTDetailIDPOA(String value) {
        return new JAXBElement<String>(_ACCOUNTDetailIDPOA_QNAME, String.class, ACCOUNTDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE", scope = ACCOUNTDetail.class)
    public JAXBElement<XMLGregorianCalendar> createACCOUNTDetailFINE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIFINE_QNAME, XMLGregorianCalendar.class, ACCOUNTDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ACC", scope = ACCOUNTDetail.class)
    public JAXBElement<String> createACCOUNTDetailIDACC(String value) {
        return new JAXBElement<String>(_ACCOUNTDetailIDACC_QNAME, String.class, ACCOUNTDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = ACCOUNTDetail.class)
    public JAXBElement<String> createACCOUNTDetailIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, ACCOUNTDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "STATO", scope = ACCOUNTDetail.class)
    public JAXBElement<String> createACCOUNTDetailSTATO(String value) {
        return new JAXBElement<String>(_LIBRETTOSTUDENTESTATO_QNAME, String.class, ACCOUNTDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "USERNAME", scope = ACCOUNTDetail.class)
    public JAXBElement<String> createACCOUNTDetailUSERNAME(String value) {
        return new JAXBElement<String>(_RECAPITOUSERNAME_QNAME, String.class, ACCOUNTDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO", scope = ACCOUNTDetail.class)
    public JAXBElement<XMLGregorianCalendar> createACCOUNTDetailINIZIO(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIINIZIO_QNAME, XMLGregorianCalendar.class, ACCOUNTDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTMembership }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ACCOUNT_MEMBERSHIP_find_20110214Result", scope = ACCOUNTMEMBERSHIPFind20110214Response.class)
    public JAXBElement<ArrayOfACCOUNTMembership> createACCOUNTMEMBERSHIPFind20110214ResponseACCOUNTMEMBERSHIPFind20110214Result(ArrayOfACCOUNTMembership value) {
        return new JAXBElement<ArrayOfACCOUNTMembership>(_ACCOUNTMEMBERSHIPFind20110214ResponseACCOUNTMEMBERSHIPFind20110214Result_QNAME, ArrayOfACCOUNTMembership.class, ACCOUNTMEMBERSHIPFind20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGOGRelazioneGerarchica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GOG_gerarchia_sto_20110214Result", scope = GOGGerarchiaSto20110214Response.class)
    public JAXBElement<ArrayOfGOGRelazioneGerarchica> createGOGGerarchiaSto20110214ResponseGOGGerarchiaSto20110214Result(ArrayOfGOGRelazioneGerarchica value) {
        return new JAXBElement<ArrayOfGOGRelazioneGerarchica>(_GOGGerarchiaSto20110214ResponseGOGGerarchiaSto20110214Result_QNAME, ArrayOfGOGRelazioneGerarchica.class, GOGGerarchiaSto20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCODERelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "CODE_find_id_fonte_20120415Result", scope = CODEFindIdFonte20120415Response.class)
    public JAXBElement<ArrayOfCODERelation> createCODEFindIdFonte20120415ResponseCODEFindIdFonte20120415Result(ArrayOfCODERelation value) {
        return new JAXBElement<ArrayOfCODERelation>(_CODEFindIdFonte20120415ResponseCODEFindIdFonte20120415Result_QNAME, ArrayOfCODERelation.class, CODEFindIdFonte20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = GOGGerarchiaSto20110214 .class)
    public JAXBElement<String> createGOGGerarchiaSto20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, GOGGerarchiaSto20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGOGRelazioneGerarchica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GOG_gerarchia_sto_20120415Result", scope = GOGGerarchiaSto20120415Response.class)
    public JAXBElement<ArrayOfGOGRelazioneGerarchica> createGOGGerarchiaSto20120415ResponseGOGGerarchiaSto20120415Result(ArrayOfGOGRelazioneGerarchica value) {
        return new JAXBElement<ArrayOfGOGRelazioneGerarchica>(_GOGGerarchiaSto20120415ResponseGOGGerarchiaSto20120415Result_QNAME, ArrayOfGOGRelazioneGerarchica.class, GOGGerarchiaSto20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERAttivitaDidatticheSostenute20120415 .class)
    public JAXBElement<String> createPERAttivitaDidatticheSostenute20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERAttivitaDidatticheSostenute20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "da_data", scope = PERFindCodiciBase20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createPERFindCodiciBase20110214DaData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERFindAllPosizioniDate20110214DaData_QNAME, XMLGregorianCalendar.class, PERFindCodiciBase20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "a_data", scope = PERFindCodiciBase20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createPERFindCodiciBase20110214AData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERFindAllPosizioniDate20110214AData_QNAME, XMLGregorianCalendar.class, PERFindCodiciBase20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "tso_id_oga", scope = PERFindCodiciBase20110214 .class)
    public JAXBElement<String> createPERFindCodiciBase20110214TsoIdOga(String value) {
        return new JAXBElement<String>(_PERFindCodiciBase20110214TsoIdOga_QNAME, String.class, PERFindCodiciBase20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "rup_id_oga", scope = PERFindCodiciBase20110214 .class)
    public JAXBElement<String> createPERFindCodiciBase20110214RupIdOga(String value) {
        return new JAXBElement<String>(_PERFindCodiciBase20110214RupIdOga_QNAME, String.class, PERFindCodiciBase20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "fro_id_atr", scope = PERFindCodiciBase20110214 .class)
    public JAXBElement<String> createPERFindCodiciBase20110214FroIdAtr(String value) {
        return new JAXBElement<String>(_PERFindCodiciBase20110214FroIdAtr_QNAME, String.class, PERFindCodiciBase20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "sto_id_oga", scope = PERFindCodiciBase20110214 .class)
    public JAXBElement<String> createPERFindCodiciBase20110214StoIdOga(String value) {
        return new JAXBElement<String>(_PERFindCodiciBase20110214StoIdOga_QNAME, String.class, PERFindCodiciBase20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ruo_id_oga", scope = PERFindCodiciBase20110214 .class)
    public JAXBElement<String> createPERFindCodiciBase20110214RuoIdOga(String value) {
        return new JAXBElement<String>(_PERFindCodiciBase20110214RuoIdOga_QNAME, String.class, PERFindCodiciBase20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_posizioni_id_adaResult", scope = PERFindPosizioniIdAdaResponse.class)
    public JAXBElement<ArrayOfPERPosizioni> createPERFindPosizioniIdAdaResponsePERFindPosizioniIdAdaResult(ArrayOfPERPosizioni value) {
        return new JAXBElement<ArrayOfPERPosizioni>(_PERFindPosizioniIdAdaResponsePERFindPosizioniIdAdaResult_QNAME, ArrayOfPERPosizioni.class, PERFindPosizioniIdAdaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "account_non_attivi", scope = ACCOUNTDETAILFINDIdAccListDaIdAda20110214 .class)
    public JAXBElement<String> createACCOUNTDETAILFINDIdAccListDaIdAda20110214AccountNonAttivi(String value) {
        return new JAXBElement<String>(_ACCOUNTDETAILFINDIdAccListDaIdAda20110214AccountNonAttivi_QNAME, String.class, ACCOUNTDETAILFINDIdAccListDaIdAda20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = ACCOUNTDETAILFINDIdAccListDaIdAda20110214 .class)
    public JAXBElement<String> createACCOUNTDETAILFINDIdAccListDaIdAda20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, ACCOUNTDETAILFINDIdAccListDaIdAda20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "account_tecnici", scope = ACCOUNTDETAILFINDIdAccListDaIdAda20110214 .class)
    public JAXBElement<String> createACCOUNTDETAILFINDIdAccListDaIdAda20110214AccountTecnici(String value) {
        return new JAXBElement<String>(_ACCOUNTDETAILFINDIdAccListDaIdAda20110214AccountTecnici_QNAME, String.class, ACCOUNTDETAILFINDIdAccListDaIdAda20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_codici_base_20120415Result", scope = PERFindCodiciBase20120415Response.class)
    public JAXBElement<ArrayOfPERPersona> createPERFindCodiciBase20120415ResponsePERFindCodiciBase20120415Result(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERFindCodiciBase20120415ResponsePERFindCodiciBase20120415Result_QNAME, ArrayOfPERPersona.class, PERFindCodiciBase20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "username", scope = ADAIDFindIdAdaDaUsername20110214 .class)
    public JAXBElement<String> createADAIDFindIdAdaDaUsername20110214Username(String value) {
        return new JAXBElement<String>(_ADAIDFindIdAccDaUsername20120415Username_QNAME, String.class, ADAIDFindIdAdaDaUsername20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_id_ada_20091229Result", scope = PERFindIdAda20091229Response.class)
    public JAXBElement<ArrayOfPERPersona> createPERFindIdAda20091229ResponsePERFindIdAda20091229Result(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERFindIdAda20091229ResponsePERFindIdAda20091229Result_QNAME, ArrayOfPERPersona.class, PERFindIdAda20091229Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "COD_ESSE3_STATO_CARRIERA", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<String> createULTIMACARRIERASTUDENTECODESSE3STATOCARRIERA(String value) {
        return new JAXBElement<String>(_ULTIMACARRIERASTUDENTECODESSE3STATOCARRIERA_QNAME, String.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_CDS", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<String> createULTIMACARRIERASTUDENTEDESCRIZIONECDS(String value) {
        return new JAXBElement<String>(_ULTIMACARRIERASTUDENTEDESCRIZIONECDS_QNAME, String.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "MEDIA_PONDERATA", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<Double> createULTIMACARRIERASTUDENTEMEDIAPONDERATA(Double value) {
        return new JAXBElement<Double>(_ULTIMACARRIERASTUDENTEMEDIAPONDERATA_QNAME, Double.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ANNO_CORSO", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<Long> createULTIMACARRIERASTUDENTEANNOCORSO(Long value) {
        return new JAXBElement<Long>(_ULTIMACARRIERASTUDENTEANNOCORSO_QNAME, Long.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "CREDITI_IN_PIANO", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<Double> createULTIMACARRIERASTUDENTECREDITIINPIANO(Double value) {
        return new JAXBElement<Double>(_ULTIMACARRIERASTUDENTECREDITIINPIANO_QNAME, Double.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_MOTIVO_STATO_CARRIERA", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<String> createULTIMACARRIERASTUDENTEDESCRIZIONEMOTIVOSTATOCARRIERA(String value) {
        return new JAXBElement<String>(_ULTIMACARRIERASTUDENTEDESCRIZIONEMOTIVOSTATOCARRIERA_QNAME, String.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "NUMERO_ESAMI_SUPERATI", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<Long> createULTIMACARRIERASTUDENTENUMEROESAMISUPERATI(Long value) {
        return new JAXBElement<Long>(_ULTIMACARRIERASTUDENTENUMEROESAMISUPERATI_QNAME, Long.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<String> createULTIMACARRIERASTUDENTEIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DATA_CHIUSURA_CARRIERA", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<XMLGregorianCalendar> createULTIMACARRIERASTUDENTEDATACHIUSURACARRIERA(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ULTIMACARRIERASTUDENTEDATACHIUSURACARRIERA_QNAME, XMLGregorianCalendar.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "MEDIA_ARITMETICA", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<Double> createULTIMACARRIERASTUDENTEMEDIAARITMETICA(Double value) {
        return new JAXBElement<Double>(_ULTIMACARRIERASTUDENTEMEDIAARITMETICA_QNAME, Double.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_GIADA_PERSONA", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<Long> createULTIMACARRIERASTUDENTEIDGIADAPERSONA(Long value) {
        return new JAXBElement<Long>(_ANAGRAFICAESTESAIDGIADAPERSONA_QNAME, Long.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ATTESA_DI_LAUREA", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<Long> createULTIMACARRIERASTUDENTEATTESADILAUREA(Long value) {
        return new JAXBElement<Long>(_ULTIMACARRIERASTUDENTEATTESADILAUREA_QNAME, Long.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "CREDITI", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<Double> createULTIMACARRIERASTUDENTECREDITI(Double value) {
        return new JAXBElement<Double>(_ULTIMACARRIERASTUDENTECREDITI_QNAME, Double.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "COD_ESSE3_MOTIVO_STATO_CARRIERA", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<String> createULTIMACARRIERASTUDENTECODESSE3MOTIVOSTATOCARRIERA(String value) {
        return new JAXBElement<String>(_ULTIMACARRIERASTUDENTECODESSE3MOTIVOSTATOCARRIERA_QNAME, String.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "NUMERO_ESAMI_PIANO", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<Long> createULTIMACARRIERASTUDENTENUMEROESAMIPIANO(Long value) {
        return new JAXBElement<Long>(_ULTIMACARRIERASTUDENTENUMEROESAMIPIANO_QNAME, Long.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "CICLO_DOTTORATO", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<Long> createULTIMACARRIERASTUDENTECICLODOTTORATO(Long value) {
        return new JAXBElement<Long>(_ULTIMACARRIERASTUDENTECICLODOTTORATO_QNAME, Long.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "COD_ESSE3_CDS", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<String> createULTIMACARRIERASTUDENTECODESSE3CDS(String value) {
        return new JAXBElement<String>(_ULTIMACARRIERASTUDENTECODESSE3CDS_QNAME, String.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ESSE3_MATRICOLA", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<String> createULTIMACARRIERASTUDENTEESSE3MATRICOLA(String value) {
        return new JAXBElement<String>(_ULTIMACARRIERASTUDENTEESSE3MATRICOLA_QNAME, String.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ANNO_ISCRIZIONE", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<Long> createULTIMACARRIERASTUDENTEANNOISCRIZIONE(Long value) {
        return new JAXBElement<Long>(_ULTIMACARRIERASTUDENTEANNOISCRIZIONE_QNAME, Long.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_STATO_CARRIERA", scope = ULTIMACARRIERASTUDENTE.class)
    public JAXBElement<String> createULTIMACARRIERASTUDENTEDESCRIZIONESTATOCARRIERA(String value) {
        return new JAXBElement<String>(_ULTIMACARRIERASTUDENTEDESCRIZIONESTATOCARRIERA_QNAME, String.class, ULTIMACARRIERASTUDENTE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_lingua", scope = DESCRIZIONEFindOga20120415 .class)
    public JAXBElement<String> createDESCRIZIONEFindOga20120415IdLingua(String value) {
        return new JAXBElement<String>(_DESCRIZIONEFindAtr20120415IdLingua_QNAME, String.class, DESCRIZIONEFindOga20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = DESCRIZIONEFindOga20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createDESCRIZIONEFindOga20120415DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, DESCRIZIONEFindOga20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = DESCRIZIONEFindOga20120415 .class)
    public JAXBElement<String> createDESCRIZIONEFindOga20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, DESCRIZIONEFindOga20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_toa", scope = DESCRIZIONEFindOga20120415 .class)
    public JAXBElement<String> createDESCRIZIONEFindOga20120415IdToa(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdToa_QNAME, String.class, DESCRIZIONEFindOga20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_id_ada_20120415Result", scope = PERFindIdAda20120415Response.class)
    public JAXBElement<ArrayOfPERPersona> createPERFindIdAda20120415ResponsePERFindIdAda20120415Result(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERFindIdAda20120415ResponsePERFindIdAda20120415Result_QNAME, ArrayOfPERPersona.class, PERFindIdAda20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PPE_ID_OGA", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniPPEIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229PPEIDOGA_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "POR_ID_OGA", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniPORIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229PORIDOGA_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO_PPE", scope = PERPosizioni.class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioniINIZIOPPE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229INIZIOPPE_QNAME, XMLGregorianCalendar.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_POR", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniDESCRIZIONEPOR(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONEPOR_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE_PPE", scope = PERPosizioni.class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioniFINEPPE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229FINEPPE_QNAME, XMLGregorianCalendar.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_ID_OGA", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniPERIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229PERIDOGA_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RUP_ID_OGA", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniRUPIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229RUPIDOGA_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_STO", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniDESCRIZIONESTO(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONESTO_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LINGUA", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniLINGUA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229LINGUA_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_RUO", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniDESCRIZIONERUO(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONERUO_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_RUP", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniDESCRIZIONERUP(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONERUP_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO_SOG", scope = PERPosizioni.class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioniINIZIOSOG(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229INIZIOSOG_QNAME, XMLGregorianCalendar.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE_POR", scope = PERPosizioni.class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioniFINEPOR(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229FINEPOR_QNAME, XMLGregorianCalendar.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_SED", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniDESCRIZIONESED(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONESED_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RUO_ID_OGA", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniRUOIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229RUOIDOGA_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PRO_ID_OGA", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniPROIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229PROIDOGA_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "STO_ID_OGA", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniSTOIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229STOIDOGA_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_PPE", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniDESCRIZIONEPPE(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONEPPE_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO_POR", scope = PERPosizioni.class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioniINIZIOPOR(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229INIZIOPOR_QNAME, XMLGregorianCalendar.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "SED_ID_OGA", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniSEDIDOGA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229SEDIDOGA_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_PRO", scope = PERPosizioni.class)
    public JAXBElement<String> createPERPosizioniDESCRIZIONEPRO(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229DESCRIZIONEPRO_QNAME, String.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE_SOG", scope = PERPosizioni.class)
    public JAXBElement<XMLGregorianCalendar> createPERPosizioniFINESOG(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERPosizioni20091229FINESOG_QNAME, XMLGregorianCalendar.class, PERPosizioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_account", scope = ACCOUNTFindIdAda20120415 .class)
    public JAXBElement<String> createACCOUNTFindIdAda20120415IdAccount(String value) {
        return new JAXBElement<String>(_ACCOUNTFindIdAda20110214IdAccount_QNAME, String.class, ACCOUNTFindIdAda20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = ACCOUNTFindIdAda20120415 .class)
    public JAXBElement<String> createACCOUNTFindIdAda20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, ACCOUNTFindIdAda20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADADescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_find_atr_20110214Result", scope = DESCRIZIONEFindAtr20110214Response.class)
    public JAXBElement<ArrayOfADADescription> createDESCRIZIONEFindAtr20110214ResponseDESCRIZIONEFindAtr20110214Result(ArrayOfADADescription value) {
        return new JAXBElement<ArrayOfADADescription>(_DESCRIZIONEFindAtr20110214ResponseDESCRIZIONEFindAtr20110214Result_QNAME, ArrayOfADADescription.class, DESCRIZIONEFindAtr20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "da_data", scope = PERFindCodiciBase20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createPERFindCodiciBase20120415DaData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERFindAllPosizioniDate20110214DaData_QNAME, XMLGregorianCalendar.class, PERFindCodiciBase20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "a_data", scope = PERFindCodiciBase20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createPERFindCodiciBase20120415AData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERFindAllPosizioniDate20110214AData_QNAME, XMLGregorianCalendar.class, PERFindCodiciBase20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "tso_id_oga", scope = PERFindCodiciBase20120415 .class)
    public JAXBElement<String> createPERFindCodiciBase20120415TsoIdOga(String value) {
        return new JAXBElement<String>(_PERFindCodiciBase20110214TsoIdOga_QNAME, String.class, PERFindCodiciBase20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "rup_id_oga", scope = PERFindCodiciBase20120415 .class)
    public JAXBElement<String> createPERFindCodiciBase20120415RupIdOga(String value) {
        return new JAXBElement<String>(_PERFindCodiciBase20110214RupIdOga_QNAME, String.class, PERFindCodiciBase20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "fro_id_atr", scope = PERFindCodiciBase20120415 .class)
    public JAXBElement<String> createPERFindCodiciBase20120415FroIdAtr(String value) {
        return new JAXBElement<String>(_PERFindCodiciBase20110214FroIdAtr_QNAME, String.class, PERFindCodiciBase20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "sto_id_oga", scope = PERFindCodiciBase20120415 .class)
    public JAXBElement<String> createPERFindCodiciBase20120415StoIdOga(String value) {
        return new JAXBElement<String>(_PERFindCodiciBase20110214StoIdOga_QNAME, String.class, PERFindCodiciBase20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ruo_id_oga", scope = PERFindCodiciBase20120415 .class)
    public JAXBElement<String> createPERFindCodiciBase20120415RuoIdOga(String value) {
        return new JAXBElement<String>(_PERFindCodiciBase20110214RuoIdOga_QNAME, String.class, PERFindCodiciBase20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "da_data", scope = PERFindAllPosizioniDate20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createPERFindAllPosizioniDate20120415DaData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERFindAllPosizioniDate20110214DaData_QNAME, XMLGregorianCalendar.class, PERFindAllPosizioniDate20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "a_data", scope = PERFindAllPosizioniDate20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createPERFindAllPosizioniDate20120415AData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERFindAllPosizioniDate20110214AData_QNAME, XMLGregorianCalendar.class, PERFindAllPosizioniDate20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindAllPosizioniDate20120415 .class)
    public JAXBElement<String> createPERFindAllPosizioniDate20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindAllPosizioniDate20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCODERelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "CODE_find_id_ada_20110214Result", scope = CODEFindIdAda20110214Response.class)
    public JAXBElement<ArrayOfCODERelation> createCODEFindIdAda20110214ResponseCODEFindIdAda20110214Result(ArrayOfCODERelation value) {
        return new JAXBElement<ArrayOfCODERelation>(_CODEFindIdAda20110214ResponseCODEFindIdAda20110214Result_QNAME, ArrayOfCODERelation.class, CODEFindIdAda20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_gru", scope = GROUPMEMBERFind20110214 .class)
    public JAXBElement<String> createGROUPMEMBERFind20110214IdGru(String value) {
        return new JAXBElement<String>(_GROUPMEMBERFind20120415IdGru_QNAME, String.class, GROUPMEMBERFind20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_atr", scope = SSDFindAll20110214 .class)
    public JAXBElement<String> createSSDFindAll20110214IdAtr(String value) {
        return new JAXBElement<String>(_SSDFindAll20120415IdAtr_QNAME, String.class, SSDFindAll20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "lingua", scope = SSDFindAll20110214 .class)
    public JAXBElement<String> createSSDFindAll20110214Lingua(String value) {
        return new JAXBElement<String>(_SSDFindAll20120415Lingua_QNAME, String.class, SSDFindAll20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ssd", scope = SSDFindAll20110214 .class)
    public JAXBElement<String> createSSDFindAll20110214IdSsd(String value) {
        return new JAXBElement<String>(_SSDFindAll20120415IdSsd_QNAME, String.class, SSDFindAll20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_acu", scope = SSDFindAll20110214 .class)
    public JAXBElement<String> createSSDFindAll20110214IdAcu(String value) {
        return new JAXBElement<String>(_SSDFindAll20120415IdAcu_QNAME, String.class, SSDFindAll20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindPosizioniIdAda.class)
    public JAXBElement<String> createPERFindPosizioniIdAdaIdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindPosizioniIdAda.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_acc", scope = ACCOUNTMEMBERSHIPFind20120415 .class)
    public JAXBElement<String> createACCOUNTMEMBERSHIPFind20120415IdAcc(String value) {
        return new JAXBElement<String>(_RECAPITOFindOgaAcc20110214IdAcc_QNAME, String.class, ACCOUNTMEMBERSHIPFind20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "descrizione", scope = VOIPFindEntity20120415 .class)
    public JAXBElement<String> createVOIPFindEntity20120415Descrizione(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229Descrizione_QNAME, String.class, VOIPFindEntity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = VOIPFindEntity20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createVOIPFindEntity20120415DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, VOIPFindEntity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = VOIPFindEntity20120415 .class)
    public JAXBElement<String> createVOIPFindEntity20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, VOIPFindEntity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_toa", scope = VOIPFindEntity20120415 .class)
    public JAXBElement<String> createVOIPFindEntity20120415IdToa(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdToa_QNAME, String.class, VOIPFindEntity20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfATTRIBUTIDIDATTICA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ADI_find_all_20120415Result", scope = ADIFindAll20120415Response.class)
    public JAXBElement<ArrayOfATTRIBUTIDIDATTICA> createADIFindAll20120415ResponseADIFindAll20120415Result(ArrayOfATTRIBUTIDIDATTICA value) {
        return new JAXBElement<ArrayOfATTRIBUTIDIDATTICA>(_ADIFindAll20120415ResponseADIFindAll20120415Result_QNAME, ArrayOfATTRIBUTIDIDATTICA.class, ADIFindAll20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_SSD", scope = SETTORESDAREACUN.class)
    public JAXBElement<String> createSETTORESDAREACUNDESCRIZIONESSD(String value) {
        return new JAXBElement<String>(_ATTRIBUTIDIDATTICADESCRIZIONESSD_QNAME, String.class, SETTORESDAREACUN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE", scope = SETTORESDAREACUN.class)
    public JAXBElement<XMLGregorianCalendar> createSETTORESDAREACUNFINE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIFINE_QNAME, XMLGregorianCalendar.class, SETTORESDAREACUN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "SSD_ID_ATR", scope = SETTORESDAREACUN.class)
    public JAXBElement<String> createSETTORESDAREACUNSSDIDATR(String value) {
        return new JAXBElement<String>(_ATTRIBUTIDIDATTICASSDIDATR_QNAME, String.class, SETTORESDAREACUN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_AREA_CUN", scope = SETTORESDAREACUN.class)
    public JAXBElement<String> createSETTORESDAREACUNDESCRIZIONEAREACUN(String value) {
        return new JAXBElement<String>(_ATTRIBUTIDIDATTICADESCRIZIONEAREACUN_QNAME, String.class, SETTORESDAREACUN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_SSD", scope = SETTORESDAREACUN.class)
    public JAXBElement<String> createSETTORESDAREACUNIDSSD(String value) {
        return new JAXBElement<String>(_ATTRIBUTIDIDATTICAIDSSD_QNAME, String.class, SETTORESDAREACUN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "LINGUA", scope = SETTORESDAREACUN.class)
    public JAXBElement<String> createSETTORESDAREACUNLINGUA(String value) {
        return new JAXBElement<String>(_PERPosizioni20091229LINGUA_QNAME, String.class, SETTORESDAREACUN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_AREA_CUN", scope = SETTORESDAREACUN.class)
    public JAXBElement<String> createSETTORESDAREACUNIDAREACUN(String value) {
        return new JAXBElement<String>(_ATTRIBUTIDIDATTICAIDAREACUN_QNAME, String.class, SETTORESDAREACUN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO", scope = SETTORESDAREACUN.class)
    public JAXBElement<XMLGregorianCalendar> createSETTORESDAREACUNINIZIO(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIINIZIO_QNAME, XMLGregorianCalendar.class, SETTORESDAREACUN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "username", scope = ADAIDFindIdAdaDaUsername20120415 .class)
    public JAXBElement<String> createADAIDFindIdAdaDaUsername20120415Username(String value) {
        return new JAXBElement<String>(_ADAIDFindIdAccDaUsername20120415Username_QNAME, String.class, ADAIDFindIdAdaDaUsername20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGOGRelazioneGerarchica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "GOG_gerarchia_sto_20091229Result", scope = GOGGerarchiaSto20091229Response.class)
    public JAXBElement<ArrayOfGOGRelazioneGerarchica> createGOGGerarchiaSto20091229ResponseGOGGerarchiaSto20091229Result(ArrayOfGOGRelazioneGerarchica value) {
        return new JAXBElement<ArrayOfGOGRelazioneGerarchica>(_GOGGerarchiaSto20091229ResponseGOGGerarchiaSto20091229Result_QNAME, ArrayOfGOGRelazioneGerarchica.class, GOGGerarchiaSto20091229Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_local", scope = CODEFindIdAda20120415 .class)
    public JAXBElement<String> createCODEFindIdAda20120415IdLocal(String value) {
        return new JAXBElement<String>(_CODEFindIdAda20120415IdLocal_QNAME, String.class, CODEFindIdAda20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = CODEFindIdAda20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createCODEFindIdAda20120415DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, CODEFindIdAda20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_fad", scope = CODEFindIdAda20120415 .class)
    public JAXBElement<String> createCODEFindIdAda20120415IdFad(String value) {
        return new JAXBElement<String>(_CODEFindIdFonte20120415IdFad_QNAME, String.class, CODEFindIdAda20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_toa", scope = CODEFindIdAda20120415 .class)
    public JAXBElement<String> createCODEFindIdAda20120415IdToa(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdToa_QNAME, String.class, CODEFindIdAda20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_lingua", scope = DESCRIZIONEFindOga20110214 .class)
    public JAXBElement<String> createDESCRIZIONEFindOga20110214IdLingua(String value) {
        return new JAXBElement<String>(_DESCRIZIONEFindAtr20120415IdLingua_QNAME, String.class, DESCRIZIONEFindOga20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = DESCRIZIONEFindOga20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createDESCRIZIONEFindOga20110214DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, DESCRIZIONEFindOga20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = DESCRIZIONEFindOga20110214 .class)
    public JAXBElement<String> createDESCRIZIONEFindOga20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, DESCRIZIONEFindOga20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_toa", scope = DESCRIZIONEFindOga20110214 .class)
    public JAXBElement<String> createDESCRIZIONEFindOga20110214IdToa(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdToa_QNAME, String.class, DESCRIZIONEFindOga20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "username", scope = ADAIDFindIdAccDaUsername20110214 .class)
    public JAXBElement<String> createADAIDFindIdAccDaUsername20110214Username(String value) {
        return new JAXBElement<String>(_ADAIDFindIdAccDaUsername20120415Username_QNAME, String.class, ADAIDFindIdAccDaUsername20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_all_posizioni_20091229Result", scope = PERFindAllPosizioni20091229Response.class)
    public JAXBElement<ArrayOfPERPosizioni20091229> createPERFindAllPosizioni20091229ResponsePERFindAllPosizioni20091229Result(ArrayOfPERPosizioni20091229 value) {
        return new JAXBElement<ArrayOfPERPosizioni20091229>(_PERFindAllPosizioni20091229ResponsePERFindAllPosizioni20091229Result_QNAME, ArrayOfPERPosizioni20091229 .class, PERFindAllPosizioni20091229Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindIdAda.class)
    public JAXBElement<String> createPERFindIdAdaIdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindIdAda.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRECAPITO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "RECAPITO_find_oga_acc_20120415Result", scope = RECAPITOFindOgaAcc20120415Response.class)
    public JAXBElement<ArrayOfRECAPITO> createRECAPITOFindOgaAcc20120415ResponseRECAPITOFindOgaAcc20120415Result(ArrayOfRECAPITO value) {
        return new JAXBElement<ArrayOfRECAPITO>(_RECAPITOFindOgaAcc20120415ResponseRECAPITOFindOgaAcc20120415Result_QNAME, ArrayOfRECAPITO.class, RECAPITOFindOgaAcc20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_rif", scope = ADIFindAll20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createADIFindAll20110214DataRif(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_APEFindAll20110214DataRif_QNAME, XMLGregorianCalendar.class, ADIFindAll20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "lingua", scope = ADIFindAll20110214 .class)
    public JAXBElement<String> createADIFindAll20110214Lingua(String value) {
        return new JAXBElement<String>(_SSDFindAll20120415Lingua_QNAME, String.class, ADIFindAll20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = ADIFindAll20110214 .class)
    public JAXBElement<String> createADIFindAll20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, ADIFindAll20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = PERFindAllPosizioni20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createPERFindAllPosizioni20110214DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, PERFindAllPosizioni20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = PERFindAllPosizioni20110214 .class)
    public JAXBElement<String> createPERFindAllPosizioni20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, PERFindAllPosizioni20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_local", scope = CODEFindIdAda20110214 .class)
    public JAXBElement<String> createCODEFindIdAda20110214IdLocal(String value) {
        return new JAXBElement<String>(_CODEFindIdAda20120415IdLocal_QNAME, String.class, CODEFindIdAda20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = CODEFindIdAda20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createCODEFindIdAda20110214DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, CODEFindIdAda20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_fad", scope = CODEFindIdAda20110214 .class)
    public JAXBElement<String> createCODEFindIdAda20110214IdFad(String value) {
        return new JAXBElement<String>(_CODEFindIdFonte20120415IdFad_QNAME, String.class, CODEFindIdAda20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_toa", scope = CODEFindIdAda20110214 .class)
    public JAXBElement<String> createCODEFindIdAda20110214IdToa(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdToa_QNAME, String.class, CODEFindIdAda20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ACC", scope = GROUPMember.class)
    public JAXBElement<String> createGROUPMemberIDACC(String value) {
        return new JAXBElement<String>(_ACCOUNTDetailIDACC_QNAME, String.class, GROUPMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = GROUPMember.class)
    public JAXBElement<String> createGROUPMemberIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, GROUPMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "USERNAME", scope = GROUPMember.class)
    public JAXBElement<String> createGROUPMemberUSERNAME(String value) {
        return new JAXBElement<String>(_RECAPITOUSERNAME_QNAME, String.class, GROUPMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ACCOUNT_DETAIL_FIND_id_acc_list_da_id_ada_20120415Result", scope = ACCOUNTDETAILFINDIdAccListDaIdAda20120415Response.class)
    public JAXBElement<ArrayOfACCOUNTDetail> createACCOUNTDETAILFINDIdAccListDaIdAda20120415ResponseACCOUNTDETAILFINDIdAccListDaIdAda20120415Result(ArrayOfACCOUNTDetail value) {
        return new JAXBElement<ArrayOfACCOUNTDetail>(_ACCOUNTDETAILFINDIdAccListDaIdAda20120415ResponseACCOUNTDETAILFINDIdAccListDaIdAda20120415Result_QNAME, ArrayOfACCOUNTDetail.class, ACCOUNTDETAILFINDIdAccListDaIdAda20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_account", scope = ACCOUNTFindIdAda20091229 .class)
    public JAXBElement<String> createACCOUNTFindIdAda20091229IdAccount(String value) {
        return new JAXBElement<String>(_ACCOUNTFindIdAda20110214IdAccount_QNAME, String.class, ACCOUNTFindIdAda20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = ACCOUNTFindIdAda20091229 .class)
    public JAXBElement<String> createACCOUNTFindIdAda20091229IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, ACCOUNTFindIdAda20091229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_TOA", scope = VOIPEntity.class)
    public JAXBElement<String> createVOIPEntityIDTOA(String value) {
        return new JAXBElement<String>(_ADADescriptionIDTOA_QNAME, String.class, VOIPEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "FINE", scope = VOIPEntity.class)
    public JAXBElement<XMLGregorianCalendar> createVOIPEntityFINE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIFINE_QNAME, XMLGregorianCalendar.class, VOIPEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE", scope = VOIPEntity.class)
    public JAXBElement<String> createVOIPEntityDESCRIZIONE(String value) {
        return new JAXBElement<String>(_ACCOUNTMembershipDESCRIZIONE_QNAME, String.class, VOIPEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = VOIPEntity.class)
    public JAXBElement<String> createVOIPEntityIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, VOIPEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "INIZIO", scope = VOIPEntity.class)
    public JAXBElement<XMLGregorianCalendar> createVOIPEntityINIZIO(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ATTRIBUTIPERSONALIINIZIO_QNAME, XMLGregorianCalendar.class, VOIPEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "nome", scope = PERFindCognomeNome20110214 .class)
    public JAXBElement<String> createPERFindCognomeNome20110214Nome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Nome_QNAME, String.class, PERFindCognomeNome20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "cognome", scope = PERFindCognomeNome20110214 .class)
    public JAXBElement<String> createPERFindCognomeNome20110214Cognome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Cognome_QNAME, String.class, PERFindCognomeNome20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "account_non_attivi", scope = ACCOUNTDETAILFINDIdAccListDaIdAda20120415 .class)
    public JAXBElement<String> createACCOUNTDETAILFINDIdAccListDaIdAda20120415AccountNonAttivi(String value) {
        return new JAXBElement<String>(_ACCOUNTDETAILFINDIdAccListDaIdAda20110214AccountNonAttivi_QNAME, String.class, ACCOUNTDETAILFINDIdAccListDaIdAda20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = ACCOUNTDETAILFINDIdAccListDaIdAda20120415 .class)
    public JAXBElement<String> createACCOUNTDETAILFINDIdAccListDaIdAda20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, ACCOUNTDETAILFINDIdAccListDaIdAda20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "account_tecnici", scope = ACCOUNTDETAILFINDIdAccListDaIdAda20120415 .class)
    public JAXBElement<String> createACCOUNTDETAILFINDIdAccListDaIdAda20120415AccountTecnici(String value) {
        return new JAXBElement<String>(_ACCOUNTDETAILFINDIdAccListDaIdAda20110214AccountTecnici_QNAME, String.class, ACCOUNTDETAILFINDIdAccListDaIdAda20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfACCOUNTEntityBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ACCOUNT_find_id_ada_20120415Result", scope = ACCOUNTFindIdAda20120415Response.class)
    public JAXBElement<ArrayOfACCOUNTEntityBase> createACCOUNTFindIdAda20120415ResponseACCOUNTFindIdAda20120415Result(ArrayOfACCOUNTEntityBase value) {
        return new JAXBElement<ArrayOfACCOUNTEntityBase>(_ACCOUNTFindIdAda20120415ResponseACCOUNTFindIdAda20120415Result_QNAME, ArrayOfACCOUNTEntityBase.class, ACCOUNTFindIdAda20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADADescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_find_atr_20120415Result", scope = DESCRIZIONEFindAtr20120415Response.class)
    public JAXBElement<ArrayOfADADescription> createDESCRIZIONEFindAtr20120415ResponseDESCRIZIONEFindAtr20120415Result(ArrayOfADADescription value) {
        return new JAXBElement<ArrayOfADADescription>(_DESCRIZIONEFindAtr20120415ResponseDESCRIZIONEFindAtr20120415Result_QNAME, ArrayOfADADescription.class, DESCRIZIONEFindAtr20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_codici_base_20110214Result", scope = PERFindCodiciBase20110214Response.class)
    public JAXBElement<ArrayOfPERPersona> createPERFindCodiciBase20110214ResponsePERFindCodiciBase20110214Result(ArrayOfPERPersona value) {
        return new JAXBElement<ArrayOfPERPersona>(_PERFindCodiciBase20110214ResponsePERFindCodiciBase20110214Result_QNAME, ArrayOfPERPersona.class, PERFindCodiciBase20110214Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_riferimento", scope = CODEFindIdFonte20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createCODEFindIdFonte20110214DataRiferimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VOIPFindEntity20091229DataRiferimento_QNAME, XMLGregorianCalendar.class, CODEFindIdFonte20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_fad", scope = CODEFindIdFonte20110214 .class)
    public JAXBElement<String> createCODEFindIdFonte20110214IdFad(String value) {
        return new JAXBElement<String>(_CODEFindIdFonte20120415IdFad_QNAME, String.class, CODEFindIdFonte20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = CODEFindIdFonte20110214 .class)
    public JAXBElement<String> createCODEFindIdFonte20110214IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, CODEFindIdFonte20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_toa", scope = CODEFindIdFonte20110214 .class)
    public JAXBElement<String> createCODEFindIdFonte20110214IdToa(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdToa_QNAME, String.class, CODEFindIdFonte20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_posizioni_id_ada_20091229Result", scope = PERFindPosizioniIdAda20091229Response.class)
    public JAXBElement<ArrayOfPERPosizioni20091229> createPERFindPosizioniIdAda20091229ResponsePERFindPosizioniIdAda20091229Result(ArrayOfPERPosizioni20091229 value) {
        return new JAXBElement<ArrayOfPERPosizioni20091229>(_PERFindPosizioniIdAda20091229ResponsePERFindPosizioniIdAda20091229Result_QNAME, ArrayOfPERPosizioni20091229 .class, PERFindPosizioniIdAda20091229Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_rif", scope = ADIFindAll20120415 .class)
    public JAXBElement<XMLGregorianCalendar> createADIFindAll20120415DataRif(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_APEFindAll20110214DataRif_QNAME, XMLGregorianCalendar.class, ADIFindAll20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "lingua", scope = ADIFindAll20120415 .class)
    public JAXBElement<String> createADIFindAll20120415Lingua(String value) {
        return new JAXBElement<String>(_SSDFindAll20120415Lingua_QNAME, String.class, ADIFindAll20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = ADIFindAll20120415 .class)
    public JAXBElement<String> createADIFindAll20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, ADIFindAll20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADADescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "DESCRIZIONE_find_oga_20120415Result", scope = DESCRIZIONEFindOga20120415Response.class)
    public JAXBElement<ArrayOfADADescription> createDESCRIZIONEFindOga20120415ResponseDESCRIZIONEFindOga20120415Result(ArrayOfADADescription value) {
        return new JAXBElement<ArrayOfADADescription>(_DESCRIZIONEFindOga20120415ResponseDESCRIZIONEFindOga20120415Result_QNAME, ArrayOfADADescription.class, DESCRIZIONEFindOga20120415Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "id_ada", scope = GOGGerarchiaSto20120415 .class)
    public JAXBElement<String> createGOGGerarchiaSto20120415IdAda(String value) {
        return new JAXBElement<String>(_VOIPFindEntity20091229IdAda_QNAME, String.class, GOGGerarchiaSto20120415 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "ID_ADA", scope = ADAObjectID.class)
    public JAXBElement<String> createADAObjectIDIDADA(String value) {
        return new JAXBElement<String>(_ATTRIBUTIPERSONALIIDADA_QNAME, String.class, ADAObjectID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "nome_padre", scope = PERCheckIdentity20110214 .class)
    public JAXBElement<String> createPERCheckIdentity20110214NomePadre(String value) {
        return new JAXBElement<String>(_PERCheckIdentity20120415NomePadre_QNAME, String.class, PERCheckIdentity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "naz_id_atr", scope = PERCheckIdentity20110214 .class)
    public JAXBElement<String> createPERCheckIdentity20110214NazIdAtr(String value) {
        return new JAXBElement<String>(_PERCheckIdentity20120415NazIdAtr_QNAME, String.class, PERCheckIdentity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "indice_rigidita_fuzzy", scope = PERCheckIdentity20110214 .class)
    public JAXBElement<Double> createPERCheckIdentity20110214IndiceRigiditaFuzzy(Double value) {
        return new JAXBElement<Double>(_PERCheckIdentity20120415IndiceRigiditaFuzzy_QNAME, Double.class, PERCheckIdentity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "data_nasc", scope = PERCheckIdentity20110214 .class)
    public JAXBElement<XMLGregorianCalendar> createPERCheckIdentity20110214DataNasc(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PERCheckIdentity20120415DataNasc_QNAME, XMLGregorianCalendar.class, PERCheckIdentity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "loc_id_atr", scope = PERCheckIdentity20110214 .class)
    public JAXBElement<String> createPERCheckIdentity20110214LocIdAtr(String value) {
        return new JAXBElement<String>(_PERCheckIdentity20120415LocIdAtr_QNAME, String.class, PERCheckIdentity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "codfis", scope = PERCheckIdentity20110214 .class)
    public JAXBElement<String> createPERCheckIdentity20110214Codfis(String value) {
        return new JAXBElement<String>(_PERCheckIdentity20120415Codfis_QNAME, String.class, PERCheckIdentity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "nome", scope = PERCheckIdentity20110214 .class)
    public JAXBElement<String> createPERCheckIdentity20110214Nome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Nome_QNAME, String.class, PERCheckIdentity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "cognome", scope = PERCheckIdentity20110214 .class)
    public JAXBElement<String> createPERCheckIdentity20110214Cognome(String value) {
        return new JAXBElement<String>(_PERFindCognomeNome20091229Cognome_QNAME, String.class, PERCheckIdentity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "sesso", scope = PERCheckIdentity20110214 .class)
    public JAXBElement<String> createPERCheckIdentity20110214Sesso(String value) {
        return new JAXBElement<String>(_PERCheckIdentity20120415Sesso_QNAME, String.class, PERCheckIdentity20110214 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPERPosizioni20091229 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ADAWs.unitn.it", name = "PER_find_posizioni_id_ada_20110214Result", scope = PERFindPosizioniIdAda20110214Response.class)
    public JAXBElement<ArrayOfPERPosizioni20091229> createPERFindPosizioniIdAda20110214ResponsePERFindPosizioniIdAda20110214Result(ArrayOfPERPosizioni20091229 value) {
        return new JAXBElement<ArrayOfPERPosizioni20091229>(_PERFindPosizioniIdAda20110214ResponsePERFindPosizioniIdAda20110214Result_QNAME, ArrayOfPERPosizioni20091229 .class, PERFindPosizioniIdAda20110214Response.class, value);
    }

}
