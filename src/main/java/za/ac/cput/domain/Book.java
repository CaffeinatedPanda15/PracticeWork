package za.ac.cput.domain;

public class Book {

    private String bookName;
    private String author;
    private String publisher;
    private int pages;


    private Book() {
    }//end of constructor

    private Book(Builder build) {
        this.bookName = build.bookName;
        this.author = build.author;
        this.publisher = build.publisher;
        this.pages = build.pages;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pages=" + pages +
                '}';
    }

    public static class Builder {
        private String bookName;
        private String author;
        private String publisher;
        private int pages;

        public Builder setBookName(String bookName) {
            this.bookName = bookName;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public Builder copy(Book book) {
            this.bookName = book.bookName;
            this.author = book.author;
            this.publisher = book.publisher;
            this.pages = book.pages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }//end of builder class
}//end if class
