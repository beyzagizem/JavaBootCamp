package Week3.AbstractClassExample;

public class CustomerManager {

    private BaseDatabase database;


    CustomerManager(BaseDatabase database1){
        this.database= database1;
    }



    public void getCustomer(){

        database.getData();
    }
}
