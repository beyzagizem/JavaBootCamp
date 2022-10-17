package Week2.ClassFieldAttiribute;

public class Main {
    public static void main(String[] args) {

//     Product product=new Product();
//
//        product.setName("şampuan");
//        product.setId(2);
//        product.setStockAmount(4);
//        product.setDescription("açıklama");
//        product.setPrice(450.5);
        Product product=new Product(2,"jbn",100);


        ProductManager productManager= new ProductManager();
        productManager.save(product);
    }
}
