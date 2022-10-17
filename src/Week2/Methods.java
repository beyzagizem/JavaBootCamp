package Week2;

public class Methods {
    public static void main(String[] args) {
        findNumber();

//        Customer customer= new Customer("Beyza","Yildirim",22);
//        Customer customer1 = new Customer("Beyza","Yildirim",22);
//        if(customer.name.equals(customer1.name)){
//            girer
//        }
//        if(customer.name==customer1.name){
//            girmez çünkü Java'da String referans tip
//        }




    }
    public  static void findNumber(){
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        int wanted = 6;
        boolean isFind = false;

        for (int sayi : numbers) {
            if (sayi == wanted) {
                isFind = true;
                break;
            }
        }
        String mesaj=" ";
        if (isFind){
            mesaj="number exist" + wanted;
            sendMessage(mesaj);
        }
        else {
            System.out.println("number does not exist");
        }


    }
    //method isimleri camel casing
    //class isimleri pascal casing
    public  static void  sendMessage(String mesaj){
        System.out.println(mesaj);



    }
}