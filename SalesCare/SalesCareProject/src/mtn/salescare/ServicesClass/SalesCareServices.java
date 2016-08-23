package mtn.salescare.ServicesClass;

import java.io.PrintStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import oracle.jdbc.OracleCallableStatement;

public class SalesCareServices {
    /**
     * Web service operation
     * * This WebMethod to Transfer VTU
     */
    public String transfer_vtu(String sender, String msgstr) {
        /*PROC_VTU_TREE (
    V_SENDER      IN    VARCHAR2,
    V_MSGSTR      IN    VARCHAR2,
    P_SHORTCODE     IN    VARCHAR2,
    V_SOURCE      IN    VARCHAR2,
    V_NODE        IN    VARCHAR2,
    V_SUCCESS       OUT NUMBER,
    V_RESPONSE        OUT VARCHAR2,
    V_SENDER_MSG      OUT VARCHAR2,
    V_GSM           OUT VARCHAR2,
    V_RECEIVER_MSG    OUT VARCHAR2)
    */
        String callspstr = "{call PROC_VTU_TREE (?,?,?,?,?,?,?,?,?,?)}";
        Connection cn = null;
        String V_SENDER_MSG = "";
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=services-scan.mtn.sd)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=services)))",
                             "EVD", "APPEVD");

            //  jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=services-scan.mtn.sd)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=services)))
            // DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=SERVICES)))",

            OracleCallableStatement callStatement = null;
            callStatement = (OracleCallableStatement)cn.prepareCall(callspstr);
            callStatement.setString(1, sender);
            callStatement.setString(2, msgstr);
            callStatement.setString(3, "626");
            callStatement.setString(4, "USSD");
            callStatement.setString(5, "AND");
            callStatement.registerOutParameter(6, Types.INTEGER);
            callStatement.registerOutParameter(7, Types.VARCHAR);
            callStatement.registerOutParameter(8, Types.VARCHAR);
            callStatement.registerOutParameter(9, Types.VARCHAR);
            callStatement.registerOutParameter(10, Types.VARCHAR);

            callStatement.executeQuery();

            String V_SUCCESS = callStatement.getString(6);
            String V_RESPONSE = callStatement.getString(7);
            V_SENDER_MSG = callStatement.getString(8);
            String V_GSM = callStatement.getString(9);
            String V_RECEIVER_MSG = callStatement.getString(10);

            System.out.println(V_RESPONSE);

            System.out.println("PROCEDURE VTU_TREE SUCCESSFULLY");


        } catch (SQLException ex) {
            Logger.getLogger(SalesCareServices.class.getName()).log(Level.SEVERE,
                                                                    null, ex);
        }

        //TODO write your implementation code here:
        return V_SENDER_MSG;
        //TODO write your implementation code here:
    }

    /**
     * Web service operation
     * This WebMethod to Retreive All Children of Father
     */
    public List<Tree> Get_Recievers(String sender) {
        Connection cn = null;
        Statement stmt = null;
        List<Tree> ls = new ArrayList<Tree>();
        ResultSet resultset;
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=SERVICES)))",
                             "TRADERS", "APPTRADERS");
            //DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=SERVICES)))",

            stmt = cn.createStatement();
            //FOR LEVEL 1 AND TOW,
            //String query = "SELECT A.MSISDN FROM TRADER_NUMBERS_DTL A, TRADERS.TRADER_DATA B WHERE A.TID = B.TID AND SUBSTR(A.MSISDN,1,2) IN ('99','92') AND B.DISTID IN(SELECT TID FROM TRADERS.TRADER_DATA WHERE DISTID = (SELECT TID FROM TRADER_NUMBERS_DTL WHERE MSISDN ='"+sender+"'))";
            String query =
                "SELECT A.MSISDN,B.TNAME FROM TRADER_NUMBERS_DTL A, TRADERS.TRADER_DATA B WHERE A.TID = B.TID AND SUBSTR(A.MSISDN,1,2) IN ('99','92') AND B.DISTID IN(SELECT TID FROM TRADERS.TRADER_DATA WHERE TID = (SELECT TID FROM TRADER_NUMBERS_DTL WHERE MSISDN ='" +
                sender + "'))";
            resultset = stmt.executeQuery(query);
            while (resultset.next()) {
                Tree treeObj = new Tree();
                String str = resultset.getString(1);
                String strName = resultset.getString(2);
                treeObj.setMSISDN(str);
                //trObj.setName(strName);

                // System.out.print(V_str);
                //ls.add(str2);
                ls.add(treeObj);
                treeObj = null;

                //System.out.println(""+rs2.getInt("user_id")+"\t"+rs2.getString("MSISDN"));
            }
            // close ResultSet rs
            resultset.close();

        } catch (SQLException ex) {
            Logger.getLogger(SalesCareServices.class.getName()).log(Level.SEVERE,
                                                                    null, ex);
        }
        return ls;
    }


    /**
     * Web service operation
     * This WebMethod to Retreive Report for VTU Transfer
     */
    public List<Resultset> Get_RecieversReport(String sender, String fromdate,
                                               String top) {
        //TODO write your implementation code here:
        Connection cn = null;
        Statement stmt = null;
        List<Resultset> resultsetList = new ArrayList<Resultset>();
        ResultSet resultset;
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=SERVICES)))",
                             "EVD", "APPEVD");
            //DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=services-scan.mtn.sd)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=services)))",

            // DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=SERVICES)))",

            stmt = cn.createStatement();
            String query =
                "SELECT MSISDN,CREDIT,SUM(CASE FLAG WHEN 'RECEIVER' THEN RECIVERAMNT ELSE 0 END) RECIVERAMNT,SUM(CASE FLAG WHEN 'SENDER' THEN SENDERAMNT ELSE 0 END) SENDERAMNT FROM VW_ALL_TRANS WHERE DISTMSISDN='" +
                sender + "' AND TRANSDATE BETWEEN " + fromdate +
                " AND SYSDATE GROUP BY  MSISDN,CREDIT";
            resultset = stmt.executeQuery(query);

            while (resultset.next()) {

                Resultset obj = new Resultset();
                String MSISDN_str = resultset.getString(1);
                String CREDIT_str = resultset.getString(2);
                String SENDERAOUMNT_str = resultset.getString(3);
                String RECEIVERAMOUNT_str = resultset.getString(4);
                //String str2 = rs2.getString(2);
                obj.setMSISDN(MSISDN_str);
                obj.setCREDIT(CREDIT_str);
                obj.setSENDERAMNT(SENDERAOUMNT_str);
                obj.setRECEIVERAMNT(RECEIVERAMOUNT_str);
                //ls.add(str2);
                resultsetList.add(obj);
                obj = null;
                //System.out.println(""+rs2.getInt("user_id")+"\t"+rs2.getString("MSISDN"));
            }
            // close ResultSet rs
            resultset.close();
        } catch (SQLException ex) {
            // Logger.getLogger(droidws.class.getName()).log(Level.SEVERE, null, ex);
        }
        //TODO write your implementation code here:
        return resultsetList;
    }

    /**
     * Web service operation  Purchasing Electricity
     */
    public Electricity purchase_elec(String msisdn, String txt) {
        String callspstr = "{call PROC_PURCHACE_ELECRTICITY (?,?,?,?)}";
        Connection cn = null;
        Electricity objct = new Electricity();
        /*Electricity Parameters*/
        String MSG;
        String RESULTCODE;
        String E_Result;

        try {

            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=services-scan.mtn.sd)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=services)))",
                             "ELECTRICITY", "ELECTRICITY10.10");
            //DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=services-scan.mtn.sd)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=services)))",

            // DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=SERVICES)))",

            OracleCallableStatement callStatement = null;

            callStatement = (OracleCallableStatement)cn.prepareCall(callspstr);

            callStatement.setString(1, msisdn);
            callStatement.setString(2, txt);

            callStatement.registerOutParameter(3, Types.VARCHAR);
            callStatement.registerOutParameter(4, Types.VARCHAR);

            callStatement.executeQuery();
            //String subno=callStatement.getString(1);
            //String txt1=callStatement.getString(2);
            MSG = callStatement.getString(3);
            RESULTCODE = callStatement.getString(4);

            // E_Result = E_MSG +"|"+ E_RESULTCODE;
            /*  if (E_RESULTCODE.equals(null)||E_RESULTCODE.isEmpty() || E_RESULTCODE.equals("") ){
                    E_RESULTCODE="000000";
             }*/
            objct.setResultCode(RESULTCODE);
            // 505000000 success
            objct.setMsg(MSG);
            /* System.out.println(E_MSG);
             System.out.println(E_RESULTCODE);
             System.out.println("PROCEDURE SUCCESSFULLY");*/
        } catch (SQLException ex) {
            Logger.getLogger(SalesCareServices.class.getName()).log(Level.SEVERE,
                                                                    null, ex);
        }
        //TODO write your implementation code here:
        return objct;
        // return E_RESULTCODE;
    }

    /**
     * Web service operation
     * * This WebMethod to Activate SIM
     */
    public String sim_activation(String sender, String subno, String puk) {
        /*
    PROC_ACTIVATE (
    V_SUBNO 1   IN   VARCHAR2,
    V_SENDER  2   IN   VARCHAR2,
    V_CARDNO_PUK 3  IN   VARCHAR2,
    V_STR   4   IN   VARCHAR2,
    V_SRC   5   IN   VARCHAR2,
    V_NODE  6   IN   VARCHAR2,
        V_CELLID  IN      VARCHAR2,
              V_LACID  IN      VARCHAR2,
    O_RESULTCODE  7 OUT VARCHAR2,
    O_RESULTDESC  8 OUT VARCHAR2,)
    */
        Connection cn = null;
        String RESPONSE = "";
        if (subno.length() == 9) {
            String callspstr = "{call PROC_ACTIVATE(?,?,?,?,?,?,?,?,?,?)}";

            try {

                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=services-scan.mtn.sd)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=services)))",
                             "ACTIVATION", "APPACTIVATION");
                //DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=services-scan.mtn.sd)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=services)))",

                //  DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=SERVICES)))",
                OracleCallableStatement callStatement = null;
                callStatement =
                        (OracleCallableStatement)cn.prepareCall(callspstr);
                callStatement.setString(1, subno);
                callStatement.setString(2, sender);
                callStatement.setString(3, puk);
                callStatement.setString(4, subno + "*" + puk);
                callStatement.setString(5, "USSD");

                callStatement.setString(6, "AND");
                callStatement.setString(7, "");
                callStatement.setString(8, "");

                callStatement.registerOutParameter(9, Types.VARCHAR);
                callStatement.registerOutParameter(10, Types.VARCHAR);
                callStatement.execute();
                String RESULTCODE = callStatement.getString(9);
                RESPONSE = callStatement.getString(10);
                System.out.println("PROCEDURE ACT SUCCESSFULLY");

            } catch (SQLException ex) {
                //Logger.getLogger(salesws.class.getName()).log(Level.SEVERE, null, ex);

                RESPONSE = ex.getMessage();
                // return ex.getMessage();
            }
        } else {
            RESPONSE = "Sub No should be 9 digits";
        }
        //TODO write your implementation code here:
        return RESPONSE;
    }


    public int Get_TP_PERMISSION(String username, String password)
    {
        Connection cn = null;
        Statement stmt = null;
        int msg = 0;
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            cn = DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=SERVICES)))",
                             "TRADERS", "APPTRADERS");              
            stmt = cn.createStatement();
            String query =
                "SELECT USERNAME FROM TP_USERS WHERE STATUS = '1' AND USERNAME='" +
                username +"' AND PASSWORD ='" + password + "' ";
            // System.out.print("login Query" + query);
            msg = stmt.executeUpdate(query);
            System.out.print("login TP=" + msg);
        } catch (SQLException sqlex) {
         String exep_msg= sqlex.getMessage();
         System.out.printf("Exception" + exep_msg);
        }
        return msg;
    }

    //

    /**
     * Web service operation
     * * This WebMethod to get All MSISDN and PIN
     */
    public Services Get_PERMISSION(String imsi, String pin) {

        Services ServicesResult = new Services();
        String fn_result = validate_POS(imsi, pin);
        Services obj = new Services();
        if (fn_result.equals("1")) {
            //TODO write your implementation code here:
            Connection cn = null;
            Statement stmt = null;
            /* Get PIN and MSISDN Through IMSI*/
            ResultSet resultset;
            try {
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

                cn =
 DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=services-scan.mtn.sd)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=services)))",
                             "TRADERS", "APPTRADERS");
                //=================================   The Last Connection 172.17.10.54

                /* cn =  DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=services)))",
                                                         "TRADERS", "APPTRADERS");*/
                //=================================================================
                stmt = cn.createStatement();
                /*  String query =
                    "SELECT S.IMSI_NUMBER," + "S.MSISDN," + "S.PIN," +
                    "S.TID," + "S.loginSTATUS," +
                    "NVL (ACT.ACTIVATION, 0) ACTIVATION," +
                    "NVL (V.VTU, 0) VTU," + "NVL (ELEC.ELEC, 1) ELEC," +
                    "NVL (DATAREG.DATAREG, 1) DATAREG" +
                    " FROM (SELECT B.IMSI_NUMBER," + "B.STATUS," +
                    "A.MSISDN," + "A.PIN," + "A.TID," +
                    "'success' loginSTATUS  " +
                    "FROM    TRADER_NUMBERS_DTL A " + "INNER JOIN " +
                    "CRM_COMMDEVICE@TABS B " +
                    "ON A.MSISDN = B.SUBNO AND B.STATUS = 40  AND B.IMSI_NUMBER = '" +
                    imsi + "' ) S    " +
                    "LEFT OUTER JOIN (SELECT TID, 1 ACTIVATION        " +
                    "FROM TRADER_SERVICES_DTL   " +
                    "WHERE SERVICEID = 2) ACT    " +
                    "ON S.TID = ACT.TID                             " +
                    "LEFT OUTER JOIN (SELECT TID, 1 VTU  " +
                    "FROM TRADER_SERVICES_DTL        " +
                    "WHERE SERVICEID = 5) V          " +
                    "ON S.TID = V.TID                   " +
                    "LEFT OUTER JOIN (SELECT TID, 1 ELEC      " +
                    "FROM TRADER_SERVICES_DTL  " +
                    "WHERE SERVICEID = 20) ELEC  " + "ON S.TID = ELEC.TID   " +
                    "LEFT OUTER JOIN (SELECT TID, 1 DATAREG          " +
                    "FROM TRADER_SERVICES_DTL     " +
                    "WHERE SERVICEID = 15) DATAREG   " +
                    "ON S.TID = DATAREG.TID ";-*/
                String query =
                    "SELECT IMSI_NUMBER,MSISDN,PIN,TID,LOGINSTATUS,TYPEID,TYEPENAME,ACTIVATION,VTU,ELEC,DATAREG  FROM vw_get_permissions WHERE IMSI_NUMBER = '" +
                    imsi + "'  AND PIN='" + pin + "'";
                resultset = stmt.executeQuery(query);
                while (resultset.next()) {

                    String IMSI = resultset.getString(1);
                    String MSISDN = resultset.getString(2);
                    String PIN = resultset.getString(3);
                    int TID = resultset.getInt(4);
                    String LOGINSTATUS = resultset.getString(5);
                    int TYPEID = resultset.getInt(6);
                    String TYEPENAME = resultset.getString(7);
                    int ACT = resultset.getInt(8);
                    int VTU = resultset.getInt(9);
                    int ELEC = resultset.getInt(10);
                    int DATAREG = resultset.getInt(11);

                    obj.setIMSI(IMSI);
                    obj.setMSISDN(MSISDN);
                    obj.setPIN(PIN);
                    obj.setTID(TID);
                    obj.setLOGINSTATUS(LOGINSTATUS);
                    obj.setVTU(VTU);
                    obj.setTYPEID(TYPEID);
                    obj.setTYEPENAME(TYEPENAME);
                    obj.setDATAREG(DATAREG);
                    obj.setACT(ACT);
                    obj.setELEC(ELEC);
                    obj.setMsg("Login Successfully");

                    // obj = null;
                    System.out.println(fn_result);
                    //System.out.println(Result_MSG);
                }
                // close ResultSet rs
                resultset.close();
            } catch (SQLException ex) {
                // Logger.getLogger(droidws.class.getName()).log(Level.SEVERE, null, ex);
                obj.setIMSI("");
                obj.setMSISDN("");
                obj.setPIN("");
                obj.setTID(0);
                obj.setLOGINSTATUS("");
                obj.setVTU(0);
                obj.setTYPEID(0);
                obj.setTYEPENAME("");
                obj.setDATAREG(0);
                obj.setACT(0);
                obj.setELEC(0);
                obj.setMsg(ex.getMessage());
            }
            //TODO write your implementation code here:
        } else {
            obj.setIMSI("");
            obj.setMSISDN("");
            obj.setPIN("");
            obj.setTID(0);
            obj.setLOGINSTATUS("");
            obj.setVTU(0);
            obj.setTYPEID(0);
            obj.setTYEPENAME("");
            obj.setDATAREG(0);
            obj.setACT(0);
            obj.setELEC(0);
            obj.setMsg(fn_result);
        }
        return obj;
    }

    /**
     * Web service operation
     * * This WebMethod to Validate POS
     */
    public String validate_POS(String p_imsi, String p_pin) {
        ///if length =4
        if (p_pin.length() == 4) {
            String callFun = "{? = call FN_PIN_VALIDATION (?,?)}";
            Connection cn = null;
            String Result_MSG = "";
            try {
                //=================================   The Last Connection 172.17.10.54
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            cn = DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521))(CONNECT_DATA=(INSTANCE_NAME=services2)(SERVER=dedicated)(SERVICE_NAME=services)))",
                         "TRADERS", "APPTRADERS");
            //DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(ADDRESS=(PROTOCOL=TCP)(HOST=services-scan.mtn.sd)(PORT=1521))(CONNECT_DATA=(SERVER=dedicated)(SERVICE_NAME=services)))",
            // DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_
            // =(ADDRESS=(PROTOCOL=TCP)(HOST=services01-vip.mtn.sd)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=services02-vip.mtn.sd)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic))(SERVER=dedicated)(SERVICE_NAME=SERVICES)))",
            OracleCallableStatement callStatement = null;
            callStatement = (OracleCallableStatement)cn.prepareCall(callFun);
            callStatement.registerOutParameter(1, Types.VARCHAR);
            callStatement.setString(2, p_imsi);
            callStatement.setString(3, p_pin);
            callStatement.executeQuery();
            Result_MSG = callStatement.getString(1);
            System.out.println(Result_MSG);
            System.out.println("Funcution called SUCCESSFULLY");

            } catch (SQLException ex) {
                Logger.getLogger(SalesCareServices.class.getName()).log(Level.SEVERE,
                                                                        null,
                                                                        ex);
                System.out.println(ex.getMessage());
            }
            //TODO write your implementation code here:
            return Result_MSG;
        } else {
            String Result_MSG = "PIN should be 4 digits";
            return Result_MSG;
        }
    }

}
