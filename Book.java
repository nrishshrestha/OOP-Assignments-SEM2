public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 1949);
        System.out.println("Borrowing book: " + (book.borrowBook() ? "Success" : "Already borrowed"));
        System.out.println("Availability: " + book.isAvailable());
        book.returnBook();
        System.out.println("Returned book. Availability: " + book.isAvailable());
    }
}
