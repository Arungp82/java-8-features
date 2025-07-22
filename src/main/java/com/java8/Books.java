package com.module1;

public class Books {

    private int bookId;
    private String bookName;

    public  Books(Integer id,String name){
            this.bookId=id;
            this.bookName=name;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
