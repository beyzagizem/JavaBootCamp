package Week2;

public class Class {
    public static void main(String[] args) {
        Operation operation=new Operation();
        System.out.println(operation.addition(3,5,100));
    }
}
 class Operation{
    public Operation(){

    }
    public  int addition(int ...numbers){
        int counter=0;
        for(int number:numbers){
            counter=counter+number;
        }
        return counter;
    }
    public int subtraction(int number1,int number2){
        return number1-number2;
    }
    public int multiplication(int number1,int number2){
        return number1*number2;
    }
    public int division(int number1,int number2){
        return number1/number2;
    }

}



