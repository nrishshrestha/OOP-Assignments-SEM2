

abstract class MenuItems {
    abstract void Prepare();
    abstract void Serving();
}

class Appetizers extends MenuItems {
    void Prepare() {
        System.out.println("Prepairing Appetizers...");
    }
    void Serving(){
        System.out.println("Serving Appetizers...`");
    }
}

class MainCourse extends MenuItems {
    void Prepare() {
        System.out.println("Prepairing MainCourse...");
    }
    void Serving(){
        System.out.println("Serving MainCourse...`");
    }
}

class Bevrages extends MenuItems {
    void Prepare() {
        System.out.println("Prepairing Beverages...");
    }
    void Serving(){
        System.out.println("Serving Beverages...`");
    }
}

public class Ordersystem {
    public static void main(String[] args) {
        MenuItems[] item = {
            new Appetizers(),
            new MainCourse(),
            new Bevrages()
        };
        for (MenuItems i : item){
            i.Prepare();
            i.Serving();
        }
    }
}
