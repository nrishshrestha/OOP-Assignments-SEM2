interface LibraryItem{
    void getTitle(String title);
    void getAuthor(String author);
    void getYear(int year);
    void isAvailabe(boolean availability);
}

class ABook implements LibraryItem{

    @Override
    public void getTitle(String title) {
        System.out.println("Books title: "+title);
    }

    @Override
    public void getAuthor(String author) {
        System.out.println("Books author: "+author);
    }

    @Override
    public void getYear(int year) {
        System.out.println("Year of publication: "+year);
    }

    @Override
    public void isAvailabe(boolean availability) {
        System.out.println("Availability: "+availability);
    }
    
}

class ImplementLibrary{
    public static void main(String[] args) {
        ABook abook=new ABook();
        abook.getTitle("Java Book");
        abook.getAuthor("Java");
        abook.getYear(2010);
        abook.isAvailabe(true);
    }
}