package DataRegistration;

import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "RegistrationSessionEJB", mappedName = "SalesCare-Sales_CareProject-RegistrationSessionEJB")
public class RegistrationSessionEJBBean implements RegistrationSessionEJB {
    @PersistenceContext(unitName="Sales_CareProject")
    private EntityManager em;

    public RegistrationSessionEJBBean() {
    }

    public Registration persistRegistration(Registration registration) {
        em.persist(registration);
        return registration;
    }

    public Registration mergeRegistration(Registration registration) {
        return em.merge(registration);
    }

    public void removeRegistration(Registration registration) {
        registration = em.find(Registration.class, registration.getId());
        em.remove(registration);
    }

    /** <code>select o from Registration o</code> */
    public List<Registration> getRegistrationFindAll() {
        return em.createNamedQuery("Registration.findAll").getResultList();
    }
    
  public String SaveData(String NAME, String MSISDN, String ADDRESS,
                             String SERAIL, String FrontImageName,
                             String BackImageName, String IMSI, Long idType,
                             byte[] FrontImage, byte[] BackImage) {
          String msg = null;
          String Result;
          try {

              if (FrontImage.length > 0 && BackImage.length > 0) {
                  Registration reg = new Registration();
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
                  
                String imgPath =
                    //"C:/imgs/" + imageName + ".PNG";
                    "/export/home/weblogic/imgs/" + FrontImageName + ".jpg";
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
}
