package Week3.Polymorpism2;

public class Main {
    public static void main(String[] args){
        DataBaseLogger dataBaseLogger=new DataBaseLogger();
        FileLogger fileLogger=new FileLogger();


        CustomerManager customerManager=new CustomerManager(fileLogger,dataBaseLogger  );
        customerManager.add();


    }
}
