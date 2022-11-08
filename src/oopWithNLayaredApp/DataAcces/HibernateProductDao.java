package oopWithNLayaredApp.DataAcces;

import oopWithNLayaredApp.Entities.Product;

public class HibernateProductDao implements IProductDao {
    public void add(Product product){
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
