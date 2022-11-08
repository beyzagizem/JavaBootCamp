package Week3.Polymorphism;

import java.util.Date;

public class CustomerManager{
    BaseLogger baseLogger1;
CustomerManager(BaseLogger baseLogger){
    baseLogger1=baseLogger;
}
public void add(){
    System.out.println("customer added");
    baseLogger1.Log("");

}
}
