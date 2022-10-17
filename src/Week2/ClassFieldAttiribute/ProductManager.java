package Week2.ClassFieldAttiribute;

public class ProductManager {

        public  void save(Product  product){
            System.out.println("desc : "+product.getDescription()+" id: "+product.getId()+
                    "price : "+product.getPrice()+"stock: "+ product.getStockAmount());

    }
}
