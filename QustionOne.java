import java.util.Scanner;
public class QustionOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        char userInput = sc.next().charAt(1);
        
        
        for (char i=0;i<=userInput;i++) {
            System.out.println(i);
        }
        }
}