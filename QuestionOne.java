import java.util.Scanner;
public class QuestionOne{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word:");
        String a=sc.nextLine();
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.println("Reverse="+b);
    }
}