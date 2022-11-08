package Week3.LogPolimormphism;

public class Main {
    public static void main (String[] args ){
        CustomerManager customerManager=new CustomerManager();
        Customer customer=new Customer("ahmet",23);
        System.out.println("denmee :" + customer.getName());
        customer.setLastname("Yılmaz");
        System.out.println(customer.getLastname());
        customerManager.addCustomer(customer);
    }
}
