package Week3.LogPolimormphism;

public class DatabaseLog extends BaseLog{
    public void addCustomer(Customer customer){
        System.out.println(customer.getLastname());
    }
}
