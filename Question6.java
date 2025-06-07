class Book {
    String title, author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class FictionBook extends Book {
    FictionBook(String t, String a) {
        super(t, a);
    }
}

class NonFictionBook extends Book {
    NonFictionBook(String t, String a) {
        super(t, a);
    }
}

class TechnicalBook extends Book {
    TechnicalBook(String t, String a) {
        super(t, a);
    }
}
public class Question6 {
   public static void main(String[] args) {
        FictionBook fb = new FictionBook("1984", "George Orwell");
        NonFictionBook nfb = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook tb = new TechnicalBook("Effective Java", "Joshua Bloch");

        fb.displayDetails();
        nfb.displayDetails();
        tb.displayDetails();
    } 
}
