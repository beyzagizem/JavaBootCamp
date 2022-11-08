package Week3.Overriding;

public class Main {
    public static void main(String[] args) {
//        EducatingCreditManager educatingCreditManager=new EducatingCreditManager();
//        System.out.println(educatingCreditManager.calculate(1000));
        BaseCreditManager[] creditManager=new BaseCreditManager[]
                {new FarmCreditManager(),new EducatingCreditManager(),new StudentCreditManager()};
        for(BaseCreditManager creditManager1 :creditManager){
            System.out.println(creditManager1.calculate(1000));

        }
   }
    }

