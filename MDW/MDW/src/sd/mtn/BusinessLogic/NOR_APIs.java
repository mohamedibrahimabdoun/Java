package sd.mtn.BusinessLogic;


import com.globitel.web.AddMSISDN;
import com.globitel.web.AddMSISDNResponse;
import com.globitel.web.CreateCampaign;
import com.globitel.web.CreateCampaignResponse;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;

import sd.mtn.Data.RequestHDR;
import sd.mtn.Data.ResultHDR;
import sd.mtn.Vas.MCN;
import sd.mtn.Vas.MCNService;


public class NOR_APIs {
  @WebServiceRef
  private static MCNService MCNServ; 
  TABS_APIs TabObj = new TABS_APIs();
 
  @WebServiceRef
  public String NorCreateCampaign (RequestHDR requestheader,String CampaignId,String CampaignName,String StartDate,String EndDate) {
    String ErrCode;
    String ErrDesc;
    String ReturnCode;
    String Result;
    String Resp = "";
    //XMLGregorianCalendar Start = null;
    //XMLGregorianCalendar End = null;
    
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    DatatypeFactory datatypeFactory;
        try {
            datatypeFactory = DatatypeFactory.newInstance();
          XMLGregorianCalendar Start = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
          XMLGregorianCalendar End =  datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
          
        
          
      ResultHDR rslthdr = new ResultHDR();
      
          /* Get  Permission */
      if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
             rslthdr.setCommandId(requestheader.getCommandId());
        rslthdr.setFinalResult(true);
        rslthdr.setResultCode("405000000");
        rslthdr.setResultDesc("Operation successfully.");
        rslthdr.setTransserial(requestheader.getSerial());
        
        
        CreateCampaign CampaignObj = new CreateCampaign();
        
        CreateCampaignResponse RespCampaign = new CreateCampaignResponse();
        String year1 = StartDate.substring(0,4);
        
        int year = 0;
        year = Integer.parseInt(StartDate.substring(0,4));
        int month= 0;
        month = Integer.parseInt(StartDate.substring(4,6));
        int day=0;
        day = Integer.parseInt(StartDate.substring(6,8));
        int hour=0;
        hour = Integer.parseInt(StartDate.substring(8,10));
        int min=0;
        min = Integer.parseInt(StartDate.substring(10,12));
        int sec=0;
        sec = Integer.parseInt(StartDate.substring(12,14));
        
          Start.setYear(year);
          Start.setMonth(month);
          Start.setDay(day);
          Start.setHour(hour);
          Start.setMinute(min);
          Start.setSecond(sec);
          Start.setTimezone(2);
          
          int end_year=0;
          end_year = Integer.parseInt(EndDate.substring(0,4));
          int end_month=0;
          end_month = Integer.parseInt(EndDate.substring(4,6));
          int end_day=0;
          end_day = Integer.parseInt(EndDate.substring(6,8));
          int end_hour=0;
          end_hour = Integer.parseInt(EndDate.substring(8,10));
          int end_min=0;
          end_min = Integer.parseInt(EndDate.substring(10,12));
          int end_sec=0;
          end_sec = Integer.parseInt(EndDate.substring(12,14));
          
          End.setYear(end_year);
          End.setMonth(end_month);
          End.setDay(end_day);
          End.setHour(end_hour);
          End.setMinute(end_min);
          End.setSecond(end_sec);
          End.setTimezone(2);

        MCNServ = new MCNService();
        MCN MCNObj = MCNServ.getMCNPort();
        
        int CreCamp = 1;
      
         CreCamp = MCNObj.createCampaign(CampaignId, CampaignName, Start, End); 
        RespCampaign.setReturn(CreCamp);
        CreCamp = RespCampaign.getReturn();
        
        Resp = String.valueOf(CreCamp);
        System.out.print(Resp);
      
        } else {
            System.out.print("Sorry Permission Deined ");
            rslthdr.setResultCode("505000000");
            rslthdr.setResultDesc("Error: Permission Deined.");
            String msg= "Sorry Permission Deined";
            Result = msg;
    }
      
    
    } catch (DatatypeConfigurationException e) {
    }
    return Resp;
  }
  
  
  @WebServiceRef
  public int AddMsisdn (RequestHDR requestheader,Integer MSISDN,String CampaignName) {
    String ErrCode;
    String ErrDesc;
    String ReturnCode;
    String Result;
    Integer Resp=0;
    
        
          
      ResultHDR rslthdr = new ResultHDR();
      
          /* Get  Permission */
      if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
             rslthdr.setCommandId(requestheader.getCommandId());
        rslthdr.setFinalResult(true);
        rslthdr.setResultCode("405000000");
        rslthdr.setResultDesc("Operation successfully.");
        rslthdr.setTransserial(requestheader.getSerial());
        MCNServ = new MCNService();
        
        AddMSISDN AddObj = new AddMSISDN();
        
        AddMSISDNResponse AddResp = new AddMSISDNResponse();
        
        
         MCN MCNObj = MCNServ.getMCNPort();
      
         Resp = MCNObj.addMSISDN(MSISDN, CampaignName);
         System.out.print(Resp);
      
        } else {
            System.out.print("Sorry Permission Deined ");
            rslthdr.setResultCode("505000000");
            rslthdr.setResultDesc("Error: Permission Deined.");
            String msg= "Sorry Permission Deined";
            Result = msg;
    }
      
    return Resp;
  }
        
  
}
