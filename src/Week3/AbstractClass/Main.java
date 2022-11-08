package Week3.AbstractClass;

public class Main {
    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator=new WomenGameCalculator();
        womenGameCalculator.calculate();
        womenGameCalculator.finalscreen();
        MenGameCalculator menGameCalculator=new MenGameCalculator();
        menGameCalculator.calculate();
        KidsGameCalculator kidsGameCalculator=new KidsGameCalculator();
        kidsGameCalculator.calculate();
    }


}
