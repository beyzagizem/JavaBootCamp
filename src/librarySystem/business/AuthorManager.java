package librarySystem.business;

import librarySystem.dataAccess.IAuthorDao;
import librarySystem.dataAccess.MemoryAuthorDao;
import librarySystem.dataAccess.PostgreAuthorDao;
import librarySystem.entity.Author;
import oopWithNLayaredApp.DataAcces.IProductDao;

import java.util.ArrayList;

public class AuthorManager  {

    IAuthorDao authorDao;

    public AuthorManager(IAuthorDao authorDao1){
        this.authorDao=authorDao1;
    }





    public void add(Author author) {
     authorDao.add();

    }
    public ArrayList<Author> getAll(){

        return authorDao.getAll();
    }

}
