package Week3.Overriding;

public class FarmCreditManager extends BaseCreditManager{
    public double calculate(double amount) {
        return amount * 1.10;
    }
}
