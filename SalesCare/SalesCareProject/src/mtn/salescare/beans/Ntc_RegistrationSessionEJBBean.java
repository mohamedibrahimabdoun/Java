package mtn.salescare.beans;

import java.util.Calendar;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mtn.salescare.ServicesClass.SalesCareServices;

@Stateless(name = "Ntc_RegistrationSessionEJB", mappedName = "SalesCare-SalesCareProject-Ntc_RegistrationSessionEJB")
public class Ntc_RegistrationSessionEJBBean implements Ntc_RegistrationSessionEJB {
    @PersistenceContext(unitName="SalesCareProject")
    private EntityManager em;

    public Ntc_RegistrationSessionEJBBean() {
    }


    public NtcRegistration persistNtcRegistration(NtcRegistration ntcRegistration) {
        em.persist(ntcRegistration);
        return ntcRegistration;
    }


    public NtcRegistration mergeNtcRegistration(NtcRegistration ntcRegistration) {
        return em.merge(ntcRegistration);
    }

    /** <code>select o from NtcRegistration o</code> */

    public List<NtcRegistration> getNtcRegistrationFindAll() {
        return em.createNamedQuery("NtcRegistration.findAll").getResultList();
    }
    
  public String SaveData(String NAME, String MSISDN, String ADDRESS,
                             String SERAIL, String FrontImageName,
                             String BackImageName, String IMSI, Long idType,
                             byte[] FrontImage, byte[] BackImage,String SOURCE,long status,String latitude,String longitude, String IMEI, String IDNUMBER, byte[] VIDEO,String IP_ADDRESS,String SENDER) {
      
         //String SOURCE
          String msg = null;
          String Result;
          try {
              if (FrontImage.length > 0 || BackImage.length > 0) {
           
                  NtcRegistration reg = new NtcRegistration();
                  reg.setMsisdn(MSISDN);
                  reg.setName(NAME);
                  reg.setAddress(ADDRESS);
                  reg.setSerail(SERAIL);
                  reg.setImsi(IMSI);
                  reg.setIdType(idType);
                  reg.setBackImagename(BackImageName);
                  reg.setFrontImagename(FrontImageName);
                  reg.setFrontImage(FrontImage);
                  reg.setBackImage(BackImage);
                  reg.setSource(SOURCE);
                  reg.setStatus(status);
                  reg.setValidated(0L);
                  reg.setLatitude(latitude);
                  reg.setLongitude(longitude);
                  reg.setImei(IMEI);
                  reg.setCustomerid(IDNUMBER);
                  reg.setVideo(VIDEO);
                  reg.setIpAddress(IP_ADDRESS);
                  reg.setSender(SENDER);
              //  String imgPath =
                    //"C:/imgs/" + imageName + ".PNG";
                    //"/export/home/weblogic/imgs/" + FrontImageName + ".jpg";
               // reg.setImagePath(imgPath);
                  try {

                      em.persist(reg);
                      msg = "Data Saved";

                  } catch (NullPointerException e) {
                      msg = e.getMessage();

                  } catch (Exception x) {
                      msg = x.getMessage();
                  }
              } // End of if
              else
                  msg = "Please Take picture First";

          } catch (Exception x) {
              msg = x.getMessage();
          }

          return msg;
      }
  
  public List<Types> getTypesFindAll() {
    final Context context; //TypesSessionEJB
    try {
      context = getInitialContext();
      TypesSessionEJB typesSessionEJB=(TypesSessionEJB) context.lookup("SalesCare-SalesCareProject-TypesSessionEJB#mtn.salescare.beans.TypesSessionEJB");
        return typesSessionEJB.getTypesFindAll();
    } catch(NamingException e) {
      return Collections.emptyList();
    }
     
  }
  
  

  
  private static Context getInitialContext() throws NamingException {
      Hashtable env = new Hashtable();
      // WebLogic Server 10.x connection details
      env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
      env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");
      return new InitialContext( env );
  }

    public String transfer_vtu(String p_sender, String p_msgstr) {
      SalesCareServices obj=new SalesCareServices();
        return obj.transfer_vtu(p_sender, p_msgstr);
    }
}
