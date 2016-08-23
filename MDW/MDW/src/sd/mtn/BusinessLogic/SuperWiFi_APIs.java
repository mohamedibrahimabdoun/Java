package sd.mtn.BusinessLogic;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import sd.mtn.Data.RequestHDR;
import sd.mtn.Data.Response;
import sd.mtn.Data.ResponseHeader;
import sd.mtn.Data.SuperWiFiResposeMessage;
import sd.mtn.Data.SuperWiFiUserRequest;


public class SuperWiFi_APIs extends DefaultHandler {

    public ResponseHeader resHeader;
   public Response response;
    String resultcode;
    String resultdesc;
    String serail;
    String username;
    String password;
    String Validity;
    String Expiry;
    String Quota;
    String Bandwidth;
    private String temp;
    public ArrayList<ResponseHeader> accList = new ArrayList<ResponseHeader>();
    public ArrayList<Response> ResponseList = new ArrayList<Response>();
  
 public static SuperWiFiResposeMessage finalrespmsg=new SuperWiFiResposeMessage();


    public static SuperWiFiResposeMessage SuperWiFiRequestMsg(RequestHDR requestheader,
                                                              SuperWiFiUserRequest SuperWiFiReq)

    {
        try {
              String line;
            String data = "";
            String input =
                "?action=" + SuperWiFiReq.getAction() + "&pcodeid=" +
                SuperWiFiReq.getPcodeid() + "&rcode=" +
                SuperWiFiReq.getRcode() + "&serial=" +
                SuperWiFiReq.getSerial() + "";

            URL url = new URL("http://172.20.40.11/api/" + input + "");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "text/xml");


            //please pass the above params information here or any use any other java object to get the respose
            // Need you expertise to draft the code here start

            // Need you expertise to draft the code here end


            OutputStream os = conn.getOutputStream();
            //  os.write(json.getBytes());
            //   os.write(byteOut.toByteArray());
            os.flush();

            Scanner scanner;
            SuperWiFiResposeMessage response;
            if (conn.getResponseCode() != 200) {
                scanner = new Scanner(conn.getErrorStream());
                //response = "Error From Server \n\n";
                throw new Exception();
            } else {

                BufferedReader bfr =
                    new BufferedReader(new InputStreamReader(conn.getInputStream()));
                scanner = new Scanner(conn.getInputStream());
                StringBuffer sb = new StringBuffer();
                sb.append("<doc>");
                while ((line = bfr.readLine()) != null) {
                    sb.append(line);

                }
                sb.append("</doc>");
          
                SAXParserFactory spfac = SAXParserFactory.newInstance();
             
                SAXParser sp = spfac.newSAXParser();
    
                SuperWiFi_APIs handler = new SuperWiFi_APIs();

                //Finally, tell the parser to parse the input and notify the handler
                sp.parse(new ByteArrayInputStream(sb.toString().getBytes()),
                         handler);
                handler.readList();

           // handler.resHeader();
              //handler.response  
     
                
                
            }
            scanner.useDelimiter("\\Z");
            scanner.close();
            conn.disconnect();

        }


        catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return finalrespmsg;
    }

    public void characters(char[] buffer, int start, int length) {
        temp = new String(buffer, start, length);
    }

    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        temp = "";
        if (qName.equalsIgnoreCase("ResponseHeader")) {
            resHeader = new ResponseHeader();
            resHeader.setResultCode(attributes.getValue("ResultCode"));

        } else if (qName.equalsIgnoreCase("Response")) {
            response = new Response();
            response.setUsername(attributes.getValue("username"));

        }
    }

  
    public void endElement(String uri, String localName,
                           String qName) throws SAXException {

        if (qName.equalsIgnoreCase("ResponseHeader")) {
            // add it to the list
            accList.add(resHeader);

        } else if (qName.equalsIgnoreCase("ResultCode")) {
            resHeader.setResultCode(temp);
        } else if (qName.equalsIgnoreCase("ResultDesc")) {
            resHeader.setResultDesc(temp);
        } else if (qName.equalsIgnoreCase("Serial")) {
            resHeader.setSerial(temp);
        }


        if (qName.equalsIgnoreCase("Response")) {
            // add it to the list
            ResponseList.add(response);

        } else if (qName.equalsIgnoreCase("username")) {
            response.setUsername(temp);
        } else if (qName.equalsIgnoreCase("password")) {
            response.setPassword(temp);
        } else if (qName.equalsIgnoreCase("Validity")) {
            response.setValidity(temp);

        } else if (qName.equalsIgnoreCase("Expiry")) {
            response.setExpiry(temp);
        } else if (qName.equalsIgnoreCase("Quota")) {
            response.setQuota(temp);
        } else if (qName.equalsIgnoreCase("Bandwidth")) {
            response.setBandwidth(temp);
        }


    }

    private void readList() {
        System.out.println("No of  the accounts in bank '" + accList.size() +
                           "'.");
        Iterator<ResponseHeader> it = accList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }

        Iterator<Response> itResponse = ResponseList.iterator();
        while (itResponse.hasNext()) {
            System.out.println(itResponse.next().toString());
        }
        
   
      finalrespmsg.setResultHeader(accList.get(0));
      finalrespmsg.setWiFiReponse(ResponseList.get(0));
    }

}


