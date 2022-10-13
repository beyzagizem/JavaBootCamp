package Week2;

public class Methods {
    public static void main(String[] args) {
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        int wanted = 6;
        boolean isFind = false;

        for (int sayi : numbers) {
            if (sayi == wanted) {
                isFind = true;
                break;
            }
        }
if (isFind){
    System.out.println("number exist");
}
else {
    System.out.println("number does not exist");
}

    }
}