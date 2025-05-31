package za.ac.cput.factory;

import za.ac.cput.domain.Book;
import za.ac.cput.util.Helper;

public class BookFactory {
    public static Book createBook(String bookName, String bookAuthor, String bookPublisher, int bookPages) {
        if (Helper.isNullorEmpty(bookName) || Helper.isNullorEmpty(bookAuthor) ||
                Helper.isNullorEmpty(bookPublisher))
            return null;
       return new Book.Builder()
               .setBookName(bookName)
               .setAuthor(bookAuthor)
               .setPublisher(bookPublisher)
               .setPages(bookPages)
               .build();
    }

}//end of class
