package mtn.salescare.beans;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class NtcRegistrationSegmentSessionEJBClient {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            NtcRegistrationSegmentSessionEJB ntcRegistrationSegmentSessionEJB = (NtcRegistrationSegmentSessionEJB)context.lookup("SalesCare-SalesCareProject-NtcRegistrationSegmentSessionEJB#mtn.salescare.beans.NtcRegistrationSegmentSessionEJB");
            for (NtcRegistration ntcregistration : (List<NtcRegistration>)ntcRegistrationSegmentSessionEJB.getNtcRegistrationFindAll()) {
                printNtcRegistration(ntcregistration);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printNtcRegistration(NtcRegistration ntcregistration) {
        System.out.println( "accountid = " + ntcregistration.getAccountid() );
        System.out.println( "address = " + ntcregistration.getAddress() );
        System.out.println( "backImage = " + ntcregistration.getBackImage() );
        System.out.println( "backImagename = " + ntcregistration.getBackImagename() );
        System.out.println( "customerid = " + ntcregistration.getCustomerid() );
        System.out.println( "datasource = " + ntcregistration.getDatasource() );
        System.out.println( "digit = " + ntcregistration.getDigit() );
        System.out.println( "firstname = " + ntcregistration.getFirstname() );
        System.out.println( "frontImage = " + ntcregistration.getFrontImage() );
        System.out.println( "frontImagename = " + ntcregistration.getFrontImagename() );
        System.out.println( "id = " + ntcregistration.getId() );
        System.out.println( "idType = " + ntcregistration.getIdType() );
        System.out.println( "imei = " + ntcregistration.getImei() );
        System.out.println( "imsi = " + ntcregistration.getImsi() );
        System.out.println( "incentive = " + ntcregistration.getIncentive() );
        System.out.println( "ipAddress = " + ntcregistration.getIpAddress() );
        System.out.println( "latitude = " + ntcregistration.getLatitude() );
        System.out.println( "longitude = " + ntcregistration.getLongitude() );
        System.out.println( "msisdn = " + ntcregistration.getMsisdn() );
        System.out.println( "name = " + ntcregistration.getName() );
        System.out.println( "newMsisdn = " + ntcregistration.getNewMsisdn() );
        System.out.println( "reqstatus = " + ntcregistration.getReqstatus() );
        System.out.println( "requestdate = " + ntcregistration.getRequestdate() );
        System.out.println( "resultcode = " + ntcregistration.getResultcode() );
        System.out.println( "resultdescr = " + ntcregistration.getResultdescr() );
        System.out.println( "secondname = " + ntcregistration.getSecondname() );
        System.out.println( "sender = " + ntcregistration.getSender() );
        System.out.println( "serail = " + ntcregistration.getSerail() );
        System.out.println( "signatureImage = " + ntcregistration.getSignatureImage() );
        System.out.println( "smstext = " + ntcregistration.getSmstext() );
        System.out.println( "source = " + ntcregistration.getSource() );
        System.out.println( "status = " + ntcregistration.getStatus() );
        System.out.println( "surname = " + ntcregistration.getSurname() );
        System.out.println( "tac = " + ntcregistration.getTac() );
        System.out.println( "tid = " + ntcregistration.getTid() );
        System.out.println( "transserial = " + ntcregistration.getTransserial() );
        System.out.println( "unnamed2 = " + ntcregistration.getUnnamed2() );
        System.out.println( "validated = " + ntcregistration.getValidated() );
        System.out.println( "valudatedBy = " + ntcregistration.getValudatedBy() );
        System.out.println( "video = " + ntcregistration.getVideo() );
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");
        return new InitialContext( env );
    }
}