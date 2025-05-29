public class Dog {
    private String name;
    private String breed;

    public Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
        System.out.println(name+ " can bark.");
        System.out.println(name+" can wag its tail.");
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy","GrateDane");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Breed: " + dog1.getBreed());
    }
}
