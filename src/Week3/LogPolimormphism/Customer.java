package Week3.LogPolimormphism;

public class Customer {
    private String name;
    private int id;
    private String lastname;



    Customer(String name, int id){
       this.name=name;
       this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setLastname( String lastname){
        this.lastname=lastname;
    }
    public String  getLastname(){
        return this.lastname;
    }

}

