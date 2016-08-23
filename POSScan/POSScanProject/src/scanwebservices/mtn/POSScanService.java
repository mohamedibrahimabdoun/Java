package scanwebservices.mtn;

import java.rmi.Remote;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import posscan.mtn.Brands;
import posscan.mtn.TraderClassification;

@WebService(name = "POSScanService")
public interface POSScanService extends Remote {
    @WebMethod
    public List<TraderClassification> getAllPosTypes();

    @WebMethod
    public List<Brands> getBrandsFindAll();

    @WebMethod
    public String SendPosinfo(@WebParam(name = "DATE")
        String date, @WebParam(name = "IMEI")
        String imei, @WebParam(name = "LAT")
        String lat, @WebParam(name = "LNG")
        String lng, @WebParam(name = "POTYPES")
        String postype, @WebParam(name = "POSNAME")
        String posname, @WebParam(name = "OWNER")
        String owner, @WebParam(name = "MOBILE")
        String mobile, @WebParam(name = "BRAND")
        String brand, @WebParam(name = "ADDRESS")
        String address, @WebParam(name = "STOCK")
        String stock);
}

///scanwebservices.mtn.POSScanWebservicesSessionEJBBean_axgqcg_WSOImpl.__WL_getBrandsFindAll_WS()