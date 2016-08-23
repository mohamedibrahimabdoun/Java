package data_reg_project;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RegSessionEJBClient {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
          File file = new File("C:/123.png");
          FileInputStream fis = new FileInputStream(file);
                     //System.out.println(file.exists() + "!!");
                     ByteArrayOutputStream bos = new ByteArrayOutputStream();
                     int x = (int)file.length();
                     System.out.print("x val"+ x);
                     byte[] buf = new byte[x + 5];
                     
                   try {
                       for (int readNum; (readNum = fis.read(buf)) != -1; ) {
                           bos.write(buf, 0, readNum); //no doubt here is 0
                           //Writes len bytes from the specified byte array starting at offset off to this byte array output stream.
                           System.out.println("read " + readNum + " bytes,");
                       }
                   } catch (IOException ex) {
                       System.out.print(ex.getMessage());
                   }
                   byte[] bytes = bos.toByteArray();
                    
            RegSessionEJB regSessionEJB = (RegSessionEJB)context.lookup("DataRegistration-Data_Reg_Project-RegSessionEJB#data_reg_project.RegSessionEJB");
          String r =regSessionEJB.Save("1", "secondName", "thirdName", "lastName",
                                  "name", "imageName", "C:/imgs/", "msisdn",
                                  "imsi", 1L, bytes);
           
          
            /*for (Registration registration : (List<Registration>)regSessionEJB.getRegistrationFindAll()) {
                printRegistration(registration);} */
            System.out.print("R Values" + r);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printRegistration(Registration registration) {
        System.out.println( "firstName = " + registration.getFirstName() );
        System.out.println( "id = " + registration.getId() );
        System.out.println( "idType = " + registration.getIdType() );
        System.out.println( "imageName = " + registration.getImageName() );
        System.out.println( "imagePath = " + registration.getImagePath() );
        System.out.println( "imsi = " + registration.getImsi() );
        System.out.println( "lastName = " + registration.getLastName() );
        System.out.println( "msisdn = " + registration.getMsisdn() );
        System.out.println( "name = " + registration.getName() );
        System.out.println( "secondName = " + registration.getSecondName() );
        System.out.println( "thirdName = " + registration.getThirdName() );
        System.out.println( "transdate = " + registration.getTransdate() );
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://172.17.10.25:7001");
        return new InitialContext( env );
    }
}
