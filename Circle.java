public class Circle {
    private float radius;
    public float area;
    public Circle(float radius){
        this.radius=radius;
        area = (22/7)*radius*radius;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }
    
}
class Circlea{
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.println(circle1.area);
    }
}

