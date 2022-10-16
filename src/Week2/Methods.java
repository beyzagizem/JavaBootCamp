package Week2;

public class Methods {
    public static void main(String[] args) {
        findNumber();

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