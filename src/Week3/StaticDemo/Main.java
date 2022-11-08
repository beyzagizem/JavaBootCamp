package Week3.StaticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        Product product=new Product();
        product.price=100;
        product.name="mouse";
        productManager.add(product);

    }
}
