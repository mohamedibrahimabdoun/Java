package mtn.salescare.WS;

import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import javax.jws.WebService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mtn.salescare.beans.NtcRegistration;
import mtn.salescare.beans.Ntc_RegistrationSessionEJB;
import mtn.salescare.beans.Types;
import mtn.salescare.beans.TypesSessionEJB;
import mtn.salescare.ServicesClass.Electricity;
import mtn.salescare.ServicesClass.Resultset;
import mtn.salescare.ServicesClass.SalesCareServices;
import mtn.salescare.ServicesClass.Services;
import mtn.salescare.ServicesClass.Tree;
import mtn.salescare.beans.NtcRegistrationSegmentSessionEJB;
import mtn.salescare.beans.NtcRegistrationSegmentSessionEJBBean;

@Stateless(name = "SalesCareWebServicesSessionEJB",
           mappedName = "SalesCare-SalesCareProject-SalesCareWebServicesSessionEJB")
@WebService(name = "SalesService", serviceName = "SalesService",
            targetNamespace = "http://tempuri.org/",
            portName = "SalesServicePort")
public class SalesCareWebServicesSessionEJBBean implements SalesCareWebServicesSessionEJB {
    @PersistenceContext(unitName = "SalesCareProject")
    private EntityManager em;

    public SalesCareWebServicesSessionEJBBean() {
    }

    @WebMethod(exclude = true)
    public NtcRegistration persistNtcRegistration(NtcRegistration ntcRegistration) {
        em.persist(ntcRegistration);
        return ntcRegistration;
    }

    @WebMethod(exclude = true)
    public NtcRegistration mergeNtcRegistration(NtcRegistration ntcRegistration) {
        return em.merge(ntcRegistration);
    }

    /** <code>select o from NtcRegistration o</code> */
    @WebMethod(exclude = true)
    public List<NtcRegistration> getNtcRegistrationFindAll() {
        return em.createNamedQuery("NtcRegistration.findAll").getResultList();

    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "weblogic.jndi.WLInitialContextFactory");
        env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");
        return new InitialContext(env);
    }

    @WebMethod
    public List<Types> getTypesFindAll() {
        final Context context; //TypesSessionEJB
        try {
            context = getInitialContext();
            TypesSessionEJB typesSessionEJB =
                (TypesSessionEJB)context.lookup("SalesCare-SalesCareProject-TypesSessionEJB#mtn.salescare.beans.TypesSessionEJB");
            return typesSessionEJB.getTypesFindAll();
        } catch (NamingException e) {
            return Collections.emptyList();
        }

    }

    @WebMethod
    public String SaveData(@WebParam(name = "NAME")
        String NAME, @WebParam(name = "MSISDN")
        String MSISDN, @WebParam(name = "ADDRESS")
        String ADDRESS, @WebParam(name = "SERAIL")
        String SERAIL, @WebParam(name = "FrontImageName")
        String FrontImageName, @WebParam(name = "BackImageName")
        String BackImageName, @WebParam(name = "IMSI")
        String IMSI, @WebParam(name = "idType")
        Long idType, @WebParam(name = "FrontImage")
        byte[] FrontImage, @WebParam(name = "BackImage")
        byte[] BackImage, @WebParam(name = "SOURCE")
        String SOURCE, @WebParam(name = "LATITUDE")
        String LATITUDE, @WebParam(name = "LONGITUDE")
        String LNOGITUDE, @WebParam(name = "IMEI")
        String IMEI, @WebParam(name = "IDNUMBER")
        String IDNUMBER, @WebParam(name = "VIDEO")
        byte[] VIDEO, @WebParam(name = "IP_ADDRESS")
        String IP_ADDRESS, @WebParam(name = "SENDER")
        String SENDER) {
        /* @WebParam(name = "LATITUDE")
              String LATITUDE, @WebParam(name = "LONGITUDE")
              String LONGITUDE*/

        String msg = "";
        final Context context;
        //
        try {

            context = getInitialContext();
            //NTCRegistrationSessionEJB nTCRegistrationSessionEJB = (NTCRegistrationSessionEJB)context.lookup("DataRegistration-Registration-NTCRegistrationSessionEJB#Data_Registration.NTCRegistrationSessionEJB");
            if (FrontImage.length > 0 || BackImage.length > 0) {
                try {
                    //  msg = registrationSessionEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL, FrontImageName, BackImageName, IMSI, idType, FrontImage, BackImage, SOURCE, 2l,LATITUDE,LNOGITUDE,IMEI,IDNUMBER,VIDEO,IP_ADDRESS,SENDER);

                    NtcRegistrationSegmentSessionEJB ntcRegistrationSegmentEJB =
                        (NtcRegistrationSegmentSessionEJB)context.lookup("SalesCare-SalesCareProject-NtcRegistrationSegmentSessionEJB#mtn.salescare.beans.NtcRegistrationSegmentSessionEJB");
                    //String  result=  ntcRegistrationSegmentSessionEJBBean.IsRegistered(MSISDN);

                    String result =
                        ntcRegistrationSegmentEJB.ValidateMSISDN_Vs_Serail(MSISDN,
                                                                           SERAIL);
                    Ntc_RegistrationSessionEJB ntc_RegistrationEJB =
                        (Ntc_RegistrationSessionEJB)context.lookup("SalesCare-SalesCareProject-Ntc_RegistrationSessionEJB#mtn.salescare.beans.Ntc_RegistrationSessionEJB");

                    if (result.equals("Not Registered")) {
                        // status 1L
                        msg =ntc_RegistrationEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL, FrontImageName,
                             BackImageName, IMSI, idType, FrontImage,
                             BackImage, SOURCE, 1L, LATITUDE, LNOGITUDE, IMEI,
                             IDNUMBER, VIDEO, IP_ADDRESS, SENDER);
                        if (msg.equals("Data Saved")) {
                            int a =
                                ntcRegistrationSegmentEJB.UpdateSegment(MSISDN);

                        }

                    } else if (result.equals("Registered")) {
                        // status 2L  already Registered                       
                        msg =
ntc_RegistrationEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL, FrontImageName,
                             BackImageName, IMSI, idType, FrontImage,
                             BackImage, SOURCE, 2L, LATITUDE, LNOGITUDE, IMEI,
                             IDNUMBER, VIDEO, IP_ADDRESS, SENDER);
                        msg = "Already Registered";

                    } else {
                        // status 3L  MSISDN and Serail or PUK not match
                        msg =
ntc_RegistrationEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL, FrontImageName,
                             BackImageName, IMSI, idType, FrontImage,
                             BackImage, SOURCE, 3L, LATITUDE, LNOGITUDE, IMEI,
                             IDNUMBER, VIDEO, IP_ADDRESS, SENDER);
                        msg = "MSISDN not Match with Serial or PUK";
                    }
                } catch (NamingException e) {
                    msg = e.getMessage();
                }
            }


            else {
                msg = "Sorry, Take ID photo";
            }
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;

        /*    if ( FrontImage.length > 0 || BackImage.length > 0) {
          context = getInitialContext();

         //============================================================================================   SalesCare-SalesCareProject-Ntc_RegistrationSessionEJB#mtn.salescare.beans.Ntc_RegistrationSessionEJB
          Ntc_RegistrationSessionEJB registrationSessionEJB = (Ntc_RegistrationSessionEJB)context.lookup("SalesCare-SalesCareProject-Ntc_RegistrationSessionEJB#mtn.salescare.beans.Ntc_RegistrationSessionEJB");
      //  msg = registrationSessionEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL, FrontImageName, BackImageName, IMSI, idType, FrontImage, BackImage, SOURCE, 2l,LATITUDE,LNOGITUDE,IMEI,IDNUMBER,VIDEO,IP_ADDRESS,SENDER);


                 // registrationSessionEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL, FrontImageName, BackImageName, IMSI, idType, FrontImage, BackImage, SOURCE, 2l);
             // registrationSessionEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL, FrontImageName, BackImageName, IMSI, idType, FrontImage, BackImage, SOURCE, 2l,String latitude,String longitude);
           msg = registrationSessionEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL, FrontImageName, BackImageName, IMSI, idType, FrontImage, BackImage, SOURCE, 2l,LATITUDE,LNOGITUDE,IMEI,IDNUMBER,VIDEO,IP_ADDRESS,SENDER);
            }
            else  {
              msg="Sorry, Take ID photo";
            }

          } catch (NamingException e) {
          msg = e.getMessage();
          }
      return  msg;*/
    }

    @WebMethod
    public String activation(@WebParam(name = "sender")
        String sender, @WebParam(name = "subno")
        String subno, @WebParam(name = "puk")
        String puk) {
        String result = "";
        SalesCareServices db = new SalesCareServices();
        result = db.sim_activation(sender, subno, puk);
        return result;
    }


    @WebMethod
    public String transfer(@WebParam(name = "sender")
        String sender, @WebParam(name = "msgstr")
        String msgstr) {
        String result = "";
        SalesCareServices db = new SalesCareServices();
        result = db.transfer_vtu(sender, msgstr);
        return result;
    }


    @WebMethod
    public Electricity purchase(@WebParam(name = "msisdn")
        String msisdn, @WebParam(name = "msgstr")
        String msgstr) {
        Electricity result;
        SalesCareServices db = new SalesCareServices();
        result = db.purchase_elec(msisdn, msgstr);
        return result;
    }


    @WebMethod
    public Services Get_PERMISSION(@WebParam(name = "imsi")
        String imsi, @WebParam(name = "pin")
        String pin) {
        Services result;
        SalesCareServices db = new SalesCareServices();
        result = db.Get_PERMISSION(imsi, pin);
        return result;
    }

    @WebMethod
    public String Get_LoginResult(@WebParam(name = "imsi")
        String imsi, @WebParam(name = "pin")
        String pin) {
        String result = "";
        SalesCareServices db = new SalesCareServices();
        result = db.validate_POS(imsi, pin);
        return result;
    }


    @WebMethod
    public List<Resultset> Get_RecieversReport(@WebParam(name = "sender")
        String sender, @WebParam(name = "fromdate")
        String fromdate, @WebParam(name = "top")
        String top) {
        List<Resultset> result;
        SalesCareServices db = new SalesCareServices();
        result = db.Get_RecieversReport(sender, fromdate, top);
        return result;
    }


    @WebMethod
    public List<Tree> Get_Recievers(@WebParam(name = "sender")
        String sender) {
        List<Tree> result;
        SalesCareServices db = new SalesCareServices();
        result = db.Get_Recievers(sender);
        return result;
    }

    public String IsRegistered(@WebParam(name = "MSISDN")
        String MSISDN, @WebParam(name = "SERAIL")
        String SERAIL) {
        final Context context;
        String Msg;
        try {
            context = getInitialContext();

            //  NtcRegistrationSegmentSessionEJB ntcRegistrationSegmentSessionEJB = (NtcRegistrationSegmentSessionEJB)context.lookup("SalesCare-SalesCareProject-NtcRegistrationSegmentSessionEJB#mtn.salescare.beans.NtcRegistrationSegmentSessionEJB");

            NtcRegistrationSegmentSessionEJB ntcRegistrationSegmentSessionEJB =
                (NtcRegistrationSegmentSessionEJB)context.lookup("SalesCare-SalesCareProject-NtcRegistrationSegmentSessionEJB#mtn.salescare.beans.NtcRegistrationSegmentSessionEJB");
            //String  result=  ntcRegistrationSegmentSessionEJBBean.IsRegistered(MSISDN);

            Msg = ntcRegistrationSegmentSessionEJB.ValidateMSISDN_Vs_Serail(MSISDN, SERAIL);


        } catch (NamingException e) {
            Msg = e.getMessage();
        }

        return Msg;
    }


    public int Get_TP_PERMISSION(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
   
      int result;
      SalesCareServices db = new SalesCareServices();
      result = db.Get_TP_PERMISSION(username, password);
      return result;
        
    }
}
