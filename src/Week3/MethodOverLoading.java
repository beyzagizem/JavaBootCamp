package Week3;

public class MethodOverLoading {
    public static void main(String[] args) {
      add(3,5,7);

    }



    public static int  add(int number1,int number2){
        return number1+number2;
    }
    public static int add(int number1,int number2,int number3){
        return number1+number2;
    }
}
