package Week3.Interface;

public class MySqlCustomerDal implements ICustomerDal, IRepository  //bir class birden fazla ınterfacei implement eder
        {
    @Override
    public void add() {
        System.out.println("my sql added");
    }
}
