package sd.mtn.ocs;

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

@WebServiceClient(wsdlLocation="http://172.21.24.100:8680/services/SubmgrtMgrService/#%7Bhttp%3A%2F%2Fwww.huawei.com%2Fbme%2Fcbsinterface%2Fsubmgrtmgr%7DSubmgrtMgrService?wsdl",
  targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
  name="SubmgrtMgrService")
public class SubmgrtMgrService
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("sd.mtn.ocs.SubmgrtMgrService");
      URL baseUrl = SubmgrtMgrService.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            SubmgrtMgrService.class.getResource("http://172.21.24.100:8680/services/SubmgrtMgrService/#%7Bhttp%3A%2F%2Fwww.huawei.com%2Fbme%2Fcbsinterface%2Fsubmgrtmgr%7DSubmgrtMgrService?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://172.21.24.100:8680/services/SubmgrtMgrService/#%7Bhttp%3A%2F%2Fwww.huawei.com%2Fbme%2Fcbsinterface%2Fsubmgrtmgr%7DSubmgrtMgrService?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://172.21.24.100:8680/services/SubmgrtMgrService/#%7Bhttp%3A%2F%2Fwww.huawei.com%2Fbme%2Fcbsinterface%2Fsubmgrtmgr%7DSubmgrtMgrService?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://172.21.24.100:8680/services/SubmgrtMgrService/#%7Bhttp%3A%2F%2Fwww.huawei.com%2Fbme%2Fcbsinterface%2Fsubmgrtmgr%7DSubmgrtMgrService?wsdl",
          e);
    }
  }

  public SubmgrtMgrService()
  {
    super(wsdlLocationURL,
          new QName("http://www.huawei.com/bme/cbsinterface/submgrtmgr",
                    "SubmgrtMgrService"));
  }

  public SubmgrtMgrService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="SubmgrtServicePort")
  public sd.mtn.ocs.Submgrt getSubmgrtServicePort()
  {
    return (sd.mtn.ocs.Submgrt) super.getPort(new QName("http://www.huawei.com/bme/cbsinterface/submgrtmgr",
                                                        "SubmgrtServicePort"),
                                              sd.mtn.ocs.Submgrt.class);
  }

  @WebEndpoint(name="SubmgrtServicePort")
  public sd.mtn.ocs.Submgrt getSubmgrtServicePort(WebServiceFeature... features)
  {
    return (sd.mtn.ocs.Submgrt) super.getPort(new QName("http://www.huawei.com/bme/cbsinterface/submgrtmgr",
                                                        "SubmgrtServicePort"),
                                              sd.mtn.ocs.Submgrt.class,
                                              features);
  }
}
