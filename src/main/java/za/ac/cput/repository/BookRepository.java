package za.ac.cput.repository;

import za.ac.cput.domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IRepository<Book, String>{

    public static IRepository repository = null;

    private List<Book> BookList;

    private BookRepository() {
        this.BookList = new ArrayList<Book>();
    }

    public static IRepository getRepository() {
        if (repository == null) {
            repository = new BookRepository();
        }
        return repository;
    }

    @Override
    public Book create(Book book) {
        boolean success = BookList.add(book);
        if (success) {
            return book;
        }
        return null;
    }

    @Override
    public Book read(String BookName) {
        for (Book b : BookList) {
            if(b.getBookName().equals(BookName));
            return b;
        }
        return null;
    }

    @Override
    public Book update(Book book) {
        String name = book.getBookName();
        Book bookold = read(name);
        if (bookold == null)
                return null;

        boolean success = delete(name);
                if (success) {
                    if (BookList.add(book))
                        return book;
                }
                return null;
    }

    @Override
    public Boolean delete(String bookName) {
        Book bootToDelete = read(bookName);
        if (bootToDelete == null)
            return false;
        return (BookList.remove(bookName));
    }
}//end of class
