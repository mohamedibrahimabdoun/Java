package sd.mtn.cbos;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 101221.1153.15811)

public class GMPPUSSDServicePortClient
{
  @WebServiceRef
  private static GMPPUSSDService_Service gMPPUSSDService_Service;

  public static void main(String [] args)
  {
    gMPPUSSDService_Service = new GMPPUSSDService_Service();
    GMPPUSSDService gMPPUSSDService = gMPPUSSDService_Service.getGMPPUSSDServicePort();
    // Add your code to call the desired methods.
  }
}
