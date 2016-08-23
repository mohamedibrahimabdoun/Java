package sd.mtn.Vas;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 101221.1153.15811)

@WebServiceClient(wsdlLocation="http://172.20.9.22:8080/MissedCallNotification_WS_1.0/services/MCNPort?wsdl",
  targetNamespace="http://web.globitel.com/", name="MCNService")
public class MCNService
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("sd.mtn.Vas.MCNService");
      URL baseUrl = MCNService.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            MCNService.class.getResource("http://172.20.9.22:8080/MissedCallNotification_WS_1.0/services/MCNPort?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://172.20.9.22:8080/MissedCallNotification_WS_1.0/services/MCNPort?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://172.20.9.22:8080/MissedCallNotification_WS_1.0/services/MCNPort?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://172.20.9.22:8080/MissedCallNotification_WS_1.0/services/MCNPort?wsdl",
          e);
    }
  }

  public MCNService()
  {
    super(wsdlLocationURL,
          new QName("http://web.globitel.com/", "MCNService"));
  }

  public MCNService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="MCNPort")
  public MCN getMCNPort()
  {
    return (MCN) super.getPort(new QName("http://web.globitel.com/",
                                         "MCNPort"), MCN.class);
  }

  @WebEndpoint(name="MCNPort")
  public MCN getMCNPort(WebServiceFeature... features)
  {
    return (MCN) super.getPort(new QName("http://web.globitel.com/",
                                         "MCNPort"), MCN.class, features);
  }
}
