public class PrimeNumbers {

    public static void main(String[] args) {

        int number =25;
        int sayac=number%2;
        System.out.println(sayac);
        boolean isPrime=true;
        for (int i=2; i<number;i++) {
            if(number%i==0) {
                isPrime=false;
            }

        }
        if(isPrime) {
            System.out.println("Sayı asaldır");
        }
        else {
            System.out.println("Sayı asal değildir");
        }

    }
}
