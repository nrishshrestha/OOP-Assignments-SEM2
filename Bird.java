abstract class Bird {
    void fly(){
        System.out.println("Bird flies");
    }
}

class Eagle extends Bird {
    @Override
    void fly(){
        System.out.println("Eagle flies");
    }
}

class Penguin extends Bird {
    @Override
    void fly(){
        System.out.println("Penguins cant fly");
    }
}

class Implement {
    public static void main(String[] args) {
        Eagle eagle1 = new Eagle();
        Penguin penguin1 = new Penguin();
        eagle1.fly();
        penguin1.fly();
    }
}