package DataRegistrationWS;

import Data_Registration.NTCRegistrationSessionEJB;
import Data_Registration.NTCRegistrationSessionEJBBean;
import Data_Registration.NTC_REG_LIMIT_SessionEJB;
import Data_Registration.NtcRegLimit;
import Data_Registration.NtcRegistration;

import Data_Registration.NtcRegistrationSegment;
import Data_Registration.NtcRegistrationSegmentSessionEJBBean;
import Data_Registration.Types;
import Data_Registration.TypesSessionEJB;

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
           mappedName = "DataRegistration-Registration-DataRegistrationSessionEJB")
@WebService(name = "DataRegistration", serviceName = "DataRegistration",
            portName = "DataRegistrationPort",
            targetNamespace = "http://MTN.SD/DataRegistration")
public class DataRegistrationSessionEJBBean implements DataRegistrationSessionEJB {
    @PersistenceContext(unitName = "Registration")
    private EntityManager em;

    public DataRegistrationSessionEJBBean() {
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


    @WebMethod(operationName = "SaveData",
               action = "http://MTN.SD/DataRegistration/SaveData")
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
        byte[] BackImage, @WebParam(name = "SignatureImage")
        byte[] SignatureImage, @WebParam(name = "SOURCE")
        String SOURCE, @WebParam(name = "CutomerId")
        String CutomerId, @WebParam(name = "NewSIM")
        String NewSim) {
        String msg = "";
        final Context context;
        try {
            context = getInitialContext();
            //NTCRegistrationSessionEJB nTCRegistrationSessionEJB = (NTCRegistrationSessionEJB)context.lookup("DataRegistration-Registration-NTCRegistrationSessionEJB#Data_Registration.NTCRegistrationSessionEJB");

            NtcRegistrationSegmentSessionEJBBean ntcRegistrationSegmentSessionEJBBean =
                (NtcRegistrationSegmentSessionEJBBean)context.lookup("DataRegistration-Registration-NtcRegistrationSegmentSessionEJBBean#Data_Registration.NtcRegistrationSegmentSessionEJBBean");
            //String  result=  ntcRegistrationSegmentSessionEJBBean.IsRegistered(MSISDN);

            String result =
                ntcRegistrationSegmentSessionEJBBean.ValidateMSISDN_Vs_Serail(MSISDN,
                                                                              SERAIL);

            NTCRegistrationSessionEJB nTCRegistrationSessionEJB =
                (NTCRegistrationSessionEJB)context.lookup("DataRegistration-Registration-NTCRegistrationSessionEJB#Data_Registration.NTCRegistrationSessionEJB");
            if (result.equals("Not Registered")) {

                msg =
nTCRegistrationSessionEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL,
                                   FrontImageName, BackImageName, IMSI, idType,
                                   FrontImage, BackImage, SignatureImage,
                                   SOURCE, 1L, CutomerId, NewSim);
                if (msg.equals("Data Saved")) {
                    int a =
                        ntcRegistrationSegmentSessionEJBBean.UpdateSegment(MSISDN);

                }

            } else if (result.equals("Registered")) {

                msg =
nTCRegistrationSessionEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL,
                                   FrontImageName, BackImageName, IMSI, idType,
                                   FrontImage, BackImage, SignatureImage,
                                   SOURCE, 2L, CutomerId, NewSim);
                msg = "Already Registered";
            } else {
                msg =
nTCRegistrationSessionEJB.SaveData(NAME, MSISDN, ADDRESS, SERAIL,
                                   FrontImageName, BackImageName, IMSI, idType,
                                   FrontImage, BackImage, SignatureImage,
                                   SOURCE, 3L, CutomerId, NewSim);
                msg = "Data Saved,But MSISDN not Match with Serial or PUK";
            }
        } catch (NamingException e) {
            msg = e.getMessage();
        }

        return msg;
    }

    @WebMethod(operationName = "getTypesFindAll",
               action = "http://MTN.SD/DataRegistration/getTypesFindAll")
    public List<Types> getTypesFindAll() {
        final Context context; //TypesSessionEJB
        try {
            context = getInitialContext();
            //NTCRegistrationSessionEJB nTCRegistrationSessionEJB = (NTCRegistrationSessionEJB)context.lookup("DataRegistration-Registration-NTCRegistrationSessionEJB#Data_Registration.NTCRegistrationSessionEJB");
            // DataRegistration-Registration-NTCRegistrationSessionEJB#Data_Registration.NTCRegistrationSessionEJB
            TypesSessionEJB typesSessionEJB =
                (TypesSessionEJB)context.lookup("DataRegistration-Registration-TypesSessionEJB#Data_Registration.TypesSessionEJB");
            return typesSessionEJB.getTypesFindAll();
        } catch (NamingException e) {
            return Collections.emptyList();
        }

    }


    @WebMethod(operationName = "IsRegistered",
               action = "http://MTN.SD/DataRegistration/IsRegistered")
    public String IsRegistered(@WebParam(name = "MSISDN")
        String MSISDN, @WebParam(name = "SERAIL")
        String SERAIL) {
        final Context context;
        String Msg;
        try {
            context = getInitialContext();
            NtcRegistrationSegmentSessionEJBBean ntcRegistrationSegmentSessionEJBBean =
                (NtcRegistrationSegmentSessionEJBBean)context.lookup("DataRegistration-Registration-NtcRegistrationSegmentSessionEJBBean#Data_Registration.NtcRegistrationSegmentSessionEJBBean");
            //String  result=  ntcRegistrationSegmentSessionEJBBean.IsRegistered(MSISDN);

            Msg =
ntcRegistrationSegmentSessionEJBBean.ValidateMSISDN_Vs_Serail(MSISDN, SERAIL);


        } catch (NamingException e) {
            Msg = e.getMessage();
        }


        return Msg;
    }

    @WebMethod(operationName = "getMaxLimit",
               action = "http://MTN.SD/DataRegistration/getMaxLimit")
    public int getMaxLimit() {
        String result = null;
        int max = 0;

        try {
            final Context context = getInitialContext();
            NTC_REG_LIMIT_SessionEJB nTC_REG_LIMIT_SessionEJB =
                (NTC_REG_LIMIT_SessionEJB)context.lookup("DataRegistration-Registration-NTC_REG_LIMIT_SessionEJB#Data_Registration.NTC_REG_LIMIT_SessionEJB");
            for (NtcRegLimit ntcreglimit :
                 (List<NtcRegLimit>)nTC_REG_LIMIT_SessionEJB.getNtcRegLimitFindAll()) {
                result = Long.toString(ntcreglimit.getMaxrownumber());
                max = Integer.parseInt(result);
            }
        } catch (NamingException e) {

        }
        return max;
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "weblogic.jndi.WLInitialContextFactory");
        env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");
        return new InitialContext(env);
    }
}
