public class Book {

    private String bookTitle;
    private String bookAuthor;
    private int yearPublished;

    public Book(String bookTitle, String bookAuthor, int yearPublished) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle != null && !bookTitle.isBlank()) {
            this.bookTitle = bookTitle;
        }
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        if (bookAuthor != null && !bookAuthor.isBlank()) {   // ✅ fixed here
            this.bookAuthor = bookAuthor;
        }
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setYearPublished(int yearPublished) {
        if (yearPublished > 0) {
            this.yearPublished = yearPublished;
        }
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
