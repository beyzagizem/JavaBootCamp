package librarySystem.dataAccess;

import librarySystem.entity.Book;

import java.util.ArrayList;

public class MemoryBookDao {
    public void add(){
        System.out.println("added bookdaomemory");

    }
    public ArrayList<Book> getAll(){
        System.out.println("MemoryBookDao çalıştı");
        return  null;
    }
}
