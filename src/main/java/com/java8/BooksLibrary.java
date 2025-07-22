package com.module1;

import java.util.List;

public class BooksLibrary {

    private Integer libId;
    private String libName;

    private List<String> listOfBooks;

    public BooksLibrary(Integer id,String libName,List<String> books){
        this.libId=id;
        this.libName =libName;
        this.listOfBooks=books;
    }

    public Integer getLibId() {
        return libId;
    }

    public void setLibId(Integer libId) {
        this.libId = libId;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    public List<String> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<String> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
}
