package com.module1;

public interface LibraryService {

    public void  getListOfBooks();

    public void checkoutBooks(Books id);

    public void addNewBooks(Books id);

    public void returnBooks(Books id);

}
