public class IsBold {
    public static void main(String[] args) {
        char harf='o';

        char[]  boldLetters = {'a','o','u'};

        boolean isBold=false;

        for (int i=0;i<boldLetters.length;i++){
            if (boldLetters[i]==harf){
                isBold=true;
            }
        }
        String message = isBold ?"evet kalın ":"hayır değil";
        System.out.println(message);
    }
}
