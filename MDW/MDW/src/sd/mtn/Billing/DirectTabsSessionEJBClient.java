package sd.mtn.Billing;

import java.io.PrintStream;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DirectTabsSessionEJBClient {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            DirectTabsSessionEJB directTabsSessionEJB = (DirectTabsSessionEJB)context.lookup("MDW-MDW-DirectTabsSessionEJB#sd.mtn.Billing.DirectTabsSessionEJB");
          int x=directTabsSessionEJB.changepostpaidLang("922902672", "2");
        System.out.print(x);
            /* for (CrmUserInfo crmuserinfo : (List<CrmUserInfo>)directTabsSessionEJB.getCrmUserInfoFindAll()) {
                printCrmUserInfo(crmuserinfo);
            }*/
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private static void printCrmUserInfo(CrmUserInfo crmuserinfo) {
        System.out.println( "address = " + crmuserinfo.getAddress() );
        System.out.println( "addrsArea = " + crmuserinfo.getAddrsArea() );
        System.out.println( "addrsBlock = " + crmuserinfo.getAddrsBlock() );
        System.out.println( "apartment = " + crmuserinfo.getApartment() );
        System.out.println( "applied = " + crmuserinfo.getApplied() );
        System.out.println( "apt = " + crmuserinfo.getApt() );
        System.out.println( "area = " + crmuserinfo.getArea() );
        System.out.println( "arBin = " + crmuserinfo.getArBin() );
        System.out.println( "arBinBint = " + crmuserinfo.getArBinBint() );
        System.out.println( "arFirstName = " + crmuserinfo.getArFirstName() );
        System.out.println( "arLastName = " + crmuserinfo.getArLastName() );
        System.out.println( "arName = " + crmuserinfo.getArName() );
        System.out.println( "arSecondName = " + crmuserinfo.getArSecondName() );
        System.out.println( "arThirdName = " + crmuserinfo.getArThirdName() );
        System.out.println( "arTitle = " + crmuserinfo.getArTitle() );
        System.out.println( "billingTemplate = " + crmuserinfo.getBillingTemplate() );
        System.out.println( "bin = " + crmuserinfo.getBin() );
        System.out.println( "binBint = " + crmuserinfo.getBinBint() );
        System.out.println( "bno = " + crmuserinfo.getBno() );
        System.out.println( "bsFlag = " + crmuserinfo.getBsFlag() );
        System.out.println( "bsType = " + crmuserinfo.getBsType() );
        System.out.println( "building = " + crmuserinfo.getBuilding() );
        System.out.println( "buildNo = " + crmuserinfo.getBuildNo() );
        System.out.println( "callerArea = " + crmuserinfo.getCallerArea() );
        System.out.println( "callerSubscrType = " + crmuserinfo.getCallerSubscrType() );
        System.out.println( "cardno = " + crmuserinfo.getCardno() );
        System.out.println( "cardType = " + crmuserinfo.getCardType() );
        System.out.println( "changed = " + crmuserinfo.getChanged() );
        System.out.println( "co = " + crmuserinfo.getCo() );
        System.out.println( "condate = " + crmuserinfo.getCondate() );
        System.out.println( "contrno = " + crmuserinfo.getContrno() );
        System.out.println( "contSub = " + crmuserinfo.getContSub() );
        System.out.println( "creationDate = " + crmuserinfo.getCreationDate() );
        System.out.println( "currVolInt = " + crmuserinfo.getCurrVolInt() );
        System.out.println( "currVolLoc = " + crmuserinfo.getCurrVolLoc() );
        System.out.println( "custNo = " + crmuserinfo.getCustNo() );
        System.out.println( "custType = " + crmuserinfo.getCustType() );
        System.out.println( "dateOfBirth = " + crmuserinfo.getDateOfBirth() );
        System.out.println( "deposit = " + crmuserinfo.getDeposit() );
        System.out.println( "dircode = " + crmuserinfo.getDircode() );
        System.out.println( "dirrdy = " + crmuserinfo.getDirrdy() );
        System.out.println( "discon = " + crmuserinfo.getDiscon() );
        System.out.println( "docComplete = " + crmuserinfo.getDocComplete() );
        System.out.println( "exc = " + crmuserinfo.getExc() );
        System.out.println( "extRetailer = " + crmuserinfo.getExtRetailer() );
        System.out.println( "firstName = " + crmuserinfo.getFirstName() );
        System.out.println( "flexFld1 = " + crmuserinfo.getFlexFld1() );
        System.out.println( "flexFld2 = " + crmuserinfo.getFlexFld2() );
        System.out.println( "flexFld3 = " + crmuserinfo.getFlexFld3() );
        System.out.println( "flexFld4 = " + crmuserinfo.getFlexFld4() );
        System.out.println( "flexFld5 = " + crmuserinfo.getFlexFld5() );
        System.out.println( "gender = " + crmuserinfo.getGender() );
        System.out.println( "groupno = " + crmuserinfo.getGroupno() );
        System.out.println( "idNo = " + crmuserinfo.getIdNo() );
        System.out.println( "idType = " + crmuserinfo.getIdType() );
        System.out.println( "info = " + crmuserinfo.getInfo() );
        System.out.println( "info2 = " + crmuserinfo.getInfo2() );
        System.out.println( "info3 = " + crmuserinfo.getInfo3() );
        System.out.println( "intRetailer = " + crmuserinfo.getIntRetailer() );
        System.out.println( "ivrLang = " + crmuserinfo.getIvrLang() );
        System.out.println( "lastname = " + crmuserinfo.getLastname() );
        System.out.println( "lastorder = " + crmuserinfo.getLastorder() );
        System.out.println( "lastCallDate = " + crmuserinfo.getLastCallDate() );
        System.out.println( "lastCallTime = " + crmuserinfo.getLastCallTime() );
        System.out.println( "lastName = " + crmuserinfo.getLastName() );
        System.out.println( "limit = " + crmuserinfo.getLimit() );
        System.out.println( "locationX = " + crmuserinfo.getLocationX() );
        System.out.println( "locationY = " + crmuserinfo.getLocationY() );
        System.out.println( "mainSubno = " + crmuserinfo.getMainSubno() );
        System.out.println( "mnpSub = " + crmuserinfo.getMnpSub() );
        System.out.println( "mnpType = " + crmuserinfo.getMnpType() );
        System.out.println( "name = " + crmuserinfo.getName() );
        System.out.println( "natCode = " + crmuserinfo.getNatCode() );
        System.out.println( "nextVolInt = " + crmuserinfo.getNextVolInt() );
        System.out.println( "nextVolLoc = " + crmuserinfo.getNextVolLoc() );
        System.out.println( "numCharged = " + crmuserinfo.getNumCharged() );
        System.out.println( "numType = " + crmuserinfo.getNumType() );
        System.out.println( "oldContrno = " + crmuserinfo.getOldContrno() );
        System.out.println( "personalId = " + crmuserinfo.getPersonalId() );
        System.out.println( "postalAdr = " + crmuserinfo.getPostalAdr() );
        System.out.println( "postalCode = " + crmuserinfo.getPostalCode() );
        System.out.println( "postArea = " + crmuserinfo.getPostArea() );
        System.out.println( "poBox = " + crmuserinfo.getPoBox() );
        System.out.println( "ppFromDate = " + crmuserinfo.getPpFromDate() );
        System.out.println( "prepostPaid = " + crmuserinfo.getPrepostPaid() );
        System.out.println( "prevVolInt = " + crmuserinfo.getPrevVolInt() );
        System.out.println( "prevVolLoc = " + crmuserinfo.getPrevVolLoc() );
        System.out.println( "priSecType = " + crmuserinfo.getPriSecType() );
        System.out.println( "profession = " + crmuserinfo.getProfession() );
        System.out.println( "profile = " + crmuserinfo.getProfile() );
        System.out.println( "promotion = " + crmuserinfo.getPromotion() );
        System.out.println( "reasonCode = " + crmuserinfo.getReasonCode() );
        System.out.println( "reservationCode = " + crmuserinfo.getReservationCode() );
        System.out.println( "scrClass = " + crmuserinfo.getScrClass() );
        System.out.println( "secondName = " + crmuserinfo.getSecondName() );
        System.out.println( "servno = " + crmuserinfo.getServno() );
        System.out.println( "specdeb = " + crmuserinfo.getSpecdeb() );
        System.out.println( "spNo = " + crmuserinfo.getSpNo() );
        System.out.println( "status = " + crmuserinfo.getStatus() );
        System.out.println( "street = " + crmuserinfo.getStreet() );
        System.out.println( "streetNo = " + crmuserinfo.getStreetNo() );
        System.out.println( "subno = " + crmuserinfo.getSubno() );
        System.out.println( "subscrType = " + crmuserinfo.getSubscrType() );
        System.out.println( "subPayPriority = " + crmuserinfo.getSubPayPriority() );
        System.out.println( "tariffProfile = " + crmuserinfo.getTariffProfile() );
        System.out.println( "thirdName = " + crmuserinfo.getThirdName() );
        System.out.println( "title = " + crmuserinfo.getTitle() );
        System.out.println( "trsfDate = " + crmuserinfo.getTrsfDate() );
        System.out.println( "zipCode = " + crmuserinfo.getZipCode() );
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
      //  env.put(Context.PROVIDER_URL, "t3://172.26.1.73:7001");
        env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");        
        return new InitialContext( env );
    }
}
