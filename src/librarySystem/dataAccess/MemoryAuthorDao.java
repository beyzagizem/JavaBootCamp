package librarySystem.dataAccess;

import librarySystem.entity.Author;


import java.util.ArrayList;

public class MemoryAuthorDao implements IAuthorDao{
    ArrayList<Author> authors=new ArrayList<>();
    public void add(Author author){
        authors.add(author);
        System.out.println("added authordao");

    }

    @Override
    public void add() {

    }

    public ArrayList<Author> getAll(){
        System.out.println("MemoryAuthorDao getall çalıştı");
        return  authors;
    }
}
