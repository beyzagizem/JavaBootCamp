package Week3.Interface;

public class CustomerManager {

  private ICustomerDal customerDal;

    CustomerManager(ICustomerDal customerDal1){
        this.customerDal=customerDal1;


    }

    public void add(){
        customerDal.add();

    }
    //business kodları
    //OracleCustomerDal oracleCustomerDal=new OracleCustomerDal();
}
