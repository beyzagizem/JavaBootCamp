package Week3.Polymorpism2;

public class CustomerManager {
BaseLogger[] baseLogger;
CustomerManager(BaseLogger... baseLogger){
    this.baseLogger=baseLogger;
}


    public void add(){
        System.out.println("Customer Added");
        for(BaseLogger baseLogger1: baseLogger){
            baseLogger1.log("mbjhj");
        }


    }
    public void update(){
        System.out.println("Customer updated");
    }
}
