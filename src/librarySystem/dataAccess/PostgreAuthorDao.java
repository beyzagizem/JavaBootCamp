package librarySystem.dataAccess;

import librarySystem.entity.Author;
import librarySystem.entity.Book;

import java.util.ArrayList;

public class PostgreAuthorDao implements IAuthorDao {
    public void add(){
        System.out.println("added PostgreAuthorDao");

    }
    public ArrayList<Author> getAll(){
        System.out.println("PostgreAuthorDao çalıştı");
        return  null;
    }
}
