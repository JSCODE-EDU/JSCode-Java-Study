package Week4;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> bookList = new ArrayList<>();
    boolean isRented;


    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBookList(String bookName){
        bookList.add(new Book(bookName));
    }

    public void printBookList(){
        for (Book book : getBookList()) {
            if(book.isRented() == false){
                System.out.println(book.getIndex() + ". " + book.getName() + " - 대여 가능");
            } else {
                System.out.println(book.getIndex() + ". " + book.getName() + " - 대여 불가");
            }
        }
    }

    public void borrowingBook(int bookIndexNum){
        for (Book book : bookList) {
            if(book.getIndex() == bookIndexNum){
                book.setRented();
            }
        }
    }


}
