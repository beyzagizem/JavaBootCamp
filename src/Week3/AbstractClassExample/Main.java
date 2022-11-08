package Week3.AbstractClassExample;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new OracleDatabase());
        customerManager.getCustomer();

    }
}
