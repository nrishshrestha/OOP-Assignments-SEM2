public class Calculatorapp {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculatorapp calc = new Calculatorapp();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(2.5, 3.5));         
        System.out.println(calc.add(1, 2, 3));          
    }
}
