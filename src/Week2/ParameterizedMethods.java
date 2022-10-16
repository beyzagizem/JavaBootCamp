package Week2;


public class ParameterizedMethods {
    public static void main(String[] args) {
        String mesaj = "hi";
        String newMesaj = mesaj.substring(0, 2);//substring değer döndürüyor
        System.out.println(newMesaj);
        // String otherMesaj=add();void olan fonksiyonu değişkene atayamayız
        int anotherMesaj = addition(4, 6);
        System.out.println(anotherMesaj);
        int total = addition2(2, 4, 3, 32, 1);
    }

    public static void add() {
        System.out.println("added");
    }

    public static void delete() {
        System.out.println("deleted");
    }

    public static void update() {
        System.out.println("updated");
    }

    public static int addition(int number1, int number2) {
        return number1 + number2;

    }

    public static int addition2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;

        }
        return total;


    }



}
