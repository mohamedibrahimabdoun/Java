package Data_RegistrationWS;

import DataRegistration.Registration;

import DataRegistration.RegistrationSessionEJB;
import DataRegistration.RegistrationSessionEJBBean;

import DataRegistration.Types;

import DataRegistration.TypesSessionEJB;

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

@Stateless(name = "DataRegistrationSessionEJB",
           mappedName = "SalesCare-Sales_CareProject-DataRegistrationSessionEJB")
@WebService(name = "DataRegistrationService",
            serviceName = "DataRegistrationService",
            targetNamespace = "http://tempuri.org/",
            portName = "DataRegistrationServicePort")
public class DataRegistSessionEJBBean implements RegistrationSessionEJB {
    @PersistenceContext(unitName = "Sales_CareProject")
    private EntityManager em;

    public DataRegistSessionEJBBean() {
    }

    @WebMethod(exclude = true)
    public Registration persistRegistration(Registration registration) {
        em.persist(registration);
        return registration;
    }

    @WebMethod(exclude = true)
    public Registration mergeRegistration(Registration registration) {
        return em.merge(registration);
    }

    /** <code>select o from Registration o</code> */
    @WebMethod(exclude = true)
    public List<Registration> getRegistrationFindAll() {
        return em.createNamedQuery("Registration.findAll").getResultList();
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "weblogic.jndi.WLInitialContextFactory");
        env.put(Context.PROVIDER_URL, "t3://localhost:7001");
        return new InitialContext(env);
    }

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
        byte[] BackImage) {
        String msg = "";


        final Context context;
        try {
            context = getInitialContext();

            RegistrationSessionEJB registrationSessionEJB = (RegistrationSessionEJB)context.lookup("SalesCare-Sales_CareProject-RegistrationSessionEJB#DataRegistration.RegistrationSessionEJB");
                                                            
            msg =
                    registrationSessionEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL, FrontImageName,
                                BackImageName, IMSI, idType, FrontImage,
                                BackImage);


        } catch (NamingException e) {
            msg = e.getMessage();
        }

        return msg;
    }

    public List<Types> getTypesFindAll() {
      final Context context; //TypesSessionEJB
      try {
        context = getInitialContext();
        TypesSessionEJB typesSessionEJB=(TypesSessionEJB) context.lookup("SalesCare-Sales_CareProject-TypesSessionEJB#DataRegistration.TypesSessionEJB");
          return typesSessionEJB.getTypesFindAll();
      } catch(NamingException e) {
        return Collections.emptyList();
      }
       
    }

    public void removeRegistration(Registration registration) {
    }
}
