package librarySystem.business;

import librarySystem.dataAccess.MemoryBookDao;
import librarySystem.entity.Book;

import java.util.ArrayList;

public class BookManager {
    MemoryBookDao memoryBookDao=new MemoryBookDao();

    public void add(){
        memoryBookDao.add();

    }
    public ArrayList<Book> getAll(){
       return memoryBookDao.getAll() ;
    }


}
