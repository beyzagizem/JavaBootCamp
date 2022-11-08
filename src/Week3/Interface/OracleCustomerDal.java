package Week3.Interface;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("oracle added");
    }
}
