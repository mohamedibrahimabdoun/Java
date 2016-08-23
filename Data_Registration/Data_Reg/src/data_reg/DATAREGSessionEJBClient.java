package data_reg;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DATAREGSessionEJBClient {
    public static void main(String[] args) {
        try {
            final Context context = getInitialContext();
            File file = new File("C:/123.jpg");
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int x = (int)file.length();
            System.out.print("x val" + x);
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

            long idType = 1L;
            DATAREGSessionEJB dATAREGSessionEJB =
                (DATAREGSessionEJB)context.lookup("Data_Registration-Data_Reg-DATAREGSessionEJB#data_reg.DATAREGSessionEJB");
            String res =
                dATAREGSessionEJB.Save("a", "a", "a", "a", "a", "a", "C:/",
                                       "a", "a", idType, bytes);
            // String r=null;
            // r =dATAREGSessionEJB.Save("l", "l", "l", "l", "l", "l","C:/", "l","55", 1L,bytes, "123");

            //  List<Registration>  r =dATAREGSessionEJB.getRegistrationFindAll();
            /*  for (Registration registration : (List<Registration>)dATAREGSessionEJB.getRegistrationFindAll()) {
              printRegistration(registration); }*/

            System.out.print("R Values" + res);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printRegistration(Registration registration) {
        System.out.println("firstName = " + registration.getFirstName());
        System.out.println("id = " + registration.getId());
        System.out.println("idType = " + registration.getIdType());
        System.out.println("image = " + registration.getImage());
        System.out.println("imageName = " + registration.getImageName());
        System.out.println("imagePath = " + registration.getImagePath());
        System.out.println("imsi = " + registration.getImsi());
        System.out.println("lastName = " + registration.getLastName());
        System.out.println("msisdn = " + registration.getMsisdn());
        System.out.println("name = " + registration.getName());
        System.out.println("secondName = " + registration.getSecondName());
        System.out.println("thirdName = " + registration.getThirdName());
        System.out.println("transdate = " + registration.getTransdate());
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "weblogic.jndi.WLInitialContextFactory");
        env.put(Context.PROVIDER_URL, "t3://localhost:7001");
        return new InitialContext(env);
    }
}
