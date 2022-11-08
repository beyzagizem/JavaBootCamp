package Week3.StaticDemo;

public class ProductManager {
    public void add(Product product){
        ProductValidator productValidator=new ProductValidator();
        if(productValidator.isValid(product))
            System.out.println("added");
        else {
            System.out.println("does not added");
        }
ProductValidator productValidator1=new ProductValidator();
    }
}
