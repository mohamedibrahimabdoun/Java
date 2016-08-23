package sd.mtn.BusinessLogic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import oracle.jdbc.OracleCallableStatement;

import sd.mtn.Billing.CcmGetData;
import sd.mtn.Billing.CrmUserEquipments;
import sd.mtn.Billing.DirectTabsSessionEJB;
import sd.mtn.Billing.TabsSessionEJB;
import sd.mtn.Billing.VwMdwPospaidBasciinfo;
import sd.mtn.Data.CustomerResponseMsg;
import sd.mtn.Data.Customer_Reqest;
import sd.mtn.Data.Customer_Resp;
import sd.mtn.Data.LanguageRespose;
import sd.mtn.Data.LanguageResposeMessage;
import sd.mtn.Data.Postpaid_BillInfo;
import sd.mtn.Data.Postpaid_Equipment;
import sd.mtn.Data.Postpaid_Profile;
import sd.mtn.Data.QueryGSM;
import sd.mtn.Data.RequestHDR;
import sd.mtn.Data.ResultHDR;

import java.sql.DriverManager;


public class TABS_APIs {
    // final static  Context context;
    LanguageResposeMessage finalresult;
    CustomerResponseMsg CustFinalresult;
    List<Postpaid_BillInfo> creditlist;
    List<Postpaid_Equipment> postpaid_Equipment_list;
    Postpaid_Profile postpaid_Profileobj;
    LanguageRespose languageReponse_obj;


    public LanguageResposeMessage ChangePostpaidLang(RequestHDR resultHeader,
                                                     String p_subno,
                                                     String p_lang) {

        finalresult = new LanguageResposeMessage();
        TabsSessionEJB tabsSessionEJB;


        try {
            final Context context = getInitialContext();
            DirectTabsSessionEJB directTabsSessionEJB =
                (DirectTabsSessionEJB)context.lookup("MDW-MDW-DirectTabsSessionEJB#sd.mtn.Billing.DirectTabsSessionEJB");
            int x = directTabsSessionEJB.changepostpaidLang(p_subno, p_lang);

            ResultHDR rslthdr = new ResultHDR();

            if (x == 1) {
                rslthdr.setCommandId(resultHeader.getCommandId());
                rslthdr.setFinalResult(true);
                rslthdr.setResultCode("405000000");
                rslthdr.setResultDesc("Operation successfully.");
                rslthdr.setTransserial(resultHeader.getSerial());

            } else {

                rslthdr.setCommandId(resultHeader.getCommandId());
                rslthdr.setFinalResult(true);
                rslthdr.setResultCode("5050000001");
                rslthdr.setResultDesc("An Error occued During Chaning Language .");
                rslthdr.setTransserial(resultHeader.getSerial());

            }
            finalresult.setResultHeader(rslthdr);
        } catch (NamingException e) {
        }
        return finalresult;
    }

    public LanguageResposeMessage getPostPaidProfile(RequestHDR resultHeader,
                                                     String p_subno) {
        finalresult = new LanguageResposeMessage();
        languageReponse_obj = new LanguageRespose();
        creditlist = getCcmGetData(p_subno);
        postpaid_Equipment_list = getPostpaidEquipments(p_subno);
        postpaid_Profileobj = getPostpaidBasicInfo(p_subno);
        languageReponse_obj.setLang(postpaid_Profileobj.getLang());
        languageReponse_obj.setMSISDN(p_subno);
        languageReponse_obj.setPrePost_Paid("POST");
        languageReponse_obj.setProfile(postpaid_Profileobj.getTariff_profile());
        ResultHDR rslthdr = new ResultHDR();
        rslthdr.setCommandId(resultHeader.getCommandId());
        rslthdr.setFinalResult(true);
        rslthdr.setResultCode("405000000");
        rslthdr.setResultDesc("Operation successfully.");
        rslthdr.setTransserial(resultHeader.getSerial());


        finalresult.setPostpaid_BillInfo(creditlist);
        finalresult.setPostpaid_Equipment(postpaid_Equipment_list);
        finalresult.setPostpaid_Profile(postpaid_Profileobj);
        finalresult.setResultHeader(rslthdr);
        finalresult.setLanguageReponse(languageReponse_obj);
        return finalresult;
    }


    private static Postpaid_Profile getPostpaidBasicInfo(String p_subno) {
        Postpaid_Profile finalresult = new Postpaid_Profile();

        try {
            final Context context;
            context = getInitialContext();

            TabsSessionEJB tabsSessionEJB;
            tabsSessionEJB =
                    (TabsSessionEJB)context.lookup("MDW-MDW-TabsSessionEJB#sd.mtn.Billing.TabsSessionEJB");
            List<VwMdwPospaidBasciinfo> templist =
                tabsSessionEJB.getPostpaidBasicInfo(p_subno);
            finalresult.setCard_type(templist.get(0).getCardType());
            finalresult.setCardno(templist.get(0).getCardno());
            finalresult.setIcc_number(templist.get(0).getIccNumber());
            finalresult.setImsi_number(templist.get(0).getImsiNumber());
            finalresult.setPin2(templist.get(0).getPin2());
            finalresult.setPin_code(templist.get(0).getPinCode());
            finalresult.setPrepost_paid(templist.get(0).getPrepostPaid());
            finalresult.setPuk2_code(templist.get(0).getPuk2Code());
            finalresult.setPuk_code(templist.get(0).getPukCode());
            finalresult.setStatus(Long.toString(templist.get(0).getStatus()));
            finalresult.setSubno(templist.get(0).getSubno());
            finalresult.setTariff_profile(templist.get(0).getTariffProfile());
            finalresult.setLang(templist.get(0).getFLEX_FLD3());


        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return finalresult;
    }

    private static List<Postpaid_Equipment> getPostpaidEquipments(String p_subno) {
        List<Postpaid_Equipment> finalresult =
            new ArrayList<Postpaid_Equipment>();

        try {
            final Context context;
            context = getInitialContext();

            Postpaid_Equipment tempPostpaid_Equipmentobj;
            TabsSessionEJB tabsSessionEJB;
            tabsSessionEJB =
                    (TabsSessionEJB)context.lookup("MDW-MDW-TabsSessionEJB#sd.mtn.Billing.TabsSessionEJB");
            List<CrmUserEquipments> templist =
                tabsSessionEJB.getCrmUserEquipments(p_subno);
            for (int i = 0; i < templist.size(); i++) {
                tempPostpaid_Equipmentobj = new Postpaid_Equipment();
                tempPostpaid_Equipmentobj.setBilledto(templist.get(i).getBilledto().toString());
                tempPostpaid_Equipmentobj.setChanged(templist.get(i).getChanged().toString());
                tempPostpaid_Equipmentobj.setContrno(templist.get(i).getContrno());
                tempPostpaid_Equipmentobj.setEquipid(templist.get(i).getEquipid());
                tempPostpaid_Equipmentobj.setSubno(templist.get(i).getSubno());
                finalresult.add(tempPostpaid_Equipmentobj);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return finalresult;
    }

    private static List<Postpaid_BillInfo> getCcmGetData(String p_subno) {
        List<Postpaid_BillInfo> finalresult =
            new ArrayList<Postpaid_BillInfo>();

        try {
            final Context context;
            context = getInitialContext();

            TabsSessionEJB tabsSessionEJB =
                (TabsSessionEJB)context.lookup("MDW-MDW-TabsSessionEJB#sd.mtn.Billing.TabsSessionEJB");
            List<CcmGetData> templist = new ArrayList<CcmGetData>();
            templist = tabsSessionEJB.getCcmGetData(p_subno);

            Postpaid_BillInfo billinfoobj = new Postpaid_BillInfo();
            billinfoobj.setCc_limit(templist.get(0).getCcLimit());
            billinfoobj.setDate1(templist.get(0).getDate1());
            billinfoobj.setDue_amt(templist.get(0).getDueAmt());
            billinfoobj.setDue_amt_ar(templist.get(0).getDueAmtAr());
            billinfoobj.setInvdate(templist.get(0).getInvdate());
            billinfoobj.setSubno(templist.get(0).getSubno());
            billinfoobj.setTot_due(templist.get(0).getTotDue());
            billinfoobj.setTot_due_ar(templist.get(0).getDueAmtAr());
            billinfoobj.setUnbilled(templist.get(0).getUnbilled());
            billinfoobj.setUnbilled_ar(templist.get(0).getUnbilledAr());

            finalresult.add(billinfoobj);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return finalresult;
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "weblogic.jndi.WLInitialContextFactory");
        env.put(Context.PROVIDER_URL, "t3://172.26.1.73:7001");
        return new InitialContext(env);
    }

    public CustomerResponseMsg CustInfoQryReq(RequestHDR resultHeader,
                                              String pMSISDN) {

        //String fn_result = validate_POS(imsi, pin);
        CustomerResponseMsg CustomerRespMsg_obj = new CustomerResponseMsg();
        //TODO write your implementation code here:
        Connection cn = null;
        Statement stmt = null;
        String pSubNo;
        pSubNo = pMSISDN;
        /* Get PIN and MSISDN Through IMSI*/
        ResultSet resultset;
        ResultHDR rslthdr = new ResultHDR();
        rslthdr.setCommandId(resultHeader.getCommandId());
        rslthdr.setFinalResult(true);
        rslthdr.setResultCode("405000000");
        rslthdr.setResultDesc("Operation successfully.");
        rslthdr.setTransserial(resultHeader.getSerial());
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=172.24.8.187)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=TABS)))",
                             "VAS", "VAS");
            stmt = cn.createStatement();
            String query =
                "SELECT CUI.SUBNO MSISDN, CUI.PREPOST_PAID, CUI.TARIFF_PROFILE, " +
                " CUI.NAME, CODEVALUE_LANG STATUS, CUI.ID_TYPE, CUI.ID_NO, CC.CARDNO, " +
                " SUBSTR(CC.ICC_NUMBER, -4,4) LAST4DIGITS,  " +
                " CC.PIN_CODE PIN, CC.PIN2, PUK_CODE PUK, PUK2_CODE PUK2, CA.ADDRESS_ID, " +
                " CA.CUST_TYPE, CA.CUST_NO, CA.PREFERED_ADDRESS, CA.ADDRESS_TYPE, " +
                " CA.POST_AREA, CA.PO_BOX, CA.STREET_NO, CA.STREET, CA.BUILD_NO, " +
                " CA.BUILDING, CA.APARTMENT, CA.ADDRESS, CA.ADDRS_AREA, CA.ADDRS_BLOCK, " +
                " CA.ZIP_CODE, CA.GOVERNATE, CA.VILLAGE, CA.ZONE, CA.POSTAL_ADDRS,  " +
                " CA.POSTAL_CODE, CA.FLOOR, CA.DISTRICT, CA.DIRECTIONS, " +
                " VB.DUE_AMT PAST_DUE, VB.UNBILLED, CASE WHEN SUBSTR(CC.IMSI_NUMBER, 7, 1) " +
                " IN ('1','3') THEN  NVL(VB.TOT_DUE,'0') " +
                " ELSE TO_CHAR(TO_NUMBER(FN_SPLITRESULT " +
                " (FN_QUERYBALANCE ('" + pSubNo +
                "','2000','QY'), 4, '|')) / 1000000) END BALANCE " +
                ", 'N' AS REGISTERED , 'N' AS MOBILEMONEY " +
                " FROM CRM_USER_INFO@TABS CUI INNER JOIN CRM_DEPARTEMENT@TABS CD " +
                " ON CUI.CONTRNO = CD.CONTRNO " +
                " INNER JOIN CRM_COMMDEVICE@TABS CC ON CUI.SUBNO = CC.SUBNO " +
                " LEFT OUTER JOIN VAS.SEGMENTS@TABS S ON CUI.SUBNO = S.MSISDN " +
                " INNER JOIN SOM_TABS_CODES@TABS STC ON CUI.STATUS = STC.CODE " +
                " LEFT OUTER JOIN " +
                " (SELECT CA.ADDRESS_ID, CCA.CUST_TYPE, CCA.PREFERED_ADDRESS,  " +
                " CCA.CUST_NO, CA.ADDRESS_TYPE, CA.POST_AREA, CA.PO_BOX, " +
                " CA.STREET_NO, CA.STREET, CA.BUILD_NO, CA.BUILDING, " +
                " CA.APARTMENT, CA.ADDRESS, CA.ADDRS_AREA, CA.ADDRS_BLOCK, " +
                " CA.ZIP_CODE, CA.GOVERNATE, CA.VILLAGE, CA.ZONE, " +
                " CA.POSTAL_ADDRS, CA.POSTAL_CODE, CA.FLOOR, CA.DISTRICT, " +
                " CA.DIRECTIONS, CA.LOGNAME, CA.LOGDATE, CA.FLEX_FLD1, " +
                " CA.FLEX_FLD2, CA.FLEX_FLD3, CA.FLEX_FLD4, CA.FLEX_FLD5 " +
                " FROM CRM_CUST_ADDRS@TABS CCA, CRM_ADDRESS@TABS CA " +
                " WHERE CCA.ADDRESS_ID = CA.ADDRESS_ID) CA " +
                " ON (CUI.CUST_TYPE = CA.CUST_TYPE AND CUI.CUST_NO = CA.CUST_NO) " +
                " LEFT OUTER JOIN TABS.CCM_GET_DATA@TABS VB ON CUI.SUBNO = VB.SUBNO " +
                " WHERE STC.CODENAME = 'SUSTAT' AND CUI.SUBNO = '" + pSubNo +
                "' AND CC.STATUS = 40 ";

            resultset = stmt.executeQuery(query);
            while (resultset.next()) {

                String MSISDN = resultset.getString(1);
                String PREPOST_PAID = resultset.getString(2);
                String TARIFF_PROFILE = resultset.getString(3);
                String Name = resultset.getString(4);
                String Status = resultset.getString(5);
                String IDType = resultset.getString(6);
                String IDNo = resultset.getString(7);
                String CARDNo = resultset.getString(8);
                String LAST4DIGITS = resultset.getString(9);
                String PIN = resultset.getString(10);
                String PIN2 = resultset.getString(11);
                String PUK = resultset.getString(12);
                String PUK2 = resultset.getString(13);
                String ADDRESS_ID = resultset.getString(14);
                String CUST_TYPE = resultset.getString(15);
                String CUST_NO = resultset.getString(16);
                String PREFERED_ADDRESS = resultset.getString(17);
                String ADDRESS_TYPE = resultset.getString(18);
                String POST_AREA = resultset.getString(19);
                String PO_BOX = resultset.getString(20);
                String STREET_NO = resultset.getString(21);
                String STREET = resultset.getString(22);
                String BUILD_NO = resultset.getString(23);
                String BUILDING = resultset.getString(24);
                String APARTMENT = resultset.getString(25);
                String ADDRESS = resultset.getString(26);
                String ADDRS_AREA = resultset.getString(27);
                String ADDRS_BLOCK = resultset.getString(28);
                String ZIP_CODE = resultset.getString(29);
                String GOVERNATE = resultset.getString(30);
                String VILLAGE = resultset.getString(31);
                String ZONE = resultset.getString(32);
                String POSTAL_ADDRS = resultset.getString(33);
                String POSTAL_CODE = resultset.getString(34);
                String FLOOR = resultset.getString(35);
                String DISTRICT = resultset.getString(36);
                String DIRECTIONS = resultset.getString(37);
                String PAST_DUE = resultset.getString(38);
                String UNBILLED = resultset.getString(39);
                String BALANCE = resultset.getString(40);
                String REGISTERED = resultset.getString(41);
                String MOBILEMONEY = resultset.getString(42);

                CustomerRespMsg_obj.setMSISDN(MSISDN);
                CustomerRespMsg_obj.setPREPOST_PAID(PREPOST_PAID);
                CustomerRespMsg_obj.setTARIFF_PROFILE(TARIFF_PROFILE);
                CustomerRespMsg_obj.setName(Name);
                CustomerRespMsg_obj.setStatus(Status);
                CustomerRespMsg_obj.setIDType(IDType);
                CustomerRespMsg_obj.setIDNo(IDNo);
                CustomerRespMsg_obj.setCARDNo(CARDNo);
                CustomerRespMsg_obj.setLAST4DIGITS(LAST4DIGITS);
                CustomerRespMsg_obj.setPIN(PIN);
                CustomerRespMsg_obj.setPIN2(PIN2);
                CustomerRespMsg_obj.setPUK(PUK);
                CustomerRespMsg_obj.setPUK2(PUK2);
                CustomerRespMsg_obj.setADDRESS_ID(ADDRESS_ID);
                CustomerRespMsg_obj.setCUST_TYPE(CUST_TYPE);
                CustomerRespMsg_obj.setCUST_NO(CUST_NO);
                CustomerRespMsg_obj.setPREFERED_ADDRESS(PREFERED_ADDRESS);
                CustomerRespMsg_obj.setADDRESS_TYPE(ADDRESS_TYPE);
                CustomerRespMsg_obj.setPOST_AREA(POST_AREA);
                CustomerRespMsg_obj.setPO_BOX(PO_BOX);
                CustomerRespMsg_obj.setSTREET_NO(STREET_NO);
                CustomerRespMsg_obj.setSTREET(STREET);
                CustomerRespMsg_obj.setBUILD_NO(BUILD_NO);
                CustomerRespMsg_obj.setBUILDING(BUILDING);
                CustomerRespMsg_obj.setAPARTMENT(APARTMENT);
                CustomerRespMsg_obj.setADDRESS(ADDRESS);
                CustomerRespMsg_obj.setADDRS_AREA(ADDRS_AREA);
                CustomerRespMsg_obj.setADDRS_BLOCK(ADDRS_BLOCK);
                CustomerRespMsg_obj.setZIP_CODE(ZIP_CODE);
                CustomerRespMsg_obj.setGOVERNATE(GOVERNATE);
                CustomerRespMsg_obj.setVILLAGE(VILLAGE);
                CustomerRespMsg_obj.setZONE(ZONE);
                CustomerRespMsg_obj.setPOSTAL_ADDRS(POSTAL_ADDRS);
                CustomerRespMsg_obj.setFLOOR(FLOOR);
                CustomerRespMsg_obj.setDISTRICT(DISTRICT);
                CustomerRespMsg_obj.setDIRECTIONS(DIRECTIONS);
                CustomerRespMsg_obj.setPAST_DUE(PAST_DUE);
                CustomerRespMsg_obj.setUNBILLED(UNBILLED);
                CustomerRespMsg_obj.setBALANCE(BALANCE);
                CustomerRespMsg_obj.setREGISTERED(REGISTERED);
                CustomerRespMsg_obj.setMOBILEMONEY(MOBILEMONEY);
                System.out.println("Success");
                //System.out.println(Result_MSG);
            }
            resultset.close();
        } catch (SQLException ex) {
            // Logger.getLogger(droidws.class.getName()).log(Level.SEVERE, null, ex);
            CustomerRespMsg_obj.setMSISDN("");
            CustomerRespMsg_obj.setPREPOST_PAID("");
            CustomerRespMsg_obj.setTARIFF_PROFILE("");
            CustomerRespMsg_obj.setName("");
            CustomerRespMsg_obj.setStatus("");
            CustomerRespMsg_obj.setIDType("");
            CustomerRespMsg_obj.setIDNo("");
            CustomerRespMsg_obj.setCARDNo("");
            CustomerRespMsg_obj.setLAST4DIGITS("");
            CustomerRespMsg_obj.setPIN("");
            CustomerRespMsg_obj.setPIN2("");
            CustomerRespMsg_obj.setPUK("");
            CustomerRespMsg_obj.setPUK2("");
            CustomerRespMsg_obj.setADDRESS_ID("");
            CustomerRespMsg_obj.setCUST_TYPE("");
            CustomerRespMsg_obj.setCUST_NO("");
            CustomerRespMsg_obj.setPREFERED_ADDRESS("");
            CustomerRespMsg_obj.setADDRESS_TYPE("");
            CustomerRespMsg_obj.setPOST_AREA("");
            CustomerRespMsg_obj.setPO_BOX("");
            CustomerRespMsg_obj.setSTREET_NO("");
            CustomerRespMsg_obj.setSTREET("");
            CustomerRespMsg_obj.setBUILD_NO("");
            CustomerRespMsg_obj.setBUILDING("");
            CustomerRespMsg_obj.setAPARTMENT("");
            CustomerRespMsg_obj.setADDRESS("");
            CustomerRespMsg_obj.setADDRS_AREA("");
            CustomerRespMsg_obj.setADDRS_BLOCK("");
            CustomerRespMsg_obj.setZIP_CODE("");
            CustomerRespMsg_obj.setGOVERNATE("");
            CustomerRespMsg_obj.setVILLAGE("");
            CustomerRespMsg_obj.setZONE("");
            CustomerRespMsg_obj.setPOSTAL_ADDRS("");
            CustomerRespMsg_obj.setFLOOR("");
            CustomerRespMsg_obj.setDISTRICT("");
            CustomerRespMsg_obj.setDIRECTIONS("");
            CustomerRespMsg_obj.setPAST_DUE("");
            CustomerRespMsg_obj.setUNBILLED("");
            CustomerRespMsg_obj.setBALANCE("");
            CustomerRespMsg_obj.setREGISTERED("");
            CustomerRespMsg_obj.setMOBILEMONEY("");
            String msg = ex.getMessage();
            System.out.print("Faild" + msg);
        }
        //TODO write your implementation code here:

        return CustomerRespMsg_obj;
    }

    public int Check_Permission(String username, String password,
                                String commandId) {
        Connection cn = null;
        Statement stmt = null;
        int msg = 0;
        try {
            int login_resp = Check_Login(username, password);
            if (login_resp == 1) {
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=SERVICES)))",
                             "MDW", "MDW10.10");
                stmt = cn.createStatement();
                String query =
                    "SELECT U.USERID FROM  USERS U INNER JOIN PERMISSIONS P ON U.USERID = P.USERID WHERE " +
                    " U.STATUS = 1 AND  P.STATUS = 1 AND  U.USERID = '" +
                    username + "' " + " AND FUNCTIONNAME = '" + commandId +
                    "' AND  COMMANDID ='" + commandId + "' ";
                msg = stmt.executeUpdate(query);
                System.out.print("Success allow Permission =" + msg);
            } else {
                System.out.print("Sorry Permission Denied=" + msg);
            }
        } catch (SQLException sqlex) {
            String exep_msg = sqlex.getMessage();
            System.out.print("Exception" + exep_msg);
        }
        return msg;
    }

    public int Check_Login(String username, String password) {
        Connection cn = null;
        Statement stmt = null;
        int msg = 0;
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=SERVICES)))",
                             "MDW", "MDW10.10");
            stmt = cn.createStatement();
            String query =
                "SELECT USERID FROM USERS WHERE STATUS = '1' AND USERID='" +
                username + "' AND PASSWORD ='" + password + "' ";
            // System.out.print("login Query" + query);
            msg = stmt.executeUpdate(query);
            System.out.print("Success login =" + msg);
        } catch (SQLException sqlex) {
            String exep_msg = sqlex.getMessage();
            System.out.print("Exception" + exep_msg);
        }
        return msg;
    }

    public CustomerResponseMsg GetConsumerInfo(RequestHDR resultHeader,
                                               String pMSISDN) {
        CustomerResponseMsg CustomerRespMsg_obj = new CustomerResponseMsg();
        Connection cn = null;
        Statement stmt = null;
        String pSubNo;
        pSubNo = pMSISDN;

        ResultSet resultset;
        ResultHDR rslthdr = new ResultHDR();

        /* Get  Permission */
        if (Check_Permission(resultHeader.getUserName(),
                             resultHeader.getPassword(),
                             resultHeader.getCommandId()) == 1) {
            rslthdr.setCommandId(resultHeader.getCommandId());
            rslthdr.setFinalResult(true);
            rslthdr.setResultCode("405000000");
            rslthdr.setResultDesc("Operation successfully.");
            rslthdr.setTransserial(resultHeader.getSerial());
            try {

                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=172.24.8.187)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=TABS)))",
                             "VAS", "VAS");
                stmt = cn.createStatement();
                String query =
                    "SELECT CUI.SUBNO MSISDN, CUI.PREPOST_PAID, CUI.NAME FULLNAME,CASE WHEN CODEVALUE_LANG = 'CONN' THEN 'ACTIVE' ELSE 'NOT_ACTIVE' END STATUS,CASE  WHEN SUBSTR (IMSI_NUMBER, 7, 1) IN ('1', '3') " +
                    " THEN  FN_SPLITRESULT (FN_QUERYCUSTOMER (CUI.SUBNO, '1',  'POST'), 2,'|') ELSE  FN_SPLITRESULT (FN_QUERYCUSTOMER (CUI.SUBNO, '1' , 'PREP'),2 ,'|' ) END  LANG, IDTYPE.CODETEXT_LANG TD_TYPE, CUI.ID_NO, " +
                    " NVL (CA.POSTAL_ADDRS, 'NA') EMAIL, NVL (CA.ZONE, 'NA') CITY,NVL (CA.ADDRESS, 'NA') ADDRESS, NVL (CA.STREET, 'NA') STREET,CASE WHEN  ( (CD.NAME  LIKE '%BATC%' OR CUI.NAME  LIKE '%BATC%') " +
                    " OR (CD.NAME  LIKE '%PATC%' OR CUI.NAME  LIKE '%PATC%') OR (CD.NAME  LIKE 'PRE%' OR CUI.NAME  LIKE 'PRE%') OR (CD.NAME  LIKE '%Batch%' OR CUI.NAME  LIKE '%Batch%') " +
                    " OR (CD.NAME  LIKE '%BATH%' OR CUI.NAME  LIKE '%BATH%') OR (CD.NAME  LIKE '%PATC%' OR CUI.NAME  LIKE '%BATC%') OR (CUI.NAME = '33')) THEN 'N' ELSE 'Y' END REGISTERED, 'N' AS MOBILEMONEY  FROM " +
                    " CRM_USER_INFO CUI INNER JOIN CRM_DEPARTEMENT CD ON CUI.CONTRNO = CD.CONTRNO " +
                    " INNER JOIN CRM_COMMDEVICE CC ON CUI.SUBNO = CC.SUBNO LEFT OUTER JOIN VAS.SEGMENTS S ON CUI.SUBNO = S.MSISDN " +
                    " INNER JOIN SOM_TABS_CODES STC ON CUI.STATUS = STC.CODE INNER JOIN (SELECT CODENAME, CODE, CODETEXT_LANG FROM SOM_TABS_CODES " +
                    " WHERE CODENAME = 'ID_TYPE') IDTYPE ON CUI.ID_TYPE = IDTYPE.CODE LEFT OUTER JOIN " +
                    " (SELECT CA.ADDRESS_ID, CCA.CUST_TYPE, CCA.PREFERED_ADDRESS, " +
                    " CCA.CUST_NO, CA.ADDRESS_TYPE, CA.POST_AREA, CA.PO_BOX, CA.STREET_NO, CA.STREET, CA.BUILD_NO, CA.BUILDING, " +
                    " CA.APARTMENT, CA.ADDRESS, CA.ADDRS_AREA, CA.ADDRS_BLOCK, CA.ZIP_CODE, CA.GOVERNATE, CA.VILLAGE, CA.ZONE, " +
                    " CA.POSTAL_ADDRS, CA.POSTAL_CODE, CA.FLOOR, CA.DISTRICT, CA.DIRECTIONS, CA.LOGNAME, CA.LOGDATE, CA.FLEX_FLD1, " +
                    " CA.FLEX_FLD2, CA.FLEX_FLD3, CA.FLEX_FLD4, CA.FLEX_FLD5 FROM CRM_CUST_ADDRS CCA, CRM_ADDRESS CA  " +
                    " WHERE CCA.ADDRESS_ID = CA.ADDRESS_ID and cca.cust_type = 'CONT') CA ON (CUI.CUST_TYPE = CA.CUST_TYPE AND CUI.CUST_NO = CA.CUST_NO) " +
                    " LEFT OUTER JOIN TABS.CCM_GET_DATA VB ON CUI.SUBNO = VB.SUBNO " +
                    " WHERE STC.CODENAME = 'SUSTAT' AND CUI.SUBNO = '" +
                    pSubNo + "' AND CC.STATUS = 40";
                resultset = stmt.executeQuery(query);
                while (resultset.next()) {
                    String MSISDN = resultset.getString(1);
                    String PREPOST_PAID = resultset.getString(2);
                    String FULLNAME = resultset.getString(3);
                    String STATUS = resultset.getString(4);
                    String LANG = resultset.getString(5);
                    String IDType = resultset.getString(6);
                    String IDNo = resultset.getString(7);
                    String EMAIL = resultset.getString(8);
                    String CITY = resultset.getString(9);
                    String ADDRESS = resultset.getString(10);
                    String STREET = resultset.getString(11);
                    String REGISTERED = resultset.getString(12);
                    String MOBILEMONEY = resultset.getString(13);

                    CustomerRespMsg_obj.setMSISDN(MSISDN);
                    CustomerRespMsg_obj.setPREPOST_PAID(PREPOST_PAID);
                    CustomerRespMsg_obj.setName(FULLNAME);
                    CustomerRespMsg_obj.setStatus(STATUS);
                    CustomerRespMsg_obj.setIDType(IDType);
                    CustomerRespMsg_obj.setIDNo(IDNo);
                    CustomerRespMsg_obj.setSTREET(STREET);
                    CustomerRespMsg_obj.setADDRESS(ADDRESS);
                    CustomerRespMsg_obj.setZONE(CITY);
                    CustomerRespMsg_obj.setPOSTAL_ADDRS(EMAIL);
                    CustomerRespMsg_obj.setLANG(LANG);
                    CustomerRespMsg_obj.setREGISTERED(REGISTERED);
                    CustomerRespMsg_obj.setMOBILEMONEY(MOBILEMONEY);
                    System.out.println("GetConsumerInfo Success Login");
                    //System.out.println(Result_MSG);
                }
                resultset.close();
            } catch (SQLException ex) {
                //   Logger.getLogger(droidws.class.getName()).log(Level.SEVERE, null, ex);
                CustomerRespMsg_obj.setMSISDN("");
                CustomerRespMsg_obj.setPREPOST_PAID("");
                CustomerRespMsg_obj.setTARIFF_PROFILE("");
                CustomerRespMsg_obj.setName("");
                CustomerRespMsg_obj.setStatus("");
                CustomerRespMsg_obj.setIDType("");
                CustomerRespMsg_obj.setIDNo("");
                CustomerRespMsg_obj.setSTREET("");
                CustomerRespMsg_obj.setADDRESS("");
                CustomerRespMsg_obj.setZONE("");
                CustomerRespMsg_obj.setLANG("");
                CustomerRespMsg_obj.setPOSTAL_ADDRS("");
                CustomerRespMsg_obj.setREGISTERED("");
                CustomerRespMsg_obj.setMOBILEMONEY("");
                String msg = ex.getMessage();
                System.out.print("Faild" + msg);
            }
            //TODO write your implementation code here:
        } else {
            System.out.print("Sorry Permission Deined ");
            rslthdr.setResultCode("505000000");
            rslthdr.setResultDesc("Error: Permission Deined.");
            CustomerRespMsg_obj.setResultCode(rslthdr.getResultCode());
            CustomerRespMsg_obj.setResultDesc(rslthdr.getResultDesc());
            String msg = "Sorry Permission Deined";

        }
        return CustomerRespMsg_obj;
    }

    public Customer_Resp PaymentRequest(RequestHDR resultHeader,
                                        Customer_Reqest PayReq) {
        String V_RESPONSE = "";
        Customer_Resp Cust_Resp = new Customer_Resp();
        CustomerResponseMsg CustomerRespMsg_obj = new CustomerResponseMsg();
        Customer_Reqest Pay_Resp;
        Connection cn = null;

        ResultHDR rslthdr = new ResultHDR();

        if (Check_Permission(resultHeader.getUserName(),
                             resultHeader.getPassword(),
                             resultHeader.getCommandId()) == 1) {
            rslthdr.setCommandId(resultHeader.getCommandId());
            rslthdr.setFinalResult(true);
            rslthdr.setResultCode("405000000");
            rslthdr.setResultDesc("Operation successfully.");
            rslthdr.setTransserial(resultHeader.getSerial());
            try {

                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=services-scan.mtn.sd)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=services)))",
                             "BANKING", "BANKING10.10");

                String callspstr =
                    "{call PROC_REQUEST (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
                OracleCallableStatement callStatement = null;
                callStatement =
                        (OracleCallableStatement)cn.prepareCall(callspstr);
                if (resultHeader.getCommandId().equals("BillInquiry")) {
                    callStatement.setString(1, PayReq.getCLIENTCODE());
                    callStatement.setString(2, PayReq.getMSISDN());
                    callStatement.setString(3, "NULL");
                    callStatement.setString(4, PayReq.getREQUESTTYPE());
                    callStatement.setString(5, "NULL");
                    callStatement.setString(6, "NULL");
                    callStatement.setString(7, "NULL");
                    callStatement.setString(8, "NULL");
                    callStatement.setString(9, "NULL");
                    callStatement.setString(10, "NULL");
                    callStatement.setString(11, "NULL");
                    callStatement.setString(12, "NULL");
                    callStatement.setString(13, "NULL");
                    callStatement.setString(14, "NULL");
                    callStatement.setString(15, "NULL");
                } else if (resultHeader.getCommandId().equals("PaymentRequest")) {
                    callStatement.setString(1, PayReq.getCLIENTCODE());
                    callStatement.setString(2, PayReq.getMSISDN());
                    callStatement.setString(3, PayReq.getAMOUNT());
                    callStatement.setString(4, PayReq.getREQUESTTYPE());
                    callStatement.setString(5, PayReq.getREQUESTREF());
                    callStatement.setString(6, PayReq.getREQUESTDATE());
                    callStatement.setString(7, PayReq.getREQUESTCURRENCY());
                    callStatement.setString(8, PayReq.getREQUESTCHANNEL());
                    callStatement.setString(9, PayReq.getREQUESTCHANNELID());
                    callStatement.setString(10, PayReq.getREQUESTLOCATION());
                    callStatement.setString(11, PayReq.getREQUESTPAN());
                    callStatement.setString(12, PayReq.getREQUESTAUTHID());
                    callStatement.setString(13, PayReq.getORDERID());
                    callStatement.setString(14, PayReq.getSESSIONID());
                    callStatement.setString(15, PayReq.getRESPONSE());
                }
                callStatement.registerOutParameter(15, Types.VARCHAR);
                callStatement.executeQuery();

                V_RESPONSE = callStatement.getString(15);

                String Code = Split(V_RESPONSE, "|", 1);
                String ResultCode = Split(V_RESPONSE, "|", 2);
                String ResultDescr = Split(V_RESPONSE, "|", 3);
                String TransSerial = Split(V_RESPONSE, "|", 4);
                String LogStatus = Split(V_RESPONSE, "|", 5);
                String QueryDetails = Split(V_RESPONSE, "|", 6);

                if (resultHeader.getCommandId().equals("BillInquiry")) {
                    String Type = Split(V_RESPONSE, "#", 1);
                    String InvDate = Split(V_RESPONSE, "#", 2);
                    String InvAmount = Split(V_RESPONSE, "#", 3);
                    String PAST_DUE = Split(V_RESPONSE, "#", 4);
                    String UNBILLED = Split(V_RESPONSE, "#", 5);
                    String TOTAL = Split(V_RESPONSE, "#", 6);
                    String Credit = Split(V_RESPONSE, "#", 7);

                    Cust_Resp.setCredit(Credit);
                    Cust_Resp.setInvAmount(InvAmount);
                    Cust_Resp.setInvDate(InvDate);
                    Cust_Resp.setLogStatus(LogStatus);
                    Cust_Resp.setPAST_DUE(PAST_DUE);
                    Cust_Resp.setQueryDetails(QueryDetails);
                    Cust_Resp.setTOTAL(TOTAL);
                    Cust_Resp.setType(Type);
                    Cust_Resp.setUNBILLED(UNBILLED);
                }
                Cust_Resp.setCode(Code);
                Cust_Resp.setResultCode(ResultCode);
                Cust_Resp.setResultDescr(ResultDescr);
                Cust_Resp.setTransSerial(TransSerial);


                System.out.println(V_RESPONSE);
                System.out.println("PROCEDURE REQUEST SUCCESSFULLY");

            } catch (SQLException ex) {
                //   Logger.getLogger(droidws.class.getName()).log(Level.SEVERE, null, ex);
                Cust_Resp.setCode("");
                Cust_Resp.setResultCode("");
                Cust_Resp.setResultDescr("");
                Cust_Resp.setTransSerial("");
                Cust_Resp.setCredit("");
                Cust_Resp.setInvAmount("");
                Cust_Resp.setInvDate("");
                Cust_Resp.setLogStatus("");
                Cust_Resp.setPAST_DUE("");
                Cust_Resp.setQueryDetails("");
                Cust_Resp.setTOTAL("");
                Cust_Resp.setType("");
                Cust_Resp.setUNBILLED("");
                System.out.print("Faild");
            }
            //TODO write your implementation code here:
        } else {
            System.out.print("Sorry Permission Deined ");
            rslthdr.setResultCode("505000000");
            rslthdr.setResultDesc("Error: Permission Deined.");
            CustomerRespMsg_obj.setResultCode(rslthdr.getResultCode());
            CustomerRespMsg_obj.setResultDesc(rslthdr.getResultDesc());
            String msg = "Sorry Permission Deined";
            V_RESPONSE = msg;

        }

        return Cust_Resp;
    }

    public String QueryGSM(RequestHDR resultHeader, QueryGSM QueryReq) {
        String V_RESPONSE = "";
        CustomerResponseMsg CustomerRespMsg_obj = new CustomerResponseMsg();
        QueryGSM Query_Resp = new QueryGSM();
        Connection cn = null;

        ResultHDR rslthdr = new ResultHDR();

        if (Check_Permission(resultHeader.getUserName(),
                             resultHeader.getPassword(),
                             resultHeader.getCommandId()) == 1) {
            rslthdr.setCommandId(resultHeader.getCommandId());
            rslthdr.setFinalResult(true);
            rslthdr.setResultCode("405000000");
            rslthdr.setResultDesc("Operation successfully.");
            rslthdr.setTransserial(resultHeader.getSerial());

            try {

                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=services)))",
                             "BANKING", "BANKING10.10");

                String callspstr = "{?=call FN_QUERYGSM (?)}";
                OracleCallableStatement callStatement = null;
                callStatement =(OracleCallableStatement)cn.prepareCall(callspstr);
                callStatement.registerOutParameter(1, Types.VARCHAR);
                callStatement.setString(2, QueryReq.getMSISDN());
                callStatement.executeQuery();
                V_RESPONSE = callStatement.getString(1);
                System.out.println("PROCEDURE REQUEST SUCCESSFULLY");

            } catch (SQLException ex) {
                //   Logger.getLogger(droidws.class.getName()).log(Level.SEVERE, null, ex);

                System.out.print("Faild");
            }
            //TODO write your implementation code here:
        } else {
            System.out.print("Sorry Permission Deined ");
            rslthdr.setResultCode("505000000");
            rslthdr.setResultDesc("Error: Permission Deined.");
            CustomerRespMsg_obj.setResultCode(rslthdr.getResultCode());
            CustomerRespMsg_obj.setResultDesc(rslthdr.getResultDesc());
            String msg = "Sorry Permission Deined";
            V_RESPONSE = msg;

        }

        return V_RESPONSE;
    }


    public static String Split(String TXT, String SAPARATOR, long WORDNO) {
        int POSITION = 0;
        int COUNTER = 0;
        String TEX = null;
        String RESULT = null;
        TEX = TXT;
        try {
            while (COUNTER < WORDNO) {
                POSITION = TEX.indexOf(SAPARATOR);
                if (COUNTER + 1 == WORDNO) {
                    RESULT = TEX.substring(0, POSITION);
                } else {
                    TEX = TEX.substring(POSITION + 1, TEX.length());
                }
                COUNTER = COUNTER + 1;
            }
        } catch (Exception e) {
            RESULT = null;
        }

        return RESULT;
    }

}

