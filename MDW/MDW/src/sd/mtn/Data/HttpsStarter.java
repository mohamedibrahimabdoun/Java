package sd.mtn.Data;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.security.KeyStore;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;


import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;


import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;




public class HttpsStarter  {

       public HttpsStarter() {
           super();}


  static  String Keystore =   "/home/weblogic/keystore/MTN.p12"    ;
  //static  String Keystore =   "C:\\JDeveloper\\mywork\\MDW\\MTN.p12"    ; 

  static char KeyStorePass[] ="123456".toCharArray();


    char KeyPass[] ="123456".toCharArray();

    public static final int Https_Port = 443;


     private static class DefaultTrustManager implements X509TrustManager {

		@Override
		public void checkClientTrusted(X509Certificate[] arg0, String arg1)
				throws CertificateException {
			// TODO Auto-generated method stub
		}

		@Override
		public void checkServerTrusted(X509Certificate[] arg0, String arg1)
				throws CertificateException {
			// TODO Auto-generated method stub
		}

		@Override
		public X509Certificate[] getAcceptedIssuers() {
			// TODO Auto-generated method stub
			return null;
		}
     }







        	public static SSLSocketFactory getFactory()
			throws KeyStoreException, FileNotFoundException, IOException,
			NoSuchAlgorithmException, CertificateException,
			UnrecoverableKeyException, KeyManagementException {
		KeyManagerFactory keyManagerFactory = KeyManagerFactory
				.getInstance("SunX509");
		KeyStore keyStore = KeyStore.getInstance("PKCS12");
try{
  //  System.out.print(KeyStorePass);
    File f1 = new File("/home/weblogic/keystore/MTN.p12");
   // File f1 = new File("C:\\JDeveloper\\mywork\\MDW\\MTN.p12");

        // System.out.print("Success01");
		InputStream keyInput = new FileInputStream( f1 );
		keyStore.load(keyInput,KeyStorePass);
                // System.out.print("Success02");
	keyInput.close();
}catch(Exception e){

    System.out.print("the error -> E1");
System.out.print(e.getMessage());
}

		keyManagerFactory.init(keyStore, "123456".toCharArray());

		SSLContext context = SSLContext.getInstance("TLS");
   context.init(keyManagerFactory.getKeyManagers(),
				new TrustManager[] { new DefaultTrustManager() },
				new SecureRandom());
                SSLSocketFactory SSF = context.getSocketFactory();
		return SSF;

	}



     }


