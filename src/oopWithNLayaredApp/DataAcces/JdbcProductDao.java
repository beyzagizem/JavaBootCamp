package oopWithNLayaredApp.DataAcces;


import oopWithNLayaredApp.Entities.Product;

public class JdbcProductDao implements IProductDao{
    public void add(Product product){
        System.out.println("JDBC ile veritabanına eklendi");
    }


}
