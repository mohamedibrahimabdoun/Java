package Data_Registration;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import javax.ejb.Stateless;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "NTCRegistrationSessionEJB", mappedName = "DataRegistration-Registration-NTCRegistrationSessionEJB")
public class NTCRegistrationSessionEJBBean implements NTCRegistrationSessionEJB {
    @PersistenceContext(unitName="Registration")
    private EntityManager em;

    public NTCRegistrationSessionEJBBean() {
    }

    public NtcRegistration persistNtcRegistration(NtcRegistration ntcRegistration) {
        em.persist(ntcRegistration);
        return ntcRegistration;
    }

    public NtcRegistration mergeNtcRegistration(NtcRegistration ntcRegistration) {
        return em.merge(ntcRegistration);
    }

    public void removeNtcRegistration(NtcRegistration ntcRegistration) {
        ntcRegistration = em.find(NtcRegistration.class, ntcRegistration.getId());
        em.remove(ntcRegistration);
    }

    /** <code>select o from NtcRegistration o</code> */
    public List<NtcRegistration> getNtcRegistrationFindAll() {
        return em.createNamedQuery("NtcRegistration.findAll").getResultList();
    }
  public String SaveData(String NAME, String MSISDN, String ADDRESS,
                             String SERAIL, String FrontImageName,
                             String BackImageName, String IMSI, Long idType,
                             byte[] FrontImage, byte[] BackImage,byte[] SignatureImage,String SOURCE,long status,String CustomerID,String NewSIM) {
      
        //String SOURCE
          String msg = null;
          String Result;
          try {

              if ((FrontImage.length > 0 || BackImage.length > 0)|| SignatureImage.length > 0) {
                Calendar calendar = Calendar.getInstance();
                java.util.Date now = calendar.getTime();
              java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
                
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
                  reg.setSignatureImage(SignatureImage);
                  reg.setSource(SOURCE);
                  reg.setStatus(status);
                  reg.setRequestdate(currentTimestamp);
                  reg.setCustomerid(CustomerID);
                  reg.setNewMsisdn(NewSIM);
                  reg.setValidated(0L);
                  
                  
              //  String imgPath =
                    //"C:/imgs/" + imageName + ".PNG";
                    //"/export/home/weblogic/imgs/" + FrontImageName + ".jpg";
               // reg.setImagePath(imgPath);
                  try {

                      em.persist(reg);
                      msg = "Data Saved";

                  } catch (NullPointerException e) {
                      msg = "Please Take Picture First";

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
      TypesSessionEJB typesSessionEJB=(TypesSessionEJB) context.lookup("DataRegistration-Registration-TypesSessionEJB#Data_Registration.TypesSessionEJB");
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
}
