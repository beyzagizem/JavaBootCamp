package oopWithNLayaredApp.Business;

import oopWithNLayaredApp.DataAcces.IProductDao;
import oopWithNLayaredApp.DataAcces.JdbcProductDao;
import oopWithNLayaredApp.Entities.Product;

public class ProductManager {
    private IProductDao iProductDao;
    public ProductManager(IProductDao iProductDao1){
        this.iProductDao=iProductDao1;

    }


    public void add(Product product) throws Exception {
        if(product.getUnitPrice()<10){
throw new Exception("fiyat 10 dan az olamaz");
        }
        else{



        }
        //bir katman başka bir katmanla iletişim kurarken yalnızca interface i ile iletişim kurmalıdır
        //IProductDao iproductDao=new JdbcProductDao();
        iProductDao.add(product);
    }
}
