package Week1;

public class IsPerfectNumber {

    public static void main (String[] args){

        int numberToCheck =7;
        int total=0;
        for(int i=1;i<numberToCheck;i++){
            if ((numberToCheck % i)==0){
                total+=i;
            }

        }
       String message= (total==numberToCheck) ? "yes perfect number":"no";
        System.out.println(message);




    }
}
