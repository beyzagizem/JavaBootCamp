package Week3.InheritanceDemo;

public class CreditUi {
    EducationCredit educationCredit;
    CreditUi (){
       EducationCredit educationCredit= new EducationCredit();
    }
    public void CalculateCredit(BaseCredit baseCredit){
        baseCredit.calculate();
    }
}
