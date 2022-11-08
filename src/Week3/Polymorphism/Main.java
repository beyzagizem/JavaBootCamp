package Week3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        BaseLogger emailLogger = new EmailLogger();
        DataBaseLogger dataBaseLogger = new DataBaseLogger();
        FileLogger fileLogger = new FileLogger();
        //emailLogger.Log(" ");
        CustomerManager customerManager=new CustomerManager(fileLogger);
        //EmployerManeger employerManeger=new EmployerManeger();
        //employerManeger.add();
        customerManager.add();




    }

}
