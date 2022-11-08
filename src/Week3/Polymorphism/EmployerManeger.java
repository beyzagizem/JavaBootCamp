package Week3.Polymorphism;

public class EmployerManeger {
    public void add(){
        System.out.println("employer added");
        DataBaseLogger dataBaseLogger = new DataBaseLogger();
        dataBaseLogger.Log("database'e loglandı");
    }
}
