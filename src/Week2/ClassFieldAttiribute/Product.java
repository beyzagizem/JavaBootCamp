package Week2.ClassFieldAttiribute;

public class Product {
   public Product(){

   }

   public Product(int id,String name,double price){
       this.id=id;
       this.name=name;
       this.price=getTaxedPrice(price);

   }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public double getStockAmount(){
        return stockAmount;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setPrice(double price){
      this.price=getTaxedPrice(price);
    }
    public void setStockAmount( int stockAmount){
        this.stockAmount=stockAmount;
    }

    double getTaxedPrice(double price){
        price+=(price*18)/100;
        double taxedPrice=price;

        return taxedPrice;
    }


}

