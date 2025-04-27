import java.util.Scanner;
public class QuestionTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        int b=0;
        while (a!=0){
            int c=a%10;
            b=b+c;
            a=a/10;
        }
        System.out.print("Sum="+b);
        sc.close();

    }
}

