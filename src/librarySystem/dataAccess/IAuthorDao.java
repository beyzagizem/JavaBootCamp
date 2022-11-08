package librarySystem.dataAccess;

import librarySystem.entity.Author;

import java.util.ArrayList;

public interface IAuthorDao {
    void add();
     ArrayList<Author> getAll();

}
