package sd.mtn.BusinessLogic;


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import java.lang.Object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.lang.instrument.Instrumentation;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import javax.net.ssl.HttpsURLConnection;

import java.net.URL;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.net.ssl.SSLSession;


import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jettison.json.JSONException;


import org.codehaus.jettison.json.JSONObject;

import org.opensaml.XML;

import sd.mtn.Data.HttpsStarter;
import sd.mtn.Data.ICash_getBill_Response;
import sd.mtn.Data.ICash_getBill_Request;
import sd.mtn.Data.ICash_IsAlive_Response;
import sd.mtn.Data.ICash_IsAlive_Request;
import sd.mtn.Data.ICash_IsAlive_ResponseMsg;
import sd.mtn.Data.ICash_getPayeesList_Response;
import sd.mtn.Data.ICash_getPayeesList_Request;
import sd.mtn.Data.ICash_payment_Response;
import sd.mtn.Data.ICash_payment_Request;
import sd.mtn.Data.ICash_register_Request;
import sd.mtn.Data.ICash_reverse_Response;
import sd.mtn.Data.ICash_reverse_Request;
import sd.mtn.Data.ICash_doCardTransfer_Response;
import sd.mtn.Data.ICash_doCardTransfer_Request;
import sd.mtn.Data.ICash_getBalance_Request;
import sd.mtn.Data.ICash_getBalance_Response;
import sd.mtn.Data.ICash_getPublicKey_Response;
import sd.mtn.Data.ICash_getPublicKey_Request;
import sd.mtn.Data.ICash_register_Response;
import sd.mtn.Data.ICash_XML_CUST;


//import weblogic.net.http.HttpsURLConnection;

import sd.mtn.Data.RequestHDR;

import sd.mtn.Data.ResultHDR;

import weblogic.security.SSL.HostnameVerifier;

import weblogic.xml.saaj.util.IOUtils;

public class ICash_APIs {

    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
     
              String Date = dateFormat.format(date).toString();



    static {
        //for localhost testing only
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(new javax.net.ssl.HostnameVerifier() {

                @Override
                public boolean verify(String hostname,
                                      javax.net.ssl.SSLSession sslSession) {
                    if (hostname.equals("172.16.198.12")) {
                        return true;
                    }
                    return false;
                }
            });
    }


    public ICash_IsAlive_Response ICash_IsAlive2(RequestHDR requestheader,
                                                 ICash_IsAlive_Request IsAlv) {
        ICash_IsAlive_Response IsAlv_resp = new ICash_IsAlive_Response();
        ResultHDR rslthdr = new ResultHDR();
        String Result;
        /* Get  Permission */
        if (Check_Permission(requestheader.getUserName(),
                             requestheader.getPassword(),
                             requestheader.getCommandId()) == 1) {
            rslthdr.setCommandId(requestheader.getCommandId());
            rslthdr.setFinalResult(true);
            rslthdr.setResultCode("405000000");
            rslthdr.setResultDesc("Operation successfully.");
            rslthdr.setTransserial(requestheader.getSerial());


            ICash_XML_CUST xml = new ICash_XML_CUST();
            JSONObject json = new JSONObject();
            String output = null;
            try {
                json.put("applicationId", IsAlv.getapplicationid());
                json.put("tranDateTime", IsAlv.gettranDateTimed());
                json.put("UUID", IsAlv.getUUID());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String input = json.toString();

            System.out.println("************ICash_IsAlive:");
            System.out.println(input);
           
           //log to txt file  
          log("########################################REQUEST:ISALIVE" + Date);
          log(input);
          
          
            StringBuilder sb = new StringBuilder();
            try {
                HttpsStarter htt = new HttpsStarter();
                java.net.URL url =
                    new URL(null, "https://172.16.198.12:8877/QAConsumer/isAlive",
                            new sun.net.www.protocol.https.Handler());
                HttpsURLConnection conn =
                    (HttpsURLConnection)url.openConnection();
                conn.setAllowUserInteraction(true);
                conn.setSSLSocketFactory(HttpsStarter.getFactory());
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");

                //conn = (HttpsURLConnection) url.openConnection();
                OutputStream os = conn.getOutputStream();
                os.write(input.getBytes());
                os.flush();
                /* String jsonData = IOUtils.toString(is);
             * XMLSerializer serializer = new XMLSerializer();
             * JSON json = JSONSerializer.toJSON( jsonData );
             * String xml = serializer.write( json );
             * System.out.println(xml); */

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : " +
                                               conn.getResponseCode());
                }
                BufferedReader br =
                    new BufferedReader(new InputStreamReader((conn.getInputStream())));

                System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    System.out.println(output);
                    sb.append(output);


                }
                conn.disconnect();

            } catch (MalformedURLException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            } catch (KeyStoreException e) {
            } catch (NoSuchAlgorithmException e) {
            } catch (CertificateException e) {
            } catch (UnrecoverableKeyException e) {
            } catch (KeyManagementException e) {
            }


            String resp = sb.toString();
          
          //log to txt file  
          log("########################################RESPONSE:ISALIVE"+ Date);
          log(resp);
            
            
            JSONObject jsonObj = null;


            try {
                jsonObj = new JSONObject(resp);
                System.out.println(xml.toString(jsonObj));
            } catch (JSONException e) {
            }


            try {
                IsAlv_resp.setResponse(xml.toString(jsonObj));
            } catch (JSONException e) {
            }
            return IsAlv_resp;
        } else {
            System.out.print("Sorry Permission Deined ");
            rslthdr.setResultCode("505000000");
            rslthdr.setResultDesc("Error: Permission Deined.");
            String msg = "Sorry Permission Deined";
            Result = msg;
        }

        IsAlv_resp.setResponse("Sorry Permission Deined ...! ");
        System.out.print(IsAlv_resp.toString());
        return IsAlv_resp;

    }

    public ICash_IsAlive_Response ICash_IsAlive(RequestHDR requestheader,
                                                ICash_IsAlive_Request IsAlv) {
        ICash_IsAlive_Response IsAlv_resp = new ICash_IsAlive_Response();
        ResultHDR rslthdr = new ResultHDR();
        String Result;
        /* Get  Permission   Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() )*/
        if (1 == 1) {
            rslthdr.setCommandId(requestheader.getCommandId());
            // rslthdr.setFinalResult(true);
            // rslthdr.setResultCode("405000000");
            // rslthdr.setResultDesc("Operation successfully.");
            //rslthdr.setTransserial(requestheader.getSerial());

            JSONObject json = new JSONObject();
            String output = null;
            try {
                json.put("applicationId", IsAlv.getapplicationid());
                json.put("tranDateTime", IsAlv.gettranDateTimed());
                json.put("UUID", IsAlv.getUUID());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String input = json.toString();

            System.out.println("************ICash_IsAlive:");
            System.out.println(input);
          //log to txt file  
          log("########################################REQUEST:ISALIVE"+ Date);
          log(input);
          


            StringBuilder sb = new StringBuilder();
            try {
                HttpsStarter htt = new HttpsStarter();
                java.net.URL url =
                    new URL(null, "https://172.16.198.12:8877/QAConsumer/isAlive",
                            new sun.net.www.protocol.https.Handler());
                HttpsURLConnection conn =
                    (HttpsURLConnection)url.openConnection();
                conn.setAllowUserInteraction(true);
                conn.setSSLSocketFactory(HttpsStarter.getFactory());
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");

                //conn = (HttpsURLConnection) url.openConnection();
                OutputStream os = conn.getOutputStream();
                os.write(input.getBytes());
                os.flush();


                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : " +
                                               conn.getResponseCode() + "  " +
                                               conn.getResponseMessage());
                }
                BufferedReader br =
                    new BufferedReader(new InputStreamReader((conn.getInputStream())));

                System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    System.out.println(output);
                    sb.append(output);


                }
                conn.disconnect();

            } catch (MalformedURLException e) {
                System.out.print("Connection Error ");
                IsAlv_resp.setresponseCode(e.getMessage());
                IsAlv_resp.setresponseMessage(e.getMessage());
                IsAlv_resp.setresponseStatus("Failed");

                // e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            } catch (KeyStoreException e) {
            } catch (NoSuchAlgorithmException e) {
            } catch (CertificateException e) {
            } catch (UnrecoverableKeyException e) {
            } catch (KeyManagementException e) {
            }


            String resp = sb.toString();
          //log to txt file  
          log("########################################RESPONSE:ISALIVE"+ Date);
          log(resp);
          
            JSONObject jsonObj = null;


            try {
                jsonObj = new JSONObject(resp);
                IsAlv_resp.setresponseMessage(jsonObj.getString("responseMessage"));
                System.out.println(IsAlv_resp.getresponseMessage());

                IsAlv_resp.setresponseCode(jsonObj.getString("responseCode"));
                System.out.println(IsAlv_resp.getresponseCode());

                IsAlv_resp.setresponseStatus(jsonObj.getString("responseStatus"));
                System.out.println(IsAlv_resp.getresponseStatus());

                IsAlv_resp.setapplicationid(jsonObj.getString("applicationId"));
                System.out.println(IsAlv_resp.getapplicationid());

                IsAlv_resp.setUUID(jsonObj.getString("UUID"));
                System.out.println(IsAlv_resp.getUUID());

                IsAlv_resp.settranDateTime(jsonObj.getString("tranDateTime"));
                System.out.println(IsAlv_resp.gettranDateTimed());
            } catch (JSONException e) {
            }


            return IsAlv_resp;
        } else {
            System.out.print("Sorry Permission Deined ");
            IsAlv_resp.setresponseCode("505000000");
            IsAlv_resp.setresponseMessage("Error: Permission Deined.");
            IsAlv_resp.setresponseStatus("Failed");

        }
        return IsAlv_resp;
    }

    public ICash_getBill_Response ICash_getBill(RequestHDR requestheader,
                                                ICash_getBill_Request B_Iuq) {

        ICash_getBill_Response getBill_resp = new ICash_getBill_Response();
        ResultHDR rslthdr = new ResultHDR();
        String Result;
        ICash_XML_CUST xml = new ICash_XML_CUST();
        /* Get  Permission */
        if (1 == 1) {
            rslthdr.setCommandId(requestheader.getCommandId());
            // rslthdr.setFinalResult(true);
            //rslthdr.setResultCode("405000000");
            //rslthdr.setResultDesc("Operation successfully.");
            //rslthdr.setTransserial(requestheader.getSerial());


            String output = null;


            JSONObject json = new JSONObject();

            try {
                json.put("applicationId", B_Iuq.getapplicationid());
                json.put("tranDateTime", B_Iuq.gettranDateTimed());
                json.put("UUID", B_Iuq.getUUID());
                json.put("userName", B_Iuq.getuserName());
                json.put("userPassword", B_Iuq.getuserPassword());
                json.put("entityId", B_Iuq.getentityId());
                json.put("entityType", B_Iuq.getentityType());
                json.put("PAN", B_Iuq.getPAN());
                json.put("IPIN", B_Iuq.getIPIN());
                json.put("payeeId", B_Iuq.getpayeeId());
                json.put("paymentInfo", B_Iuq.getpaymentInfo());
                json.put("authenticationType", B_Iuq.getauthenticationType());
                json.put("mbr", B_Iuq.getmbr());
                json.put("expDate", B_Iuq.getexpDate());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String input = json.toString();
            System.out.println("************ICash_getBill:");
            System.out.println(input);
          //log to txt file  
          log("########################################REQUEST:ICash_getBill"+ Date);
          log(input);

            URL url;
            StringBuilder sb = new StringBuilder();

            try {
                HttpsStarter htt = new HttpsStarter();
                url =
new URL(null, "https://172.16.198.12:8877/QAConsumer/getBill",
        new sun.net.www.protocol.https.Handler());
                HttpsURLConnection conn =
                    (HttpsURLConnection)url.openConnection();
                conn.setAllowUserInteraction(true);
                conn.setSSLSocketFactory(HttpsStarter.getFactory());
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                OutputStream os = conn.getOutputStream();
                os.write(input.getBytes());
                os.flush();

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : " +
                                               conn.getResponseCode());
                }

                BufferedReader br =
                    new BufferedReader(new InputStreamReader((conn.getInputStream())));


                System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    System.out.println(output);
                    sb.append(output);


                }

                conn.disconnect();

            } catch (MalformedURLException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            } catch (KeyStoreException e) {
            } catch (NoSuchAlgorithmException e) {
            } catch (CertificateException e) {
            } catch (UnrecoverableKeyException e) {
            } catch (KeyManagementException e) {
            }


            String resp = sb.toString();
          //log to txt file  
          log("########################################RESPONSE:ICash_getBill"+ Date);
          log(resp);
            JSONObject jsonObj = null;

            try {
                jsonObj = new JSONObject(resp);
                getBill_resp.setresponseMessage(jsonObj.getString("responseMessage"));
                System.out.println(getBill_resp.getresponseMessage());

                getBill_resp.setresponseCode(jsonObj.getString("responseCode"));
                System.out.println(getBill_resp.getresponseCode());

                getBill_resp.setresponseStatus(jsonObj.getString("responseStatus"));
                System.out.println(getBill_resp.getresponseStatus());

                getBill_resp.setapplicationid(jsonObj.getString("applicationId"));
                System.out.println(getBill_resp.getapplicationid());

                getBill_resp.setUUID(jsonObj.getString("UUID"));
                System.out.println(getBill_resp.getUUID());

                getBill_resp.settranDateTime(jsonObj.getString("tranDateTime"));

                getBill_resp.setIPIN(jsonObj.getString("IPIN"));
                getBill_resp.setPAN(jsonObj.getString("PIN"));
                getBill_resp.setacqTranFee(jsonObj.getString("acqTranFee"));
                getBill_resp.setauthenticationType(jsonObj.getString("authenticationType"));
                getBill_resp.setbalance(jsonObj.getString("balance"));
                getBill_resp.setbillInfo(jsonObj.getString("billInfo"));
                getBill_resp.setentityId(jsonObj.getString("entityId"));
                getBill_resp.setentityType(jsonObj.getString("entityType"));
                getBill_resp.setexpDate(jsonObj.getString("expDate"));
                getBill_resp.setissuerTranFee(jsonObj.getString("issuerTranFee"));
                getBill_resp.setmbr(jsonObj.getString("mbr"));
                getBill_resp.setpayeeId(jsonObj.getString("payeeId"));
                getBill_resp.setuserPassword(jsonObj.getString("userPassword"));
                getBill_resp.setuserName(jsonObj.getString("userName"));


                System.out.println(getBill_resp.gettranDateTimed());
            } catch (JSONException e) {
            }


            return getBill_resp;
        } else {
            System.out.print("Sorry Permission Deined ");
            getBill_resp.setresponseCode("505000000");
            getBill_resp.setresponseMessage("Error: Permission Deined.");
            getBill_resp.setresponseStatus("Failed");

        }


        return getBill_resp;

    }


    public ICash_register_Response ICash_register(RequestHDR requestheader,
                                                  ICash_register_Request RegRqst) {

        ICash_register_Response Reg_resp = new ICash_register_Response();

        ResultHDR rslthdr = new ResultHDR();
        String Result;
        /* Get  Permission */
        if (1 == 1) {
            rslthdr.setCommandId(requestheader.getCommandId());
            // rslthdr.setFinalResult(true);
            //rslthdr.setResultCode("405000000");
            //rslthdr.setResultDesc("Operation successfully.");
            //rslthdr.setTransserial(requestheader.getSerial());


            ICash_XML_CUST xml = new ICash_XML_CUST();

            String output = null;
            /* String input1 =
            "?applicationId=" + RegRqst.getapplicationid() + "&tranDateTime=" +
            RegRqst.gettranDateTimed() + "&UUID=" + RegRqst.getUUID() +
            "&userName" + RegRqst.getuserName() + "&userPassword" +
            RegRqst.getuserPassword() + "&entityId" + RegRqst.getentityId() +
            "&entityType" + RegRqst.getentityType() + "&PAN" +
            RegRqst.getPAN() + "&IPIN" + RegRqst.getIPIN() + "&mbr" +
            RegRqst.getmbr() + "&extraInfo" + RegRqst.getextraInfo() +
            "&panCategory" + RegRqst.getpanCategory() + "&registrationType" +
            RegRqst.getregistrationType() + "&entityGroup" +
            RegRqst.getentityGroup() + "&phoneNo" + RegRqst.getphoneNo() +
            "&Email" + RegRqst.getEmail() + "&financialInstitutionId" +
            RegRqst.getfinancialInstitutionId() + "";*/

            JSONObject json = new JSONObject();
            try {
                json.put("applicationId", RegRqst.getapplicationid());
                json.put("tranDateTime", RegRqst.gettranDateTimed());
                json.put("UUID", RegRqst.getUUID());
                json.put("userName", RegRqst.getuserName());
                json.put("userPassword", RegRqst.getuserPassword());
                json.put("entityId", RegRqst.getentityId());
                json.put("entityType", RegRqst.getentityType());
                json.put("PAN", RegRqst.getPAN());
                json.put("IPIN", RegRqst.getIPIN());
                json.put("mbr", RegRqst.getmbr());
                json.put("expDate", RegRqst.getexpDate());
                json.put("extraInfo", RegRqst.getextraInfo());
                json.put("panCategory", RegRqst.getpanCategory());
                json.put("registrationType", RegRqst.getregistrationType());
                json.put("entityGroup", RegRqst.getentityGroup());
                json.put("phoneNo", RegRqst.getphoneNo());
                json.put("email", RegRqst.getEmail());
                json.put("fullName", RegRqst.getfullName());
                json.put("customerIdNumber", RegRqst.getcustomerIdNumber());
                json.put("customerIdType", RegRqst.getcustomerIdType());
                json.put("bankAccountNumber", RegRqst.getbankAccountNumber());
                json.put("bankAccountType", RegRqst.getbankAccountType());
                json.put("bankBranchId", RegRqst.getbankBranchId());
                json.put("bankId", RegRqst.getbankId());
                json.put("dateOfBirth", RegRqst.getdateOfBirth());
                json.put("job", RegRqst.getjob());
                //  json.put("financialInstitutionId", RegRqst.getfinancialInstitutionId());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String input = json.toString();
            System.out.println("************ICash_reg**************:");
            System.out.println(input);
          //log to txt file  
          log("########################################REQUEST:ICash_reg"+ Date);
          log(input);
          
            URL url;
            StringBuilder sb = new StringBuilder();

            try {
                HttpsStarter htt = new HttpsStarter();
                url =
new URL(null, "https://172.16.198.12:8877/QAConsumer/register",
        new sun.net.www.protocol.https.Handler());
                HttpsURLConnection conn =
                    (HttpsURLConnection)url.openConnection();
                conn.setAllowUserInteraction(true);
                conn.setSSLSocketFactory(HttpsStarter.getFactory());
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                OutputStream os = conn.getOutputStream();
                os.write(input.getBytes());
                os.flush();

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : " +
                                               conn.getResponseCode());
                }

                BufferedReader br =
                    new BufferedReader(new InputStreamReader((conn.getInputStream())));


                System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    System.out.println(output);
                    sb.append(output);


                }

                conn.disconnect();

            } catch (MalformedURLException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            } catch (KeyStoreException e) {
            } catch (NoSuchAlgorithmException e) {
            } catch (CertificateException e) {
            } catch (UnrecoverableKeyException e) {
            } catch (KeyManagementException e) {
            }


            String resp = sb.toString();
          //log to txt file  
          log("########################################RESPONSE:ICash_reg"+ Date);
          log(resp);
            
            JSONObject jsonObj = null;


            try {
                jsonObj = new JSONObject(resp);
                Reg_resp.setresponseMessage(jsonObj.getString("responseMessage"));
                System.out.println(Reg_resp.getresponseMessage());

                Reg_resp.setresponseCode(jsonObj.getString("responseCode"));
                System.out.println(Reg_resp.getresponseCode());

                Reg_resp.setresponseStatus(jsonObj.getString("responseStatus"));
                System.out.println(Reg_resp.getresponseStatus());

                Reg_resp.setapplicationid(jsonObj.getString("applicationId"));
                System.out.println(Reg_resp.getapplicationid());

                Reg_resp.setUUID(jsonObj.getString("UUID"));
                System.out.println(Reg_resp.getUUID());

                Reg_resp.settranDateTime(jsonObj.getString("tranDateTime"));

                Reg_resp.setIPIN(jsonObj.getString("IPIN"));
                Reg_resp.setPAN(jsonObj.getString("PAN"));

                Reg_resp.setentityId(jsonObj.getString("entityId"));
                Reg_resp.setentityType(jsonObj.getString("entityType"));

                Reg_resp.setmbr(jsonObj.getString("mbr"));

                Reg_resp.setuserPassword(jsonObj.getString("userPassword"));
                Reg_resp.setuserName(jsonObj.getString("userName"));

                Reg_resp.setemail(jsonObj.getString("email"));
                Reg_resp.setphoneNo(jsonObj.getString("phoneNo"));
                Reg_resp.setfinancialInstitutionId(jsonObj.getString("financialInstitutionId"));
                Reg_resp.setentityGroup(jsonObj.getString("entityGroup"));
                Reg_resp.setextraInfo(jsonObj.getString("extraInfo"));
                Reg_resp.setpanCategory(jsonObj.getString("panCategory"));
                Reg_resp.setcreationDate(jsonObj.getString("creationDate"));
                Reg_resp.setregistrationType(jsonObj.getString("registrationType"));


            } catch (JSONException e) {
            }


            return Reg_resp;
        } else {
            System.out.print("Sorry Permission Deined ");
            Reg_resp.setresponseCode("505000000");
            Reg_resp.setresponseMessage("Error: Permission Deined.");
            Reg_resp.setresponseStatus("Failed");

        }


        return Reg_resp;

    }

    public ICash_reverse_Response ICash_Reverse(RequestHDR requestheader,
                                                ICash_reverse_Request Rvl_rqst) {

        ICash_reverse_Response Rvl_RESP = new ICash_reverse_Response();
        ResultHDR rslthdr = new ResultHDR();
        String Result;
        /* Get  Permission     Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() )*/
        if (1 == 1) {
            rslthdr.setCommandId(requestheader.getCommandId());
            rslthdr.setFinalResult(true);
            rslthdr.setResultCode("405000000");
            rslthdr.setResultDesc("Operation successfully.");
            rslthdr.setTransserial(requestheader.getSerial());


            ICash_XML_CUST xml = new ICash_XML_CUST();

            String output = null;

            /* String input1 =
            "?applicationId=" + Rvl_rqst.getapplicationid() + "&tranDateTime=" +
            Rvl_rqst.gettranDateTimed() + "&UUID=" + Rvl_rqst.getUUID() +
            "&originalTranUUID=" + Rvl_rqst.getoriginalTranUUID() +
            "&originalTranDateTime=" + Rvl_rqst.getoriginalTranDateTime() + "";*/


            JSONObject json = new JSONObject();
            try {
                json.put("applicationId", Rvl_rqst.getapplicationid());
                json.put("tranDateTime", Rvl_rqst.gettranDateTimed());
                json.put("UUID", Rvl_rqst.getUUID());
                json.put("originalTranUUID", Rvl_rqst.getoriginalTranUUID());
                json.put("originalTranDateTime",
                         Rvl_rqst.getoriginalTranDateTime());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String input = json.toString();
            System.out.println("************ICash_rev:");
            System.out.println(input);
          //log to txt file  
          log("########################################REQUEST:ICash_rev"+ Date);
          log(input);
            URL url;
            StringBuilder sb = new StringBuilder();

            try {
                HttpsStarter htt = new HttpsStarter();
                url =
new URL(null, "https://172.16.198.12:8877/QAConsumer/reverse",
        new sun.net.www.protocol.https.Handler());
                HttpsURLConnection conn =
                    (HttpsURLConnection)url.openConnection();
                conn.setAllowUserInteraction(true);
                conn.setSSLSocketFactory(HttpsStarter.getFactory());
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                OutputStream os = conn.getOutputStream();
                os.write(input.getBytes());
                os.flush();

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : " +
                                               conn.getResponseCode());
                }

                BufferedReader br =
                    new BufferedReader(new InputStreamReader((conn.getInputStream())));


                System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    System.out.println(output);
                    sb.append(output);


                }

                conn.disconnect();

            } catch (MalformedURLException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            } catch (KeyStoreException e) {
            } catch (NoSuchAlgorithmException e) {
            } catch (CertificateException e) {
            } catch (UnrecoverableKeyException e) {
            } catch (KeyManagementException e) {
            }


            String resp = sb.toString();
          //log to txt file  
          log("########################################RESPONSE:ICash_rev"+ Date);
          log(resp);
            
            JSONObject jsonObj = null;


            try {
                jsonObj = new JSONObject(resp);
                Rvl_RESP.setresponseMessage(jsonObj.getString("responseMessage"));
                System.out.println(Rvl_RESP.getresponseMessage());

                Rvl_RESP.setresponseCode(jsonObj.getString("responseCode"));
                System.out.println(Rvl_RESP.getresponseCode());

                Rvl_RESP.setresponseStatus(jsonObj.getString("responseStatus"));
                System.out.println(Rvl_RESP.getresponseStatus());

                Rvl_RESP.setapplicationid(jsonObj.getString("applicationId"));
                System.out.println(Rvl_RESP.getapplicationid());

                Rvl_RESP.setUUID(jsonObj.getString("UUID"));
                System.out.println(Rvl_RESP.getUUID());

                Rvl_RESP.settranDateTime(jsonObj.getString("tranDateTime"));

                Rvl_RESP.setoriginalTranDateTime(jsonObj.getString("originalTranDateTime"));
                Rvl_RESP.setoriginalTranUUID(jsonObj.getString("originalTranUUID"));

            } catch (JSONException e) {
            }


            return Rvl_RESP;
        } else {
            System.out.print("Sorry Permission Deined ");
            Rvl_RESP.setresponseCode("505000000");
            Rvl_RESP.setresponseMessage("Error: Permission Deined.");
            Rvl_RESP.setresponseStatus("Failed");

        }


        return Rvl_RESP;

    }

    public ICash_getPayeesList_Response ICash_getPayeesList(RequestHDR requestheader,
                                                            ICash_getPayeesList_Request PayLst_rqst) {

        ICash_getPayeesList_Response PayLst_RESP =
            new ICash_getPayeesList_Response();

        ResultHDR rslthdr = new ResultHDR();
        String Result;
        /* Get  Permission    Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() )*/
        if (1 == 1) {
            rslthdr.setCommandId(requestheader.getCommandId());
            rslthdr.setFinalResult(true);
            rslthdr.setResultCode("405000000");
            rslthdr.setResultDesc("Operation successfully.");
            rslthdr.setTransserial(requestheader.getSerial());


            ICash_XML_CUST xml = new ICash_XML_CUST();

            String output = null;

            /* String input1 =
            "?applicationId=" + PayLst_rqst.getapplicationid() + "&tranDateTime=" +
            PayLst_rqst.gettranDateTimed() + "&UUID=" + PayLst_rqst.getUUID() +
            "";*/

            JSONObject json = new JSONObject();
            try {
                json.put("applicationId", PayLst_rqst.getapplicationid());
                json.put("tranDateTime", PayLst_rqst.gettranDateTimed());
                json.put("UUID", PayLst_rqst.getUUID());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String input = json.toString();
            System.out.println("************ICash_GET PL:");
            System.out.println(input);

          //log to txt file  
          log("########################################REQUEST:ICash_GET_Payee"+ Date);
          log(input);

            URL url;
            StringBuilder sb = new StringBuilder();

            try {
                HttpsStarter htt = new HttpsStarter();
                url =
new URL(null, "https://172.16.198.12:8877/QAConsumer/getPayeesList",
        new sun.net.www.protocol.https.Handler());
                HttpsURLConnection conn =
                    (HttpsURLConnection)url.openConnection();
                conn.setAllowUserInteraction(true);
                conn.setSSLSocketFactory(HttpsStarter.getFactory());
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                OutputStream os = conn.getOutputStream();
                os.write(input.getBytes());
                os.flush();

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : " +
                                               conn.getResponseCode());
                }

                BufferedReader br =
                    new BufferedReader(new InputStreamReader((conn.getInputStream())));


                System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    System.out.println(output);
                    sb.append(output);


                }

                conn.disconnect();

            } catch (MalformedURLException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            } catch (KeyStoreException e) {
            } catch (NoSuchAlgorithmException e) {
            } catch (CertificateException e) {
            } catch (UnrecoverableKeyException e) {
            } catch (KeyManagementException e) {
            }


            String resp = sb.toString();
          //log to txt file  
          log("########################################RESPONSE:ICash_GET_Payee"+ Date);
          log(resp);
            
            JSONObject jsonObj = null;


            try {
                jsonObj = new JSONObject(resp);
                PayLst_RESP.setresponseMessage(jsonObj.getString("responseMessage"));
                System.out.println(PayLst_RESP.getresponseMessage());

                PayLst_RESP.setresponseCode(jsonObj.getString("responseCode"));
                System.out.println(PayLst_RESP.getresponseCode());

                PayLst_RESP.setresponseStatus(jsonObj.getString("responseStatus"));
                System.out.println(PayLst_RESP.getresponseStatus());

                PayLst_RESP.setapplicationid(jsonObj.getString("applicationId"));
                System.out.println(PayLst_RESP.getapplicationid());

                PayLst_RESP.setUUID(jsonObj.getString("UUID"));
                System.out.println(PayLst_RESP.getUUID());

                PayLst_RESP.settranDateTime(jsonObj.getString("tranDateTime"));

                PayLst_RESP.setPayees(jsonObj.getString("Payees"));


            } catch (JSONException e) {
            }


            return PayLst_RESP;
        } else {
            System.out.print("Sorry Permission Deined ");
            PayLst_RESP.setresponseCode("505000000");
            PayLst_RESP.setresponseMessage("Error: Permission Deined.");
            PayLst_RESP.setresponseStatus("Failed");

        }


        return PayLst_RESP;

    }


    public ICash_getPublicKey_Response ICash_getPublicKey(RequestHDR requestheader,
                                                          ICash_getPublicKey_Request PblcKY_rqst) {

        ICash_getPublicKey_Response PblcKY_RESP =
            new ICash_getPublicKey_Response();
        ResultHDR rslthdr = new ResultHDR();
        String Result;
        /* Get  Permission     Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() )*/
        if (1 == 1) {
            rslthdr.setCommandId(requestheader.getCommandId());
            rslthdr.setFinalResult(true);
            rslthdr.setResultCode("405000000");
            rslthdr.setResultDesc("Operation successfully.");
            rslthdr.setTransserial(requestheader.getSerial());


            ICash_XML_CUST xml = new ICash_XML_CUST();

            String output = null;

            /*  String input1 =
            "?applicationId=" + PblcKY_rqst.getapplicationid() + "&tranDateTime=" +
            PblcKY_rqst.gettranDateTimed() + "&UUID=" + PblcKY_rqst.getUUID() +
            "";*/

            JSONObject json = new JSONObject();
            try {
                json.put("applicationId", PblcKY_rqst.getapplicationid());
                json.put("tranDateTime", PblcKY_rqst.gettranDateTimed());
                json.put("UUID", PblcKY_rqst.getUUID());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String input = json.toString();

            System.out.println("************ICash_GET Pkey");
            System.out.println(input);
            
          //log to txt file  
          log("########################################REQUEST:ICash_GET Pkey"+ Date);
          log(input);

            URL url;
            StringBuilder sb = new StringBuilder();

            try {
                HttpsStarter htt = new HttpsStarter();
                url =
new URL(null, "https://172.16.198.12:8877/QAConsumer/getPublicKey",
        new sun.net.www.protocol.https.Handler());
                HttpsURLConnection conn =
                    (HttpsURLConnection)url.openConnection();
                conn.setAllowUserInteraction(true);
                conn.setSSLSocketFactory(HttpsStarter.getFactory());
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                OutputStream os = conn.getOutputStream();
                os.write(input.getBytes());
                os.flush();

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : " +
                                               conn.getResponseCode());
                }

                BufferedReader br =
                    new BufferedReader(new InputStreamReader((conn.getInputStream())));


                System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    System.out.println(output);
                    sb.append(output);


                }

                conn.disconnect();

            } catch (MalformedURLException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            } catch (KeyStoreException e) {
            } catch (NoSuchAlgorithmException e) {
            } catch (CertificateException e) {
            } catch (UnrecoverableKeyException e) {
            } catch (KeyManagementException e) {
            }


            String resp = sb.toString();
          //log to txt file  
          log("########################################RESPONSE:ICash_GET Pkey"+ Date);
          log(resp);
            
            JSONObject jsonObj = null;


            try {
                jsonObj = new JSONObject(resp);
                PblcKY_RESP.setresponseMessage(jsonObj.getString("responseMessage"));
                System.out.println(PblcKY_RESP.getresponseMessage());

                PblcKY_RESP.setresponseCode(jsonObj.getString("responseCode"));
                System.out.println(PblcKY_RESP.getresponseCode());

                PblcKY_RESP.setresponseStatus(jsonObj.getString("responseStatus"));
                System.out.println(PblcKY_RESP.getresponseStatus());

                PblcKY_RESP.setapplicationid(jsonObj.getString("applicationId"));
                System.out.println(PblcKY_RESP.getapplicationid());

                PblcKY_RESP.setUUID(jsonObj.getString("UUID"));
                System.out.println(PblcKY_RESP.getUUID());

                PblcKY_RESP.settranDateTime(jsonObj.getString("tranDateTime"));

                PblcKY_RESP.setpubKeyValue(jsonObj.getString("pubKeyValue"));


                System.out.println(PblcKY_RESP.gettranDateTimed());
            } catch (JSONException e) {
            }


            return PblcKY_RESP;
        } else {
            System.out.print("Sorry Permission Deined ");
            PblcKY_RESP.setresponseCode("505000000");
            PblcKY_RESP.setresponseMessage("Error: Permission Deined.");
            PblcKY_RESP.setresponseStatus("Failed");

        }


        return PblcKY_RESP;

    }


    public ICash_payment_Response ICash_payment(RequestHDR requestheader,
                                                ICash_payment_Request Pymnt_rqst) {

        ICash_payment_Response Pymnt_RESP = new ICash_payment_Response();
        ResultHDR rslthdr = new ResultHDR();
        String Result;
        /* Get  Permission    Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() )*/
        if (1 == 1) {
            rslthdr.setCommandId(requestheader.getCommandId());
            //rslthdr.setFinalResult(true);
            // rslthdr.setResultCode("405000000");
            // rslthdr.setResultDesc("Operation successfully.");
            //  rslthdr.setTransserial(requestheader.getSerial());


            ICash_XML_CUST xml = new ICash_XML_CUST();

            String output = null;

            /* String input1 =
            "?applicationId=" + Pymnt_rqst.getapplicationid() + "&tranDateTime=" +
            Pymnt_rqst.gettranDateTimed() + "&UUID=" + Pymnt_rqst.getUUID() +
            "&userName" + Pymnt_rqst.getuserName() + "&userPassword" +
            Pymnt_rqst.getuserPassword() + "&entityId" +
            Pymnt_rqst.getentityId() + "&entityType" +
            Pymnt_rqst.getentityType() + "&PAN" + Pymnt_rqst.getPAN() +
            "&IPIN" + Pymnt_rqst.getIPIN() + "&payeeId" +
            Pymnt_rqst.getpayeeId() + "&paymentInfo" +
            Pymnt_rqst.getpaymentInfo() + "&authenticationType" +
            Pymnt_rqst.getauthenticationType() + "&mbr" + Pymnt_rqst.getmbr() +
            "&expDate" + Pymnt_rqst.getexpDate() + "&tranCurrency" +
            Pymnt_rqst.gettranCurrency() + "&tranAmount" +
            Pymnt_rqst.gettranAmount() + "&fromAccountType" +
            Pymnt_rqst.getfromAccountType() + "";*/


            JSONObject json = new JSONObject();
            try {
                json.put("applicationId", Pymnt_rqst.getapplicationid());
                json.put("tranDateTime", Pymnt_rqst.gettranDateTimed());
                json.put("UUID", Pymnt_rqst.getUUID());
                json.put("userName", Pymnt_rqst.getuserName());
                json.put("userPassword", Pymnt_rqst.getuserPassword());
                json.put("entityId", Pymnt_rqst.getentityId());
                json.put("entityType", Pymnt_rqst.getentityType());
                json.put("PAN", Pymnt_rqst.getPAN());
                json.put("IPIN", Pymnt_rqst.getIPIN());
                json.put("payeeId", Pymnt_rqst.getpayeeId());
                json.put("paymentInfo", Pymnt_rqst.getpaymentInfo());

                json.put("mbr", Pymnt_rqst.getmbr());
                json.put("expDate", Pymnt_rqst.getexpDate());
                json.put("tranCurrency", Pymnt_rqst.gettranCurrency());
                json.put("tranAmount", Pymnt_rqst.gettranAmount());
                json.put("fromAccountType", Pymnt_rqst.getfromAccountType());
                json.put("authenticationType",
                         Pymnt_rqst.getauthenticationType());

            } catch (JSONException e) {
                e.printStackTrace();
            }
            String input = json.toString();
            System.out.println("************ICash_PYMNT:");
            System.out.println(input);
            
          //log to txt file  
          log("########################################REQUEST:ICash_PYMNT"+ Date);
          log(input);

            URL url;
            StringBuilder sb = new StringBuilder();

            try {
                HttpsStarter htt = new HttpsStarter();
                url =
new URL(null, "https://172.16.198.12:8877/QAConsumer/payment",
        new sun.net.www.protocol.https.Handler());
                HttpsURLConnection conn =
                    (HttpsURLConnection)url.openConnection();
                conn.setAllowUserInteraction(true);
                conn.setSSLSocketFactory(HttpsStarter.getFactory());
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                OutputStream os = conn.getOutputStream();
                os.write(input.getBytes());
                os.flush();

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : " +
                                               conn.getResponseCode());
                }

                BufferedReader br =
                    new BufferedReader(new InputStreamReader((conn.getInputStream())));


                System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    System.out.println(output);
                    sb.append(output);


                }

                conn.disconnect();

            } catch (MalformedURLException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            } catch (KeyStoreException e) {
            } catch (NoSuchAlgorithmException e) {
            } catch (CertificateException e) {
            } catch (UnrecoverableKeyException e) {
            } catch (KeyManagementException e) {
            }


            String resp = sb.toString();
          //log to txt file  
          log("########################################RESPONSE:ICash_PYMNT"+ Date);
          log(input);
            
            JSONObject jsonObj = null;


            try {
                jsonObj = new JSONObject(resp);
                Pymnt_RESP.setresponseMessage(jsonObj.getString("responseMessage"));


                Pymnt_RESP.setresponseCode(jsonObj.getString("responseCode"));


                Pymnt_RESP.setresponseStatus(jsonObj.getString("responseStatus"));


                Pymnt_RESP.setapplicationid(jsonObj.getString("applicationId"));


                Pymnt_RESP.setUUID(jsonObj.getString("UUID"));


                Pymnt_RESP.settranDateTime(jsonObj.getString("tranDateTime"));

                //                Pymnt_RESP.setIPIN(jsonObj.getString("IPIN"));
                // Pymnt_RESP.setPAN(jsonObj.getString("PAN"));

                Pymnt_RESP.setentityId(jsonObj.getString("entityId"));
                Pymnt_RESP.setentityType(jsonObj.getString("entityType"));

                Pymnt_RESP.setmbr(jsonObj.getString("mbr"));

                //  Pymnt_RESP.setuserPassword(jsonObj.getString("userPassword"));
                //  Pymnt_RESP.setuserName(jsonObj.getString("userName"));
             
                Pymnt_RESP.setacqTranFee(jsonObj.getString("acqTranFee"));

                if (Pymnt_RESP.getresponseCode().equals("0")) {
                    Pymnt_RESP.setbalance(jsonObj.getString("balance"));
                  Pymnt_RESP.setbillInfo(jsonObj.getString("billInfo"));
             //    Pymnt_RESP.setbillInfo(jsonObj.getString("customerName"));
                  
                }
                Pymnt_RESP.setexpDate(jsonObj.getString("expDate"));
                Pymnt_RESP.setfromAccountType(jsonObj.getString("fromAccountType"));
                Pymnt_RESP.setissuerTranFee(jsonObj.getString("issuerTranFee"));
                Pymnt_RESP.settranAmount(jsonObj.getString("tranAmount"));
                Pymnt_RESP.settranCurrency(jsonObj.getString("tranCurrency"));
                Pymnt_RESP.setpayeeId(jsonObj.getString("payeeId"));
                Pymnt_RESP.setpaymentInfo(jsonObj.getString("paymentInfo"));


            } catch (JSONException e) {
                e.printStackTrace();
            }


            return Pymnt_RESP;
        } else {
            System.out.print("Sorry Permission Deined ");
            Pymnt_RESP.setresponseCode("505000000");
            Pymnt_RESP.setresponseMessage("Error: Permission Deined.");
            Pymnt_RESP.setresponseStatus("Failed");

        }


        return Pymnt_RESP;

    }


    public ICash_doCardTransfer_Response ICash_doCardTransfer(RequestHDR requestheader,
                                                              ICash_doCardTransfer_Request doCardTransfer_rqst) {

        ICash_doCardTransfer_Response doCardTransfer_RESP =
            new ICash_doCardTransfer_Response();

        ResultHDR rslthdr = new ResultHDR();
        String Result;
        /* 
         * Permission   Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) */
        if (1 == 1) {
            rslthdr.setCommandId(requestheader.getCommandId());
            //  rslthdr.setFinalResult(true);
            //  rslthdr.setResultCode("405000000");
            //  rslthdr.setResultDesc("Operation successfully.");
            //  rslthdr.setTransserial(requestheader.getSerial());


            ICash_XML_CUST xml = new ICash_XML_CUST();

            String output = null;
            /*   String input1 =
            "?applicationId=" + doCardTransfer_rqst.getapplicationid() +
            "&tranDateTime=" + doCardTransfer_rqst.gettranDateTimed() +
            "&UUID=" + doCardTransfer_rqst.getUUID() + "&userName" +
            doCardTransfer_rqst.getuserName() + "&userPassword" +
            doCardTransfer_rqst.getuserPassword() + "&entityId" +
            doCardTransfer_rqst.getentityId() + "&entityType" +
            doCardTransfer_rqst.getentityType() + "&PAN" +
            doCardTransfer_rqst.getPAN() + "&IPIN" +
            doCardTransfer_rqst.getIPIN() + "&fromAccountType" +
            doCardTransfer_rqst.getfromAccountType() + "&authenticationType" +
            doCardTransfer_rqst.getauthenticationType() + "&mbr" +
            doCardTransfer_rqst.getmbr() + "&expDate" +
            doCardTransfer_rqst.getexpDate() + "&tranCurrency" +
            doCardTransfer_rqst.gettranCurrency() + "&tranAmount" +
            doCardTransfer_rqst.gettranAmount() + "&fromAccountType" +
            doCardTransfer_rqst.getfromAccountType() + "";*/


            JSONObject json = new JSONObject();
            try {
                json.put("applicationId",
                         doCardTransfer_rqst.getapplicationid());
                json.put("tranDateTime",
                         doCardTransfer_rqst.gettranDateTimed());
                json.put("UUID", doCardTransfer_rqst.getUUID());
                json.put("userName", doCardTransfer_rqst.getuserName());
                json.put("userPassword",
                         doCardTransfer_rqst.getuserPassword());
                json.put("entityId", doCardTransfer_rqst.getentityId());
                json.put("entityType", doCardTransfer_rqst.getentityType());
                json.put("PAN", doCardTransfer_rqst.getPAN());
                json.put("IPIN", doCardTransfer_rqst.getIPIN());
                json.put("fromAccountType",
                         doCardTransfer_rqst.getfromAccountType());
                json.put("toCard", doCardTransfer_rqst.gettoCard());
                json.put("mbr", doCardTransfer_rqst.getmbr());
                json.put("expDate", doCardTransfer_rqst.getexpDate());
                json.put("tranCurrency",
                         doCardTransfer_rqst.gettranCurrency());
                json.put("tranAmount", doCardTransfer_rqst.gettranAmount());
                json.put("authenticationType",
                         doCardTransfer_rqst.getauthenticationType());

            } catch (JSONException e) {
                e.printStackTrace();
            }
            String input = json.toString();
            System.out.println("************ICash_DOCRADTRANS:");
            System.out.println(input);
          //log to txt file  
          log("########################################REQUEST:ICash_DOCRADTRANS"+ Date);
          log(input);
            URL url;
            StringBuilder sb = new StringBuilder();

            try {
                HttpsStarter htt = new HttpsStarter();
                url =
new URL(null, "https://172.16.198.12:8877/QAConsumer/doCardTransfer",
        new sun.net.www.protocol.https.Handler());
                HttpsURLConnection conn =
                    (HttpsURLConnection)url.openConnection();
                conn.setAllowUserInteraction(true);
                conn.setSSLSocketFactory(HttpsStarter.getFactory());
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                OutputStream os = conn.getOutputStream();
                os.write(input.getBytes());
                os.flush();

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : " +
                                               conn.getResponseCode());
                }

                BufferedReader br =
                    new BufferedReader(new InputStreamReader((conn.getInputStream())));


                System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    System.out.println(output);
                    sb.append(output);


                }

                conn.disconnect();

            } catch (MalformedURLException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            } catch (KeyStoreException e) {
            } catch (NoSuchAlgorithmException e) {
            } catch (CertificateException e) {
            } catch (UnrecoverableKeyException e) {
            } catch (KeyManagementException e) {
            }


            String resp = sb.toString();
            
          //log to txt file  
          log("########################################RESPONSE:ICash_DOCRADTRANS"+ Date);
          log(resp);
            JSONObject jsonObj = null;


            try {
                jsonObj = new JSONObject(resp);
                doCardTransfer_RESP.setresponseMessage(jsonObj.getString("responseMessage"));


                doCardTransfer_RESP.setresponseCode(jsonObj.getString("responseCode"));


                doCardTransfer_RESP.setresponseStatus(jsonObj.getString("responseStatus"));


                doCardTransfer_RESP.setapplicationid(jsonObj.getString("applicationId"));


                doCardTransfer_RESP.setUUID(jsonObj.getString("UUID"));


                doCardTransfer_RESP.settranDateTime(jsonObj.getString("tranDateTime"));

                //  doCardTransfer_RESP.setIPIN(jsonObj.getString("IPIN"));
                doCardTransfer_RESP.setPAN(jsonObj.getString("PAN"));

                doCardTransfer_RESP.setentityId(jsonObj.getString("entityId"));
                doCardTransfer_RESP.setentityType(jsonObj.getString("entityType"));

                doCardTransfer_RESP.setmbr(jsonObj.getString("mbr"));

                //doCardTransfer_RESP.setuserPassword(jsonObj.getString("userPassword"));
                //doCardTransfer_RESP.setuserName(jsonObj.getString("userName"));

                doCardTransfer_RESP.setacqTranFee(jsonObj.getString("acqTranFee"));

                if (doCardTransfer_RESP.getresponseCode().equals("0")) {
                    doCardTransfer_RESP.setbalance(jsonObj.getString("balance"));
                }

                doCardTransfer_RESP.setexpDate(jsonObj.getString("expDate"));
                doCardTransfer_RESP.setfromAccountType(jsonObj.getString("fromAccountType"));
                doCardTransfer_RESP.setissuerTranFee(jsonObj.getString("issuerTranFee"));
                doCardTransfer_RESP.settoCard(jsonObj.getString("toCard"));
                doCardTransfer_RESP.settranAmount(jsonObj.getString("tranAmount"));
                doCardTransfer_RESP.settranCurrency(jsonObj.getString("tranCurrency"));


                System.out.println(doCardTransfer_RESP.gettranDateTimed());
            } catch (JSONException e) {
            }


            return doCardTransfer_RESP;
        } else {
            System.out.print("Sorry Permission Deined ");
            doCardTransfer_RESP.setresponseCode("505000000");
            doCardTransfer_RESP.setresponseMessage("Error: Permission Deined.");
            doCardTransfer_RESP.setresponseStatus("Failed");

        }


        return doCardTransfer_RESP;

    }


    public ICash_getBalance_Response ICash_getBalance(RequestHDR requestheader,
                                                      ICash_getBalance_Request Balance_Request) {

        ICash_getBalance_Response Balance_Response =
            new ICash_getBalance_Response();
        ResultHDR rslthdr = new ResultHDR();
        String Result;
        /* Get  Permission
       Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() )*/
        if (1 == 1) {
            rslthdr.setCommandId(requestheader.getCommandId());
            rslthdr.setFinalResult(true);
            rslthdr.setResultCode("405000000");
            rslthdr.setResultDesc("Operation successfully.");
            rslthdr.setTransserial(requestheader.getSerial());


            ICash_XML_CUST xml = new ICash_XML_CUST();

            String output = null;


            JSONObject json = new JSONObject();
            try {
                json.put("applicationId", Balance_Request.getapplicationid());
                json.put("tranDateTime", Balance_Request.gettranDateTimed());
                json.put("UUID", Balance_Request.getUUID());
                json.put("userName", Balance_Request.getuserName());
                json.put("userPassword", Balance_Request.getuserPassword());
                json.put("entityId", Balance_Request.getentityId());
                json.put("entityType", Balance_Request.getentityType());
                json.put("PAN", Balance_Request.getPAN());
                json.put("IPIN", Balance_Request.getIPIN());
                json.put("authenticationType",
                         Balance_Request.getauthenticationType());
                json.put("mbr", Balance_Request.getmbr());
                json.put("expDate", Balance_Request.getexpDate());
                json.put("tranCurrency", Balance_Request.gettranCurrency());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String input = json.toString();

            System.out.println("ICash_GetBalance:");

            System.out.println("---------Request-----------------");
            System.out.println(input);
            System.out.println("---------End of Request-----------");
          //log to txt file  
          log("########################################REQUEST:ICash_GetBalance"+ Date);
          log(input);

            URL url;
            StringBuilder sb = new StringBuilder();

            try {
                HttpsStarter htt = new HttpsStarter();

                url =
new URL(null, "https://172.16.198.12:8877/QAConsumer/getBalance",
        new sun.net.www.protocol.https.Handler());
                HttpsURLConnection conn =
                    (HttpsURLConnection)url.openConnection();
                conn.setAllowUserInteraction(true);
                conn.setSSLSocketFactory(HttpsStarter.getFactory());
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                OutputStream os = conn.getOutputStream();
                os.write(input.getBytes());
                os.flush();

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : " +
                                               conn.getResponseCode());
                }

                BufferedReader br =
                    new BufferedReader(new InputStreamReader((conn.getInputStream())));


                System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    System.out.println(output);
                    sb.append(output);


                }

                conn.disconnect();

            } catch (MalformedURLException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            } catch (KeyStoreException e) {
            } catch (NoSuchAlgorithmException e) {
            } catch (CertificateException e) {
            } catch (UnrecoverableKeyException e) {
            } catch (KeyManagementException e) {
            }


            String resp = sb.toString();
          //log to txt file  
          log("########################################RESPONSE:ICash_GetBalance"+ Date);
          log(resp);
            JSONObject jsonObj = null;

            System.out.println("-----------Response ------------------");
            System.out.println(output);
            System.out.println("-----------ENd of Response ------------------");

            try {
                jsonObj = new JSONObject(resp);
                Balance_Response.setPAN(jsonObj.getString("PAN"));

                Balance_Response.setentityId(jsonObj.getString("entityId"));
                Balance_Response.setentityType(jsonObj.getString("entityType"));

                Balance_Response.setmbr(jsonObj.getString("mbr"));

                //   Balance_Response.setuserPassword(jsonObj.getString("userPassword"));
                // Balance_Response.setuserName(jsonObj.getString("userName"));

                Balance_Response.setacqTranFee(jsonObj.getString("acqTranFee"));

                Balance_Response.setexpDate(jsonObj.getString("expDate"));

                Balance_Response.setissuerTranFee(jsonObj.getString("issuerTranFee"));

                Balance_Response.settranCurrency(jsonObj.getString("tranCurrency"));

                Balance_Response.setresponseMessage(jsonObj.getString("responseMessage"));

                Balance_Response.setresponseCode(jsonObj.getString("responseCode"));

                if (Balance_Response.getresponseCode().equals("0")) {
                    Balance_Response.setbalance(jsonObj.getString("balance"));
                }


                Balance_Response.setresponseStatus(jsonObj.getString("responseStatus"));


                Balance_Response.setapplicationid(jsonObj.getString("applicationId"));


                Balance_Response.setUUID(jsonObj.getString("UUID"));


                Balance_Response.settranDateTime(jsonObj.getString("tranDateTime"));

                // Balance_Response.setIPIN(jsonObj.getString("IPIN"));


            } catch (JSONException e) {
                e.printStackTrace();

            }


            return Balance_Response;
        } else {
            System.out.print("Sorry Permission Deined ");
            Balance_Response.setresponseCode("505000000");
            Balance_Response.setresponseMessage("Error: Permission Deined.");
            Balance_Response.setresponseStatus("Failed");

        }


        return Balance_Response;

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
  public  void log(String log) {
      try {
   
                       DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
       //get current date time with Date()
       Date date = new Date();
       System.out.println(dateFormat.format(date));
             String Date = dateFormat.format(date).toString();
                        
        String content = log + "\r\n";
                                
        File file = new File("/home/weblogic/logs/consumer_"+Date+".txt");
   System.out.println(file);
        // if file doesnt exists, then create it
        if (!file.exists()) {
          file.createNewFile();
        }
   
        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(content);
                          bw.close();
   
        System.out.println("Done");
   
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }



