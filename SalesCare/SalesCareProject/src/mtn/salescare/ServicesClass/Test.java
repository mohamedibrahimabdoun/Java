package mtn.salescare.ServicesClass;

public class Test {
    public Test() {
        super();
    }

    public static void main(String[] args) {
        // Test test = new Test();

        SalesCareServices sales_obj = new SalesCareServices();
        Services rslt = sales_obj.Get_PERMISSION("634021423765711", "0000");
        System.out.print(rslt.getMsg());

        SalesCareServices test = new SalesCareServices();
        String successFail = test.validate_POS("634021423765711", "0000");
        System.out.print(successFail);

        SalesCareServices pruchase = new SalesCareServices();
        Electricity result =
            pruchase.purchase_elec("998316000", "141000000000*1");
        System.out.print(result.getResultCode());

        SalesCareServices activate = new SalesCareServices();
        String result2 =
            activate.sim_activation("922902672", "928038956", "123");
        System.out.print(result);


        SalesCareServices TP_login = new SalesCareServices();
        int res = TP_login.Get_TP_PERMISSION("sys", "sysdev");
        System.out.print("login TP" + res);

    }
}

