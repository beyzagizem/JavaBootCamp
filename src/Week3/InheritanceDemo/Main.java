package Week3.InheritanceDemo;

public class Main {
    public static void main(String[] args) {
        EducationCredit educationCredit=new EducationCredit();
        FarmCredit farmCredit=new FarmCredit();
        farmCredit.calculate();
        CreditUi creditUi=new CreditUi();
        creditUi.CalculateCredit(new BaseCredit());


    }
}
