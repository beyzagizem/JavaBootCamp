package oopWithNLayaredApp;


import oopWithNLayaredApp.Business.ProductManager;
import oopWithNLayaredApp.DataAcces.JdbcProductDao;
import oopWithNLayaredApp.Entities.Product;


public class Main  {
    public static void main(String[] args) throws Exception {
        Product product1=new Product(1,"ütü",1000);

        ProductManager productManager=new ProductManager(new JdbcProductDao());
        productManager.add(product1);

    }

}
