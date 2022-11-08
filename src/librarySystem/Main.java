package librarySystem;

import librarySystem.business.AuthorManager;
import librarySystem.business.BookManager;
import librarySystem.dataAccess.MemoryAuthorDao;
import librarySystem.entity.Author;

public class Main {
    public static void main(String[] args){
        Author author=new Author();
        Author author1=new Author(2,"Mehmet","Rauf");
        author1.setId(1);
        author1.setName("Mehmet");
        author1.setSurname("Rauf");
        Author author2=new Author();
        author2.setId(2);
        author2.setName("Paulo");
        author2.setSurname("Coelho");

        AuthorManager authorManager=new AuthorManager(new MemoryAuthorDao());
        BookManager bookManager=new BookManager();
        authorManager.add(author1);
        authorManager.add(author2);
        authorManager.getAll();
    }
}
