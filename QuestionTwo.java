import java.util.Scanner;
public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int userInput = sc.nextInt();

        int sum = 0;
        for (int i=0;i<=userInput;i++) {
            sum +=i;
        }
        System.out.print(sum);
    }
}

